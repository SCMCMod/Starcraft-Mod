package ga.scmc.handlers;

import ga.scmc.worldgen.dimaiur.WorldProviderAiur;
import ga.scmc.worldgen.dimchar.WorldProviderChar;
import ga.scmc.worldgen.dimkaldir.WorldProviderKaldir;
import ga.scmc.worldgen.dimkorhal.WorldProviderKorhal;
import ga.scmc.worldgen.dimshakuras.WorldProviderShakuras;
import ga.scmc.worldgen.dimslayn.WorldProviderSlayn;
import ga.scmc.worldgen.dimspace.WorldProviderSpace;
import ga.scmc.worldgen.dimzerus.WorldProviderZerus;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionHandler {

	public static DimensionType char_dt = DimensionType.register("Char", "_starcraft", ConfigurationHandler.INT_DIMENSION_CHAR, WorldProviderChar.class, true);
	public static DimensionType shakuras_dt = DimensionType.register("Shakuras", "_starcraft", ConfigurationHandler.INT_DIMENSION_SHAKURAS, WorldProviderShakuras.class, true);
	public static DimensionType slayn_dt = DimensionType.register("Slayn", "_starcraft", ConfigurationHandler.INT_DIMENSION_SLAYN, WorldProviderSlayn.class, true);
	public static DimensionType korhal_dt = DimensionType.register("Korhal", "_starcraft", ConfigurationHandler.INT_DIMENSION_KORHAL, WorldProviderKorhal.class, true);
	public static DimensionType kaldir_dt = DimensionType.register("Kaldir", "_starcraft", ConfigurationHandler.INT_DIMENSION_KALDIR, WorldProviderKaldir.class, true);
	public static DimensionType aiur_dt = DimensionType.register("Aiur", "_starcraft", ConfigurationHandler.INT_DIMENSION_AIUR, WorldProviderAiur.class, true);
	public static DimensionType zerus_dt = DimensionType.register("Zerus", "_starcraft", ConfigurationHandler.INT_DIMENSION_ZERUS, WorldProviderZerus.class, true);
	public static DimensionType space_dt = DimensionType.register("Space", "_starcraft", ConfigurationHandler.INT_DIMENSION_SPACE, WorldProviderSpace.class, true);

	public static void preInit() {
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_CHAR, char_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_SHAKURAS, shakuras_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_KORHAL, korhal_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_KALDIR, kaldir_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_SLAYN, slayn_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_AIUR, aiur_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_ZERUS, zerus_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_SPACE, space_dt);
	}
}