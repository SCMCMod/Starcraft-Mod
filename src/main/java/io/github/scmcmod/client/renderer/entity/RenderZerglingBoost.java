package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelZerglingBoost;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityZerglingBoost;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZerglingBoost extends RenderLiving<EntityZerglingBoost> implements LayerRenderer<EntityZerglingBoost>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.ZERGLINGBOOST_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.ZERGLING_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.ZERGLING_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderZerglingBoost(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelZerglingBoost(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZerglingBoost entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingBoost entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingBoost entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));

		if (entitylivingbaseIn.getBurrowState() == true)
		{
			GlStateManager.translate(0, 0.6F, 0);
		}
	}

	@Override
	public void doRenderLayer(EntityZerglingBoost entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityZerglingBoost>
	{

		@Override
		public Render<? super EntityZerglingBoost> createRenderFor(RenderManager manager)
		{
			return new RenderZerglingBoost(manager);
		}

	}
}
