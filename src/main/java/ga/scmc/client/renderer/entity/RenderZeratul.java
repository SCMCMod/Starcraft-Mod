package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelZeratul;
import ga.scmc.entity.living.EntityZeratul;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderZeratul extends RenderLiving<EntityZeratul> implements LayerRenderer<EntityZeratul> {
	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.ZERATUL_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.ZERATUL_OVERLAY);
	private static final ResourceLocation	STATICGLOW	= new ResourceLocation(Resources.ZERATUL_GLOW_STATIC);
	private final RenderZeratul				RENDERER;
	protected ModelZeratul					model;

	public RenderZeratul(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZeratul) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZeratul entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZeratul entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZeratul entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.65F, 0.65F, 0.65F);
	}

	@Override
	public void doRenderLayer(EntityZeratul entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}
