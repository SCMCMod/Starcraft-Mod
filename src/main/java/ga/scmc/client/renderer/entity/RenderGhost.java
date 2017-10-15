package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityGhost;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelGhost;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGhost extends RenderLiving<EntityGhost> {
	private static final ResourceLocation GHOST_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/ghost.png");
	protected ModelGhost modelEntity;

	public RenderGhost(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelGhost) mainModel);
	}

	@Override
	public void doRender(EntityGhost entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGhost entity) {
		return GHOST_TEXTURES;
	}
}