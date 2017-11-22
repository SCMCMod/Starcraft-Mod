package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelUrsadon;
import ga.scmc.entity.living.EntityUrsadon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * @author Ocelot5836
 */
public class RenderUrsadon<T> extends RenderLiving<EntityUrsadon> {
	
	protected ModelUrsadon model;

	public RenderUrsadon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelUrsadon) mainModel);
	}
	
	@Override
	public void doRender(EntityUrsadon entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityUrsadon entity) {
		return new ResourceLocation(Resources.URSADON_BASE);
	}
	
	@Override
	protected void preRenderCallback(EntityUrsadon entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.50F, 1.50F, 1.50F);
	}
}