package ga.scmc.client.renderer.entity;

import ga.scmc.client.renderer.layers.LayerLarvaColor;
import ga.scmc.client.renderer.layers.LayerLarvaGlowStatic;
import ga.scmc.entity.living.EntityLarva;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelLarva;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//And again
public class RenderLarva<T> extends RenderLiving<EntityLarva> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/larva_base.png");
	protected ModelLarva model;
	
	public RenderLarva(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelLarva) mainModel);
		addLayer(new LayerLarvaColor(this));
		addLayer(new LayerLarvaGlowStatic(this));
	}

	@Override
	public void doRender(EntityLarva entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLarva entity) {
		return TEXTURE;
	}
}
