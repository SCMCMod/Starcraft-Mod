package ga.scmc.worldgen.dimchar;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerRiverInit;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class GenLayerChar extends GenLayer {

	public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType type, String settingsStr) {
		int biomeSize = 6;

		GenLayer biomes = new GenLayerCharBiomes(1L);

		GenLayer scars = GenLayerZoom.magnify(1000L, biomes, 0);
		scars = new GenLayerRiverInit(10L, scars);
		scars = GenLayerZoom.magnify(1000L, scars, 2);
		scars = GenLayerZoom.magnify(1000L, scars, biomeSize - 2);
		scars = new GenLayerCharScars(1L, scars);

		for (int i = 0; i < biomeSize; i++) {
			biomes = new GenLayerZoom(1000 + i, biomes);
		}

		GenLayer charmix = new GenLayerCharMix(100L, biomes, scars);
		GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, charmix);
		charmix.initWorldGenSeed(seed);
		genlayervoronoizoom.initWorldGenSeed(seed);
		return new GenLayer[] { charmix, genlayervoronoizoom };
	}

	public GenLayerChar(long par1) {
		super(par1);
	}

	@Override
	public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight) {
		return null;
	}
}