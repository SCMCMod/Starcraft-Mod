package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelBroodmother;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityNafash;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderNafash extends RenderLiving<EntityNafash> implements LayerRenderer<EntityNafash>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.BROODMOTHER_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.BROODMOTHER_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.BROODMOTHER_GLOW_STATIC);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.BROODMOTHER_GLOW_DYNAMIC);

	public static final Factory FACTORY = new Factory();

	public RenderNafash(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelBroodmother(), 0.7f);
		this.addLayer(this);

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
		ColoredLayerRender.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
		ColoredLayerRender.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityNafash>
	{

		@Override
		public Render<? super EntityNafash> createRenderFor(RenderManager manager)
		{
			return new RenderNafash(manager);
		}

	}
}
