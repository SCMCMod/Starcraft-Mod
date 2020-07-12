package com.arpaesis.scmc.client.renderer.particle;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector4f;

import com.ocelot.api.utils.TextureUtils;

import net.minecraft.client.particle.ParticleDigging;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ParticleCustomDigging extends ParticleDigging
{

	private ResourceLocation texture;
	private Vector4f textureCoords;

	public ParticleCustomDigging(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, ResourceLocation texture, Vector4f textureCoords)
	{
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn, Blocks.DIRT.getDefaultState());
		this.texture = texture;
		this.textureCoords = textureCoords;
	}

	@Override
	public void renderParticle(BufferBuilder buffer, Entity entity, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ)
	{
		float f = ((float) this.textureCoords.x + this.particleTextureJitterX / 4.0F) / 16.0F;
		float f1 = f + 0.015609375F;
		float f2 = ((float) this.textureCoords.y + this.particleTextureJitterY / 4.0F) / 16.0F;
		float f3 = f2 + 0.015609375F;
		float f4 = 0.1F * this.particleScale;

		{
			f = this.getInterpolatedU((double) (this.particleTextureJitterX / 4.0F * 16.0F));
			f1 = this.getInterpolatedU((double) ((this.particleTextureJitterX + 1.0F) / 4.0F * 16.0F));
			f2 = this.getInterpolatedV((double) (this.particleTextureJitterY / 4.0F * 16.0F));
			f3 = this.getInterpolatedV((double) ((this.particleTextureJitterY + 1.0F) / 4.0F * 16.0F));
		}

		float f5 = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) partialTicks - interpPosX);
		float f6 = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) partialTicks - interpPosY);
		float f7 = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) partialTicks - interpPosZ);
		int i = this.getBrightnessForRender(partialTicks);
		int j = i >> 16 & 65535;
		int k = i & 65535;

		CoreUtil.bindTexture(this.texture);

		buffer.pos((double) (f5 - rotationX * f4 - rotationXY * f4), (double) (f6 - rotationZ * f4), (double) (f7 - rotationYZ * f4 - rotationXZ * f4)).tex((double) f, (double) f3).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
		buffer.pos((double) (f5 - rotationX * f4 + rotationXY * f4), (double) (f6 + rotationZ * f4), (double) (f7 - rotationYZ * f4 + rotationXZ * f4)).tex((double) f, (double) f2).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
		buffer.pos((double) (f5 + rotationX * f4 + rotationXY * f4), (double) (f6 + rotationZ * f4), (double) (f7 + rotationYZ * f4 + rotationXZ * f4)).tex((double) f1, (double) f2).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
		buffer.pos((double) (f5 + rotationX * f4 - rotationXY * f4), (double) (f6 - rotationZ * f4), (double) (f7 + rotationYZ * f4 - rotationXZ * f4)).tex((double) f1, (double) f3).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
		Tessellator.getInstance().draw();
		buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);

		CoreUtil.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
	}

	public float getInterpolatedU(double u)
	{
		float f = this.textureCoords.z / 16;
		return this.textureCoords.x + f * (float) u / 16.0F;
	}

	public float getInterpolatedV(double v)
	{
		float f = this.textureCoords.w / 16;
		return this.textureCoords.y + f * (float) v / 16.0F;
	}
}