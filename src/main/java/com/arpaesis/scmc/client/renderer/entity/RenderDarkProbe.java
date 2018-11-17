package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelDarkProbe;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityDarkProbe;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDarkProbe extends RenderLiving<EntityDarkProbe> implements LayerRenderer<EntityDarkProbe>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.DARKPROBE_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.DARKPROBE_OVERLAY);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.DARKPROBE_GLOW_DYNAMIC);

	public static final Factory FACTORY = new Factory();

	public RenderDarkProbe(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelDarkProbe(), 0.4f);
		this.addLayer(this);

	}

	@Override
	public void doRender(EntityDarkProbe entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkProbe entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityDarkProbe entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}

	@Override
	public void doRenderLayer(EntityDarkProbe entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityDarkProbe>
	{

		@Override
		public Render<? super EntityDarkProbe> createRenderFor(RenderManager manager)
		{
			return new RenderDarkProbe(manager);
		}

	}
}
