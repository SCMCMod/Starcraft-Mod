package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerZerglingBoostColor;
import ga.scmc.client.renderer.layers.LayerZerglingBoostGlowStatic;
import ga.scmc.entity.living.EntityZerglingBoost;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelZerglingBoost;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//You know the drill; no more of these comments
public class RenderZerglingBoost<T> extends RenderLiving<EntityZerglingBoost> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/zerglingboost_base.png");
	protected ModelZerglingBoost model;

	public RenderZerglingBoost(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingBoost) mainModel);
		addLayer(new LayerZerglingBoostColor(this));
		addLayer(new LayerZerglingBoostGlowStatic(this));
	}

	@Override
	public void doRender(EntityZerglingBoost entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingBoost entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingBoost entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass()/60), 1.25F + (entitylivingbaseIn.getBiomass()/60), 1.25F + (entitylivingbaseIn.getBiomass()/60));
	}
}