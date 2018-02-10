package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelProbe;
import ga.scmc.entity.living.EntityProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderProbe extends RenderLiving<EntityProbe> implements LayerRenderer<EntityProbe> {

	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.PROBE_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.PROBE_OVERLAY);
	private static final ResourceLocation	DYNAMICGLOW	= new ResourceLocation(Resources.PROBE_GLOW_DYNAMIC);
	private final RenderProbe				RENDERER;
	protected ModelProbe					model;

	public RenderProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelProbe) mainModel);
		this.addLayer(this);
		this.RENDERER = this;
	}

	@Override
	public void doRender(EntityProbe entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityProbe entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityProbe entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.5F, 1.5F, 1.5F);
	}

	@Override
	public void doRenderLayer(EntityProbe entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}
