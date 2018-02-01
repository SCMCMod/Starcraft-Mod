package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskPrimalColor;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskPrimalGlowStatic;
import ga.scmc.client.renderer.model.ModelMutaliskPrimal;
import ga.scmc.entity.living.EntityMutaliskPrimal;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderMutaliskPrimal<T> extends RenderLiving<EntityMutaliskPrimal> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISKPRIMAL_BASE);
	protected ModelMutaliskPrimal model;
	int x = 0;

	public RenderMutaliskPrimal(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMutaliskPrimal) mainModel);
		addLayer(new LayerMutaliskPrimalColor(this));
		addLayer(new LayerMutaliskPrimalGlowStatic(this));
	}

	@Override
	public void doRender(EntityMutaliskPrimal entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMutaliskPrimal entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityMutaliskPrimal entitylivingbaseIn, float partialTickTime) {
		if(entitylivingbaseIn.motionY > 0) {
			GlStateManager.rotate(MathHelper.clamp(x--, -30, 0), 1.0F, 0, 0);
			x = MathHelper.clamp(x--, -50, 0);
		}
		if(entitylivingbaseIn.motionY < 0) {
			GlStateManager.rotate(MathHelper.clamp(x++, 0, 30), 1.0F, 0, 0);
			x = MathHelper.clamp(x++, 0, 50);
		}
		//GlStateManager.scale(1.0F + (entitylivingbaseIn.getBiomass() / 60), 1.0F + (entitylivingbaseIn.getBiomass() / 60), 1.0F + (entitylivingbaseIn.getBiomass() / 60));
	}
}