package ga.scmc.api;

import ga.scmc.enums.EnumTeamColors;

public class StarcraftUtils {

	public static int minecraftColorToStarcraftColor(int color) {
		if (color == 0)
			return EnumTeamColors.PURPLE.getId();
		if (color == 1)
			return EnumTeamColors.BROWN.getId();
		if (color == 2)
			return EnumTeamColors.PINK.getId();
		if (color == 3)
			return EnumTeamColors.BLUE.getId();
		if (color == 4)
			return EnumTeamColors.CYAN.getId();
		if (color == 5)
			return EnumTeamColors.GRAY.getId();
		if (color == 6)
			return EnumTeamColors.GREEN.getId();
		if (color == 7)
			return EnumTeamColors.LIGHT_BLUE.getId();
		if (color == 8)
			return EnumTeamColors.LIME.getId();
		if (color == 9)
			return EnumTeamColors.MAGENTA.getId();
		if (color == 10)
			return EnumTeamColors.ORANGE.getId();
		if (color == 11)
			return EnumTeamColors.RED.getId();
		if (color == 12)
			return EnumTeamColors.SILVER.getId();
		if (color == 13)
			return EnumTeamColors.WHITE.getId();
		if (color == 14)
			return EnumTeamColors.YELLOW.getId();

		return EnumTeamColors.WHITE.getId();
	}
}