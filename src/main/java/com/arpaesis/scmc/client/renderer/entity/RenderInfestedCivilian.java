package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelInfestedCivilian;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityInfestedCivilian;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderInfestedCivilian extends RenderLiving<EntityInfestedCivilian>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.INFESTED_CIVILIAN);

	public static final Factory FACTORY = new Factory();

	public RenderInfestedCivilian(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelInfestedCivilian(), 0.4f);
	}

	@Override
	public void doRender(EntityInfestedCivilian entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityInfestedCivilian entity)
	{
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityInfestedCivilian entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.75F, 0.75F, 0.75F);
	}

	public static class Factory implements IRenderFactory<EntityInfestedCivilian>
	{

		@Override
		public Render<? super EntityInfestedCivilian> createRenderFor(RenderManager manager)
		{
			return new RenderInfestedCivilian(manager);
		}

	}
}
