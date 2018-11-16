package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelUrsadon;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityUrsadonMatriarch;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrsadonMatriarch<T> extends RenderLiving<EntityUrsadonMatriarch>
{

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.URSADON_MATRIARCH_BASE);
	protected ModelUrsadon model;

	public RenderUrsadonMatriarch(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
	{
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		this.model = ((ModelUrsadon) this.mainModel);
	}

	@Override
	public void doRender(EntityUrsadonMatriarch entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityUrsadonMatriarch entity)
	{
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityUrsadonMatriarch entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(2.0F, 2.0F, 2.0F);
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
}