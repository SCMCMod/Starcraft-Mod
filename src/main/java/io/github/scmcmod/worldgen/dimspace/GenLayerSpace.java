package io.github.scmcmod.worldgen.dimspace;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class GenLayerSpace extends GenLayer
{

	public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType type, String str)
	{
		GenLayer biomes = new GenLayerSpaceBiomes(1L);
		biomes = new GenLayerZoom(1000L, biomes);
		biomes = new GenLayerZoom(1001L, biomes);
		biomes = new GenLayerZoom(1002L, biomes);
		biomes = new GenLayerZoom(1003L, biomes);
		biomes = new GenLayerZoom(1004L, biomes);
		biomes = new GenLayerZoom(1005L, biomes);
		GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
		biomes.initWorldGenSeed(seed);
		genlayervoronoizoom.initWorldGenSeed(seed);
		return new GenLayer[]
		{ biomes, genlayervoronoizoom };
	}

	public GenLayerSpace(long par1)
	{
		super(par1);
	}

	@Override
	public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
	{
		return null;
	}
}
