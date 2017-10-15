package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerVoidProbe;
import ga.scmc.entity.living.EntityVoidProbe;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelVoidProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVoidProbe<T> extends RenderLiving<EntityVoidProbe> {
	private static final ResourceLocation VOID_PROBE_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/voidprobe.png");
	protected ModelVoidProbe modelEntity;

	public RenderVoidProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelVoidProbe) mainModel);
		addLayer(new LayerVoidProbe(this));
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
		return VOID_PROBE_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityVoidProbe entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}
}
