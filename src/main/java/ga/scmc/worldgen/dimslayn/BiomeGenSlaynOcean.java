package ga.scmc.worldgen.dimslayn;

import java.util.Random;

import ga.scmc.handlers.BiomeHandler;
import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeGenSlaynOcean extends BiomeHandler {

	public BiomeGenSlaynOcean(BiomeProperties id) {
		super(id);

		setRegistryName("slayn_deep_ocean");
		topBlock = BlockHandler.SAND_SLAYN.getDefaultState();
		fillerBlock = BlockHandler.SAND_SLAYN.getDefaultState();

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
			} else {
				IBlockState origState = chunkPrimerIn.getBlockState(xLoc, yLoc, zLoc);

				if (origState.getMaterial() == Material.AIR) { // If we're still
																// in the air...
					j = -1;
				} else if (origState.getBlock() == BlockHandler.STONE_SLAYN) { // If
																				// we've
																				// hit
																				// the
																				// ground...
					if (j == -1) { // If we were just in the air...
						if (randHeight <= 0) {
							topBlock = AIR;
							fillerBlock = BlockHandler.STONE_SLAYN.getDefaultState();
						} else if (yLoc >= seaLevel - 4 && yLoc <= seaLevel + 1) {
							topBlock = this.topBlock;
							fillerBlock = this.fillerBlock;
						}

						if (yLoc < seaLevel && (topBlock == null || topBlock.getMaterial() == Material.AIR)) {
						}

						j = randHeight;

						if (yLoc >= seaLevel - 1) {
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, topBlock);
						} else if (yLoc < seaLevel - 7 - randHeight) {
							topBlock = AIR;
							fillerBlock = BlockHandler.STONE_SLAYN.getDefaultState();
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, BlockHandler.GRAVEL_SLAYN.getDefaultState());
						} else {
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, fillerBlock);
						}
					} else if (j > 0) {
						--j;
						chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, fillerBlock);
					}
				}
			}
		}
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
		genBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}
}
