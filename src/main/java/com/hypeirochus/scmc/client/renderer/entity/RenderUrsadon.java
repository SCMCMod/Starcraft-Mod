package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelUrsadon;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityUrsadon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrsadon<T> extends RenderLiving<EntityUrsadon>
{

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.URSADON_BASE);
	protected ModelUrsadon model;

	public RenderUrsadon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
	{
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelUrsadon) mainModel);
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