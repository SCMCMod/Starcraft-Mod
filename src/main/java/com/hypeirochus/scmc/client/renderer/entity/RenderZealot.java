package com.hypeirochus.scmc.client.renderer.entity;

import com.hypeirochus.api.client.render.Draw;
import com.hypeirochus.api.client.render.OpenGL;
import com.hypeirochus.scmc.client.renderer.ColoredLayerRender;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.model.ModelZealot;
import com.hypeirochus.scmc.entity.living.EntityZealot;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class RenderZealot extends RenderLiving<EntityZealot> implements LayerRenderer<EntityZealot> {

	private static final ResourceLocation	BASE		= new ResourceLocation(Resources.ZEALOT_BASE);
	private static final ResourceLocation	OVERLAY		= new ResourceLocation(Resources.ZEALOT_OVERLAY);
	private static final ResourceLocation	STATICGLOW	= new ResourceLocation(Resources.ZEALOT_GLOW_STATIC);
	private static final ResourceLocation	DYNAMICGLOW	= new ResourceLocation(Resources.ZEALOT_GLOW_DYNAMIC);
	private final RenderZealot				RENDERER;
	protected ModelZealot					model;
	
	protected ItemStack icon = new ItemStack(ItemHandler.ICON_PROTOSS);

	public RenderZealot(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		model = ((ModelZealot) mainModel);
		this.addLayer(this);
		this.RENDERER = this;
	}

	@Override
	public void doRender(EntityZealot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
		OpenGL.pushMatrix();
		{
			GlStateManager.disableCull();

			OpenGL.translate(x, y + 4.5F, z);

			if (entity != null && entity.world.getClosestPlayerToEntity(entity, 8.0D) != null) {
				float scale = 0.04F;
				OpenGL.scale(scale, scale, scale);
				OpenGL.disableLight();

				OpenGL.pushMatrix();
				{
					OpenGL.rotate(AccessHandler.getMinecraft().player.rotationYaw + 180, 0F, -1F, 0F);
					OpenGL.pushMatrix();
					{
						OpenGL.rotate(180, -1F, 0F, 0F);
						Draw.renderItem(icon, -7, 15);
						Draw.drawString((entity.getFactionAsString().toLowerCase()), -20, 30, 0xFFE5E500, false);
						scale = 0.5F;
						OpenGL.scale(scale, scale, scale);
					}
					OpenGL.popMatrix();
				}
				OpenGL.popMatrix();

				OpenGL.enableLight();
			}
		}
		OpenGL.popMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZealot entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityZealot entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.7F, 0.7F, 0.7F);
	}

	@Override
	public void doRenderLayer(EntityZealot entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, OVERLAY, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, STATICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, DYNAMICGLOW, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}
