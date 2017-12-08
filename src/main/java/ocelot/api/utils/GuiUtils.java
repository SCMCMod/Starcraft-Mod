package ocelot.api.utils;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;

/**
 * <em><b>Copyright (c) 2017 Ocelot5836.</b></em>
 * 
 * @author Ocelot5836
 */
public class GuiUtils extends GuiScreen {

	private static final Minecraft MC = Minecraft.getMinecraft();

	/**
	 * Draws an array of lines to a gui.
	 * 
	 * @param lines
	 *            The lines to render
	 * @param x
	 *            The x position to render at
	 * @param y
	 *            The y position to render at
	 * @param color
	 *            The color of the text
	 */
	public static void drawLines(List<String> lines, int x, int y, int color) {
		for (int i = 0; i < lines.size(); i++) {
			MC.fontRendererObj.drawString(lines.get(i), x, y + (i * 8), color);
		}
	}

	/**
	 * Checks if the mouse is inside of the specified location.
	 * 
	 * @param x
	 *            The x position to check
	 * @param y
	 *            The y position to check
	 * @param width
	 *            The width of the check area
	 * @param height
	 *            The height of the check area
	 * @param mouseX
	 *            The x of the mouse
	 * @param mouseY
	 *            The y of the mouse
	 * @return Whether the mouse is inside of that location
	 */
	public static boolean isMouseInside(int x, int y, int width, int height, int mouseX, int mouseY) {
		if (mouseX >= x && mouseX <= (x + width) && mouseY >= y && mouseY < (y + height)) {
			return true;
		}
		return false;
	}

	/**
	 * Draws a gui with the specified parameters.
	 * 
	 * @param x
	 *            The x to draw the window at
	 * @param y
	 *            The y to draw the window at
	 * @param width
	 *            The width of the window
	 * @param height
	 *            The height of the window
	 * @param zLevel
	 *            <em> MAKE SURE NOT TO EDIT THIS VALUE UNLESS YOU KNOW WHAT YOU ARE DOING!!</em>
	 */
	public static void drawCustomSizeGui(int x, int y, int width, int height, float zLevel) {
		TextureUtils.bindTexture("textures/gui/util.png");
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		drawScaledCustomSizeModalRect(x + 5, y + 5, 5, 5, 5, 5, width - 10, height - 10, 256, 256);
		drawScaledCustomSizeModalRect(x, y + 5, 0, 5, 5, 5, 5, height - 10, 256, 256);
		drawScaledCustomSizeModalRect(x + width - 5, y + 5, 10, 5, 5, 5, 5, height - 10, 256, 256);
		drawScaledCustomSizeModalRect(x + 5, y + height - 5, 5, 10, 5, 5, width - 10, 5, 256, 256);
		drawScaledCustomSizeModalRect(x + 5, y, 5, 0, 5, 5, width - 10, 5, 256, 256);

		drawStaticTextureModelRect(x, y, 0, 0, 5, 5, zLevel);
		drawStaticTextureModelRect(x + width - 5, y, 10, 0, 5, 5, zLevel);
		drawStaticTextureModelRect(x, y + height - 5, 0, 10, 5, 5, zLevel);
		drawStaticTextureModelRect(x + width - 5, y + height - 5, 10, 10, 5, 5, zLevel);
	}

	/**
	 * Draws a default minecraft slot at the specified position with the specified size.
	 * 
	 * @param x
	 *            The x position
	 * @param y
	 *            The y position
	 * @param width
	 *            The width of the slot
	 * @param height
	 *            The height of the slot
	 */
	public static void drawSlot(int x, int y, int width, int height) {
		TextureUtils.bindTexture("textures/gui/util.png");
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		drawScaledCustomSizeModalRect(x + 1, y + 1, 1, 16, 0, 0, width - 2, height - 2, 256, 256);

		drawScaledCustomSizeModalRect(x, y, 0, 15, 1, 1, 1, height - 1, 256, 256);
		drawScaledCustomSizeModalRect(x + 1, y, 0, 15, 1, 1, width - 2, 1, 256, 256);
		drawScaledCustomSizeModalRect(x + (width - 1), y, 2, 16, 1, 1, 1, height - 1, 256, 256);
		drawScaledCustomSizeModalRect(x + 1, y + (height - 1), 1, 17, 1, 1, width - 1, 1, 256, 256);

		drawScaledCustomSizeModalRect(x + (width - 1), y, 2, 15, 1, 1, 1, 1, 256, 256);
		drawScaledCustomSizeModalRect(x, y + (height - 1), 0, 17, 1, 1, 1, 1, 256, 256);
	}

