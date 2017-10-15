package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityBroodling;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelBroodling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBroodling extends RenderLiving<EntityBroodling> {
	private static final ResourceLocation BROODLING_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/broodling.png");
	protected ModelBroodling modelEntity;

	public RenderBroodling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelBroodling) mainModel);
	}

	@Override
	public void doRender(EntityBroodling entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBroodling entity) {
		return BROODLING_TEXTURES;
	}
}