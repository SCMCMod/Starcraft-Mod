package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.entity.layers.LayerBrutaliskColor;
import ga.scmc.client.renderer.model.ModelBrutalisk;
import ga.scmc.entity.living.EntityBrutalisk;
import ga.scmc.lib.Library;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrutalisk<T> extends RenderLiving<EntityBrutalisk> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/brutalisk_base.png");
	protected ModelBrutalisk model;

	public RenderBrutalisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelBrutalisk) mainModel);
		addLayer(new LayerBrutaliskColor(this));
	}

	@Override
	public void doRender(EntityBrutalisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrutalisk entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityBrutalisk entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(3.0F + (entitylivingbaseIn.getBiomass() / 60), 3.0F + (entitylivingbaseIn.getBiomass() / 60), 3.0F + (entitylivingbaseIn.getBiomass() / 60));
	}
}
