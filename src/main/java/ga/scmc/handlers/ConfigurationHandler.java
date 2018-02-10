package ga.scmc.handlers;

import java.io.File;

import ga.scmc.lib.FactorySettings;
import net.minecraftforge.common.config.Configuration;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The config class that makes a GUI and a file for config.
 */
public class ConfigurationHandler {

	public static boolean	BOOL_CREEP_CAN_SPREAD				= FactorySettings.BOOL_CREEP_CAN_SPREAD;
	public static boolean	BOOL_VANILLA_MOB_SPAWNING_DISABLED	= FactorySettings.BOOL_VANILLA_MOB_SPAWNING_DISABLED;

	public static int		INT_CREEP_SPREAD_BASE_VALUE			= FactorySettings.INT_CREEP_SPREAD_BASE_VALUE;
	public static int		INT_DIMENSION_CHAR					= FactorySettings.INT_DIMENSION_CHAR;
	public static int		INT_DIMENSION_SHAKURAS				= FactorySettings.INT_DIMENSION_SHAKURAS;
	public static int		INT_DIMENSION_SLAYN					= FactorySettings.INT_DIMENSION_SLAYN;
	public static int		INT_DIMENSION_KORHAL				= FactorySettings.INT_DIMENSION_KORHAL;
	public static int		INT_DIMENSION_KALDIR				= FactorySettings.INT_DIMENSION_KALDIR;
	public static int		INT_DIMENSION_AIUR					= FactorySettings.INT_DIMENSION_AIUR;
	public static int		INT_DIMENSION_ZERUS					= FactorySettings.INT_DIMENSION_ZERUS;
	public static int		INT_DIMENSION_SPACE					= FactorySettings.INT_DIMENSION_SPACE;

	public static void preInit() {
		Configuration config = new Configuration(new File("config/Starcraft.cfg"));

		// General
		config.setCategoryComment("General", "General settings.");
		BOOL_CREEP_CAN_SPREAD = config.get("General", "Zerg - Creep Can Spread", FactorySettings.BOOL_CREEP_CAN_SPREAD).getBoolean(FactorySettings.BOOL_CREEP_CAN_SPREAD);
		INT_CREEP_SPREAD_BASE_VALUE = config.getInt("Creep Spread Base Value", "General", FactorySettings.INT_CREEP_SPREAD_BASE_VALUE, 0, 16, "Base value for Creep Spread. WARNING, DO NOT SET THIS HIGH");

		// Dimensions
		config.setCategoryComment("Dimension IDs", "Change the IDs of the dimensions");
		INT_DIMENSION_CHAR = config.getInt("Char ID", "Dimension IDs", INT_DIMENSION_CHAR, -128, 127, "ID for the planet Char");
		INT_DIMENSION_SHAKURAS = config.getInt("Shakuras ID", "Dimension IDs", INT_DIMENSION_SHAKURAS, -128, 127, "ID for the planet Shakuras");
		// Mob Spawning
		config.setCategoryComment("Mob Spawning", "Decide which mobs will spawn and which mobs will not.");
		BOOL_VANILLA_MOB_SPAWNING_DISABLED = config.get("Mob Spawning", "Vanilla - Vanilla Mob Spawning Is Disabled", FactorySettings.BOOL_VANILLA_MOB_SPAWNING_DISABLED).getBoolean(FactorySettings.BOOL_VANILLA_MOB_SPAWNING_DISABLED);

		config.save();
	}
}