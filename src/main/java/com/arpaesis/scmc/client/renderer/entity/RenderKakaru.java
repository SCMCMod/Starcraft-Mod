package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelKakaru;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityKakaru;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderKakaru<T> extends RenderLiving<EntityKakaru>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.KAKARU);

	public static final Factory FACTORY = new Factory();

	public RenderKakaru(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelKakaru(), 0.6f);
	}

	@Override
	public void doRender(EntityKakaru entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityKakaru entity)
	{
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityKakaru entitylivingbaseIn, float partialTickTime)
	{
	}

	public static class Factory implements IRenderFactory<EntityKakaru>
	{

		@Override
		public Render<? super EntityKakaru> createRenderFor(RenderManager manager)
		{
			return new RenderKakaru(manager);
		}

	}
}
