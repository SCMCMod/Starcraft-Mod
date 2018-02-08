package ga.scmc.worldgen.dimaiur;

import java.util.Random;

import ga.scmc.handlers.BiomeHandler;
import ga.scmc.handlers.MetaBlockHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeGenAiurProtossCity extends BiomeHandler {

	public BiomeGenAiurProtossCity(BiomeProperties id) {
		super(id);

		setRegistryName("aiur_protoss_city");

		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();

		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
	}

	public final void genBiomeTerrainShakuras(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {

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
				chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(0));
			} else if (yLoc > seaLevel) {
				chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, AIR);
			} else {
				chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, STONE);
			}
		}
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
		genBiomeTerrainShakuras(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}
}