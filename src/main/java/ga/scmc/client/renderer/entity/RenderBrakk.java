package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerBrakkColor;
import ga.scmc.client.renderer.entity.layers.LayerBrakkGlowDynamic;
import ga.scmc.client.renderer.model.ModelBrakk;
import ga.scmc.entity.living.EntityBrakk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrakk<T> extends RenderLiving<EntityBrakk> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.BRAKK_BASE);
	protected ModelBrakk model;

	public RenderBrakk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelBrakk) mainModel);
		addLayer(new LayerBrakkColor(this));
		addLayer(new LayerBrakkGlowDynamic(this));
	}

	@Override
	public void doRender(EntityBrakk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrakk entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityBrakk entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(5.5F + (entitylivingbaseIn.getBiomass() / 60), 5.5F + (entitylivingbaseIn.getBiomass() / 60), 5.5F + (entitylivingbaseIn.getBiomass() / 60));
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
}