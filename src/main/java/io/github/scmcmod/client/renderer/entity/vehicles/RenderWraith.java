package io.github.scmcmod.client.renderer.entity.vehicles;

import io.github.scmcmod.client.model.entity.vehicle.ModelWraith;
import io.github.scmcmod.entity.vehicles.EntityWraith;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.rom.client.Resources;

@SideOnly(Side.CLIENT)
public class RenderWraith extends Render<EntityWraith>
{
	/** instance of ModelWraith for rendering */
	protected ModelBase modelWraith = new ModelWraith();

	public static final Factory FACTORY = new Factory();

	// TODO: make this NBT based for the wraith, to make phases of the cloaking
	private float mod = 1.0F;

	public RenderWraith(RenderManager renderManagerIn)
	{
		super(renderManagerIn);
		this.shadowSize = 0.5F;
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	public void doRender(EntityWraith entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		GlStateManager.pushMatrix();
		GlStateManager.scale(0.7F, 0.7F, 0.7F);

		this.setupTranslation(x, y, z);
		this.setupRotation(entity, entityYaw, partialTicks);
		this.bindEntityTexture(entity);

		if (this.renderOutlines)
		{
			GlStateManager.enableColorMaterial();
			GlStateManager.enableOutlineMode(this.getTeamColor(entity));
		}

		if (entity.getCloakState())
		{
			GlStateManager.enableAlpha();
			GlStateManager.enableBlend();
			if (entity.ticksExisted % 20 == 0 && mod > 0.24F)
			{
				mod -= 0.12F;
			}
			GlStateManager.color(1.0F, 1.0F, 1.0F, mod);
		}

		this.modelWraith.render(entity, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

		if (entity.getCloakState())
		{
			GlStateManager.color(1.0F, 1.0F, 1.0F, mod);
			GlStateManager.disableAlpha();
			GlStateManager.disableBlend();
		}

		if (this.renderOutlines)
		{
			GlStateManager.disableOutlineMode();
			GlStateManager.disableColorMaterial();
		}

		GlStateManager.popMatrix();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	public void setupRotation(EntityWraith p_188311_1_, float p_188311_2_, float p_188311_3_)
	{
		GlStateManager.rotate(180.0F - p_188311_2_, 0.0F, 1.0F, 0.0F);
		float f1 = p_188311_1_.getDamageTaken() - p_188311_3_;

		if (f1 < 0.0F)
		{
			f1 = 0.0F;
		}

		GlStateManager.scale(-1.0F, -1.0F, 1.0F);
	}

	public void setupTranslation(double p_188309_1_, double p_188309_3_, double p_188309_5_)
	{
		GlStateManager.translate((float) p_188309_1_, (float) p_188309_3_ + 0.375F, (float) p_188309_5_);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless
	 * you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityWraith entity)
	{
		return Resources.BLANK;
	}

	public boolean isMultipass()
	{
		return true;
	}

	public void renderMultipass(EntityWraith p_188300_1_, double p_188300_2_, double p_188300_4_, double p_188300_6_, float p_188300_8_, float p_188300_9_)
	{
		GlStateManager.pushMatrix();
		this.setupTranslation(p_188300_2_, p_188300_4_, p_188300_6_);
		this.setupRotation(p_188300_1_, p_188300_8_, p_188300_9_);
		this.bindEntityTexture(p_188300_1_);
		GlStateManager.popMatrix();
	}

	public static class Factory implements IRenderFactory<EntityWraith>
	{

		@Override
		public Render<? super EntityWraith> createRenderFor(RenderManager manager)
		{
			return new RenderWraith(manager);
		}

	}
}
