package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityStalker;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelStalker;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStalker extends RenderLiving<EntityStalker> {
	private static final ResourceLocation STALKER_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/stalker.png");
	protected ModelStalker modelEntity;

	public RenderStalker(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelStalker) mainModel);
	}

	@Override
	public void doRender(EntityStalker entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityStalker entity) {
		return STALKER_TEXTURES;
	}
}