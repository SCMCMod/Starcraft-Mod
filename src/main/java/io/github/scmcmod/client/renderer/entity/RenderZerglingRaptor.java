package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelZerglingRaptor;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityZerglingRaptor;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZerglingRaptor extends RenderLiving<EntityZerglingRaptor> implements LayerRenderer<EntityZerglingRaptor>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.ZERGLINGRAPTOR_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.ZERGLING_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.ZERGLINGSWARMLING_GLOW_STATIC);

	public static final Factory FACTORY = new Factory();

	public RenderZerglingRaptor(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelZerglingRaptor(), 0.4f);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZerglingRaptor entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingRaptor entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingRaptor entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));

		if (entitylivingbaseIn.getBurrowState() == true)
		{
			GlStateManager.translate(0, 0.6F, 0);
		}
	}

	@Override
	public void doRenderLayer(EntityZerglingRaptor entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		RenderUtilities.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityZerglingRaptor>
	{

		@Override
		public Render<? super EntityZerglingRaptor> createRenderFor(RenderManager manager)
		{
			return new RenderZerglingRaptor(manager);
		}

	}
}
