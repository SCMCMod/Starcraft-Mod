package com.hypeirochus.scmc.entity;

import com.hypeirochus.scmc.damagesource.StarcraftDamageSources;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityHydraliskSpike extends EntityThrowable
{

	public EntityHydraliskSpike(World worldIn)
	{
		super(worldIn);
		float size = 0.05f;
		this.setSize(size, size);
	}

	public EntityHydraliskSpike(World worldIn, EntityLivingBase throwerIn)
	{
		super(worldIn, throwerIn);
	}

	public void shoot(double x, double y, double z, float velocity, float inaccuracy)
	{
		float f = MathHelper.sqrt(x * x + y * y + z * z);
		x = x / (double) f;
		y = y / (double) f;
		z = z / (double) f;
		x = x + this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
		y = y + this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
		z = z + this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
		x = x * (double) velocity;
		y = y * (double) velocity;
		z = z * (double) velocity;
		this.motionX = x;
		this.motionY = y;
		this.motionZ = z;
		float f1 = MathHelper.sqrt(x * x + z * z);
		this.rotationYaw = (float) (MathHelper.atan2(x, z) * (180D / Math.PI));
		this.rotationPitch = (float) (MathHelper.atan2(y, (double) f1) * (180D / Math.PI));
		this.prevRotationYaw = this.rotationYaw;
		this.prevRotationPitch = this.rotationPitch;
	}

	public static void registerFixesSnowball(DataFixer fixer)
	{
		EntityThrowable.registerFixesThrowable(fixer, "HydraliskSpike");
	}

	@Override
	protected float getGravityVelocity()
	{
		return 0;
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	@Override
	protected void onImpact(RayTraceResult result)
	{
		if (result.entityHit != null)
		{
			float i = 6.0F;
			result.entityHit.attackEntityFrom(StarcraftDamageSources.causeHydraliskNeedleDamage(this, this.getThrower()), i);
			this.setDead();
		}
	}
}