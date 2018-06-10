package com.hypeirochus.scmc.entity.living;

import com.google.common.base.Predicate;
import com.hypeirochus.scmc.entity.ai.EntityAIScarabExplode;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class EntityScarab extends EntityProtossMob implements IMob, Predicate<EntityLivingBase> {
	
	private byte explosionRadius = 6;
	private short fuseTime = 10;

	public EntityScarab(World worldIn) {
		super(worldIn);
		setSize(.7F, .7F);
		this.setColor(EnumColors.LIGHT_BLUE);
		this.setFactions(EnumFactionTypes.DAELAAM);
	}

	public EntityScarab(World worldIn, EnumColors color, EnumFactionTypes faction) {
		super(worldIn);
		setSize(.7F, .7F);
		this.setColor(color);
		this.setFactions(faction);
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIScarabExplode(this));
		tasks.addTask(3, new EntityAIAttackMelee(this, 1, false));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity) {
		return checkTarget(entity, EnumFactionTypes.DAELAAM);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(24);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1024.0D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		return true;
	}

	@Override
	public boolean canBeCollidedWith() {
		return false;
	}

	/**
	 * Creates an explosion as determined by this scarab's power and explosion radius.
	 */
	private void explode() {
		if (!world.isRemote) {
			boolean flag = world.getGameRules().getBoolean("mobGriefing");
			float f = 1;
			dead = true;
			world.createExplosion(this, posX, posY, posZ, explosionRadius * f, flag);
			setDead();
		}
	}

	@Override
	public float getExplosionResistance(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn) {
		return 10000;
	}

	/**
	 * The maximum height from where the entity is allowed to jump (used in pathfinder)
	 */
	@Override
	public int getMaxFallHeight() {
		return 500;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate() {
		
		if (isEntityAlive()) {
			if(this.getAttackTarget() != null && this.getDistance(this.getAttackTarget()) < 2.0D) {
				explode();
			}
		}

		if (ticksExisted > 500) {
			explode();
		}

		super.onUpdate();
	}
}