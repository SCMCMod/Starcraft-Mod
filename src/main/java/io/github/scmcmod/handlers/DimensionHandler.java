package io.github.scmcmod.handlers;

import io.github.scmcmod.config.SCConfig;
import io.github.scmcmod.worldgen.dimaiur.WorldProviderAiur;
import io.github.scmcmod.worldgen.dimchar.WorldProviderChar;
import io.github.scmcmod.worldgen.dimkaldir.WorldProviderKaldir;
import io.github.scmcmod.worldgen.dimkorhal.WorldProviderKorhal;
import io.github.scmcmod.worldgen.dimshakuras.WorldProviderShakuras;
import io.github.scmcmod.worldgen.dimslayn.WorldProviderSlayn;
import io.github.scmcmod.worldgen.dimspace.WorldProviderSpace;
import io.github.scmcmod.worldgen.dimzerus.WorldProviderZerus;
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