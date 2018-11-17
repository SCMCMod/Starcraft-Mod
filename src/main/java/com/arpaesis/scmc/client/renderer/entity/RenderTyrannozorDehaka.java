package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelTyrannozorDehaka;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityTyrannozorDehaka;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTyrannozorDehaka extends RenderLiving<EntityTyrannozorDehaka> implements LayerRenderer<EntityTyrannozorDehaka>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.TYRANNOZORDEHAKA_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.TYRANNOZORDEHAKA_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.TYRANNOZORDEHAKA_GLOW_DYNAMIC);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.TYRANNOZORDEHAKA_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderTyrannozorDehaka(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelTyrannozorDehaka(), 3.0f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityTyrannozorDehaka entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTyrannozorDehaka entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityTyrannozorDehaka entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(4.0F + (entitylivingbaseIn.getBiomass() / 60), 4.0F + (entitylivingbaseIn.getBiomass() / 60), 4.0F + (entitylivingbaseIn.getBiomass() / 60));
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

	@Override
	public void doRenderLayer(EntityTyrannozorDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
		ColoredLayerRender.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityTyrannozorDehaka>
	{

		@Override
		public Render<? super EntityTyrannozorDehaka> createRenderFor(RenderManager manager)
		{
			return new RenderTyrannozorDehaka(manager);
		}

	}
}