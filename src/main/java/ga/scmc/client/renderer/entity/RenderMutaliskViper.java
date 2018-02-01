package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskViperColor;
import ga.scmc.client.renderer.entity.layers.LayerMutaliskViperGlowStatic;
import ga.scmc.client.renderer.model.ModelMutaliskViper;
import ga.scmc.entity.living.EntityMutaliskViper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderMutaliskViper<T> extends RenderLiving<EntityMutaliskViper> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISKVIPER_BASE);
	protected ModelMutaliskViper model;
	int x = 0;

	public RenderMutaliskViper(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMutaliskViper) mainModel);
		addLayer(new LayerMutaliskViperColor(this));
		addLayer(new LayerMutaliskViperGlowStatic(this));
	}

	@Override
	public void doRender(EntityMutaliskViper entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMutaliskViper entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityMutaliskViper entitylivingbaseIn, float partialTickTime) {
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