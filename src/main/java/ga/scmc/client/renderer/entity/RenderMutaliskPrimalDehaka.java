package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskPrimalDehakaColor;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskPrimalDehakaGlowStatic;
import ga.scmc.client.renderer.model.ModelMutaliskPrimalDehaka;
import ga.scmc.entity.living.EntityMutaliskPrimalDehaka;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMutaliskPrimalDehaka<T> extends RenderLiving<EntityMutaliskPrimalDehaka> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISKPRIMALDEHAKA_BASE);
	protected ModelMutaliskPrimalDehaka model;
	
	public RenderMutaliskPrimalDehaka(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMutaliskPrimalDehaka) mainModel);
		addLayer(new LayerMutaliskPrimalDehakaColor(this));
		addLayer(new LayerMutaliskPrimalDehakaGlowStatic(this));
	}

	@Override
	public void doRender(EntityMutaliskPrimalDehaka entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMutaliskPrimalDehaka entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityMutaliskPrimalDehaka entitylivingbaseIn, float partialTickTime) {
		//GlStateManager.scale(1.0F + (entitylivingbaseIn.getBiomass() / 60), 1.0F + (entitylivingbaseIn.getBiomass() / 60), 1.0F + (entitylivingbaseIn.getBiomass() / 60));
	}
}