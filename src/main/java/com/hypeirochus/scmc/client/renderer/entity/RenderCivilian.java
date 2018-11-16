package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.scmc.client.model.entity.ModelCivilian;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.entity.living.EntityCivilian;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCivilian extends RenderLiving<EntityCivilian>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.CIVILIAN);
	protected ModelCivilian model;

	public RenderCivilian(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
	{
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelCivilian) mainModel);
	}

	@Override
	public void doRender(EntityCivilian entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCivilian entity)
	{
		return TEXTURE;
	}
}
