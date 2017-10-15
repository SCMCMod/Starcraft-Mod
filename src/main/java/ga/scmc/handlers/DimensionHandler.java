package ga.scmc.handlers;

import ga.scmc.worldgen.dimchar.WorldProviderChar;
import ga.scmc.worldgen.dimshakuras.WorldProviderShakuras;
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

	public static void preInit() {
		char_dt = DimensionType.register("Char", "_starcraft", ConfigurationHandler.INT_DIMENSION_CHAR, WorldProviderChar.class, true);
		shakuras_dt = DimensionType.register("Shakuras", "_starcraft", ConfigurationHandler.INT_DIMENSION_SHAKURAS, WorldProviderShakuras.class, true);
		//slayn_dt = DimensionType.register("Slayn", "_starcraft", ConfigurationHandler.INT_DIMENSION_SLAYN, WorldProviderSlayn.class, true);
		
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_CHAR, char_dt);
		DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_SHAKURAS, shakuras_dt);
		//DimensionManager.registerDimension(ConfigurationHandler.INT_DIMENSION_SLAYN, slayn_dt);
	}
}