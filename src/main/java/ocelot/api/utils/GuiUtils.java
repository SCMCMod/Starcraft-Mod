package ocelot.api.utils;

import java.util.List;

import net.minecraft.client.Minecraft;

/**
 * <em><b>Copyright (c) 2017 Ocelot5836.</b></em>
 * 
 * @author Ocelot5836
 */
public class GuiUtils {

	private static final Minecraft MC = Minecraft.getMinecraft();

	/**
	 * Plays the default minecraft button click sound.
	 * 
	 * @deprecated Please use {@link SoundUtils#playButtonClick()} instead because this will lbe removed soon
	 */
	public static void playButtonClick() {
		SoundUtils.playButtonClick();
	}

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
}