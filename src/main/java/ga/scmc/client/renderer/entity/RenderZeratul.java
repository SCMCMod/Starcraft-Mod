package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerZeratulColor;
import ga.scmc.client.renderer.entity.layers.LayerZeratulGlowStatic;
import ga.scmc.client.renderer.model.ModelZeratul;
import ga.scmc.entity.living.EntityZeratul;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZeratul<T> extends RenderLiving<EntityZeratul> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERATUL_BASE);
	protected ModelZeratul model;

	public RenderZeratul(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZeratul) mainModel);
		addLayer(new LayerZeratulColor(this));
		addLayer(new LayerZeratulGlowStatic(this));
	}

	@Override
	public void doRender(EntityZeratul entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZeratul entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityZeratul entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.65F, 0.65F, 0.65F);
	}
}
