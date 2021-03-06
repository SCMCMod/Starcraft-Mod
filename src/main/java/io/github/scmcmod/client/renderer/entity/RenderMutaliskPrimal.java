package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelMutaliskPrimal;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityMutaliskPrimal;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMutaliskPrimal extends RenderLiving<EntityMutaliskPrimal> implements LayerRenderer<EntityMutaliskPrimal>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.MUTALISKPRIMAL_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.MUTALISKPRIMAL_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.MUTALISK_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderMutaliskPrimal(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelMutaliskPrimal(), 0.5f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityMutaliskPrimal entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMutaliskPrimal entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityMutaliskPrimal entitylivingbaseIn, float partialTickTime)
	{
	}

	@Override
	public void doRenderLayer(EntityMutaliskPrimal entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityMutaliskPrimal>
	{

		@Override
		public Render<? super EntityMutaliskPrimal> createRenderFor(RenderManager manager)
		{
			return new RenderMutaliskPrimal(manager);
		}

	}
}
