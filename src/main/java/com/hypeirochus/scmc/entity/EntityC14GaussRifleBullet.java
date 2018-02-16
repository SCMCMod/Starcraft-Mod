package com.hypeirochus.scmc.entity;

import com.hypeirochus.scmc.entity.living.EntityMarine;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityC14GaussRifleBullet extends EntityThrowable {

	public EntityC14GaussRifleBullet(World worldIn) {
		super(worldIn);
		float size = 0.25f;
		this.setSize(size, size);
	}

	public EntityC14GaussRifleBullet(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
		this.setLocationAndAngles(throwerIn.posX, throwerIn.posY + throwerIn.getEyeHeight(), throwerIn.posZ, throwerIn.rotationYaw, throwerIn.rotationPitch);
		this.posY -= 0.1D;
		this.setPosition(this.posX, this.posY, this.posZ);
		this.motionX = -MathHelper.sin((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		this.motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		this.motionZ = MathHelper.cos((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		this.setThrowableHeading(motionX, motionY, motionZ, 1.8F, 1.0F);
	}

	public static void registerFixes(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "C14GaussRifleBullet");
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		if (ticksExisted > 100) {
			setDead();
		}
	}

	@Override
	protected float getGravityVelocity() {
		return 0;
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	@Override
	protected void onImpact(RayTraceResult result) {
		if (!world.isRemote) {
			if (result.entityHit != null && result.entityHit != this.getThrower()) {
				float i = 6.0F;

				if (result.entityHit instanceof EntityMarine) {
					i = 0;
				}
				if (result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), i)) {
					setDead();
				}
			}
		}
	}
}