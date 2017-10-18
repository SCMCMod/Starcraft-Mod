package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerPredatorColor;
import ga.scmc.client.renderer.layers.LayerPredatorGlowDynamic;
import ga.scmc.client.renderer.layers.LayerPredatorGlowStatic;
import ga.scmc.entity.living.EntityPredator;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelPredator;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPredator<T> extends RenderLiving<EntityPredator> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/predator_base.png");
	protected ModelPredator model;

	public RenderPredator(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelPredator) mainModel);
		addLayer(new LayerPredatorColor(this));
		addLayer(new LayerPredatorGlowDynamic(this));
		addLayer(new LayerPredatorGlowStatic(this));
	}

	@Override
	public void doRender(EntityPredator entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPredator entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityPredator entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.2F, 1.2F, 1.2F);
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
}