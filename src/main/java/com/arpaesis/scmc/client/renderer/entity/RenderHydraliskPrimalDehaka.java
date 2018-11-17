package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelHydraliskPrimalDehaka;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityHydraliskPrimalDehaka;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderHydraliskPrimalDehaka extends RenderLiving<EntityHydraliskPrimalDehaka> implements LayerRenderer<EntityHydraliskPrimalDehaka>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.HYDRALISKPRIMALDEHAKA_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.HYDRALISK_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.HYDRALISKPRIMALDEHAKA_GLOW_STATIC);

	public RenderHydraliskPrimalDehaka(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelHydraliskPrimalDehaka(), 0.8f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityHydraliskPrimalDehaka entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydraliskPrimalDehaka entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityHydraliskPrimalDehaka entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.5F + (entitylivingbaseIn.getBiomass() / 60), 1.5F + (entitylivingbaseIn.getBiomass() / 60), 1.5F + (entitylivingbaseIn.getBiomass() / 60));
	}

	@Override
	public void doRenderLayer(EntityHydraliskPrimalDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}
}