package io.github.scmcmod.client.renderer.entity;

import io.github.scmcmod.client.model.entity.ModelUrsadon;
import io.github.scmcmod.client.renderer.Resources;
import io.github.scmcmod.entity.living.EntityUrsadonMatriarch;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderUrsadonMatriarch extends RenderLiving<EntityUrsadonMatriarch>
{

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.URSADON_MATRIARCH_BASE);

	public static final Factory FACTORY = new Factory();

	public RenderUrsadonMatriarch(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelUrsadon(), 0.6f);
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

	public static class Factory implements IRenderFactory<EntityUrsadonMatriarch>
	{

		@Override
		public Render<? super EntityUrsadonMatriarch> createRenderFor(RenderManager manager)
		{
			return new RenderUrsadonMatriarch(manager);
		}

	}
}