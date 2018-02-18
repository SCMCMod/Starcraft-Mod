package com.ocelot.api.utils;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class WorldUtils {

	@Nullable
	public static RayTraceResult blockRayTrace(BlockPos pos, Vec3d start, Vec3d end, AxisAlignedBB boundingBox) {
		Vec3d vec3d = start.subtract((double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
		Vec3d vec3d1 = end.subtract((double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
		RayTraceResult raytraceresult = boundingBox.calculateIntercept(vec3d, vec3d1);
		return raytraceresult == null ? null : new RayTraceResult(raytraceresult.hitVec.addVector((double) pos.getX(), (double) pos.getY(), (double) pos.getZ()), raytraceresult.sideHit, pos);
	}

	/**
	 * Returns an entity that is found within the distance facing the player's look vector.
	 * 
	 * @param distance
	 *            The distance of the ray search area
	 * @return The entity that was found in the path of the ray
	 */
	public static EntityLivingBase getEntity(double distance) {
		Minecraft mc = Minecraft.getMinecraft();
		float partialTicks = mc.getRenderPartialTicks();

		Entity pointedEntity;
		double d0 = distance;
		RayTraceResult omo = mc.renderViewEntity.rayTrace(d0, partialTicks);
		double d1 = d0;
		Vec3d vec3 = mc.renderViewEntity.getPositionEyes(partialTicks);
		Vec3d vec31 = mc.renderViewEntity.getLook(partialTicks);
		Vec3d vec32 = vec3.addVector(vec31.x * d0, vec31.y * d0, vec31.z * d0);
		pointedEntity = null;
		Vec3d vec33 = null;
		float f1 = 1.0F;
		List list = mc.world.getEntitiesWithinAABBExcludingEntity(mc.renderViewEntity, mc.renderViewEntity.getEntityBoundingBox().grow(vec31.x * d0, vec31.y * d0, vec31.z * d0).expand((double) f1, (double) f1, (double) f1));
		double d2 = d1;

		for (int i = 0; i < list.size(); ++i) {
			Entity entity = (Entity) list.get(i);

			if (entity.canBeCollidedWith()) {
				float f2 = entity.getCollisionBorderSize();
				AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand((double) f2, (double) f2, (double) f2);
				RayTraceResult movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);

				if (axisalignedbb.contains(vec3)) {
					if (0.0D < d2 || d2 == 0.0D) {
						pointedEntity = entity;
						vec33 = movingobjectposition == null ? vec3 : movingobjectposition.hitVec;
						d2 = 0.0D;
					}
				} else if (movingobjectposition != null) {
					double d3 = vec3.distanceTo(movingobjectposition.hitVec);

					if (d3 < d2 || d2 == 0.0D) {
						if (entity == mc.renderViewEntity.getRidingEntity() && !entity.canRiderInteract()) {
							if (d2 == 0.0D) {
								pointedEntity = entity;
								vec33 = movingobjectposition.hitVec;
							}
						} else {
							pointedEntity = entity;
							vec33 = movingobjectposition.hitVec;
							d2 = d3;
						}
					}
				}
			}
		}
		if (pointedEntity != null && (d2 < d1 || omo == null)) {
			omo = new RayTraceResult(pointedEntity, vec33);

			if (pointedEntity instanceof EntityLivingBase || pointedEntity instanceof EntityItemFrame) {
				mc.pointedEntity = pointedEntity;
			}
		}
		if (omo != null) {
			if (omo.typeOfHit == RayTraceResult.Type.ENTITY) {
				if (omo.entityHit instanceof EntityLivingBase) {
					return (EntityLivingBase) omo.entityHit;
				}
			}
		}
		return null;
	}
}