package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelDarkProbe;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityDarkProbe;
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
	protected void renderModel(EntityDarkProbe entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
	{
		super.renderModel(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
//		RenderUtilities.renderShields(this.mainModel, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
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
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
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
