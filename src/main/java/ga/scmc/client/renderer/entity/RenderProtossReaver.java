package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerProtossReaver;
import ga.scmc.entity.living.EntityProtossReaver;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelProtossReaver;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;


public class RenderProtossReaver<T> extends RenderLiving<EntityProtossReaver> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/preaver.png");
	protected ModelProtossReaver model;

	public RenderProtossReaver(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelProtossReaver) mainModel);
		addLayer(new LayerProtossReaver(this));
	}

	@Override
	public void doRender(EntityProtossReaver entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityProtossReaver entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityProtossReaver entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(5.0F, 5.0F, 5.0F);
	}
}
