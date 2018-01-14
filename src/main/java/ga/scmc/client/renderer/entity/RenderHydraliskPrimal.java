package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerHydraliskPrimalColor;
import ga.scmc.client.renderer.entity.layers.LayerHydraliskPrimalGlowStatic;
import ga.scmc.client.renderer.model.ModelHydralisk;
import ga.scmc.entity.living.EntityHydraliskPrimal;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//Same reason for special case
public class RenderHydraliskPrimal<T> extends RenderLiving<EntityHydraliskPrimal> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.HYDRALISKPRIMAL_BASE);
	protected ModelHydralisk model;

	public RenderHydraliskPrimal(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelHydralisk) mainModel);
		addLayer(new LayerHydraliskPrimalColor(this));
		addLayer(new LayerHydraliskPrimalGlowStatic(this));
	}

	@Override
	public void doRender(EntityHydraliskPrimal entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydraliskPrimal entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityHydraliskPrimal entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.5F + (entitylivingbaseIn.getBiomass() / 60), 1.5F + (entitylivingbaseIn.getBiomass() / 60), 1.5F + (entitylivingbaseIn.getBiomass() / 60));
	}
}