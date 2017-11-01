package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerLarvaCocoonColor;
import ga.scmc.client.renderer.model.ModelLarvaCocoon;
import ga.scmc.entity.living.EntityLarvaCocoon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLarvaCocoon<T> extends RenderLiving<EntityLarvaCocoon> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.LARVA_COCOON_BASE);
	protected ModelLarvaCocoon model;

	public RenderLarvaCocoon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelLarvaCocoon) mainModel);
		addLayer(new LayerLarvaCocoonColor(this));
	}

	@Override
	public void doRender(EntityLarvaCocoon entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLarvaCocoon entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityLarvaCocoon entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.7F, 1.7F, 1.7F);
	}
}
