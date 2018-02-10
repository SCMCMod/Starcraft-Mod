package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelZealot;
import ga.scmc.entity.living.EntityZealot;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderZealot extends RenderLiving<EntityZealot> implements LayerRenderer<EntityZealot> {

	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.ZEALOT_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.ZEALOT_OVERLAY);
	private static final ResourceLocation	STATICGLOW	= new ResourceLocation(Resources.ZEALOT_GLOW_STATIC);
	private static final ResourceLocation	DYNAMICGLOW	= new ResourceLocation(Resources.ZEALOT_GLOW_DYNAMIC);
	private final RenderZealot				RENDERER;
	protected ModelZealot					model;

	public RenderZealot(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZealot) mainModel);
		this.addLayer(this);
		this.RENDERER = this;
	}

	@Override
	public void doRender(EntityZealot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZealot entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZealot entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.7F, 0.7F, 0.7F);
	}

	@Override
	public void doRenderLayer(EntityZealot entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}
