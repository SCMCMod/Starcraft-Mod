package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelBroodmother;
import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityNafash;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderNafash extends RenderLiving<EntityNafash> implements LayerRenderer<EntityNafash>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.BROODMOTHER_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.BROODMOTHER_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.BROODMOTHER_GLOW_STATIC);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.BROODMOTHER_GLOW_DYNAMIC);
	private final RenderNafash RENDERER;
	protected ModelBroodmother model;

	public RenderNafash(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
	{
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelBroodmother) mainModel);
		this.addLayer(this);
		this.RENDERER = this;
	}

	@Override
	public void doRender(EntityNafash entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityNafash entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityNafash entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}

	@Override
	public void doRenderLayer(EntityNafash entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}
}
