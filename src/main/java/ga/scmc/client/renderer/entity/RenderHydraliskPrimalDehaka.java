package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerHydraliskPrimalDehakaColor;
import ga.scmc.client.renderer.entity.layers.LayerHydraliskPrimalDehakaGlowStatic;
import ga.scmc.client.renderer.model.ModelHydraliskPrimalDehaka;
import ga.scmc.entity.living.EntityHydraliskPrimalDehaka;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//Same reason for special case
public class RenderHydraliskPrimalDehaka<T> extends RenderLiving<EntityHydraliskPrimalDehaka> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.HYDRALISKPRIMALDEHAKA_BASE);
	protected ModelHydraliskPrimalDehaka model;

	public RenderHydraliskPrimalDehaka(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelHydraliskPrimalDehaka) mainModel);
		addLayer(new LayerHydraliskPrimalDehakaColor(this));
		addLayer(new LayerHydraliskPrimalDehakaGlowStatic(this));
	}

	@Override
	public void doRender(EntityHydraliskPrimalDehaka entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydraliskPrimalDehaka entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityHydraliskPrimalDehaka entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.3F + (entitylivingbaseIn.getBiomass() / 60), 1.3F + (entitylivingbaseIn.getBiomass() / 60), 1.3F + (entitylivingbaseIn.getBiomass() / 60));
	}
}