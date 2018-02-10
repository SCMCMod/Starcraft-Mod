package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.ColoredLayerRender;
import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelBrutalisk;
import ga.scmc.entity.living.EntityBrutalisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderBrutalisk extends RenderLiving<EntityBrutalisk> implements LayerRenderer<EntityBrutalisk> {
	private static final ResourceLocation	BASE	= new ResourceLocation(Resources.BRUTALISK_BASE);
	private static final ResourceLocation	OVERLAY	= new ResourceLocation(Resources.BRUTALISK_OVERLAY);
	private final RenderBrutalisk			RENDERER;
	protected ModelBrutalisk				model;

	public RenderBrutalisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelBrutalisk) mainModel);
		this.RENDERER = this;
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityBrutalisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrutalisk entity) {
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityBrutalisk entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
	
	@Override
	protected void preRenderCallback(EntityBrutalisk entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(3.0F + (entitylivingbaseIn.getBiomass() / 60), 3.0F + (entitylivingbaseIn.getBiomass() / 60), 3.0F + (entitylivingbaseIn.getBiomass() / 60));
	}
}
