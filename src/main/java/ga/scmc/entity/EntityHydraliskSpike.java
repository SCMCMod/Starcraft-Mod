package ga.scmc.entity;

import ga.scmc.StarcraftDamageSources;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityHydraliskSpike extends EntityThrowable {

	public EntityHydraliskSpike(World worldIn) {
		super(worldIn);
		float size = 0.05f;
		this.setSize(size, size);
	}

	public EntityHydraliskSpike(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
		this.setLocationAndAngles(throwerIn.posX, throwerIn.posY + throwerIn.getEyeHeight(), throwerIn.posZ, throwerIn.rotationYaw, throwerIn.rotationPitch);
		this.posX -= MathHelper.cos((rotationYaw / 180F) * 3.141593F) * 0.16F;
		this.posY -= 0.1D;
		this.posZ -= MathHelper.sin((rotationYaw / 180F) * 3.141593F) * 0.16F;
		this.setPosition(this.posX, this.posY, this.posZ);
		this.motionX = -MathHelper.sin((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		this.motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		this.motionZ = MathHelper.cos((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		this.setThrowableHeading(motionX, motionY, motionZ, 1.8F, 1.0F);
	}

	public static void registerFixesSnowball(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "HydraliskSpike");
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
		if (result.entityHit != null) {
			float i = 6.0F;
			result.entityHit.attackEntityFrom(StarcraftDamageSources.causeHydraliskNeedleDamage(this, this.getThrower()), i);
			this.setDead();
		}
	}
}