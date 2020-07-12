package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelCivilian;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityCivilian;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderCivilian extends RenderLiving<EntityCivilian>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.CIVILIAN);

	public static final Factory FACTORY = new Factory();

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

	public static class Factory implements IRenderFactory<EntityCivilian>
	{

		@Override
		public Render<? super EntityCivilian> createRenderFor(RenderManager manager)
		{
			return new RenderCivilian(manager);
		}

	}
}
