package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelLarva;
import io.github.scmcmod.client.renderer.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityLarva;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderLarva extends RenderLiving<EntityLarva> implements LayerRenderer<EntityLarva>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.LARVA_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.LARVA_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.LARVA_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderLarva(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelLarva(), 0.3f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityLarva entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLarva entity)
	{
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityLarva entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityLarva>
	{

		@Override
		public Render<? super EntityLarva> createRenderFor(RenderManager manager)
		{
			return new RenderLarva(manager);
		}

	}
}
