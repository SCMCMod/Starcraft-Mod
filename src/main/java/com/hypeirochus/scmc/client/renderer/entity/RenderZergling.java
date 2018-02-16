package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.api.client.render.Draw;
import com.hypeirochus.api.client.render.OpenGL;
import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.model.ModelZergling;
import com.hypeirochus.scmc.entity.living.EntityZergling;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.WorldInfo;

public class RenderZergling extends RenderLiving<EntityZergling> implements LayerRenderer<EntityZergling> {

	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.ZERGLING_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.ZERGLING_OVERLAY);
	private static final ResourceLocation	STATICGLOW	= new ResourceLocation(Resources.ZERGLING_GLOW_STATIC);
	private final RenderZergling			RENDERER;
	protected ModelZergling					model;

	protected ItemStack icon = new ItemStack(ItemHandler.ICON_ZERG);
	
	public RenderZergling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZergling) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZergling entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
		OpenGL.pushMatrix();
		{
			GlStateManager.disableCull();

			OpenGL.translate(x, y + 3.5F, z);

			if (entity != null && entity.world.getClosestPlayerToEntity(entity, 8.0D) != null) {
				float scale = 0.04F;
				OpenGL.scale(scale, scale, scale);
				OpenGL.disableLight();

				OpenGL.pushMatrix();
				{
					OpenGL.rotate(AccessHandler.getMinecraft().player.rotationYaw + 180, 0F, -1F, 0F);
					OpenGL.pushMatrix();
					{
						OpenGL.rotate(180, -1F, 0F, 0F);
						Draw.renderItem(icon, -7, 15);
						Draw.drawString((entity.getFactionAsString().toLowerCase()), -15, 30, 0xFF761674, false);
						scale = 0.5F;
						OpenGL.scale(scale, scale, scale);
					}
					OpenGL.popMatrix();
				}
				OpenGL.popMatrix();

				OpenGL.enableLight();
			}
		}
		OpenGL.popMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZergling entity) {
		return BASE;
	}
	
	@Override
	protected void preRenderCallback(EntityZergling entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));
	}

	@Override
	public void doRenderLayer(EntityZergling entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}