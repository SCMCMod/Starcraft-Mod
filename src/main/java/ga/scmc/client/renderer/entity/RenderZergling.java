package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerZerglingColor;
import ga.scmc.client.renderer.entity.layers.LayerZerglingGlowStatic;
import ga.scmc.client.renderer.model.ModelZergling;
import ga.scmc.entity.living.EntityZergling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZergling<T> extends RenderLiving<EntityZergling> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLING_BASE);
	protected ModelZergling model;

	public RenderZergling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZergling) mainModel);
		addLayer(new LayerZerglingColor(this));
		addLayer(new LayerZerglingGlowStatic(this));
	}

	@Override
	public void doRender(EntityZergling entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZergling entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZergling entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));
	}
}