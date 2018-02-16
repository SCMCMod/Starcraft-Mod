package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.model.ModelZerglingPrimalDehakaBoost;
import com.hypeirochus.scmc.entity.living.EntityZerglingPrimalDehakaBoost;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingPrimalDehakaBoost extends RenderLiving<EntityZerglingPrimalDehakaBoost> implements LayerRenderer<EntityZerglingPrimalDehakaBoost> {

	private static final ResourceLocation			BASE		= new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKABOOST_BASE);
	private static final ResourceLocation			OVERLAY		= new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_OVERLAY);
	private static final ResourceLocation			STATICGLOW	= new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_GLOW_STATIC);
	private final RenderZerglingPrimalDehakaBoost	RENDERER;
	protected ModelZerglingPrimalDehakaBoost		model;

	public RenderZerglingPrimalDehakaBoost(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingPrimalDehakaBoost) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZerglingPrimalDehakaBoost entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingPrimalDehakaBoost entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingPrimalDehakaBoost entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));
	}

	@Override
	public void doRenderLayer(EntityZerglingPrimalDehakaBoost entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}