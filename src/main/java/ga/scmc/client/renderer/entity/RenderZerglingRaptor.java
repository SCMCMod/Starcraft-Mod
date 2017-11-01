package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerZerglingRaptorColor;
import ga.scmc.client.renderer.entity.layers.LayerZerglingRaptorGlowStatic;
import ga.scmc.client.renderer.model.ModelZerglingRaptor;
import ga.scmc.entity.living.EntityZerglingRaptor;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingRaptor<T> extends RenderLiving<EntityZerglingRaptor> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGRAPTOR_BASE);
	protected ModelZerglingRaptor model;

	public RenderZerglingRaptor(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingRaptor) mainModel);
		addLayer(new LayerZerglingRaptorColor(this));
		addLayer(new LayerZerglingRaptorGlowStatic(this));
	}

	@Override
	public void doRender(EntityZerglingRaptor entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingRaptor entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingRaptor entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));
	}
}
