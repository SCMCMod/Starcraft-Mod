package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerDarkTemplarColor;
import ga.scmc.client.renderer.entity.layers.LayerDarkTemplarGlowStatic;
import ga.scmc.client.renderer.model.ModelDarkTemplar;
import ga.scmc.entity.living.EntityDarkTemplar;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDarkTemplar<T> extends RenderLiving<EntityDarkTemplar> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.DARKTEMPLAR_BASE);
	protected ModelDarkTemplar model;

	public RenderDarkTemplar(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelDarkTemplar) mainModel);
		addLayer(new LayerDarkTemplarColor(this));
		addLayer(new LayerDarkTemplarGlowStatic(this));
	}

	@Override
	public void doRender(EntityDarkTemplar entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkTemplar entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityDarkTemplar entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.65F, 0.65F, 0.65F);
	}
}
