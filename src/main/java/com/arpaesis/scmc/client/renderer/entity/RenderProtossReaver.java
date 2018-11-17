package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelProtossReaver;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityProtossReaver;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderProtossReaver extends RenderLiving<EntityProtossReaver> implements LayerRenderer<EntityProtossReaver>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.PREAVER_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.PREAVER_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.PREAVER_GLOW_DYNAMIC);

	public RenderProtossReaver(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelProtossReaver(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityProtossReaver entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected void preRenderCallback(EntityProtossReaver entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(5.0D, 5.0D, 5.0D);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityProtossReaver entity)
	{
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityProtossReaver entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}
}
