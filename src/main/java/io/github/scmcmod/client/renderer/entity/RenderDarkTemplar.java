package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelDarkTemplar;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityDarkTemplar;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDarkTemplar extends RenderLiving<EntityDarkTemplar> implements LayerRenderer<EntityDarkTemplar>
{
	private static final ResourceLocation BASE = new ResourceLocation(Resources.DARKTEMPLAR_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.DARKTEMPLAR_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.DARKTEMPLAR_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderDarkTemplar(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelDarkTemplar(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityDarkTemplar entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected void renderModel(EntityDarkTemplar entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
	{
		super.renderModel(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
//		RenderUtilities.renderShields(this.mainModel, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkTemplar entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityDarkTemplar entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.65F, 0.65F, 0.65F);
	}

	@Override
	public void doRenderLayer(EntityDarkTemplar entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityDarkTemplar>
	{

		@Override
		public Render<? super EntityDarkTemplar> createRenderFor(RenderManager manager)
		{
			return new RenderDarkTemplar(manager);
		}

	}
}
