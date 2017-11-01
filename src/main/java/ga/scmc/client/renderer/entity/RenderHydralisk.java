package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerHydraliskColor;
import ga.scmc.client.renderer.entity.layers.LayerHydraliskGlowStatic;
import ga.scmc.client.renderer.model.ModelHydralisk;
import ga.scmc.entity.living.EntityHydralisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//Same reason for special case
public class RenderHydralisk<T> extends RenderLiving<EntityHydralisk> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.HYDRALISK_BASE);
	protected ModelHydralisk model;

	public RenderHydralisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelHydralisk) mainModel);
		addLayer(new LayerHydraliskColor(this));
		addLayer(new LayerHydraliskGlowStatic(this));
	}

	@Override
	public void doRender(EntityHydralisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydralisk entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityHydralisk entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.3F + (entitylivingbaseIn.getBiomass() / 60), 1.3F + (entitylivingbaseIn.getBiomass() / 60), 1.3F + (entitylivingbaseIn.getBiomass() / 60));
	}
}