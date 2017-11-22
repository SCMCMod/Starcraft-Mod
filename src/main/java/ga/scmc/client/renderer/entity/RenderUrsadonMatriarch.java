package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelUrsadon;
import ga.scmc.entity.living.EntityUrsadon;
import ga.scmc.entity.living.EntityUrsadonMatriarch;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * @author Ocelot5836
 */
public class RenderUrsadonMatriarch extends RenderLiving<EntityUrsadonMatriarch> {
	
	protected ModelUrsadon model;

	public RenderUrsadonMatriarch(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelUrsadon) mainModel);
	}

	@Override
	public void doRender(EntityUrsadonMatriarch entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityUrsadonMatriarch entity) {
		return new ResourceLocation(Resources.URSADON_MATRIARCH_BASE);
	}
	
	@Override
	protected void preRenderCallback(EntityUrsadonMatriarch entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(2.00F, 2.00F, 2.00F);
	}
}