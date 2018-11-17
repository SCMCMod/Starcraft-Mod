package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelUrsadon;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityUrsadon;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrsadon<T> extends RenderLiving<EntityUrsadon>
{

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.URSADON_BASE);

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
}