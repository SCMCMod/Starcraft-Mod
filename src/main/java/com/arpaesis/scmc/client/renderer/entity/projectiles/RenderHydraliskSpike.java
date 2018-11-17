package com.arpaesis.scmc.client.renderer.entity.projectiles;

import com.arpaesis.scmc.Starcraft;
import com.arpaesis.scmc.client.model.entity.projectile.ModelHydraliskSpike;
import com.arpaesis.scmc.entity.EntityHydraliskSpike;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderHydraliskSpike extends Render<EntityHydraliskSpike>
{

	private ModelBase model = new ModelHydraliskSpike();

	public static final Factory FACTORY = new Factory();

	public RenderHydraliskSpike(RenderManager renderManager)
	{
		super(renderManager);
	}

	public RenderHydraliskSpike(RenderManager renderManager, ModelBase model)
	{
		this(renderManager);
		this.model = model;
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	@Override
	public void doRender(EntityHydraliskSpike entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) x, (float) y, (float) z);
		GlStateManager.enableRescaleNormal();
		float scale = 1.0F;
		GlStateManager.scale(scale, scale, scale);
		this.bindEntityTexture(entity);
		this.model.render(entity, 0.0F, 0.0F, 0.0F, entityYaw, 0.0F, 0.03125F);
		GlStateManager.popMatrix();
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless
	 * you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(EntityHydraliskSpike entity)
	{
		return new ResourceLocation(Starcraft.RL_BASE + "textures/entity/hydraliskspike.png");
	}

	public static class Factory implements IRenderFactory<EntityHydraliskSpike>
	{

		@Override
		public Render<? super EntityHydraliskSpike> createRenderFor(RenderManager manager)
		{
			return new RenderHydraliskSpike(manager);
		}

	}
}