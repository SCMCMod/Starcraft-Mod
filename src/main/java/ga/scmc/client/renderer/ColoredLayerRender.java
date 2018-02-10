package ga.scmc.client.renderer;

import org.lwjgl.opengl.GL11;

import ga.scmc.api.IEntityTeamColorable;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

/**
 * The code to rendering the entity layers
 * 
 * @author CJMinecraft
 */
public class ColoredLayerRender {

	public static <T extends EntityLiving> void render(RenderLiving<T> renderer, T entity, ResourceLocation overlayTexture, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if (entity instanceof IEntityTeamColorable) {
			IEntityTeamColorable<T> entityTeam = (IEntityTeamColorable<T>) entity;
			renderer.bindTexture(overlayTexture);

			if (entity.isInvisible())
				GlStateManager.depthMask(false);
			else
				GlStateManager.depthMask(true);

			GlStateManager.color(entityTeam.getTeamColor().getR() / 255.0F, entityTeam.getTeamColor().getG() / 255.0F, entityTeam.getTeamColor().getB() / 255.0F);
			renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	public static <T extends EntityLiving> void renderDynamicGlow(RenderLiving<T> renderer, T entity, ResourceLocation overlayTexture, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, float partialTicks) {
		if (entity instanceof IEntityTeamColorable) {
			IEntityTeamColorable<T> entityTeam = (IEntityTeamColorable<T>) entity;
			renderer.bindTexture(overlayTexture);
			GlStateManager.enableAlpha();

			if (entity.isInvisible()) {
				GlStateManager.depthMask(false);
			} else {
				GlStateManager.depthMask(true);
			}

			int i = 61680;
			int j = i % 65536;
			int k = i / 65536;
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glColor3f(entityTeam.getTeamColor().getR() / 255, entityTeam.getTeamColor().getG() / 255, entityTeam.getTeamColor().getB() / 255);
			renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
			i = entity.getBrightnessForRender(partialTicks);
			j = i % 65536;
			k = i / 65536;
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
			renderer.setLightmap(entity, partialTicks);
			GlStateManager.enableAlpha();
			GlStateManager.resetColor();
		}
	}

	public static <T extends EntityLiving> void renderStaticGlow(RenderLiving<T> renderer, T entity, ResourceLocation overlayTexture, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, float partialTicks) {
		if (entity instanceof IEntityTeamColorable) {
			if (!entity.isInvisible()) {
				renderer.bindTexture(overlayTexture);
				GlStateManager.enableAlpha();

				int i = 61680;
				int j = i % 65536;
				int k = i / 65536;
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
				GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
				renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
				i = entity.getBrightnessForRender(partialTicks);
				j = i % 65536;
				k = i / 65536;
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
				renderer.setLightmap(entity, partialTicks);
				GlStateManager.enableAlpha();
				GlStateManager.color(1, 1, 1, 1);
			}
		}
	}
}