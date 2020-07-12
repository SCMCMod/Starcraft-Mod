package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelProtossReaver;
import io.github.scmcmod.client.renderer.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityProtossReaver;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderProtossReaver extends RenderLiving<EntityProtossReaver> implements LayerRenderer<EntityProtossReaver>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.PREAVER_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.PREAVER_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.PREAVER_GLOW_DYNAMIC);

	public static final Factory FACTORY = new Factory();

	public RenderProtossReaver(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelProtossReaver(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityProtossReaver entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected void renderModel(EntityProtossReaver entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
	{
		super.renderModel(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
		RenderUtilities.renderShields(this.mainModel, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
	}

	@Override
	protected void preRenderCallback(EntityProtossReaver entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(5.0D, 5.0D, 5.0D);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityProtossReaver entity)
	{
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityProtossReaver entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityProtossReaver>
	{

		@Override
		public Render<? super EntityProtossReaver> createRenderFor(RenderManager manager)
		{
			return new RenderProtossReaver(manager);
		}

	}
}
