package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelZerglingPrimalDehakaBoost;
import io.github.scmcmod.client.renderer.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityZerglingPrimalDehakaBoost;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZerglingPrimalDehakaBoost extends RenderLiving<EntityZerglingPrimalDehakaBoost> implements LayerRenderer<EntityZerglingPrimalDehakaBoost>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKABOOST_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderZerglingPrimalDehakaBoost(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelZerglingPrimalDehakaBoost(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZerglingPrimalDehakaBoost entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingPrimalDehakaBoost entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingPrimalDehakaBoost entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));
	}

	@Override
	public void doRenderLayer(EntityZerglingPrimalDehakaBoost entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityZerglingPrimalDehakaBoost>
	{

		@Override
		public Render<? super EntityZerglingPrimalDehakaBoost> createRenderFor(RenderManager manager)
		{
			return new RenderZerglingPrimalDehakaBoost(manager);
		}

	}
}