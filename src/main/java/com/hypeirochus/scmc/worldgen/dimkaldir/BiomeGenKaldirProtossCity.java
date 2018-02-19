package com.hypeirochus.scmc.worldgen.dimkaldir;

import java.util.Random;

import com.hypeirochus.scmc.handlers.BiomeHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeGenKaldirProtossCity extends BiomeHandler {

	public BiomeGenKaldirProtossCity(BiomeProperties id) {
		super(id);

		setRegistryName("kaldir_protoss_city");

		topBlock = Blocks.STONE.getDefaultState();
		fillerBlock = Blocks.STONE.getDefaultState();

		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
	}

	public final void genBiomeTerrain(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {

		int seaLevel = worldIn.getSeaLevel();
		IBlockState topBlock = this.topBlock;
		IBlockState fillerBlock = this.fillerBlock;
		int j = -1;
		int randHeight = (int) (noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int zLoc = x & 15;
		int xLoc = z & 15;

		for (int yLoc = 255; yLoc >= 0; --yLoc) {
			if (yLoc <= rand.nextInt(5)) {
				chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, BEDROCK);
			} else if (yLoc == seaLevel) {
				chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(0));
			} else if (yLoc > seaLevel) {
				chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, AIR);
			} else {
				chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, STONE);
			}
		}
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
		genBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}
}