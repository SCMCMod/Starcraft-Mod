package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelPredator;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityPredator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.rom.client.RenderUtilities;

public class RenderPredator extends RenderLiving<EntityPredator> implements LayerRenderer<EntityPredator>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.PREDATOR_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.PREDATOR_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.PREDATOR_GLOW_STATIC);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.PREDATOR_GLOW_DYNAMIC);

	public static final Factory FACTORY = new Factory();

	public RenderPredator(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelPredator(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityPredator entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPredator entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityPredator entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.2F, 1.2F, 1.2F);
	}

	@Override
	public void doRenderLayer(EntityPredator entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
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

	public static class Factory implements IRenderFactory<EntityPredator>
	{

		@Override
		public Render<? super EntityPredator> createRenderFor(RenderManager manager)
		{
			return new RenderPredator(manager);
		}

	}
}
