package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerZerglingPrimal2Color;
import ga.scmc.client.renderer.entity.layers.LayerZerglingPrimal2GlowDynamic;
import ga.scmc.client.renderer.model.ModelZerglingPrimal2;
import ga.scmc.entity.living.EntityZerglingPrimal2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingPrimal2<T> extends RenderLiving<EntityZerglingPrimal2> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMAL2_BASE);
	protected ModelZerglingPrimal2 model;

	public RenderZerglingPrimal2(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingPrimal2) mainModel);
		addLayer(new LayerZerglingPrimal2Color(this));
		addLayer(new LayerZerglingPrimal2GlowDynamic(this));
	}

	@Override
	public void doRender(EntityZerglingPrimal2 entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingPrimal2 entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingPrimal2 entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(.95F + (entitylivingbaseIn.getBiomass() / 60), .95F + (entitylivingbaseIn.getBiomass() / 60), .95F + (entitylivingbaseIn.getBiomass() / 60));
	}
}