package com.arpaesis.scmc.handlers;

import com.arpaesis.scmc.config.SCConfig;
import com.arpaesis.scmc.worldgen.dimaiur.WorldProviderAiur;
import com.arpaesis.scmc.worldgen.dimchar.WorldProviderChar;
import com.arpaesis.scmc.worldgen.dimkaldir.WorldProviderKaldir;
import com.arpaesis.scmc.worldgen.dimkorhal.WorldProviderKorhal;
import com.arpaesis.scmc.worldgen.dimshakuras.WorldProviderShakuras;
import com.arpaesis.scmc.worldgen.dimslayn.WorldProviderSlayn;
import com.arpaesis.scmc.worldgen.dimspace.WorldProviderSpace;
import com.arpaesis.scmc.worldgen.dimzerus.WorldProviderZerus;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionHandler
{

	public static DimensionType char_dt = DimensionType.register("Char", "_starcraft", SCConfig.INT_DIMENSION_CHAR, WorldProviderChar.class, false);
	public static DimensionType shakuras_dt = DimensionType.register("Shakuras", "_starcraft", SCConfig.INT_DIMENSION_SHAKURAS, WorldProviderShakuras.class, false);
	public static DimensionType slayn_dt = DimensionType.register("Slayn", "_starcraft", SCConfig.INT_DIMENSION_SLAYN, WorldProviderSlayn.class, false);
	public static DimensionType korhal_dt = DimensionType.register("Korhal", "_starcraft", SCConfig.INT_DIMENSION_KORHAL, WorldProviderKorhal.class, false);
	public static DimensionType kaldir_dt = DimensionType.register("Kaldir", "_starcraft", SCConfig.INT_DIMENSION_KALDIR, WorldProviderKaldir.class, false);
	public static DimensionType aiur_dt = DimensionType.register("Aiur", "_starcraft", SCConfig.INT_DIMENSION_AIUR, WorldProviderAiur.class, false);
	public static DimensionType zerus_dt = DimensionType.register("Zerus", "_starcraft", SCConfig.INT_DIMENSION_ZERUS, WorldProviderZerus.class, false);
	public static DimensionType space_dt = DimensionType.register("Space", "_starcraft", SCConfig.INT_DIMENSION_SPACE, WorldProviderSpace.class, false);

	public static void init()
	{
		DimensionManager.registerDimension(SCConfig.INT_DIMENSION_CHAR, char_dt);
		DimensionManager.registerDimension(SCConfig.INT_DIMENSION_SHAKURAS, shakuras_dt);
		DimensionManager.registerDimension(SCConfig.INT_DIMENSION_KORHAL, korhal_dt);
		DimensionManager.registerDimension(SCConfig.INT_DIMENSION_KALDIR, kaldir_dt);
		DimensionManager.registerDimension(SCConfig.INT_DIMENSION_SLAYN, slayn_dt);
		DimensionManager.registerDimension(SCConfig.INT_DIMENSION_AIUR, aiur_dt);
		DimensionManager.registerDimension(SCConfig.INT_DIMENSION_ZERUS, zerus_dt);
		DimensionManager.registerDimension(SCConfig.INT_DIMENSION_SPACE, space_dt);
	}
}