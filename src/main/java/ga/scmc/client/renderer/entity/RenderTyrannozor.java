package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerTyrannozorColor;
import ga.scmc.client.renderer.entity.layers.LayerTyrannozorGlowDynamic;
import ga.scmc.client.renderer.model.ModelTyrannozor;
import ga.scmc.entity.living.EntityTyrannozor;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTyrannozor<T> extends RenderLiving<EntityTyrannozor> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.TYRANNOZOR_BASE);
	protected ModelTyrannozor model;

	public RenderTyrannozor(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelTyrannozor) mainModel);
		addLayer(new LayerTyrannozorColor(this));
		addLayer(new LayerTyrannozorGlowDynamic(this));
	}

	@Override
	public void doRender(EntityTyrannozor entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTyrannozor entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityTyrannozor entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(4.0F + (entitylivingbaseIn.getBiomass() / 60), 4.0F + (entitylivingbaseIn.getBiomass() / 60), 4.0F + (entitylivingbaseIn.getBiomass() / 60));
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
}