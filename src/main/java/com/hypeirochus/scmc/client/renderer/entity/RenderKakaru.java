package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelKakaru;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityKakaru;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKakaru<T> extends RenderLiving<EntityKakaru>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.KAKARU);
	protected ModelKakaru model;

	public RenderKakaru(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
	{
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelKakaru) mainModel);
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
}
