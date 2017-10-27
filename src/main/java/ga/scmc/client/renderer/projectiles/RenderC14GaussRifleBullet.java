package ga.scmc.client.renderer.projectiles;

import ga.scmc.client.renderer.model.ModelBullet;
import ga.scmc.entity.projectiles.EntityC14GaussRifleBullet;
import ga.scmc.lib.Library;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderC14GaussRifleBullet extends Render<EntityC14GaussRifleBullet> {

	private ModelBase model = new ModelBullet();

	public RenderC14GaussRifleBullet(RenderManager renderManager) {
		super(renderManager);
	}

	public RenderC14GaussRifleBullet(RenderManager renderManager, ModelBase model) {
		this(renderManager);
		this.model = model;
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	@Override
	public void doRender(EntityC14GaussRifleBullet entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) x, (float) y, (float) z);
		GlStateManager.enableRescaleNormal();
		float scale = 0.5F;
		GlStateManager.scale(-scale, -scale, scale);
		GlStateManager.rotate(-(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks) + 180F, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(-(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks), 1.0F, 0.0F, 0.0F);
		this.bindEntityTexture(entity);
		this.model.render(entity, 0.0F, 0.0F, 0.0F, entityYaw, 0.0F, 0.03125F);
		GlStateManager.popMatrix();
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(EntityC14GaussRifleBullet entity) {
		return new ResourceLocation(Library.MODID, "textures/entity/bullet.png");
	}
}