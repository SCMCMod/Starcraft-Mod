package com.hypeirochus.scmc.entity.living;

import java.util.Random;

import com.google.common.base.Predicate;
import com.hypeirochus.api.world.entity.ItemDrop;
import com.hypeirochus.scmc.capabilities.ColorProvider;
import com.hypeirochus.scmc.capabilities.IColor;
import com.hypeirochus.scmc.entity.IShieldEntity;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
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
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityProtossReaver extends EntityProtossMob implements IMob, IRangedAttackMob, IShieldEntity, Predicate<EntityLivingBase> {

	public int		ammo	= 4;

	public EntityProtossReaver(World world) {
		super(world);
		setSize(5.0F, 5.0F);
		experienceValue = 133;
		this.setColor(EnumColors.LIGHT_BLUE);
		this.setFactions(EnumFactionTypes.DAELAAM);
		setAttributes(EnumTypeAttributes.MASSIVE, EnumTypeAttributes.MECHANICAL, EnumTypeAttributes.GROUND, EnumTypeAttributes.ARMORED);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackRanged(this, 0.25F, 85, 30));
		tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	@Override
	public boolean apply(EntityLivingBase entity) {
		if (!entity.isInvisible()) {
			if (entity instanceof EntityStarcraftMob) {
				if (entity.isCreatureType(EnumCreatureType.MONSTER, false)) {
					if (!((EntityStarcraftMob) entity).isFaction(EnumFactionTypes.DAELAAM)) {
						if (((EntityStarcraftMob) entity).getColor() != this.getColor()) {
							return true;
						} else {
							return false;
						}
					} else if (((EntityStarcraftMob) entity).getColor() != this.getColor()) {
						return true;
					}
				}
			} else if (entity instanceof EntityStarcraftPassive) {
				if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					if (!((EntityStarcraftPassive) entity).isFaction(EnumFactionTypes.DAELAAM)) {
						if (((EntityStarcraftPassive) entity).getColor() != this.getColor() && !((EntityStarcraftPassive) entity).isType(EnumTypeAttributes.CRITTER)) {
							return true;
						} else {
							return false;
						}
					} else if (((EntityStarcraftPassive) entity).getColor() != this.getColor()) {
						return true;
					}
				}
			} else if (entity instanceof EntityPlayer) {
				IColor color = ((EntityPlayer) entity).getCapability(ColorProvider.COLOR, null);
				if (color.getColor() == this.getColor().getId()) {
					return false;
				} else {
					return true;
				}
			} else {
				if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					return false;
				}
				return true;
			}
		} else if (entity.isInvisible() && this.hasAttribute(EnumTypeAttributes.DETECTOR)) {
			return true;
		} else {
			return false;
		}
		return false;
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(10, new ItemStack(ItemHandler.PROTOSS_INGOT, 1 + this.rand.nextInt(2), MetaHandler.ProtossIngotType.KHALAI.getID()));
		drop.tryDrop(this);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(133.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.24000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entity, float distance) {
		if (!world.isRemote && this.ammo > 1) {
			EntityScarab scarab = new EntityScarab(world, this.getColor(), EnumFactionTypes.DAELAAM);
			scarab.setLocationAndAngles(posX, posY, posZ, 0, 0);
			world.spawnEntity(scarab);
			ammo--;
		}
	}

	@Override
	public boolean canBePushed() {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch (rand.nextInt(4)) {
		case 0:
			return SoundHandler.ENTITY_PREAVER_LIVE1;
		case 1:
			return SoundHandler.ENTITY_PREAVER_LIVE2;
		case 2:
			return SoundHandler.ENTITY_PREAVER_LIVE3;
		case 3:
			return SoundHandler.ENTITY_PREAVER_LIVE4;
		default:
			return SoundHandler.ENTITY_PREAVER_LIVE5;
		}

	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_PREAVER_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source) {
		return SoundHandler.ENTITY_PREAVER_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public void onLivingUpdate() {
		
		if (ticksExisted % 160 == 0 || ticksExisted % 160 == 1) {
			if (ammo < 4) {
				ammo++;
			}
		}
		super.onLivingUpdate();
	}

	@Override
	public void setSwingingArms(boolean swingingArms) {
		
	}
	
	@Override
	public float getMaxShields() {
		return 100.0F;
	}
}