package com.hypeirochus.scmc.entity.living;

import java.util.Random;

import com.google.common.base.Predicate;
import com.hypeirochus.api.world.entity.ItemDrop;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumMetaItem;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.handlers.WeaponHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityZealot extends EntityProtossMob implements IMob, Predicate<EntityLivingBase> {

	public float								offsetHealth;
	public int									timeSinceHurt;
	private static final DataParameter<Boolean>	SHEATH	= EntityDataManager.createKey(EntityZealot.class, DataSerializers.BOOLEAN);

	public EntityZealot(World world) {
		super(world);
		setSize(1.0F, 2.9F);
		experienceValue = 100;
		this.setColor(EnumColors.LIGHT_BLUE);
		this.setFactions(EnumFactionTypes.DAELAAM);
		setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	@Override
	protected void entityInit() {
		super.entityInit();

		this.getDataManager().register(SHEATH, false);
	}

	public boolean canSheathBlades() {
		return this.getDataManager().get(SHEATH);
	}

	protected void setSheathed(boolean bool) {
		this.getDataManager().set(SHEATH, bool);
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the
	 * target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity) {
		return checkTarget(entity, EnumFactionTypes.DAELAAM);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	/**
	 * Drop 0-2 items of this living's type.
	 * 
	 * @param recentlyHit
	 *            - Whether this entity has recently been hit by a player.
	 * @param looting
	 *            - Level of Looting used to kill this mob.
	 */
	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.ENERGY, 1 + this.rand.nextInt(2), EnumMetaItem.EnergyType.PURE.getID()));
		ItemDrop drop2 = new ItemDrop(1, new ItemStack(WeaponHandler.PSI_BLADE));
		drop.tryDrop(this);
		drop2.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch (rand.nextInt(3)) {
		case 0:
			return SoundHandler.ENTITY_ZEALOT_LIVE1;
		case 1:
			return SoundHandler.ENTITY_ZEALOT_LIVE2;
		case 2:
			return SoundHandler.ENTITY_ZEALOT_LIVE3;
		default:
			return SoundHandler.ENTITY_ZEALOT_LIVE4;
		}
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_ZEALOT_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_ZEALOT_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public void onUpdate() {
		if (!world.isRemote) {
			if (this.getAttackTarget() != null && this.getDistanceSqToEntity(this.getAttackTarget()) < 80.0D) {
				this.setSheathed(true);
			} else if (this.getAttackTarget() == null) {
				this.setSheathed(false);
			}
		}
		super.onUpdate();
	}

	@Override
	public void onLivingUpdate() {
		if (ticksExisted % 20 == 0 && this.getHealth() < this.getMaxHealth()) {
			if (this.getHealth() < 100.0 - offsetHealth) {
				offsetHealth = 100 - getHealth();
			}
			if (this.getHealth() < this.getMaxHealth() - offsetHealth && ticksExisted - timeSinceHurt > 200) {
				this.heal(2.0F);
			}
		}
		super.onLivingUpdate();
	}

	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		this.playSound(SoundHandler.FX_PSIBLADE_ATTACK, 1.0F, 1.0F);
		return super.attackEntityAsMob(entityIn);
	}
}