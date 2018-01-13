package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerArtislopeGlowStatic;
import ga.scmc.client.renderer.model.ModelTastelope;
import ga.scmc.entity.living.EntityArtislope;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * @author Ocelot5836
 */
public class RenderArtislope<T> extends RenderLiving<EntityArtislope> {
	
	protected ModelTastelope model;

	public RenderArtislope(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelTastelope) mainModel);
		addLayer(new LayerArtislopeGlowStatic(this));
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityArtislope entity) {
		return new ResourceLocation(Resources.ARTISLOPE_BASE);
	}
}