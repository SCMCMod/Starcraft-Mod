package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntitySCV;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelSCV;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSCV extends RenderLiving<EntitySCV> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/scv.png");
	protected ModelSCV model;

	public RenderSCV(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelSCV) mainModel);
	}

	@Override
	public void doRender(EntitySCV entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySCV entity) {
		return TEXTURE;
	}
}