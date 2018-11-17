package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelScarab;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.client.renderer.entity.layers.LayerScarab;
import com.arpaesis.scmc.entity.living.EntityScarab;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScarab<T> extends RenderLiving<EntityScarab>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.SCARAB);

	public RenderScarab(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelScarab(), 0.4f);
		this.addLayer(new LayerScarab(this));
	}

	@Override
	public void doRender(EntityScarab entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityScarab entity)
	{
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityScarab entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.65F, 0.65F, 0.65F);
	}
}
