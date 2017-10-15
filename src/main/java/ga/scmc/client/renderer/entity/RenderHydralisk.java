package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerHydralisk;
import ga.scmc.entity.living.EntityHydralisk;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelHydralisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//Same reason for special case
public class RenderHydralisk<T> extends RenderLiving<EntityHydralisk> {
	private static final ResourceLocation ZERGLING_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/hydralisk.png");
	protected ModelHydralisk modelEntity;

	public RenderHydralisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelHydralisk) mainModel);
		addLayer(new LayerHydralisk(this));
	}

	@Override
	public void doRender(EntityHydralisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydralisk entity) {
		return ZERGLING_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityHydralisk entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(1.3F, 1.3F, 1.3F);
	}
}