	/**
	 * Renders an entity to the screen.
	 * 
	 * @param x
	 *            The x position
	 * @param y
	 *            The y position
	 * @param scale
	 *            The scale of the entity
	 * @param mouseX
	 *            The mouse x position
	 * @param mouseY
	 *            The mouse y position
	 * @param entity
	 *            The entity to render
	 */
	public static void drawEntityOnScreen(int x, int y, int scale, float mouseX, float mouseY, EntityLivingBase entity) {
		GlStateManager.enableColorMaterial();
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) x, (float) y, 50.0F);
		GlStateManager.scale((float) (-scale), (float) scale, (float) scale);
		GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
		float f = entity.renderYawOffset;
		float f1 = entity.rotationYaw;
		float f2 = entity.rotationPitch;
		float f3 = entity.prevRotationYawHead;
		float f4 = entity.rotationYawHead;
		GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
		RenderHelper.enableStandardItemLighting();
		GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(-((float) Math.atan((double) (mouseY / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
		entity.renderYawOffset = (float) Math.atan((double) (mouseX / 40.0F)) * 20.0F;
		entity.rotationYaw = (float) Math.atan((double) (mouseX / 40.0F)) * 40.0F;
		entity.rotationPitch = -((float) Math.atan((double) (mouseY / 40.0F))) * 20.0F;
		entity.rotationYawHead = entity.rotationYaw;
		entity.prevRotationYawHead = entity.rotationYaw;
		GlStateManager.translate(0.0F, 0.0F, 0.0F);
		RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
		rendermanager.setPlayerViewY(180.0F);
		rendermanager.setRenderShadow(false);
		rendermanager.doRenderEntity(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
		rendermanager.setRenderShadow(true);
		entity.renderYawOffset = f;
		entity.rotationYaw = f1;
		entity.rotationPitch = f2;
		entity.prevRotationYawHead = f3;
		entity.rotationYawHead = f4;
		GlStateManager.popMatrix();
		RenderHelper.disableStandardItemLighting();
		GlStateManager.disableRescaleNormal();
		GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GlStateManager.disableTexture2D();
		GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}

	/**
	 * A static reference to {@link #drawTexturedModalRect(float, float, int, int, int, int)}.
	 * 
	 * <br>
	 * </br>
	 * 
	 * <em> Draws a textured rectangle using the texture currently bound to the TextureManager </em>
	 * 
	 * @param zLevel
	 *            <em> MAKE SURE NOT TO EDIT THIS VALUE UNLESS YOU KNOW WHAT YOU ARE DOING!!</em>
	 */
	private static void drawStaticTextureModelRect(float x, float y, int minU, int minV, int maxU, int maxV, float zLevel) {
		float f = 0.00390625F;
		float f1 = 0.00390625F;
		Tessellator tessellator = Tessellator.getInstance();
		VertexBuffer vertexbuffer = tessellator.getBuffer();
		vertexbuffer.begin(7, DefaultVertexFormats.POSITION_TEX);
		vertexbuffer.pos((double) (x + 0.0F), (double) (y + (float) maxV), (double) zLevel).tex((double) ((float) (minU + 0) * 0.00390625F), (double) ((float) (minV + maxV) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (x + (float) maxU), (double) (y + (float) maxV), (double) zLevel).tex((double) ((float) (minU + maxU) * 0.00390625F), (double) ((float) (minV + maxV) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (x + (float) maxU), (double) (y + 0.0F), (double) zLevel).tex((double) ((float) (minU + maxU) * 0.00390625F), (double) ((float) (minV + 0) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (x + 0.0F), (double) (y + 0.0F), (double) zLevel).tex((double) ((float) (minU + 0) * 0.00390625F), (double) ((float) (minV + 0) * 0.00390625F)).endVertex();
		tessellator.draw();
	}
}