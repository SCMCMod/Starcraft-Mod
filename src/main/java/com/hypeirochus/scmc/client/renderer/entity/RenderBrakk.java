package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.model.ModelBrakk;
import com.hypeirochus.scmc.entity.living.EntityBrakk;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderBrakk extends RenderLiving<EntityBrakk> implements LayerRenderer<EntityBrakk> {

	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.BRAKK_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.BRAKK_OVERLAY);
	private static final ResourceLocation	DYNAMICGLOW	= new ResourceLocation(Resources.BRAKK_GLOW_DYNAMIC);
	private final RenderBrakk				RENDERER;
	protected ModelBrakk					model;

	public RenderBrakk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelBrakk) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityBrakk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrakk entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityBrakk entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(5.5F + (entitylivingbaseIn.getBiomass() / 60), 5.5F + (entitylivingbaseIn.getBiomass() / 60), 5.5F + (entitylivingbaseIn.getBiomass() / 60));
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

	@Override
	public void doRenderLayer(EntityBrakk entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}