package com.hypeirochus.scmc.lib;

import java.util.Random;

import com.hypeirochus.scmc.capabilities.playerrace.IPlayerRace.Race;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.handlers.CapabilityHandler;

import net.minecraft.entity.player.EntityPlayer;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * This class holds some generic useful methods that can be used.
 * 
 * @author Ocelot5836
 */
public class StarcraftUtils
{

	private static Random random = new Random();

	/**
	 * Transfers a minecraft color id into a starcraft color id.
	 * 
	 * @param id The color id
	 * @return The color id
	 */
	public static int minecraftColorToStarcraftColor(int id)
	{
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

	/**
	 * @param player The player to get the race from
	 * @param race The player's new race
	 */
	public static void setPlayerRace(EntityPlayer player, Race race)
	{
		if (player.hasCapability(CapabilityHandler.CAPABILITY_PLAYER_RACE, null))
		{
			player.getCapability(CapabilityHandler.CAPABILITY_PLAYER_RACE, null).setRace(race);
		}
	}

	/**
	 * @param player The player to get the race from
	 * @return The player's race, undefined if the capability is null
	 */
	public static Race getPlayerRace(EntityPlayer player)
	{
		if (player.hasCapability(CapabilityHandler.CAPABILITY_PLAYER_RACE, null))
		{
			return player.getCapability(CapabilityHandler.CAPABILITY_PLAYER_RACE, null).getRace();
		}
		return Race.UNDEFINED;
	}
}