package com.hypeirochus.scmc.worldgen.dimchar;

import com.hypeirochus.scmc.handlers.BiomeHandler;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCharBiomes extends GenLayer {

	public Biome[] dimBiomes = { BiomeHandler.biomeCharZergHive, BiomeHandler.biomeCharAshPlains, BiomeHandler.biomeCharGlassPlains, BiomeHandler.biomeCharAshPlateau, BiomeHandler.biomeCharLavaOcean, BiomeHandler.biomeCharAshHills, BiomeHandler.biomeCharHills };

	public GenLayerCharBiomes(long par1) {
		super(par1);
	}

	@Override
	public int[] getInts(int x, int z, int width, int length) {
		int[] dest = IntCache.getIntCache(width * length); // Simply allocates
															// us some memory.
		for (int dz = 0; dz < length; dz++) {
			for (int dx = 0; dx < width; dx++) {
				initChunkSeed(dx + x, dz + z);
				// dest[(dx + dz * width)] =
				// dimBiomes[nextInt(dimBiomes.length)].getIdForBiome(dimBiomes[dz]);
				dest[(dx + dz * width)] = Biome.getIdForBiome(dimBiomes[nextInt(dimBiomes.length)]);
			}
		}
		return dest;
	}
}