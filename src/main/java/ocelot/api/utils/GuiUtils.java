package ocelot.api.utils;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

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
	 * @param posX
	 *            The x position to render at
	 * @param posY
	 *            The y position to render at
	 * @param color
	 *            The color of the text
	 */
	public static void drawLines(List<String> lines, int posX, int posY, int color) {
		for (int i = 0; i < lines.size(); i++) {
			MC.fontRendererObj.drawString(lines.get(i), posX, posY + (i * 8), color);
		}
	}

	/**
	 * Checks if the mouse is inside of the specified location.
	 * 
	 * @param posX
	 *            The x position to check
	 * @param posY
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
	public static boolean isMouseInside(int posX, int posY, int width, int height, int mouseX, int mouseY) {
		if (mouseX >= posX && mouseX <= (posX + width) && mouseY >= posY && mouseY < (posY + height)) {
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
	 * A static reference to {@link #drawTexturedModalRect(float, float, int, int, int, int)}.
	 */
	private static void drawStaticTextureModelRect(float xCoord, float yCoord, int minU, int minV, int maxU, int maxV, float zLevel) {
		float f = 0.00390625F;
		float f1 = 0.00390625F;
		Tessellator tessellator = Tessellator.getInstance();
		VertexBuffer vertexbuffer = tessellator.getBuffer();
		vertexbuffer.begin(7, DefaultVertexFormats.POSITION_TEX);
		vertexbuffer.pos((double) (xCoord + 0.0F), (double) (yCoord + (float) maxV), (double) zLevel).tex((double) ((float) (minU + 0) * 0.00390625F), (double) ((float) (minV + maxV) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (xCoord + (float) maxU), (double) (yCoord + (float) maxV), (double) zLevel).tex((double) ((float) (minU + maxU) * 0.00390625F), (double) ((float) (minV + maxV) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (xCoord + (float) maxU), (double) (yCoord + 0.0F), (double) zLevel).tex((double) ((float) (minU + maxU) * 0.00390625F), (double) ((float) (minV + 0) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (xCoord + 0.0F), (double) (yCoord + 0.0F), (double) zLevel).tex((double) ((float) (minU + 0) * 0.00390625F), (double) ((float) (minV + 0) * 0.00390625F)).endVertex();
		tessellator.draw();
	}
}