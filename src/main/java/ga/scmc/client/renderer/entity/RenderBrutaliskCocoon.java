package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityBrutaliskCocoon;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelBrutaliskCocoon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrutaliskCocoon extends RenderLiving<EntityBrutaliskCocoon> {
	private static final ResourceLocation BRUTALISKCOCOON_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/brutaliskcocoon.png");
	protected ModelBrutaliskCocoon modelEntity;

	public RenderBrutaliskCocoon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelBrutaliskCocoon) mainModel);
	}

	@Override
	public void doRender(EntityBrutaliskCocoon entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrutaliskCocoon entity) {
		return BRUTALISKCOCOON_TEXTURES;
	}
}