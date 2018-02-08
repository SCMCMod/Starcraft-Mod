package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerArtosilopeGlowStatic;
import ga.scmc.client.renderer.model.ModelLope;
import ga.scmc.entity.living.EntityArtosilope;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * @author Ocelot5836
 */
public class RenderArtosilope<T> extends RenderLiving<EntityArtosilope> {

	protected ModelLope model;

	public RenderArtosilope(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelLope) mainModel);
		addLayer(new LayerArtosilopeGlowStatic(this));
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityArtosilope entity) {
		return new ResourceLocation(Resources.ARTOSILOPE_BASE);
	}
}