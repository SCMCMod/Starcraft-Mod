package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelMutaliskViper;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityMutaliskViper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMutaliskViper extends RenderLiving<EntityMutaliskViper> implements LayerRenderer<EntityMutaliskViper>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.MUTALISKVIPER_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.MUTALISKVIPER_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.MUTALISK_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderMutaliskViper(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelMutaliskViper(), 0.5f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityMutaliskViper entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMutaliskViper entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityMutaliskViper entitylivingbaseIn, float partialTickTime)
	{
	}

	@Override
	public void doRenderLayer(EntityMutaliskViper entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityMutaliskViper>
	{

		@Override
		public Render<? super EntityMutaliskViper> createRenderFor(RenderManager manager)
		{
			return new RenderMutaliskViper(manager);
		}

	}
}
