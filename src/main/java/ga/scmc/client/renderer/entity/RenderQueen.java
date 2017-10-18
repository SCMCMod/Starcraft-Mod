package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityQueen;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelQueen;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderQueen extends RenderLiving<EntityQueen> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/queen.png");
	protected ModelQueen model;

	public RenderQueen(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelQueen) mainModel);
	}

	@Override
	public void doRender(EntityQueen entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityQueen entity) {
		return TEXTURE;
	}
}