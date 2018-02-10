package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelBroodling;
import ga.scmc.entity.living.EntityBroodling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderBroodling extends RenderLiving<EntityBroodling> implements LayerRenderer<EntityBroodling> {
	private static final ResourceLocation	BASE	= new ResourceLocation(Resources.BROODLING_BASE);
	private static final ResourceLocation	OVERLAY	= new ResourceLocation(Resources.BROODLING_OVERLAY);
	private final RenderBroodling			RENDERER;
	protected ModelBroodling				model;

	public RenderBroodling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelBroodling) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityBroodling entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBroodling entity) {
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityBroodling entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}
