package com.hypeirochus.scmc.client.renderer.particle;

import javax.annotation.Nullable;

import com.ocelot.api.utils.TextureUtils;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//TODO: MOVE TO CORE MOD, talk to ocelot about what the hell this is??
@SideOnly(Side.CLIENT)
public class CustomTextureDestroyEffect extends Particle
{

	private IBlockState sourceState;
	private ResourceLocation texture;
	private int u, v, width, height;
	private BlockPos sourcePos;

	public CustomTextureDestroyEffect(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, IBlockState state, ResourceLocation texture, int u, int v, int width, int height)
	{
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
		this.sourceState = state;
		this.texture = texture;
		this.u = u;
		this.v = v;
		this.width = width;
		this.height = height;
		this.particleGravity = state.getBlock().blockParticleGravity;
		this.particleRed = 0.6F;
		this.particleGreen = 0.6F;
		this.particleBlue = 0.6F;
		this.particleScale = 1.0F;
	}

	/**
	 * Sets the position of the block that this particle came from. Used for
	 * calculating texture and color multiplier.
	 */
	public CustomTextureDestroyEffect setBlockPos(BlockPos pos)
	{
		this.sourcePos = pos;

		if (this.sourceState.getBlock() == Blocks.GRASS)
		{
			return this;
		} else
		{
			this.multiplyColor(pos);
			return this;
		}
	}

	public CustomTextureDestroyEffect init()
	{
		this.sourcePos = new BlockPos(this.posX, this.posY, this.posZ);
		Block block = this.sourceState.getBlock();

		if (block == Blocks.GRASS)
		{
			return this;
		} else
		{
			this.multiplyColor(this.sourcePos);
			return this;
		}
	}

	protected void multiplyColor(@Nullable BlockPos p_187154_1_)
	{
		int i = Minecraft.getMinecraft().getBlockColors().colorMultiplier(this.sourceState, this.world, p_187154_1_, 0);
		this.particleRed *= (float) (i >> 16 & 255) / 255.0F;
		this.particleGreen *= (float) (i >> 8 & 255) / 255.0F;
		this.particleBlue *= (float) (i & 255) / 255.0F;
	}

	/**
	 * Retrieve what effect layer (what texture) the particle should be rendered
	 * with. 0 for the particle sprite sheet, 1 for the main Texture atlas, and 3
	 * for a custom texture
	 */
	public int getFXLayer()
	{
		return 3;
	}

	/**
	 * Renders the particle
	 */
	public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ)
	{
		// TODO finish this class
		TextureUtils.bindTexture(texture);
		// float f = (float) this.particleTextureIndexX / 16.0F;
		// float f1 = f + 0.0624375F;
		// float f2 = (float) this.particleTextureIndexY / 16.0F;
		// float f3 = f2 + 0.0624375F;
		// float f4 = 0.1F * this.particleScale;
		//
		// f = u;
		// f1 = v;
		// f2 = width;
		// f3 = height;
		//
		float f5 = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) partialTicks - interpPosX);
		float f6 = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) partialTicks - interpPosY);
		float f7 = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) partialTicks - interpPosZ);
		// int i = this.getBrightnessForRender(partialTicks);
		// int j = i >> 16 & 65535;
		// int k = i & 65535;
		// Vec3d[] avec3d = new Vec3d[] { new Vec3d((double) (-rotationX * f4 -
		// rotationXY * f4), (double) (-rotationZ * f4), (double) (-rotationYZ * f4 -
		// rotationXZ * f4)), new Vec3d((double) (-rotationX * f4 + rotationXY * f4),
		// (double) (rotationZ * f4), (double) (-rotationYZ * f4 + rotationXZ * f4)),
		// new Vec3d((double) (rotationX * f4 + rotationXY * f4), (double) (rotationZ *
		// f4), (double) (rotationYZ * f4 + rotationXZ * f4)), new Vec3d((double)
		// (rotationX * f4 - rotationXY * f4), (double) (-rotationZ * f4), (double)
		// (rotationYZ * f4 - rotationXZ * f4)) };
		//
		// float f8 = this.particleAngle + (this.particleAngle - this.prevParticleAngle)
		// * partialTicks;
		// float f9 = MathHelper.cos(f8 * 0.5F);
		// float f10 = MathHelper.sin(f8 * 0.5F) * (float) cameraViewDir.x;
		// float f11 = MathHelper.sin(f8 * 0.5F) * (float) cameraViewDir.y;
		// float f12 = MathHelper.sin(f8 * 0.5F) * (float) cameraViewDir.z;
		// Vec3d vec3d = new Vec3d((double) f10, (double) f11, (double) f12);
		//
		// for (int l = 0; l < 4; ++l) {
		// avec3d[l] = vec3d.scale(2.0D *
		// avec3d[l].dotProduct(vec3d)).add(avec3d[l].scale((double) (f9 * f9) -
		// vec3d.dotProduct(vec3d))).add(vec3d.crossProduct(avec3d[l]).scale((double)
		// (2.0F * f9)));
		// }

		// buffer.pos((double) f5 + avec3d[0].x, (double) f6 + avec3d[0].y, (double) f7
		// + avec3d[0].z).tex((double) f1, (double) f3).color(this.particleRed,
		// this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(j,
		// k).endVertex();
		// buffer.pos((double) f5 + avec3d[1].x, (double) f6 + avec3d[1].y, (double) f7
		// + avec3d[1].z).tex((double) f1, (double) f2).color(this.particleRed,
		// this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(j,
		// k).endVertex();
		// buffer.pos((double) f5 + avec3d[2].x, (double) f6 + avec3d[2].y, (double) f7
		// + avec3d[2].z).tex((double) f, (double) f2).color(this.particleRed,
		// this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(j,
		// k).endVertex();
		// buffer.pos((double) f5 + avec3d[3].x, (double) f6 + avec3d[3].y, (double) f7
		// + avec3d[3].z).tex((double) f, (double) f3).color(this.particleRed,
		// this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(j,
		// k).endVertex();
		GlStateManager.pushMatrix();
		GlStateManager.translate(f5, f6, f7);
		Gui.drawRect(0, 0, 1, 1, 0xff000000);
		GlStateManager.popMatrix();
	}

	public int getBrightnessForRender(float p_189214_1_)
	{
		int i = super.getBrightnessForRender(p_189214_1_);
		int j = 0;

		if (this.world.isBlockLoaded(this.sourcePos))
		{
			j = this.world.getCombinedLight(this.sourcePos, 0);
		}

		return i == 0 ? j : i;
	}
}