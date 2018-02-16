package ga.scmc.lib;

import java.util.Random;

import ga.scmc.enums.EnumColors;
import net.minecraft.world.World;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class holds some generic useful methods that can be used.
 * 
 * @author Ocelot5836
 */
public class StarcraftUtils {

	private static Random random = new Random();

	/**
	 * Transfers a minecraft id into a starcraft id.
	 * 
	 * @param id
	 *            The color id
	 * @return The color id
	 */
	public static int minecraftColorToStarcraftColor(int id) {
		if (id == 0)
			return EnumColors.PURPLE.getId();
		if (id == 1)
			return EnumColors.BROWN.getId();
		if (id == 2)
			return EnumColors.PINK.getId();
		if (id == 3)
			return EnumColors.BLUE.getId();
		if (id == 4)
			return EnumColors.CYAN.getId();
		if (id == 5)
			return EnumColors.GRAY.getId();
		if (id == 6)
			return EnumColors.GREEN.getId();
		if (id == 7)
			return EnumColors.LIGHT_BLUE.getId();
		if (id == 8)
			return EnumColors.LIME.getId();
		if (id == 9)
			return EnumColors.MAGENTA.getId();
		if (id == 10)
			return EnumColors.ORANGE.getId();
		if (id == 11)
			return EnumColors.RED.getId();
		if (id == 12)
			return EnumColors.SILVER.getId();
		if (id == 14)
			return EnumColors.YELLOW.getId();

		return EnumColors.WHITE.getId();
	}

	public static boolean shouldGasDissipate(World world, int maxHeight, int currentHeight) {
		int lowestHeight = world.getSeaLevel() + 20;
		float chance = (float) currentHeight / ((float) maxHeight + (float) lowestHeight);

		System.out.println(chance);

		return random.nextFloat() <= chance;
	}
}