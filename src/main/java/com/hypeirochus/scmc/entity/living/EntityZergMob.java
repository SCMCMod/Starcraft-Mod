package com.hypeirochus.scmc.entity.living;

import java.util.ArrayList;

import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityZergMob extends EntityStarcraftMob {

	private static final DataParameter<Integer>	BIOMASS	= EntityDataManager.createKey(EntityZergMob.class, DataSerializers.VARINT);
	private static final DataParameter<Boolean>	BURROW	= EntityDataManager.createKey(EntityZergMob.class, DataSerializers.BOOLEAN);

	public EntityZergMob(World world) {
		super(world);
	}

	@Override
	public boolean getCanSpawnHere() {
		if (this.world.getDifficulty() != EnumDifficulty.PEACEFUL) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected void entityInit() {
		this.getDataManager().register(BIOMASS, 0);
		this.getDataManager().register(BURROW, false);
		
		super.entityInit();
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);

		nbt.setInteger("Biomass", this.getBiomass());
		nbt.setBoolean("Burrow", this.getBurrowState());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.setBiomass(nbt.getInteger("Biomass"));
		this.isBurrowed(nbt.getBoolean("Burrow"));
	}

	public int getBiomass() {
		return this.getDataManager().get(BIOMASS);
	}

	public void setBiomass(int amount) {
		this.getDataManager().set(BIOMASS, amount);
	}

	protected void findBiomass() {
		if (!this.world.isRemote && this.world.getWorldTime() % 40 == 0 && this.getAttackTarget() == null) {
			ArrayList<EntityItem> entityItemList = (ArrayList<EntityItem>) world.getEntitiesWithinAABB(EntityItem.class, this.getEntityBoundingBox().expand(8, 8, 8));

			for (EntityItem entityItem : entityItemList) {
				if (!entityItem.cannotPickup()) {
					ItemStack stack = entityItem.getItem();

					if (stack.getItem() == ItemHandler.BIOMASS) {
						this.getNavigator().setPath(this.getNavigator().getPathToEntityLiving(entityItem), 1);
					}

					if (this.getDistance(entityItem) <= 2) {
						this.onPickupBiomass(entityItem);
					}
					break;
				}
			}

			entityItemList.clear();
			entityItemList = null;
		}
	}

	protected void onPickupBiomass(EntityItem entityItem) {
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(this.getMaxHealth() + (entityItem.getItem().getCount()));
		this.setHealth(this.getHealth() + (entityItem.getItem().getCount()));
		this.setBiomass(this.getBiomass() + (entityItem.getItem().getCount()));
		entityItem.setDead();
	}
	
	public boolean getBurrowState() {
		return this.getDataManager().get(BURROW);
	}

	public void isBurrowed(boolean isBurrowed) {
		this.getDataManager().set(BURROW, isBurrowed);
	}
	
	protected void clearAITasks() {
	   tasks.taskEntries.clear();
	   targetTasks.taskEntries.clear();
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if(!this.world.isRemote) {
			if (this.getBiomass() <= 100) {
				this.findBiomass();
			}
			if (this.getBiomass() > 100) {
				this.setBiomass(100);
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(this.getMaxHealth() + this.getBiomass());
			}
			if(this.getHealth() < this.getMaxHealth()/6 && this.getBurrowState() == false) {
				world.playSound(null, this.getPosition(), SoundHandler.FX_ZERG_BURROWDOWN, SoundCategory.NEUTRAL, 7.0F, 1.0F);
				this.isBurrowed(true);
				this.clearAITasks();
				this.amendAttribute(EnumTypeAttributes.INVISIBLE);
			}else if(this.getHealth() > this.getMaxHealth()/6 && this.getBurrowState() == true) {
				world.playSound(null, this.getPosition(), SoundHandler.FX_ZERG_BURROWUP, SoundCategory.NEUTRAL, 7.0F, 1.0F);
				this.isBurrowed(false);
				this.initEntityAI();
				this.removeAttribute(EnumTypeAttributes.INVISIBLE);
			}
		}
	}
	
	@Override
	public void knockBack(Entity entityIn, float strength, double xRatio, double zRatio) {
		if(this.getBurrowState() == true) {
			//Do nothing. Burrowed zerg should not have knockback.
		}else {
			super.knockBack(entityIn, strength, xRatio, zRatio);
		}
	}
	
	@Override
	protected void initEntityAI() {
		super.initEntityAI();
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (ticksExisted % 20 == 0 && !(this.getHealth() == this.getMaxHealth() + this.getBiomass()) && !this.isDead) {
			this.heal(0.27F);
		}
	}

	@Override
	public void onKillEntity(EntityLivingBase entityLivingIn) {
		int biomassAmount;
		if (entityLivingIn.getMaxHealth() <= 256) {
			biomassAmount = (int) entityLivingIn.getMaxHealth() / 4;
		} else {
			biomassAmount = 64;
		}
		if (entityLivingIn instanceof EntityStarcraftMob) {
			if (((EntityStarcraftMob) entityLivingIn).hasAttribute(EnumTypeAttributes.MECHANICAL)) {
				// do nothing
			} else {
				entityLivingIn.dropItem(ItemHandler.BIOMASS, biomassAmount);
			}
		} else if (entityLivingIn instanceof EntityStarcraftPassive) {
			if (((EntityStarcraftPassive) entityLivingIn).hasAttribute(EnumTypeAttributes.MECHANICAL)) {
				// do nothing
			} else {
				entityLivingIn.dropItem(ItemHandler.BIOMASS, biomassAmount);
			}
		} else {
			entityLivingIn.dropItem(ItemHandler.BIOMASS, biomassAmount);
		}
		super.onKillEntity(entityLivingIn);
	}
}
