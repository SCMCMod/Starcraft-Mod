package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.model.ModelPredator;
import com.hypeirochus.scmc.entity.living.EntityPredator;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderPredator extends RenderLiving<EntityPredator> implements LayerRenderer<EntityPredator> {

	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.PREDATOR_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.PREDATOR_OVERLAY);
	private static final ResourceLocation	STATICGLOW	= new ResourceLocation(Resources.PREDATOR_GLOW_STATIC);
	private static final ResourceLocation	DYNAMICGLOW	= new ResourceLocation(Resources.PREDATOR_GLOW_DYNAMIC);
	private final RenderPredator			RENDERER;
	protected ModelPredator					model;

	public RenderPredator(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelPredator) mainModel);
		this.addLayer(this);
		this.RENDERER = this;
	}

	@Override
	public void doRender(EntityPredator entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPredator entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityPredator entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.2F, 1.2F, 1.2F);
	}

	@Override
	public void doRenderLayer(EntityPredator entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}
