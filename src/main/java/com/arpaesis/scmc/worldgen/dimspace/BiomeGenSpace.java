package com.arpaesis.scmc.worldgen.dimspace;

import java.util.Random;

import com.arpaesis.scmc.handlers.BiomeHandler;

import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeGenSpace extends BiomeHandler
{

	public BiomeGenSpace(BiomeProperties id)
	{
		super(id);

		setRegistryName("space");

		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
	}

	public final void genBiomeTerrain(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
	{
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
	{
		genBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}
}