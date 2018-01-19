package ga.scmc.handlers;

import ga.scmc.worldgen.dimaiur.WorldProviderAiur;
import ga.scmc.worldgen.dimchar.WorldProviderChar;
import ga.scmc.worldgen.dimkaldir.WorldProviderKaldir;
import ga.scmc.worldgen.dimkorhal.WorldProviderKorhal;
import ga.scmc.worldgen.dimshakuras.WorldProviderShakuras;
import ga.scmc.worldgen.dimslayn.WorldProviderSlayn;
import ga.scmc.worldgen.dimzerus.WorldProviderZerus;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;

public class DimensionHandler {
	
	public static DimensionType char_dt = null;
	public static final WorldType CHAR_WT = new WorldType("CHAR");

	public static DimensionType shakuras_dt = null;
	public static final WorldType SHAKURAS_WT = new WorldType("SHAKURAS");

	public static DimensionType slayn_dt = null;
	public static final WorldType SLAYN_WT = new WorldType("SLAYN");
	
	public static DimensionType korhal_dt = null;
	public static final WorldType KORHAL_WT = new WorldType("KORHAL");
	
	public static DimensionType kaldir_dt = null;
	public static final WorldType KALDIR_WT = new WorldType("KALDIR");

	public static DimensionType aiur_dt = null;
	public static final WorldType AIUR_WT = new WorldType("AIUR");

	public static DimensionType zerus_dt = null;
	public static final WorldType ZERUS_WT = new WorldType("ZERUS");

	public static void preInit() {
		char_dt = DimensionType.register("Char", "_starcraft", ConfigurationHandler.INT_DIMENSION_CHAR, WorldProviderChar.class, true);
		shakuras_dt = DimensionType.register("Shakuras", "_starcraft", ConfigurationHandler.INT_DIMENSION_SHAKURAS, WorldProviderShakuras.class, true);
		slayn_dt = DimensionType.register("Slayn", "_starcraft", ConfigurationHandler.INT_DIMENSION_SLAYN, WorldProviderSlayn.class, true);
		korhal_dt = DimensionType.register("Korhal", "_starcraft", ConfigurationHandler.INT_DIMENSION_KORHAL, WorldProviderKorhal.class, true);
		kaldir_dt = DimensionType.register("Kaldir", "_starcraft", ConfigurationHandler.INT_DIMENSION_KALDIR, WorldProviderKaldir.class, true);
		kaldir_dt = DimensionType.register("Aiur", "_starcraft", ConfigurationHandler.INT_DIMENSION_AIUR, WorldProviderAiur.class, true);
		kaldir_dt = DimensionType.register("Zerus", "_starcraft", ConfigurationHandler.INT_DIMENSION_ZERUS, WorldProviderZerus.class, true);
		
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_CHAR, char_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_SHAKURAS, shakuras_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_KORHAL, korhal_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_KALDIR, kaldir_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_SLAYN, slayn_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_AIUR, aiur_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_ZERUS, zerus_dt);
	}
}