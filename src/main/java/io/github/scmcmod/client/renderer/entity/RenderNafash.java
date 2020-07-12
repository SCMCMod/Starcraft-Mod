package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelBroodmother;
import io.github.scmcmod.client.renderer.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityNafash;
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
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
		RenderUtilities.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
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
