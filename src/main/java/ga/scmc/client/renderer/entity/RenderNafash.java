package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerNafashColor;
import ga.scmc.client.renderer.entity.layers.LayerNafashGlowDynamic;
import ga.scmc.client.renderer.entity.layers.LayerNafashGlowStatic;
import ga.scmc.client.renderer.model.ModelBroodmother;
import ga.scmc.entity.living.EntityNafash;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNafash<T> extends RenderLiving<EntityNafash> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.BROODMOTHER_BASE);
	protected ModelBroodmother model;

	public RenderNafash(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelBroodmother) mainModel);
		addLayer(new LayerNafashColor(this));
		addLayer(new LayerNafashGlowDynamic(this));
		addLayer(new LayerNafashGlowStatic(this));
	}

	@Override
	public void doRender(EntityNafash entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityNafash entity) {
		return TEXTURE;
	}

	@Override
	protected void preRenderCallback(EntityNafash entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.2F, 1.2F, 1.2F);
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
}