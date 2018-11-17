package com.ocelot.api.utils;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//TODO: MOVE TO CORE MOD
public class WorldUtils
{

	/**
	 * Returns an entity that is found within the distance facing the player's look
	 * vector.
	 * 
	 * @param distance The distance of the ray search area
	 * @return The entity that was found in the path of the ray
	 * @deprecated Use {@link #getRay(double)} instead of this.
	 */
	public static EntityLivingBase getEntity(double distance)
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
				} else if (movingobjectposition != null)
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
						} else
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
		if (omo != null)
		{
			if (omo.typeOfHit == RayTraceResult.Type.ENTITY)
			{
				if (omo.entityHit instanceof EntityLivingBase)
				{
					return (EntityLivingBase) omo.entityHit;
				}
			}
		}
		return null;
	}

	/**
	 * Returns a ray that is found within the distance facing the player's look
	 * vector.
	 * 
	 * @param distance The distance of the ray search area
	 * @return The ray that was created
	 */
	@Nullable
	public static RayTraceResult getRay(double distance)
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
				} else if (movingobjectposition != null)
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
						} else
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

	/**
	 * Renders a block at the specified position
	 * 
	 * @param world The world
	 * @param state The state to render
	 * @param pos The position to render at
	 * @param tessellator The tessellator instance
	 * @param buffer The buffer instance
	 */
	@SideOnly(Side.CLIENT)
	public static void renderBlock(World world, IBlockState state, BlockPos pos, Tessellator tessellator, BufferBuilder buffer)
	{
		buffer.begin(7, DefaultVertexFormats.BLOCK);
		BlockRendererDispatcher blockrendererdispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
		blockrendererdispatcher.getBlockModelRenderer().renderModel(world, blockrendererdispatcher.getModelForState(state), state, pos, buffer, false, MathHelper.getPositionRandom(pos));
		tessellator.draw();
	}

	/**
	 * Renders a bounding box at the specifed pos with the specified size.
	 * 
	 * @param tessellator The tessellator instance
	 * @param buffer The buffer instance
	 * @param x The x start of the box
	 * @param y The y start of the box
	 * @param z The z start of the box
	 * @param x1 The x size of the box
	 * @param y1 The y size of the box
	 * @param z1 The z size of the box
	 * @param xPos The x pos of the box
	 * @param yPos The x pos of the box
	 * @param zPos The x pos of the box
	 */
	private void renderBox(Tessellator tessellator, BufferBuilder buffer, double x, double y, double z, double x1, double y1, double z1, int xPos, int yPos, int zPos)
	{
		GlStateManager.glLineWidth(2.0F);
		buffer.begin(3, DefaultVertexFormats.POSITION_COLOR);
		buffer.pos(x, y, z).color((float) yPos, (float) yPos, (float) yPos, 0.0F).endVertex();
		buffer.pos(x, y, z).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x1, y, z).color(yPos, zPos, zPos, xPos).endVertex();
		buffer.pos(x1, y, z1).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x, y, z1).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x, y, z).color(zPos, zPos, yPos, xPos).endVertex();
		buffer.pos(x, y1, z).color(zPos, yPos, zPos, xPos).endVertex();
		buffer.pos(x1, y1, z).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x1, y1, z1).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x, y1, z1).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x, y1, z).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x, y1, z1).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x, y, z1).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x1, y, z1).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x1, y1, z1).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x1, y1, z).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x1, y, z).color(yPos, yPos, yPos, xPos).endVertex();
		buffer.pos(x1, y, z).color((float) yPos, (float) yPos, (float) yPos, 0.0F).endVertex();
		tessellator.draw();
	}
}