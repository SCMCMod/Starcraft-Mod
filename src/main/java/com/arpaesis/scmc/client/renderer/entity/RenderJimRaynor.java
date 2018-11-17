package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelMarine;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityJimRaynor;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderJimRaynor extends RenderLiving<EntityJimRaynor>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.JIMRAYNOR_BASE);

	public static final Factory FACTORY = new Factory();

	public RenderJimRaynor(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelMarine(), 0.4f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityJimRaynor entity)
	{
		return BASE;
	}

	public static class Factory implements IRenderFactory<EntityJimRaynor>
	{

		@Override
		public Render<? super EntityJimRaynor> createRenderFor(RenderManager manager)
		{
			return new RenderJimRaynor(manager);
		}

	}
}