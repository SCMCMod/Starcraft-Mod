package ga.scmc.lib;

import ga.scmc.enums.TeamColors;

public class StarcraftUtils {

	public static int minecraftColorToStarcraftColor(int color) {
		if (color == 0)
			return TeamColors.PURPLE.getId();
		if (color == 1)
			return TeamColors.BROWN.getId();
		if (color == 2)
			return TeamColors.PINK.getId();
		if (color == 3)
			return TeamColors.BLUE.getId();
		if (color == 4)
			return TeamColors.CYAN.getId();
		if (color == 5)
			return TeamColors.GRAY.getId();
		if (color == 6)
			return TeamColors.GREEN.getId();
		if (color == 7)
			return TeamColors.LIGHT_BLUE.getId();
		if (color == 8)
			return TeamColors.LIME.getId();
		if (color == 9)
			return TeamColors.MAGENTA.getId();
		if (color == 10)
			return TeamColors.ORANGE.getId();
		if (color == 11)
			return TeamColors.RED.getId();
		if (color == 12)
			return TeamColors.SILVER.getId();
		if (color == 13)
			return TeamColors.WHITE.getId();
		if (color == 14)
			return TeamColors.YELLOW.getId();

		return TeamColors.WHITE.getId();
	}
}