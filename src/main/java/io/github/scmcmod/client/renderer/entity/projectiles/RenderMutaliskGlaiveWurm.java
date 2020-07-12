package io.github.scmcmod.client.renderer.entity.projectiles;

import io.github.scmcmod.Starcraft;
import io.github.scmcmod.client.model.entity.ModelMutaliskGlaiveWurm;
import io.github.scmcmod.entity.EntityMutaliskGlaiveWurm;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMutaliskGlaiveWurm extends Render<EntityMutaliskGlaiveWurm>
{

	private ModelBase model = new ModelMutaliskGlaiveWurm();
	int x = 0;

	public static final Factory FACTORY = new Factory();

	public RenderMutaliskGlaiveWurm(RenderManager renderManager)
	{
		super(renderManager);
	}

	public RenderMutaliskGlaiveWurm(RenderManager renderManager, ModelBase model)
	{
		this(renderManager);
		this.model = model;
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	@Override
	public void doRender(EntityMutaliskGlaiveWurm entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) x, (float) y, (float) z);
		GlStateManager.enableRescaleNormal();
		float scale = 1.0F;
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(40, this.x++, scale, scale);
		this.bindEntityTexture(entity);
		this.model.render(entity, 0.0F, 0.0F, 0.0F, entityYaw, 0.0F, 0.03125F);
		GlStateManager.popMatrix();
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless
	 * you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(EntityMutaliskGlaiveWurm entity)
	{
		return new ResourceLocation(SCConstants.MODID + "textures/entity/mutaliskglaivewurm.png");
	}

	public static class Factory implements IRenderFactory<EntityMutaliskGlaiveWurm>
	{

		@Override
		public Render<? super EntityMutaliskGlaiveWurm> createRenderFor(RenderManager manager)
		{
			return new RenderMutaliskGlaiveWurm(manager);
		}

	}
}