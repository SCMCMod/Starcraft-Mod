package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelCivilian;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityCivilian;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCivilian extends RenderLiving<EntityCivilian>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.CIVILIAN);

	public RenderCivilian(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelCivilian(), 0.4f);
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
