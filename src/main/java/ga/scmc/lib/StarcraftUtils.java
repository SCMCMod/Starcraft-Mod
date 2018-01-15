package ga.scmc.lib;

import ga.scmc.enums.EnumTeamColors;
import net.minecraft.world.World;
import scala.util.Random;

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
			return EnumTeamColors.PURPLE.getId();
		if (id == 1)
			return EnumTeamColors.BROWN.getId();
		if (id == 2)
			return EnumTeamColors.PINK.getId();
		if (id == 3)
			return EnumTeamColors.BLUE.getId();
		if (id == 4)
			return EnumTeamColors.CYAN.getId();
		if (id == 5)
			return EnumTeamColors.GRAY.getId();
		if (id == 6)
			return EnumTeamColors.GREEN.getId();
		if (id == 7)
			return EnumTeamColors.LIGHT_BLUE.getId();
		if (id == 8)
			return EnumTeamColors.LIME.getId();
		if (id == 9)
			return EnumTeamColors.MAGENTA.getId();
		if (id == 10)
			return EnumTeamColors.ORANGE.getId();
		if (id == 11)
			return EnumTeamColors.RED.getId();
		if (id == 12)
			return EnumTeamColors.SILVER.getId();
		if (id == 14)
			return EnumTeamColors.YELLOW.getId();

		return EnumTeamColors.WHITE.getId();
	}

	public static boolean shouldGasDissipate(World world, int maxHeight, int currentHeight) {
		int lowestHeight = world.getSeaLevel();
		if (currentHeight < lowestHeight || maxHeight - lowestHeight <= 0)
			return false;
		float chance = currentHeight / (maxHeight - lowestHeight);

		return random.nextFloat() <= chance;
	}
}