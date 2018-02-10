package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelLarvaCocoon;
import ga.scmc.entity.living.EntityLarvaCocoon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderLarvaCocoon extends RenderLiving<EntityLarvaCocoon> implements LayerRenderer<EntityLarvaCocoon> {
	private static final ResourceLocation	BASE	= new ResourceLocation(Resources.LARVA_COCOON_BASE);
	private static final ResourceLocation	OVERLAY	= new ResourceLocation(Resources.LARVA_COCOON_OVERLAY);
	private final RenderLarvaCocoon			RENDERER;
	protected ModelLarvaCocoon				model;

	public RenderLarvaCocoon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelLarvaCocoon) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityLarvaCocoon entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLarvaCocoon entity) {
		return BASE;
	}
	
	@Override
	protected void preRenderCallback(EntityLarvaCocoon entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.7F, 1.7F, 1.7F);
	}

	@Override
	public void doRenderLayer(EntityLarvaCocoon entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}
