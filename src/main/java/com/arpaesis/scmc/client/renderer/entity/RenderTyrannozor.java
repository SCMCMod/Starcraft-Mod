package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelTyrannozor;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.client.renderer.SCRenderUtilities;
import com.arpaesis.scmc.entity.living.EntityTyrannozor;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTyrannozor extends RenderLiving<EntityTyrannozor> implements LayerRenderer<EntityTyrannozor>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.TYRANNOZOR_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.TYRANNOZOR_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.TYRANNOZOR_GLOW_DYNAMIC);

	public static final Factory FACTORY = new Factory();

	public RenderTyrannozor(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelTyrannozor(), 3.0f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityTyrannozor entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTyrannozor entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityTyrannozor entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(4.0F + (entitylivingbaseIn.getBiomass() / 60), 4.0F + (entitylivingbaseIn.getBiomass() / 60), 4.0F + (entitylivingbaseIn.getBiomass() / 60));
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

	@Override
	public void doRenderLayer(EntityTyrannozor entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		SCRenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		SCRenderUtilities.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityTyrannozor>
	{

		@Override
		public Render<? super EntityTyrannozor> createRenderFor(RenderManager manager)
		{
			return new RenderTyrannozor(manager);
		}

	}
}