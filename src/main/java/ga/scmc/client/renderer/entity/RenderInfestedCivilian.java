package ga.scmc.client.renderer.entity;

import ga.scmc.entity.living.EntityInfestedCivilian;
import ga.scmc.lib.Library;
import ga.scmc.model.ModelInfestedCivilian;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderInfestedCivilian extends RenderLiving<EntityInfestedCivilian> {
	private static final ResourceLocation INFESTEDCIVILIAN_TEXTURES = new ResourceLocation(Library.RL_BASE + "textures/entity/infestedcivilian.png");
	protected ModelInfestedCivilian modelEntity;
	public RenderInfestedCivilian(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelInfestedCivilian) mainModel);
	}

	@Override
	public void doRender(EntityInfestedCivilian entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityInfestedCivilian entity) {
		return INFESTEDCIVILIAN_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityInfestedCivilian entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.75F, 0.75F, 0.75F);
	}
}
