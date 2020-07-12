/**
 * Starcraft-Mod
 * Copyright (C) 2020
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.scmcmod.utils;

import java.util.HashSet;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class RayTracing {
	
	/**
	 * Ray traces from the player's head to the distance supplied.
	 * 
	 * @param distance The distance of the ray search area
	 * @return The result of that ray trace
	 */
	@Nullable
	public static RayTraceResult rayTrace(double distance)
	{
		Minecraft mc = Minecraft.getMinecraft();
		float partialTicks = mc.getRenderPartialTicks();

		Entity pointedEntity;
		double d0 = distance;
		RayTraceResult omo = mc.getRenderViewEntity().rayTrace(d0, partialTicks);
		double d1 = d0;
		Vec3d vec3 = mc.getRenderViewEntity().getPositionEyes(partialTicks);
		Vec3d vec31 = mc.getRenderViewEntity().getLook(partialTicks);
		Vec3d vec32 = vec3.add(vec31.x * d0, vec31.y * d0, vec31.z * d0);
		pointedEntity = null;
		Vec3d vec33 = null;
		float f1 = 1.0F;
		List list = mc.world.getEntitiesWithinAABBExcludingEntity(mc.getRenderViewEntity(), mc.getRenderViewEntity().getEntityBoundingBox().grow(vec31.x * d0, vec31.y * d0, vec31.z * d0).expand((double) f1, (double) f1, (double) f1));
		double d2 = d1;

		for (int i = 0; i < list.size(); ++i)
		{
			Entity entity = (Entity) list.get(i);

			if (entity.canBeCollidedWith())
			{
				float f2 = entity.getCollisionBorderSize();
				AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand((double) f2, (double) f2, (double) f2);
				RayTraceResult movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);

				if (axisalignedbb.contains(vec3))
				{
					if (0.0D < d2 || d2 == 0.0D)
					{
						pointedEntity = entity;
						vec33 = movingobjectposition == null ? vec3 : movingobjectposition.hitVec;
						d2 = 0.0D;
					}
				}
				else if (movingobjectposition != null)
				{
					double d3 = vec3.distanceTo(movingobjectposition.hitVec);

					if (d3 < d2 || d2 == 0.0D)
					{
						if (entity == mc.getRenderViewEntity().getRidingEntity() && !entity.canRiderInteract())
						{
							if (d2 == 0.0D)
							{
								pointedEntity = entity;
								vec33 = movingobjectposition.hitVec;
							}
						}
						else
						{
							pointedEntity = entity;
							vec33 = movingobjectposition.hitVec;
							d2 = d3;
						}
					}
				}
			}
		}
		if (pointedEntity != null && (d2 < d1 || omo == null))
		{
			omo = new RayTraceResult(pointedEntity, vec33);

			if (pointedEntity instanceof EntityLivingBase || pointedEntity instanceof EntityItemFrame)
			{
				mc.pointedEntity = pointedEntity;
			}
		}
		return omo;
	}
	
	
    public static RayTraceResult raytrace(World world, double x, double y, double z, double tx, double ty, double tz, float borderSize, HashSet<Entity> excluded) {
		Vec3d startVec = new Vec3d(x, y, z);
        Vec3d lookVec = new Vec3d(tx - x, ty - y, tz - z);
        Vec3d endVec = new Vec3d(tx, ty, tz);
		float minX = (float)(x < tx ? x : tx);
		float minY = (float)(y < ty ? y : ty);
		float minZ = (float)(z < tz ? z : tz);
		float maxX = (float)(x > tx ? x : tx);
		float maxY = (float)(y > ty ? y : ty);
		float maxZ = (float)(z > tz ? z : tz);

		// Get Block Collision:
        RayTraceResult collision = world.rayTraceBlocks(startVec, endVec, false);
		startVec = new Vec3d(x, y, z);
		endVec = new Vec3d(tx, ty, tz);
		float maxDistance = (float)endVec.distanceTo(startVec);
		if(collision != null)
			maxDistance = (float)collision.hitVec.distanceTo(startVec);

		// Get Entity Collision:
		if(excluded != null) {
			AxisAlignedBB bb = new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ).expand(borderSize, borderSize, borderSize);
			List<Entity> allEntities = world.getEntitiesWithinAABBExcludingEntity(null, bb);
			Entity closestHitEntity = null;
			float closestHit = Float.POSITIVE_INFINITY;
			float currentHit;
			AxisAlignedBB entityBb;
            RayTraceResult intercept;
			for(Entity ent : allEntities) {
				if(ent.canBeCollidedWith() && !excluded.contains(ent)) {
					float entBorder = ent.getCollisionBorderSize();
					entityBb = ent.getEntityBoundingBox();
					if(entityBb != null) {
						entityBb = entityBb.expand(entBorder, entBorder, entBorder);
						intercept = entityBb.calculateIntercept(startVec, endVec);
						if(intercept != null) {
							currentHit = (float) intercept.hitVec.distanceTo(startVec);
							if(currentHit < closestHit || currentHit == 0) {
								closestHit = currentHit;
								closestHitEntity = ent;
							}
						}
					}
				}
			}
			if(closestHitEntity != null)
				collision = new RayTraceResult(closestHitEntity);
		}
		
		return collision;
    }

    public static RayTraceResult raytraceEntities(World world, double x, double y, double z, double tx, double ty, double tz, float borderSize, HashSet<Entity> excluded) {
        Vec3d startVec = new Vec3d(x, y, z);
        Vec3d lookVec = new Vec3d(tx - x, ty - y, tz - z);
        Vec3d endVec = new Vec3d(tx, ty, tz);
		float minX = (float)(x < tx ? x : tx);
		float minY = (float)(y < ty ? y : ty);
		float minZ = (float)(z < tz ? z : tz);
		float maxX = (float)(x > tx ? x : tx);
		float maxY = (float)(y > ty ? y : ty);
		float maxZ = (float)(z > tz ? z : tz);

		// Get Entities and Raytrace Blocks:
		AxisAlignedBB bb = new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ).expand(borderSize, borderSize, borderSize);
		List<Entity> allEntities = world.getEntitiesWithinAABBExcludingEntity(
				null, bb);
        RayTraceResult collision = world.rayTraceBlocks(startVec, endVec, false);

		// Get Entity Collision:
		Entity closestHitEntity = null;
		float closestHit = Float.POSITIVE_INFINITY;
		float currentHit = 0.0f;
		AxisAlignedBB entityBb;
        RayTraceResult intercept;
		for(Entity ent : allEntities) {
			if(ent.canBeCollidedWith() && !excluded.contains(ent)) {
				float entBorder = ent.getCollisionBorderSize();
				entityBb = ent.getEntityBoundingBox();
				if(entityBb != null) {
					entityBb = entityBb.expand(entBorder, entBorder, entBorder);
					intercept = entityBb.calculateIntercept(startVec, endVec);
					if(intercept != null) {
						currentHit = (float) intercept.hitVec.distanceTo(startVec);
						if(currentHit < closestHit || currentHit == 0) {
							closestHit = currentHit;
							closestHitEntity = ent;
						}
					}
				}
			}
		}
		if(closestHitEntity != null)
			collision = new RayTraceResult(closestHitEntity);
		return collision;
    }


}
