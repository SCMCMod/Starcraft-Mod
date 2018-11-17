package com.arpaesis.scmc.entity.living;

import java.util.Random;

import com.arpaesis.api.world.entity.ItemDrop;
import com.arpaesis.scmc.entity.EntityMutaliskGlaiveWurm;
import com.arpaesis.scmc.enums.EnumColors;
import com.arpaesis.scmc.enums.EnumFactionTypes;
import com.arpaesis.scmc.enums.EnumTypeAttributes;
import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.handlers.ItemHandler;
import com.arpaesis.scmc.handlers.SoundHandler;
import com.google.common.base.Predicate;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.monster.IMob;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityMutaliskPrimal extends EntityZergFlying implements IMob, IRangedAttackMob, Predicate<EntityLivingBase>
{

	public EntityMutaliskPrimal(World world)
	{
		super(world);
		setSize(4.0F, 1.5F);
		this.setColor(EnumColors.CYAN);
		this.setFactions(EnumFactionTypes.PRIMALZERG);
		this.setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.AIR);
		moveHelper = new EntityMutaliskPrimal.MutaliskMoveHelper(this);
		tasks.addTask(2, new EntityAIAttackRanged(this, 1.0D, 40, 20.0F));
		tasks.addTask(5, new EntityMutaliskPrimal.AIRandomFly(this));
		tasks.addTask(7, new EntityMutaliskPrimal.AILookAround(this));
		targetTasks.addTask(1, new EntityAIFindEntityNearestPlayer(this));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, true, false, this));
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor)
	{
		EntityMutaliskGlaiveWurm wurm = new EntityMutaliskGlaiveWurm(this.world, this);
		double d0 = target.posY + (double) target.getEyeHeight() - 1.000000023841858D - target.getDistanceSq(target.getPosition());
		double d1 = target.posX - this.posX;
		double d2 = d0 - wurm.posY;
		double d3 = target.posZ - this.posZ;
		float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;
		wurm.setPositionAndRotationDirect(d1, d2 + (double) f, d3, 1.6F, .0F, 0, false);
		this.playSound(SoundHandler.FX_MUTALISK_FIRE, 0.5F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.world.spawnEntity(wurm);
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the
	 * target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity)
	{
		return checkTarget(entity, EnumFactionTypes.PRIMALZERG);
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting)
	{
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.ZERG_CARAPACE, 1 + this.rand.nextInt(2), MetaHandler.CarapaceType.T2.getID()));
		drop.tryDrop(this);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000298023224D);
	}

	@Override
	public int getMaxSpawnedInChunk()
	{
		return 1;
	}

	@Override
	public SoundEvent getAmbientSound()
	{
		Random rand = new Random();

		switch (rand.nextInt(1))
		{
		case 0:
			return SoundHandler.ENTITY_MUTALISK_LIVE1;
		default:
			return SoundHandler.ENTITY_MUTALISK_LIVE2;
		}
	}

	@Override
	public SoundEvent getDeathSound()
	{
		return SoundHandler.ENTITY_MUTALISK_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source)
	{
		return SoundHandler.ENTITY_MUTALISK_HURT;
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	@Override
	protected float getSoundVolume()
	{
		return 2.5F;
	}

	static class AILookAround extends EntityAIBase
	{
		private final EntityMutaliskPrimal parentEntity;

		public AILookAround(EntityMutaliskPrimal kakaru)
		{
			this.parentEntity = kakaru;
			this.setMutexBits(2);
		}

		/**
		 * Returns whether the EntityAIBase should begin execution.
		 */
		public boolean shouldExecute()
		{
			return true;
		}

		/**
		 * Updates the task
		 */
		public void updateTask()
		{
			if (this.parentEntity.getAttackTarget() == null)
			{
				this.parentEntity.rotationYaw = -((float) MathHelper.atan2(this.parentEntity.motionX, this.parentEntity.motionZ)) * (180F / (float) Math.PI);
				this.parentEntity.renderYawOffset = this.parentEntity.rotationYaw;
			} else
			{
				EntityLivingBase entitylivingbase = this.parentEntity.getAttackTarget();
				double d0 = 64.0D;

				if (entitylivingbase.getDistance(this.parentEntity) < 4096.0D)
				{
					double d1 = entitylivingbase.posX - this.parentEntity.posX;
					double d2 = entitylivingbase.posZ - this.parentEntity.posZ;
					this.parentEntity.rotationYaw = -((float) MathHelper.atan2(d1, d2)) * (180F / (float) Math.PI);
					this.parentEntity.renderYawOffset = this.parentEntity.rotationYaw;
				}
			}
		}
	}

	static class AIRandomFly extends EntityAIBase
	{
		private final EntityMutaliskPrimal parentEntity;

		public AIRandomFly(EntityMutaliskPrimal kakaru)
		{
			this.parentEntity = kakaru;
			this.setMutexBits(1);
		}

		/**
		 * Returns whether the EntityAIBase should begin execution.
		 */
		public boolean shouldExecute()
		{
			EntityMoveHelper entitymovehelper = this.parentEntity.getMoveHelper();

			if (!entitymovehelper.isUpdating())
			{
				return true;
			} else
			{
				double d0 = entitymovehelper.getX() - this.parentEntity.posX;
				double d1 = entitymovehelper.getY() - this.parentEntity.posY;
				double d2 = entitymovehelper.getZ() - this.parentEntity.posZ;
				double d3 = d0 * d0 + d1 * d1 + d2 * d2;
				return d3 < 1.0D || d3 > 3600.0D;
			}
		}

		/**
		 * Returns whether an in-progress EntityAIBase should continue executing
		 */
		public boolean continueExecuting()
		{
			return false;
		}

		/**
		 * Execute a one shot task or start executing a continuous task
		 */
		public void startExecuting()
		{
			Random random = this.parentEntity.getRNG();
			double d0 = this.parentEntity.posX + (double) ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
			double d1 = this.parentEntity.posY + (double) ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
			double d2 = this.parentEntity.posZ + (double) ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
			this.parentEntity.getMoveHelper().setMoveTo(d0, d1, d2, 1.0D);
		}
	}

	static class MutaliskMoveHelper extends EntityMoveHelper
	{
		private final EntityMutaliskPrimal parentEntity;
		private int courseChangeCooldown;

		public MutaliskMoveHelper(EntityMutaliskPrimal kakaru)
		{
			super(kakaru);
			this.parentEntity = kakaru;
		}

		public void onUpdateMoveHelper()
		{
			if (this.action == EntityMoveHelper.Action.MOVE_TO)
			{
				double d0 = this.posX - this.parentEntity.posX;
				double d1 = this.posY - this.parentEntity.posY;
				double d2 = this.posZ - this.parentEntity.posZ;
				double d3 = d0 * d0 + d1 * d1 + d2 * d2;

				if (this.courseChangeCooldown-- <= 0)
				{
					this.courseChangeCooldown += this.parentEntity.getRNG().nextInt(5) + 2;
					d3 = (double) MathHelper.sqrt(d3);

					if (this.isNotColliding(this.posX, this.posY, this.posZ, d3))
					{
						this.parentEntity.motionX += d0 / d3 * 0.1D;
						this.parentEntity.motionY += d1 / d3 * 0.1D;
						this.parentEntity.motionZ += d2 / d3 * 0.1D;
					} else
					{
						this.action = EntityMoveHelper.Action.WAIT;
					}
				}
			}
		}

		/**
		 * Checks if entity bounding box is not colliding with terrain
		 */
		private boolean isNotColliding(double x, double y, double z, double p_179926_7_)
		{
			double d0 = (x - this.parentEntity.posX) / p_179926_7_;
			double d1 = (y - this.parentEntity.posY) / p_179926_7_;
			double d2 = (z - this.parentEntity.posZ) / p_179926_7_;
			AxisAlignedBB axisalignedbb = this.parentEntity.getEntityBoundingBox();

			for (int i = 1; (double) i < p_179926_7_; ++i)
			{
				axisalignedbb = axisalignedbb.offset(d0, d1, d2);

				if (!this.parentEntity.world.getCollisionBoxes(this.parentEntity, axisalignedbb).isEmpty())
				{
					return false;
				}
			}

			return true;
		}
	}

	@Override
	public void setSwingingArms(boolean swingingArms)
	{

	}
}
