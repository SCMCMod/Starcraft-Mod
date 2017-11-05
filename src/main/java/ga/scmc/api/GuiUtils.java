package ga.scmc.api;

import java.util.List;

import ga.scmc.client.renderer.RenderUtil;
import ga.scmc.lib.Library;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * @author Ocelot5836
 */
public class GuiUtils {

	private static Minecraft mc = Minecraft.getMinecraft();

	/**
	 * Plays the default minecraft button click sound.
	 */
	public static void playButtonClick() {
		mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
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
			mc.fontRendererObj.drawString(lines.get(i), posX, posY + (i * 8), color);
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
	 * Binds a texture using the specified domain and path.
	 * 
	 * @param domain
	 *            The domain of the texture
	 * @param path
	 *            The path to the texture
	 */
	public static void bindTexture(String domain, String path) {
		RenderUtil.bindTexture(new ResourceLocation(domain, path));
	}

	/**
	 * Binds a texture using the specified path.
	 * 
	 * @param path
	 *            The path to the texture
	 */
	public static void bindTexture(String path) {
		bindTexture(Library.MODID, path);
	}
}