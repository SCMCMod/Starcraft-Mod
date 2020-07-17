package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelMutaliskBroodlord;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityMutaliskBroodlord;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMutaliskBroodlord extends RenderLiving<EntityMutaliskBroodlord> implements LayerRenderer<EntityMutaliskBroodlord>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.MUTALISKBROODLORD_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.MUTALISKBROODLORD_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.MUTALISK_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderMutaliskBroodlord(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelMutaliskBroodlord(), 0.5f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityMutaliskBroodlord entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMutaliskBroodlord entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityMutaliskBroodlord entitylivingbaseIn, float partialTickTime)
	{
	}

	@Override
	public void doRenderLayer(EntityMutaliskBroodlord entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityMutaliskBroodlord>
	{

		@Override
		public Render<? super EntityMutaliskBroodlord> createRenderFor(RenderManager manager)
		{
			return new RenderMutaliskBroodlord(manager);
		}

	}
}
