package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.model.ModelKakaru;
import ga.scmc.entity.living.EntityKakaru;
import ga.scmc.lib.Library;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKakaru<T> extends RenderLiving<EntityKakaru> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/kakaru.png");
	protected ModelKakaru model;

	public RenderKakaru(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelKakaru) mainModel);
	}

	@Override
	public void doRender(EntityKakaru entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityKakaru entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityKakaru entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(2.5F, 2.5F, 2.5F);
		GlStateManager.translate(0, 1.0F, 0);
	}
}
