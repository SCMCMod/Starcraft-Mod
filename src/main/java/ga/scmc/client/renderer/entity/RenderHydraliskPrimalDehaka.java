package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelHydraliskPrimalDehaka;
import ga.scmc.entity.living.EntityHydraliskPrimalDehaka;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderHydraliskPrimalDehaka extends RenderLiving<EntityHydraliskPrimalDehaka> implements LayerRenderer<EntityHydraliskPrimalDehaka> {

	private static final ResourceLocation		BASE		= new ResourceLocation(Resources.HYDRALISKPRIMALDEHAKA_BASE);
	private static final ResourceLocation		OVERLAY		= new ResourceLocation(Resources.HYDRALISK_OVERLAY);
	private static final ResourceLocation		STATICGLOW	= new ResourceLocation(Resources.HYDRALISKPRIMALDEHAKA_GLOW_STATIC);
	private final RenderHydraliskPrimalDehaka	RENDERER;

	protected ModelHydraliskPrimalDehaka		model;

	public RenderHydraliskPrimalDehaka(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelHydraliskPrimalDehaka) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityHydraliskPrimalDehaka entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydraliskPrimalDehaka entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityHydraliskPrimalDehaka entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.5F + (entitylivingbaseIn.getBiomass() / 60), 1.5F + (entitylivingbaseIn.getBiomass() / 60), 1.5F + (entitylivingbaseIn.getBiomass() / 60));
	}

	@Override
	public void doRenderLayer(EntityHydraliskPrimalDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}