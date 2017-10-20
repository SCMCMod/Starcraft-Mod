package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerDarkProbeColor;
import ga.scmc.client.renderer.layers.LayerDarkProbeGlowDynamic;
import ga.scmc.entity.living.EntityDarkProbe;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelDarkProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDarkProbe<T> extends RenderLiving<EntityDarkProbe> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/darkprobe_base.png");
	protected ModelDarkProbe model;

	public RenderDarkProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelDarkProbe) mainModel);
		addLayer(new LayerDarkProbeColor(this));
		addLayer(new LayerDarkProbeGlowDynamic(this));
	}

	@Override
	public void doRender(EntityDarkProbe entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkProbe entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityDarkProbe entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}
}
