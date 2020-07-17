package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelMarine;
import net.rom.client.RenderUtilities;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityMarine;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * @author Ocelot5836
 */
public class RenderMarine extends RenderLiving<EntityMarine> implements LayerRenderer<EntityMarine>
{

	protected ModelMarine model;
	private static final ResourceLocation BASE = new ResourceLocation(Resources.MARINE_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.MARINE_OVERLAY);

	public static final Factory FACTORY = new Factory();

	public RenderMarine(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelMarine(), 0.4f);
		this.addLayer(this);
		this.addLayer(new LayerHeldItem(this));
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMarine entity)
	{
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityMarine entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		RenderUtilities.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}

	public static class Factory implements IRenderFactory<EntityMarine>
	{

		@Override
		public Render<? super EntityMarine> createRenderFor(RenderManager manager)
		{
			return new RenderMarine(manager);
		}

	}
}
