package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskBroodlordColor;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskBroodlordGlowStatic;
import ga.scmc.client.renderer.model.ModelMutaliskBroodlord;
import ga.scmc.entity.living.EntityMutaliskBroodlord;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMutaliskBroodlord<T> extends RenderLiving<EntityMutaliskBroodlord> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISKBROODLORD_BASE);
	protected ModelMutaliskBroodlord model;

	public RenderMutaliskBroodlord(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMutaliskBroodlord) mainModel);
		addLayer(new LayerMutaliskBroodlordColor(this));
		addLayer(new LayerMutaliskBroodlordGlowStatic(this));
	}

	@Override
	public void doRender(EntityMutaliskBroodlord entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMutaliskBroodlord entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityMutaliskBroodlord entitylivingbaseIn, float partialTickTime) {
		// GlStateManager.scale(1.0F + (entitylivingbaseIn.getBiomass() / 60), 1.0F +
		// (entitylivingbaseIn.getBiomass() / 60), 1.0F +
		// (entitylivingbaseIn.getBiomass() / 60));
	}
}