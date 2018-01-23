package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerTyrannozorDehakaColor;
import ga.scmc.client.renderer.entity.layers.LayerTyrannozorDehakaGlowDynamic;
import ga.scmc.client.renderer.entity.layers.LayerTyrannozorDehakaGlowStatic;
import ga.scmc.client.renderer.model.ModelTyrannozorDehaka;
import ga.scmc.entity.living.EntityTyrannozorDehaka;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTyrannozorDehaka<T> extends RenderLiving<EntityTyrannozorDehaka> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.TYRANNOZORDEHAKA_BASE);
	protected ModelTyrannozorDehaka model;

	public RenderTyrannozorDehaka(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelTyrannozorDehaka) mainModel);
		addLayer(new LayerTyrannozorDehakaColor(this));
		addLayer(new LayerTyrannozorDehakaGlowDynamic(this));
		addLayer(new LayerTyrannozorDehakaGlowStatic(this));
	}

	@Override
	public void doRender(EntityTyrannozorDehaka entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTyrannozorDehaka entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityTyrannozorDehaka entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(4.0F + (entitylivingbaseIn.getBiomass() / 60), 4.0F + (entitylivingbaseIn.getBiomass() / 60), 4.0F + (entitylivingbaseIn.getBiomass() / 60));
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
}