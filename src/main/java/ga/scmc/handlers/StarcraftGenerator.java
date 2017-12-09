package ga.scmc.handlers;

import java.util.Random;

import ga.scmc.worldgen.structure.SCWorldGenerator;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StarcraftGenerator {

	protected WorldGenerator COAL_CHAR;
	protected WorldGenerator COAL_SHAKURAS;
	protected WorldGenerator COPPER_CHAR;
	protected WorldGenerator COPPER_OVERWORLD;
	protected WorldGenerator COPPER_SHAKURAS;
	protected WorldGenerator DIAMOND_CHAR;
	protected WorldGenerator DIAMOND_SHAKURAS;
	protected WorldGenerator PHOSPHORUS_OVERWORLD;
	
	protected WorldGenerator DIRT_CHAR;
	protected WorldGenerator DIRT_SHAKURAS;
	protected WorldGenerator GOLD_CHAR;
	protected WorldGenerator GOLD_SHAKURAS;
	protected WorldGenerator GRAVEL_CHAR;
	protected WorldGenerator GRAVEL_SHAKURAS;
	protected WorldGenerator IRON_CHAR;
	protected WorldGenerator IRON_SHAKURAS;
	protected WorldGenerator URANIUM_CHAR;
	protected WorldGenerator URANIUM_SHAKURAS;
	protected WorldGenerator PHOSPHORUS_SHAKURAS;

	protected WorldGenerator COAL_GENERIC;
	protected WorldGenerator IRON_GENERIC;
	protected WorldGenerator GOLD_GENERIC;
	protected WorldGenerator DIAMOND_GENERIC;
	protected WorldGenerator LAPIS_GENERIC;
	protected WorldGenerator COPPER_GENERIC;
	protected WorldGenerator TITANIUM_GENERIC;
	protected WorldGenerator DIRT_GENERIC;
	protected WorldGenerator GRAVEL_GENERIC;
	protected WorldGenerator REDSTONE_GENERIC;
	protected WorldGenerator MINERAL_GENERIC;
	protected WorldGenerator RICHMINERAL_GENERIC;

	protected WorldGenerator LAPIS_CHAR;
	protected WorldGenerator LAPIS_SHAKURAS;
	protected WorldGenerator MAGMA_CHAR;
	protected WorldGenerator MINERAL_CHAR;
	protected WorldGenerator MINERAL_SHAKURAS;
	protected SCWorldGenerator PROTOSS_CYBERNETICS_CORE;
	protected SCWorldGenerator PROTOSS_PYLON;
	protected SCWorldGenerator PROTOSS_WARPGATE;
	protected WorldGenerator REDSTONE_CHAR;
	protected WorldGenerator REDSTONE_SHAKURAS;
	protected WorldGenerator RICHMINERAL_CHAR;
	protected WorldGenerator RICHMINERAL_SHAKURAS;
	protected WorldGenerator PHOSPHORUS_CHAR;

	protected SCWorldGenerator SPAWNING_POOL;
	protected SCWorldGenerator TERRAN_BUNKER;
	protected SCWorldGenerator TERRAN_BARRACKS;
	protected SCWorldGenerator TERRAN_COMMAND_CENTER;
	protected WorldGenerator TITANIUM_CHAR;
	protected WorldGenerator TITANIUM_OVERWORLD;
	protected WorldGenerator TITANIUM_SHAKURAS;

	protected SCWorldGenerator GEYSER;
	protected SCWorldGenerator MINERAL_PATCH;

	protected SCWorldGenerator ZERG_HYDRALISK_DEN;
	protected SCWorldGenerator ZERG_SPIRE;
	
	protected static void runGenerator(SCWorldGenerator generator, IBlockState state, IBlockState state2, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);

			generator.generate(state, state2, world, rand, offsetX, offsetY, offsetZ, new BlockPos(x, y, z), flag);
		}
	}

	// for structures that use team colors and stuff
	protected static void runGenerator(SCWorldGenerator generator, int metaColor, int metaSecColor, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);

			generator.generate(metaColor, metaSecColor, world, rand, offsetX, offsetY, offsetZ, new BlockPos(x, y, z), flag);
		}
	}

	// for generic structures
	protected static void runGenerator(SCWorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);

			generator.generate(world, rand, offsetX, offsetY, offsetZ, new BlockPos(x, y, z), flag);
		}
	}

	protected static void runGenerator(SCWorldGenerator generator, int meta, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);

			generator.generate(meta, world, rand, offsetX, offsetY, offsetZ, new BlockPos(x, y, z));
		}
	}

	// for ores and such
	protected static void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);

			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
}
