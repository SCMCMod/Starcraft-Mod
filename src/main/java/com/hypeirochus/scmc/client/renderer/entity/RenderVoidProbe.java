package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelVoidProbe;
import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityVoidProbe;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderVoidProbe extends RenderLiving<EntityVoidProbe> implements LayerRenderer<EntityVoidProbe>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.VOID_PROBE_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.VOID_PROBE_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.VOID_PROBE_GLOW_DYNAMIC);
	private final RenderVoidProbe RENDERER;
	protected ModelVoidProbe model;

	public RenderVoidProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
	{
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelVoidProbe) mainModel);
		this.addLayer(this);
		this.RENDERER = this;
	}

	@Override
	public void doRender(EntityVoidProbe entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityVoidProbe entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityVoidProbe entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}

	@Override
	public void doRenderLayer(EntityVoidProbe entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}
}
