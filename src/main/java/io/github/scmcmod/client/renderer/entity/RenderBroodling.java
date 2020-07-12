package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelBroodling;
import io.github.scmcmod.client.renderer.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityBroodling;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBroodling extends RenderLiving<EntityBroodling> implements LayerRenderer<EntityBroodling>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.BROODLING_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.BROODLING_OVERLAY);

	public static final Factory FACTORY = new Factory();

	public RenderBroodling(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelBroodling(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityBroodling entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBroodling entity)
	{
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityBroodling entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityBroodling>
	{

		@Override
		public Render<? super EntityBroodling> createRenderFor(RenderManager manager)
		{
			return new RenderBroodling(manager);
		}

	}
}
