package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelZerglingPrimal2;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityZerglingPrimal2;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZerglingPrimal2 extends RenderLiving<EntityZerglingPrimal2> implements LayerRenderer<EntityZerglingPrimal2>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.ZERGLINGPRIMAL2_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.ZERGLINGPRIMAL2_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.ZERGLINGPRIMAL_GLOW_DYNAMIC);

	public static final Factory FACTORY = new Factory();

	public RenderZerglingPrimal2(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelZerglingPrimal2(), 0.4f);
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
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityZerglingPrimal2>
	{

		@Override
		public Render<? super EntityZerglingPrimal2> createRenderFor(RenderManager manager)
		{
			return new RenderZerglingPrimal2(manager);
		}

	}
}
