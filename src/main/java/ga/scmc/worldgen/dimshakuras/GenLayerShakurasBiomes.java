package ga.scmc.worldgen.dimshakuras;

import ga.scmc.handlers.BiomeHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerShakurasBiomes extends GenLayer {

	public Biome[] dimBiomes = { BiomeHandler.biomeShakurasDesert, BiomeHandler.biomeShakurasHills, BiomeHandler.biomeShakurasOcean, BiomeHandler.biomeShakurasMountains, BiomeHandler.biomeShakurasCity};

	public GenLayerShakurasBiomes(long par1) {
		super(par1);
	}

	@Override
	public int[] getInts(int x, int z, int width, int depth) {
		int[] dest = IntCache.getIntCache(width * depth);
		for(int dz = 0; dz < depth; dz++) {
			for(int dx = 0; dx < width; dx++) {
				initChunkSeed(dx + x, dz + z);
				// dest[(dx + dz * width)] =
				// dimBiomes[nextInt(dimBiomes.length)].getIdForBiome(dimBiomes[dz]);
				dest[(dx + dz * width)] = Biome
						.getIdForBiome(/* dimBiomes[dz] */dimBiomes[nextInt(dimBiomes.length)]);
			}
		}

		return dest;
	}
}