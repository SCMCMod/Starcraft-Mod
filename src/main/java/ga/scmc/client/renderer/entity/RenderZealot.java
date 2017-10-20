package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerZealotColor;
import ga.scmc.client.renderer.layers.LayerZealotGlowDynamic;
import ga.scmc.client.renderer.layers.LayerZealotGlowStatic;
import ga.scmc.entity.living.EntityZealot;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelZealot;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

// Moar special cases
public class RenderZealot<T> extends RenderLiving<EntityZealot> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/zealot_base.png");
	protected ModelZealot model;

	public RenderZealot(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZealot) mainModel);
		addLayer(new LayerZealotColor(this));
		addLayer(new LayerZealotGlowDynamic(this));
		addLayer(new LayerZealotGlowStatic(this));
	}

	@Override
	public void doRender(EntityZealot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZealot entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZealot entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.70F, 0.70F, 0.70F);
	}
}