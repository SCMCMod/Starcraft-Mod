package ocelot.api.utils;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumHandSide;

/**
 * This class makes the programmers' (Ocelot5836) life easier by translating to the default minecraft model translations.
 * 
 * @author Ocelot5836
 */
public class ModelUtils {

	/**
	 * Rotates the model to look the same as a minecraft block looks in the gui.
	 */
	public static void rotateDefaultBlockGui() {
		GlStateManager.rotate(30, 1, 0, 0);
		GlStateManager.rotate(225, 0, 1, 0);
	}

	/**
	 * Rotates the model to look the same as a minecraft block looks in firstperson.
	 * 
	 * @param side
	 *            The side to base the transform off of
	 */
	public static void rotateDefaultBlockFirstperson(EnumHandSide side) {
		float rotation = side == EnumHandSide.RIGHT ? 45 : -45;
		GlStateManager.rotate(rotation, 0, 1, 0);
	}

	/**
	 * Rotates the model to look the same as a minecraft block looks in thirdperson.
	 * 
	 * @param side
	 *            The side to base the transform off of
	 */
	public static void rotateDefaultBlockThirdperson(EnumHandSide side) {
		float rotation = side == EnumHandSide.RIGHT ? 45 : -45;
		float translation = side == EnumHandSide.RIGHT ? 0.9f : -0.9f;
		GlStateManager.rotate(75, 1, 0, 0);
		GlStateManager.rotate(rotation, 0, 1, 0);

		GlStateManager.translate(translation, -1.1, -0.9);
	}
}