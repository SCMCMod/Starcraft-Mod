package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.layers.LayerMarineColor;
import ga.scmc.client.renderer.model.ModelMarine;
import ga.scmc.entity.living.EntityMarine;
import ga.scmc.lib.Library;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * @author Ocelot5836
 */
public class RenderMarine extends RenderLiving<EntityMarine> {
	
	protected ModelMarine model;

	public RenderMarine(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMarine) mainModel);
		addLayer(new LayerMarineColor(this));
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMarine entity) {
		return new ResourceLocation(Resources.MARINE_BASE);
	}
}