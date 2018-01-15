package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerZerglingPrimal3Color;
import ga.scmc.client.renderer.entity.layers.LayerZerglingPrimal3GlowDynamic;
import ga.scmc.client.renderer.model.ModelZerglingPrimal3;
import ga.scmc.entity.living.EntityZerglingPrimal3;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingPrimal3<T> extends RenderLiving<EntityZerglingPrimal3> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMAL3_BASE);
	protected ModelZerglingPrimal3 model;

	public RenderZerglingPrimal3(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingPrimal3) mainModel);
		addLayer(new LayerZerglingPrimal3Color(this));
		addLayer(new LayerZerglingPrimal3GlowDynamic(this));
	}

	@Override
	public void doRender(EntityZerglingPrimal3 entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingPrimal3 entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingPrimal3 entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(.95F + (entitylivingbaseIn.getBiomass() / 60), .95F + (entitylivingbaseIn.getBiomass() / 60), .95F + (entitylivingbaseIn.getBiomass() / 60));
	}
}