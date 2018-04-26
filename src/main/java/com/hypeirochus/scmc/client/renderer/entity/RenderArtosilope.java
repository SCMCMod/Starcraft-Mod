package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelLope;
import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityArtosilope;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderArtosilope extends RenderLiving<EntityArtosilope> implements LayerRenderer<EntityArtosilope> {

	private static final ResourceLocation BASE = new ResourceLocation(Resources.ARTOSILOPE_BASE);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.TASTELOPE_GLOW_STATIC);
	private final RenderArtosilope RENDERER;
	protected ModelLope model;

	public RenderArtosilope(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelLope) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityArtosilope entity) {
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityArtosilope entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}