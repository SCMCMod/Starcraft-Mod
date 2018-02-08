package ga.scmc.client.renderer.projectiles;

import ga.scmc.entity.EntityFlamethrowerFlame;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlamethrowerFlame extends Render<EntityFlamethrowerFlame> {

	private ModelBase model = null;

	public RenderFlamethrowerFlame(RenderManager renderManager) {
		super(renderManager);
	}

	public RenderFlamethrowerFlame(RenderManager renderManager, ModelBase model) {
		this(renderManager);
		this.model = model;
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	@Override
	public void doRender(EntityFlamethrowerFlame entity, double x, double y, double z, float entityYaw, float partialTicks) {
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless
	 * you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(EntityFlamethrowerFlame entity) {
		return null;
	}
}