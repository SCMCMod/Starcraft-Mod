package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.model.ModelProtossReaver;
import com.hypeirochus.scmc.entity.living.EntityProtossReaver;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderProtossReaver extends RenderLiving<EntityProtossReaver> implements LayerRenderer<EntityProtossReaver> {
	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.PREAVER_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.PREAVER_OVERLAY);
	private static final ResourceLocation	DYNAMICGLOW	= new ResourceLocation(Resources.PREAVER_GLOW_DYNAMIC);
	private final RenderProtossReaver		RENDERER;
	protected ModelProtossReaver			model;

	public RenderProtossReaver(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelProtossReaver) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityProtossReaver entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected void preRenderCallback(EntityProtossReaver entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(5.0D, 5.0D, 5.0D);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityProtossReaver entity) {
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityProtossReaver entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}
