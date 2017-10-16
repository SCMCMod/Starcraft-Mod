package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityBrutalisk;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelBrutalisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrutalisk extends RenderLiving<EntityBrutalisk> {
	private static final ResourceLocation BRUTALISK_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/brutalisk.png");
	protected ModelBrutalisk modelEntity;

	public RenderBrutalisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelBrutalisk) mainModel);
	}

	@Override
	public void doRender(EntityBrutalisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrutalisk entity) {
		return BRUTALISK_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityBrutalisk entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(3.0F + (entitylivingbaseIn.getBiomass()/60), 3.0F + (entitylivingbaseIn.getBiomass()/60), 3.0F + (entitylivingbaseIn.getBiomass()/60));
	}
}
