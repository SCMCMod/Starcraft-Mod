package com.arpaesis.scmc.client.renderer;

import org.lwjgl.opengl.GL11;

import com.arpaesis.scmc.api.IEntityTeamColorable;
import com.arpaesis.scmc.entity.living.EntityProtossMob;
import com.arpaesis.scmc.entity.living.EntityProtossPassive;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

/**
 * The code to rendering the entity layers
 * 
 * @author CJMinecraft
 */
//TODO: MOVE TO CORE MOD
public class SCRenderUtilities
{

	public static <T extends EntityLiving> void render(RenderLiving<T> renderer, T entity, ResourceLocation overlayTexture, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		if (entity instanceof IEntityTeamColorable)
		{
			IEntityTeamColorable<T> entityTeam = (IEntityTeamColorable<T>) entity;
			renderer.bindTexture(overlayTexture);

			if (entity.isInvisible())
				GlStateManager.depthMask(false);
			else
				GlStateManager.depthMask(true);

			GlStateManager.color(entityTeam.getColor().getR() / 255.0F, entityTeam.getColor().getG() / 255.0F, entityTeam.getColor().getB() / 255.0F);
			renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	public static <T extends EntityLiving> void renderDynamicGlow(RenderLiving<T> renderer, T entity, ResourceLocation overlayTexture, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, float partialTicks)
	{
		if (entity instanceof IEntityTeamColorable)
		{
			IEntityTeamColorable<T> entityTeam = (IEntityTeamColorable<T>) entity;
			renderer.bindTexture(overlayTexture);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

			if (entity.isInvisible())
			{
				GlStateManager.depthMask(false);
			} else
			{
				GlStateManager.depthMask(true);
			}

			int i = 61680;
			int j = i % 65536;
			int k = i / 65536;
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glColor3f(entityTeam.getColor().getR() / 255, entityTeam.getColor().getG() / 255, entityTeam.getColor().getB() / 255);
			renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
			i = entity.getBrightnessForRender();
			j = i % 65536;
			k = i / 65536;
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
			renderer.setLightmap(entity);
			GlStateManager.disableBlend();
			GlStateManager.resetColor();
		}
	}

	public static <T extends EntityLiving> void renderStaticGlow(RenderLiving<T> renderer, T entity, ResourceLocation overlayTexture, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, float partialTicks)
	{
		if (entity instanceof IEntityTeamColorable)
		{
			if (!entity.isInvisible())
			{
				renderer.bindTexture(overlayTexture);
				GlStateManager.enableBlend();
				GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

				int i = 61680;
				int j = i % 65536;
				int k = i / 65536;
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
				GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
				renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
				i = entity.getBrightnessForRender();
				j = i % 65536;
				k = i / 65536;
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
				renderer.setLightmap(entity);
				GlStateManager.disableBlend();
				GlStateManager.color(1, 1, 1, 1);
			}
		}
	}

	public static <T extends EntityProtossMob> void renderShields(ModelBase shields, T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
	{
		if (entity.getShields() > 0f)
		{
			GlStateManager.pushMatrix();

			GlStateManager.color(0.4f, 0.4f, 1f, MathHelper.clamp((float) entity.cooldown / 48, 0.0f, 0.4f));
			GlStateManager.disableTexture2D();
			GlStateManager.depthMask(false);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			shields.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
			GlStateManager.scale(1f, 1f, 1.1f);
			GlStateManager.translate(0f, 0f, -0.025f);
			shields.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

			GlStateManager.disableBlend();
			GlStateManager.depthMask(true);
			GlStateManager.enableTexture2D();

			GlStateManager.popMatrix();
		}
	}

	public static <T extends EntityProtossPassive> void renderShields(ModelBase shields, T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
	{
		if (entity.getShields() > 0f)
		{
			GlStateManager.pushMatrix();

			GlStateManager.color(0.4f, 0.4f, 1f, MathHelper.clamp((float) entity.cooldown / 48, 0.0f, 0.4f));
			GlStateManager.disableTexture2D();
			GlStateManager.depthMask(false);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			shields.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
			GlStateManager.scale(1f, 1f, 1.1f);
			GlStateManager.translate(0f, 0f, -0.025f);
			shields.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

			GlStateManager.disableBlend();
			GlStateManager.depthMask(true);
			GlStateManager.enableTexture2D();

			GlStateManager.popMatrix();
		}
	}
}