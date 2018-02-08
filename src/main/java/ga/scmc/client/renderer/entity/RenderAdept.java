package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.model.ModelAdept;
import ga.scmc.entity.living.EntityAdept;
import ga.scmc.lib.Library;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAdept extends RenderLiving<EntityAdept> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/adept.png");
	protected ModelAdept model;

	public RenderAdept(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelAdept) mainModel);
	}

	@Override
	public void doRender(EntityAdept entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAdept entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityAdept entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.75F, 0.75F, 0.75F);
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
}