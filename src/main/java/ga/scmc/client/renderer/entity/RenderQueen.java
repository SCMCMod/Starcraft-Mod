package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerQueenColor;
import ga.scmc.client.renderer.entity.layers.LayerQueenGlowStatic;
import ga.scmc.client.renderer.model.ModelQueen;
import ga.scmc.entity.living.EntityQueen;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderQueen<T> extends RenderLiving<EntityQueen> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.QUEEN_BASE);
	protected ModelQueen model;

	public RenderQueen(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelQueen) mainModel);
		addLayer(new LayerQueenColor(this));
		addLayer(new LayerQueenGlowStatic(this));
	}

	@Override
	public void doRender(EntityQueen entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityQueen entity) {
		return TEXTURE;
	}
}
