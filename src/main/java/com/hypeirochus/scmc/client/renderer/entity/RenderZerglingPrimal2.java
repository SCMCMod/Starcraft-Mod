package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelZerglingPrimal2;
import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityZerglingPrimal2;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingPrimal2 extends RenderLiving<EntityZerglingPrimal2> implements LayerRenderer<EntityZerglingPrimal2>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.ZERGLINGPRIMAL2_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.ZERGLINGPRIMAL2_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.ZERGLINGPRIMAL_GLOW_DYNAMIC);
	private final RenderZerglingPrimal2 RENDERER;
	protected ModelZerglingPrimal2 model;

	public RenderZerglingPrimal2(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
	{
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingPrimal2) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZerglingPrimal2 entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingPrimal2 entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingPrimal2 entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(.95F + (entitylivingbaseIn.getBiomass() / 60), .95F + (entitylivingbaseIn.getBiomass() / 60), .95F + (entitylivingbaseIn.getBiomass() / 60));
	}

	@Override
	public void doRenderLayer(EntityZerglingPrimal2 entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
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