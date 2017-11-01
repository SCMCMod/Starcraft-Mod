package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerVoidProbeColor;
import ga.scmc.client.renderer.entity.layers.LayerVoidProbeGlowDynamic;
import ga.scmc.client.renderer.model.ModelVoidProbe;
import ga.scmc.entity.living.EntityVoidProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVoidProbe<T> extends RenderLiving<EntityVoidProbe> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.VOID_PROBE_BASE);
	protected ModelVoidProbe model;

	public RenderVoidProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelVoidProbe) mainModel);
		addLayer(new LayerVoidProbeColor(this));
		addLayer(new LayerVoidProbeGlowDynamic(this));
	}

	@Override
	public void doRender(EntityVoidProbe entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityVoidProbe entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityVoidProbe entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}
}
