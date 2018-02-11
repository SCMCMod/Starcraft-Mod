package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.ModelMarine;
import ga.scmc.entity.living.EntityJimRaynor;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * @author Ocelot5836
 */
public class RenderJimRaynor extends RenderLiving<EntityJimRaynor> {

	private static final ResourceLocation	BASE	= new ResourceLocation(Resources.JIMRAYNOR_BASE);
	private final RenderJimRaynor			RENDERER;
	protected ModelMarine					model;

	public RenderJimRaynor(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelMarine) mainModel);
		this.RENDERER = this;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityJimRaynor entity) {
		return BASE;
	}
}