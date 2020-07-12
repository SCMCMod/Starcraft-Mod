package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelLarvaCocoon;
import io.github.scmcmod.client.renderer.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityLarvaCocoon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderLarvaCocoon extends RenderLiving<EntityLarvaCocoon> implements LayerRenderer<EntityLarvaCocoon>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.LARVA_COCOON_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.LARVA_COCOON_OVERLAY);

	public static final Factory FACTORY = new Factory();

	public RenderLarvaCocoon(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelLarvaCocoon(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityLarvaCocoon entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLarvaCocoon entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityLarvaCocoon entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.7F, 1.7F, 1.7F);
	}

	@Override
	public void doRenderLayer(EntityLarvaCocoon entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityLarvaCocoon>
	{

		@Override
		public Render<? super EntityLarvaCocoon> createRenderFor(RenderManager manager)
		{
			return new RenderLarvaCocoon(manager);
		}

	}
}
