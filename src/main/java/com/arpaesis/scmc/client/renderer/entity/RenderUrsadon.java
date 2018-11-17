package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelUrsadon;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityUrsadon;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderUrsadon extends RenderLiving<EntityUrsadon>
{

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.URSADON_BASE);

	public static final Factory FACTORY = new Factory();

	public RenderUrsadon(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelUrsadon(), 0.5f);
	}

	@Override
	public void doRender(EntityUrsadon entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityUrsadon entity)
	{
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityUrsadon entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

	public static class Factory implements IRenderFactory<EntityUrsadon>
	{

		@Override
		public Render<? super EntityUrsadon> createRenderFor(RenderManager manager)
		{
			return new RenderUrsadon(manager);
		}

	}
}