package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerTastelopeGlowStatic;
import ga.scmc.client.renderer.model.ModelLope;
import ga.scmc.entity.living.EntityTastelope;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * @author Ocelot5836
 */
public class RenderTastelope<T> extends RenderLiving<EntityTastelope> {

	protected ModelLope model;

	public RenderTastelope(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelLope) mainModel);
		addLayer(new LayerTastelopeGlowStatic(this));
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTastelope entity) {
		return new ResourceLocation(Resources.TASTELOPE_BASE);
	}
}