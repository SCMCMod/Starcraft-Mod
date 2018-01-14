package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerZerglingPrimalDehakaColor;
import ga.scmc.client.renderer.entity.layers.LayerZerglingPrimalDehakaStatic;
import ga.scmc.client.renderer.model.ModelZerglingPrimalDehaka;
import ga.scmc.entity.living.EntityZerglingPrimalDehaka;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingPrimalDehaka<T> extends RenderLiving<EntityZerglingPrimalDehaka> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_BASE);
	protected ModelZerglingPrimalDehaka model;

	public RenderZerglingPrimalDehaka(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingPrimalDehaka) mainModel);
		addLayer(new LayerZerglingPrimalDehakaColor(this));
		addLayer(new LayerZerglingPrimalDehakaStatic(this));
	}

	@Override
	public void doRender(EntityZerglingPrimalDehaka entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingPrimalDehaka entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingPrimalDehaka entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));
	}
}