package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelZeratul;
import io.github.scmcmod.client.renderer.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityZeratul;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZeratul extends RenderLiving<EntityZeratul> implements LayerRenderer<EntityZeratul>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.ZERATUL_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.ZERATUL_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.ZERATUL_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderZeratul(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelZeratul(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZeratul entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected void renderModel(EntityZeratul entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
	{
		super.renderModel(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
		RenderUtilities.renderShields(this.mainModel, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZeratul entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZeratul entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.65F, 0.65F, 0.65F);
	}

	@Override
	public void doRenderLayer(EntityZeratul entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityZeratul>
	{

		@Override
		public Render<? super EntityZeratul> createRenderFor(RenderManager manager)
		{
			return new RenderZeratul(manager);
		}

	}
}
