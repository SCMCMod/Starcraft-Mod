package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelLope;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.client.renderer.SCRenderUtilities;
import com.arpaesis.scmc.entity.living.EntityArtosilope;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderArtosilope extends RenderLiving<EntityArtosilope> implements LayerRenderer<EntityArtosilope>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.ARTOSILOPE_BASE);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.TASTELOPE_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderArtosilope(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelLope(), 0.4f);
		this.addLayer(this);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityArtosilope entity)
	{
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityArtosilope entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		SCRenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityArtosilope>
	{

		@Override
		public Render<? super EntityArtosilope> createRenderFor(RenderManager manager)
		{
			return new RenderArtosilope(manager);
		}

	}
}