package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityMarauder;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelMarauder;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMarauder extends RenderLiving<EntityMarauder> {
	private static final ResourceLocation MARAUDER_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/marauder.png");
	protected ModelMarauder modelEntity;

	public RenderMarauder(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelMarauder) mainModel);
	}

	@Override
	public void doRender(EntityMarauder entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMarauder entity) {
		return MARAUDER_TEXTURES;
	}
}