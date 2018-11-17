package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelLope;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityTastelope;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTastelope extends RenderLiving<EntityTastelope> implements LayerRenderer<EntityTastelope>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.TASTELOPE_BASE);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.TASTELOPE_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderTastelope(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelLope(), 0.4f);
		this.addLayer(this);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTastelope entity)
	{
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityTastelope entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityTastelope>
	{

		@Override
		public Render<? super EntityTastelope> createRenderFor(RenderManager manager)
		{
			return new RenderTastelope(manager);
		}

	}
}