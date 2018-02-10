package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelZerglingPrimalDehaka;
import ga.scmc.entity.living.EntityZerglingPrimalDehaka;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderZerglingPrimalDehaka extends RenderLiving<EntityZerglingPrimalDehaka> implements LayerRenderer<EntityZerglingPrimalDehaka> {

	private static final ResourceLocation		BASE		= new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_BASE);
	private static final ResourceLocation		OVERLAY		= new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_OVERLAY);
	private static final ResourceLocation		STATICGLOW	= new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_GLOW_STATIC);
	private final RenderZerglingPrimalDehaka	RENDERER;
	protected ModelZerglingPrimalDehaka			model;

	public RenderZerglingPrimalDehaka(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZerglingPrimalDehaka) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZerglingPrimalDehaka entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingPrimalDehaka entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZerglingPrimalDehaka entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60), 1.25F + (entitylivingbaseIn.getBiomass() / 60));
	}

	@Override
	public void doRenderLayer(EntityZerglingPrimalDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}