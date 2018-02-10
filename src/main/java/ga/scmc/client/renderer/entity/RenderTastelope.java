package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelLope;
import ga.scmc.entity.living.EntityTastelope;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderTastelope extends RenderLiving<EntityTastelope> implements LayerRenderer<EntityTastelope> {

	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.TASTELOPE_BASE);
	private static final ResourceLocation	STATICGLOW	= new ResourceLocation(Resources.TASTELOPE_GLOW_STATIC);
	private final RenderTastelope			RENDERER;
	protected ModelLope						model;

	public RenderTastelope(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelLope) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTastelope entity) {
		return new ResourceLocation(Resources.TASTELOPE_BASE);
	}

	@Override
	public void doRenderLayer(EntityTastelope entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}