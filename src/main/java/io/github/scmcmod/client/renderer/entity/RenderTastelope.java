package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelLope;
import io.github.scmcmod.client.renderer.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityTastelope;
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
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
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