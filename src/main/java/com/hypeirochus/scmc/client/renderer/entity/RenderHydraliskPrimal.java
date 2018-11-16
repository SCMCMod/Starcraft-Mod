package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelHydralisk;
import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityHydraliskPrimal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderHydraliskPrimal extends RenderLiving<EntityHydraliskPrimal> implements LayerRenderer<EntityHydraliskPrimal>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.HYDRALISKPRIMAL_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.HYDRALISKPRIMAL_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.HYDRALISK_GLOW_STATIC);
	private final RenderHydraliskPrimal RENDERER;

	protected ModelHydralisk model;

	public RenderHydraliskPrimal(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
	{
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelHydralisk) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityHydraliskPrimal entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydraliskPrimal entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityHydraliskPrimal entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.5F + (entitylivingbaseIn.getBiomass() / 60), 1.5F + (entitylivingbaseIn.getBiomass() / 60), 1.5F + (entitylivingbaseIn.getBiomass() / 60));

		if (entitylivingbaseIn.getBurrowState() == true)
		{
			GlStateManager.translate(0, 2.0F, 0);
		}
	}

	@Override
	public void doRenderLayer(EntityHydraliskPrimal entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}
}