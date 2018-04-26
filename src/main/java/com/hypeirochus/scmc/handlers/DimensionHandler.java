package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.worldgen.dimaiur.WorldProviderAiur;
import com.hypeirochus.scmc.worldgen.dimchar.WorldProviderChar;
import com.hypeirochus.scmc.worldgen.dimkaldir.WorldProviderKaldir;
import com.hypeirochus.scmc.worldgen.dimkorhal.WorldProviderKorhal;
import com.hypeirochus.scmc.worldgen.dimshakuras.WorldProviderShakuras;
import com.hypeirochus.scmc.worldgen.dimslayn.WorldProviderSlayn;
import com.hypeirochus.scmc.worldgen.dimspace.WorldProviderSpace;
import com.hypeirochus.scmc.worldgen.dimzerus.WorldProviderZerus;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionHandler {

	public static DimensionType char_dt = DimensionType.register("Char", "_starcraft", StarcraftConfig.INT_DIMENSION_CHAR, WorldProviderChar.class, false);
	public static DimensionType shakuras_dt = DimensionType.register("Shakuras", "_starcraft", StarcraftConfig.INT_DIMENSION_SHAKURAS, WorldProviderShakuras.class, false);
	public static DimensionType slayn_dt = DimensionType.register("Slayn", "_starcraft", StarcraftConfig.INT_DIMENSION_SLAYN, WorldProviderSlayn.class, false);
	public static DimensionType korhal_dt = DimensionType.register("Korhal", "_starcraft", StarcraftConfig.INT_DIMENSION_KORHAL, WorldProviderKorhal.class, false);
	public static DimensionType kaldir_dt = DimensionType.register("Kaldir", "_starcraft", StarcraftConfig.INT_DIMENSION_KALDIR, WorldProviderKaldir.class, false);
	public static DimensionType aiur_dt = DimensionType.register("Aiur", "_starcraft", StarcraftConfig.INT_DIMENSION_AIUR, WorldProviderAiur.class, false);
	public static DimensionType zerus_dt = DimensionType.register("Zerus", "_starcraft", StarcraftConfig.INT_DIMENSION_ZERUS, WorldProviderZerus.class, false);
	public static DimensionType space_dt = DimensionType.register("Space", "_starcraft", StarcraftConfig.INT_DIMENSION_SPACE, WorldProviderSpace.class, false);

	public static void init() {
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_CHAR, char_dt);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_SHAKURAS, shakuras_dt);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_KORHAL, korhal_dt);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_KALDIR, kaldir_dt);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_SLAYN, slayn_dt);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_AIUR, aiur_dt);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_ZERUS, zerus_dt);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_SPACE, space_dt);
	}
}