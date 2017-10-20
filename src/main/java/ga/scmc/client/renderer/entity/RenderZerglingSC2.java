package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerZerglingColor;
import ga.scmc.client.renderer.layers.LayerZerglingSC2GlowStatic;
import ga.scmc.entity.living.EntityZerglingSC2;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelZerglingSC2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingSC2<T> extends RenderLiving<EntityZerglingSC2> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/zergling_base.png");
	protected ModelZerglingSC2 model;

	public RenderZerglingSC2(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingSC2) mainModel);
		addLayer(new LayerZerglingColor(this));
		addLayer(new LayerZerglingSC2GlowStatic(this));
	}

	@Override
	public void doRender(EntityZerglingSC2 entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingSC2 entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingSC2 entitylivingbaseIn, float partialTickTime) {
			GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass()/60), 1.25F + (entitylivingbaseIn.getBiomass()/60), 1.25F + (entitylivingbaseIn.getBiomass()/60));
	}
}