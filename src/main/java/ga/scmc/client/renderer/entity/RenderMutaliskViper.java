package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelMutaliskViper;
import ga.scmc.entity.living.EntityMutaliskViper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderMutaliskViper extends RenderLiving<EntityMutaliskViper> implements LayerRenderer<EntityMutaliskViper> {
	private static final ResourceLocation		BASE		= new ResourceLocation(Resources.MUTALISKVIPER_BASE);
	private static final ResourceLocation		OVERLAY		= new ResourceLocation(Resources.MUTALISKVIPER_OVERLAY);
	private static final ResourceLocation		STATICGLOW	= new ResourceLocation(Resources.MUTALISK_GLOW_STATIC);
	private final RenderMutaliskViper	RENDERER;
	protected ModelMutaliskViper			model;

	public RenderMutaliskViper(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMutaliskViper) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
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
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityMutaliskViper entitylivingbaseIn, float partialTickTime) {
	}

	@Override
	public void doRenderLayer(EntityMutaliskViper entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}