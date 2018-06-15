package com.hypeirochus.scmc.entity.living;

import java.util.Random;

import com.google.common.base.Predicate;
import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

/**
 * @author Hypeirochus
 */
public class EntityUrsadon extends EntityMob implements IMob, Predicate<EntityLivingBase> {

	public EntityUrsadon(World world) {
		super(world);
		setSize(1.5F, 1.5F);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, true, this));
	}

	@Override
	public boolean apply(EntityLivingBase entity) {
		if (!entity.isInvisible()) {
			if (entity instanceof EntityUrsadon || entity instanceof EntityUrsadonMatriarch) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch (rand.nextInt(1)) {
		case 0:
			return SoundHandler.ENTITY_URSADON_LIVE1;
		default:
			return SoundHandler.ENTITY_URSADON_LIVE2;
		}
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_URSADON_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source) {
		return SoundHandler.ENTITY_URSADON_HURT;
	}

	@Override
	public boolean getCanSpawnHere() {
		if (this.world.provider.getDimension() == StarcraftConfig.INT_DIMENSION_KALDIR && world.getDifficulty() != EnumDifficulty.PEACEFUL) {
			return true;
		}
		return false;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3804D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0D);
	}
}