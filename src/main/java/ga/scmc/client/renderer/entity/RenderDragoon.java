package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityDragoon;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelDragoon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDragoon extends RenderLiving<EntityDragoon> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/dragoon.png");
	protected ModelDragoon model;

	public RenderDragoon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelDragoon) mainModel);
	}

	@Override
	public void doRender(EntityDragoon entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDragoon entity) {
		return TEXTURE;
	}
}