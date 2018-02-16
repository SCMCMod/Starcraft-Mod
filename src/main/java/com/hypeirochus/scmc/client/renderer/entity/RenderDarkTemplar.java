package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.model.ModelDarkTemplar;
import com.hypeirochus.scmc.entity.living.EntityDarkTemplar;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderDarkTemplar extends RenderLiving<EntityDarkTemplar> implements LayerRenderer<EntityDarkTemplar> {
	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.DARKTEMPLAR_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.DARKTEMPLAR_OVERLAY);
	private static final ResourceLocation	STATICGLOW	= new ResourceLocation(Resources.DARKTEMPLAR_GLOW_STATIC);
	private final RenderDarkTemplar			RENDERER;
	protected ModelDarkTemplar				model;

	public RenderDarkTemplar(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelDarkTemplar) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityDarkTemplar entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkTemplar entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityDarkTemplar entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.65F, 0.65F, 0.65F);
	}

	@Override
	public void doRenderLayer(EntityDarkTemplar entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}
