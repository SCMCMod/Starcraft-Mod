package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerZerglingPrimal1Color;
import ga.scmc.client.renderer.entity.layers.LayerZerglingPrimal1GlowDynamic;
import ga.scmc.client.renderer.model.ModelZerglingPrimal1;
import ga.scmc.entity.living.EntityZerglingPrimal1;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingPrimal1<T> extends RenderLiving<EntityZerglingPrimal1> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMAL1_BASE);
	protected ModelZerglingPrimal1 model;

	public RenderZerglingPrimal1(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingPrimal1) mainModel);
		addLayer(new LayerZerglingPrimal1Color(this));
		addLayer(new LayerZerglingPrimal1GlowDynamic(this));
	}

	@Override
	public void doRender(EntityZerglingPrimal1 entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingPrimal1 entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingPrimal1 entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(.95F + (entitylivingbaseIn.getBiomass() / 60), .95F + (entitylivingbaseIn.getBiomass() / 60), .95F + (entitylivingbaseIn.getBiomass() / 60));
	}
}