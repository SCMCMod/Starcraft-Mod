package com.arpaesis.scmc.client.renderer.entity;

import com.arpaesis.scmc.client.model.entity.ModelZealot;
import com.arpaesis.scmc.client.renderer.ColoredLayerRender;
import com.arpaesis.scmc.client.renderer.Resources;
import com.arpaesis.scmc.entity.living.EntityZealot;
import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.handlers.ItemHandler;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZealot extends RenderLiving<EntityZealot> implements LayerRenderer<EntityZealot>
{

	private static final ResourceLocation BASE = new ResourceLocation(Resources.ZEALOT_BASE);
	private static final ResourceLocation OVERLAY = new ResourceLocation(Resources.ZEALOT_OVERLAY);
	private static final ResourceLocation STATICGLOW = new ResourceLocation(Resources.ZEALOT_GLOW_STATIC);
	private static final ResourceLocation DYNAMICGLOW = new ResourceLocation(Resources.ZEALOT_GLOW_DYNAMIC);
	
	public static final Factory FACTORY = new Factory();

	protected ItemStack icon = new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.PROTOSS.getID());

	public RenderZealot(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelZealot(), 0.5F);
		this.addLayer(this);
	}

	@Override
	public void doRender(EntityZealot entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines)
		{
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZealot entity)
	{
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZealot entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.7F, 0.7F, 0.7F);
	}

	@Override
	public void doRenderLayer(EntityZealot entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		ColoredLayerRender.render(this, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
		ColoredLayerRender.renderDynamicGlow(this, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return false;
	}

	public static class Factory implements IRenderFactory<EntityZealot>
	{

		@Override
		public Render<? super EntityZealot> createRenderFor(RenderManager manager)
		{
			return new RenderZealot(manager);
		}

	}
}
