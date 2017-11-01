package ga.scmc.handlers;

import java.util.Random;

import ga.scmc.worldgen.dimchar.CharWorldGenMinable;
import ga.scmc.worldgen.dimshakuras.ShakurasWorldGenMinable;
import ga.scmc.worldgen.structure.SCWorldGenerator;
import ga.scmc.worldgen.structure.StructureGeyserTemplate;
import ga.scmc.worldgen.structure.StructureMineralPatchTemplate;
import ga.scmc.worldgen.structure.StructureProtossCyberneticsCoreTemplate;
import ga.scmc.worldgen.structure.StructureProtossPylonTemplate;
import ga.scmc.worldgen.structure.StructureProtossWarpGateTemplate;
import ga.scmc.worldgen.structure.StructureTerranBunkerTemplate;
import ga.scmc.worldgen.structure.StructureZergHydraliskDenTemplate;
import ga.scmc.worldgen.structure.StructureZergSpawningPoolTemplate;
import ga.scmc.worldgen.structure.StructureZergSpireTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The base for all world generation stuff in SCMC.
 */
public class WorldGenerationHandler implements IWorldGenerator {
    
    public static final WorldGenerationHandler INSTANCE = new WorldGenerationHandler(); 

	public static void preInit() {
		GameRegistry.registerWorldGenerator(INSTANCE, 0);
	}

	private static void runGenerator(SCWorldGenerator generator, IBlockState state, IBlockState state2, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
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
	private static void runGenerator(SCWorldGenerator generator, int metaColor, int metaSecColor, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
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
	private static void runGenerator(SCWorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
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

	private static void runGenerator(SCWorldGenerator generator, int meta, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight) {
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
	private static void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
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

	private WorldGenerator COAL_CHAR;
	private WorldGenerator COAL_SHAKURAS;
	private WorldGenerator COPPER_CHAR;
	private WorldGenerator COPPER_OVERWORLD;
	private WorldGenerator COPPER_SHAKURAS;
	private WorldGenerator DIAMOND_CHAR;
	private WorldGenerator DIAMOND_SHAKURAS;
	private WorldGenerator DIRT_CHAR;
	private WorldGenerator DIRT_SHAKURAS;
	private WorldGenerator GOLD_CHAR;
	private WorldGenerator GOLD_SHAKURAS;
	private WorldGenerator GRAVEL_CHAR;
	private WorldGenerator GRAVEL_SHAKURAS;
	private WorldGenerator IRON_CHAR;
	private WorldGenerator IRON_SHAKURAS;
	private WorldGenerator URANIUM_CHAR;
	private WorldGenerator URANIUM_SHAKURAS;
	
	private WorldGenerator COAL_KORHAL;
	private WorldGenerator IRON_KORHAL;
	private WorldGenerator GOLD_KORHAL;
	private WorldGenerator DIAMOND_KORHAL;
	private WorldGenerator LAPIS_KORHAL;
	private WorldGenerator COPPER_KORHAL;
	private WorldGenerator TITANIUM_KORHAL;
	private WorldGenerator DIRT_KORHAL;
	private WorldGenerator GRAVEL_KORHAL;
	private WorldGenerator REDSTONE_KORHAL;

	private WorldGenerator LAPIS_CHAR;
	private WorldGenerator LAPIS_SHAKURAS;
	private WorldGenerator MAGMA_CHAR;
	private WorldGenerator MINERAL_CHAR;
	private WorldGenerator MINERAL_SHAKURAS;
	private SCWorldGenerator PROTOSS_CYBERNETICS_CORE;
	private SCWorldGenerator PROTOSS_PYLON;
	private SCWorldGenerator PROTOSS_WARPGATE;
	private WorldGenerator REDSTONE_CHAR;
	private WorldGenerator REDSTONE_SHAKURAS;
	private WorldGenerator RICHMINERAL_CHAR;
	private WorldGenerator RICHMINERAL_SHAKURAS;

	private SCWorldGenerator SPAWNING_POOL;
	private SCWorldGenerator TERRAN_BUNKER;
	private WorldGenerator TITANIUM_CHAR;
	private WorldGenerator TITANIUM_OVERWORLD;
	private WorldGenerator TITANIUM_SHAKURAS;

	private SCWorldGenerator GEYSER;
	private SCWorldGenerator MINERAL_PATCH;

	private SCWorldGenerator ZERG_HYDRALISK_DEN;
	private SCWorldGenerator ZERG_SPIRE;

	public WorldGenerationHandler() {
		COPPER_OVERWORLD = new WorldGenMinable(BlockHandler.ORE_COPPER_OW.getDefaultState(), 8);
		TITANIUM_OVERWORLD = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);

		TITANIUM_CHAR = new CharWorldGenMinable(BlockHandler.ORE_TITANIUM_CHAR.getDefaultState(), 8);
		URANIUM_CHAR = new ShakurasWorldGenMinable(BlockHandler.ORE_URANIUM_CHAR.getDefaultState(), 1);
		COAL_CHAR = new CharWorldGenMinable(BlockHandler.ORE_COAL_CHAR.getDefaultState(), 16);
		COPPER_CHAR = new CharWorldGenMinable(BlockHandler.ORE_COPPER_CHAR.getDefaultState(), 8);
		DIAMOND_CHAR = new CharWorldGenMinable(BlockHandler.ORE_DIAMOND_CHAR.getDefaultState(), 8);
		GOLD_CHAR = new CharWorldGenMinable(BlockHandler.ORE_GOLD_CHAR.getDefaultState(), 8);
		IRON_CHAR = new CharWorldGenMinable(BlockHandler.ORE_IRON_CHAR.getDefaultState(), 8);
		LAPIS_CHAR = new CharWorldGenMinable(BlockHandler.ORE_LAPIS_CHAR.getDefaultState(), 8);
		MINERAL_CHAR = new CharWorldGenMinable(BlockHandler.ORE_MINERAL_CHAR.getDefaultState(), 8);
		REDSTONE_CHAR = new CharWorldGenMinable(BlockHandler.ORE_REDSTONE_CHAR.getDefaultState(), 8);
		RICHMINERAL_CHAR = new CharWorldGenMinable(BlockHandler.ORE_RICHMINERAL_CHAR.getDefaultState(), 8);
		MAGMA_CHAR = new CharWorldGenMinable(BlockHandler.MAGMA_CHAR.getDefaultState(), 16);
		DIRT_CHAR = new CharWorldGenMinable(BlockHandler.DIRT_CHAR.getDefaultState(), 33);
		GRAVEL_CHAR = new CharWorldGenMinable(BlockHandler.GRAVEL_CHAR.getDefaultState(), 33);

		TITANIUM_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_TITANIUM_SHAKURAS.getDefaultState(), 8);
		URANIUM_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_URANIUM_SHAKURAS.getDefaultState(), 1);
		COAL_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_COAL_SHAKURAS.getDefaultState(), 16);
		COPPER_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_COPPER_SHAKURAS.getDefaultState(), 8);
		DIAMOND_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_DIAMOND_SHAKURAS.getDefaultState(), 8);
		GOLD_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_GOLD_SHAKURAS.getDefaultState(), 8);
		IRON_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_IRON_SHAKURAS.getDefaultState(), 8);
		LAPIS_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
		MINERAL_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_MINERAL_SHAKURAS.getDefaultState(), 8);
		REDSTONE_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_REDSTONE_SHAKURAS.getDefaultState(), 8);
		RICHMINERAL_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_RICHMINERAL_SHAKURAS.getDefaultState(), 8);
		DIRT_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.DIRT_SHAKURAS.getDefaultState(), 33);
		GRAVEL_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.GRAVEL_SHAKURAS.getDefaultState(), 33);
		
		TITANIUM_KORHAL = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
		COAL_KORHAL = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), 16);
		COPPER_KORHAL = new WorldGenMinable(BlockHandler.ORE_COPPER_OW.getDefaultState(), 8);
		DIAMOND_KORHAL = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 8);
		GOLD_KORHAL = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), 8);
		IRON_KORHAL = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 8);
		LAPIS_KORHAL = new WorldGenMinable(BlockHandler.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
		//MINERAL_KORHAL = new WorldGenMinable(BlockHandler.ORE_MINERAL_SHAKURAS.getDefaultState(), 8);
		REDSTONE_KORHAL = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 8);
		//RICHMINERAL_KORHAL = new WorldGenMinable(BlockHandler.ORE_RICHMINERAL_SHAKURAS.getDefaultState(), 8);
		TITANIUM_KORHAL = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
		DIRT_KORHAL = new WorldGenMinable(Blocks.DIRT.getDefaultState(), 33);
		GRAVEL_KORHAL = new WorldGenMinable(Blocks.GRAVEL.getDefaultState(), 33);

		SPAWNING_POOL = new StructureZergSpawningPoolTemplate();
		ZERG_HYDRALISK_DEN = new StructureZergHydraliskDenTemplate();
		ZERG_SPIRE = new StructureZergSpireTemplate();
		TERRAN_BUNKER = new StructureTerranBunkerTemplate();
		PROTOSS_PYLON = new StructureProtossPylonTemplate();
		PROTOSS_WARPGATE = new StructureProtossWarpGateTemplate();
		PROTOSS_CYBERNETICS_CORE = new StructureProtossCyberneticsCoreTemplate();
		GEYSER = new StructureGeyserTemplate();

		MINERAL_PATCH = new StructureMineralPatchTemplate();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		Random rnd = new Random();
		switch (world.provider.getDimension()) {
		case 0: // Overworld
			runGenerator(COPPER_OVERWORLD, world, random, chunkX, chunkZ, 15, 4, 64);
			runGenerator(TITANIUM_OVERWORLD, world, random, chunkX, chunkZ, 3, 4, 28);
			if (rnd.nextInt(100) < 25 && world.getWorldInfo().isMapFeaturesEnabled()) {
				runGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
			}
	
		case -1: // Nether

		case 1: // End

		default: // check for our dimensions
			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_CHAR) {
				runGenerator(COAL_CHAR, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(COPPER_CHAR, world, random, chunkX, chunkZ, 15, 4, 64);
				runGenerator(DIAMOND_CHAR, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_CHAR, world, random, chunkX, chunkZ, 2, 0, 32);
				runGenerator(IRON_CHAR, world, random, chunkX, chunkZ, 20, 0, 64);
				runGenerator(LAPIS_CHAR, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(MINERAL_CHAR, world, random, chunkX, chunkZ, 12, 28, 50);
				runGenerator(REDSTONE_CHAR, world, random, chunkX, chunkZ, 8, 0, 16);
				runGenerator(RICHMINERAL_CHAR, world, random, chunkX, chunkZ, 6, 4, 28);
				runGenerator(TITANIUM_CHAR, world, random, chunkX, chunkZ, 3, 4, 28);
				runGenerator(URANIUM_CHAR, world, random, chunkX, chunkZ, 1, 4, 20);
				runGenerator(DIRT_CHAR, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_CHAR, world, random, chunkX, chunkZ, 10, 0, 128);

				if (rnd.nextInt(100) < 20 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(SPAWNING_POOL, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (rnd.nextInt(100) < 15 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(ZERG_SPIRE, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (rnd.nextInt(100) < 15 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(ZERG_HYDRALISK_DEN, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (rnd.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, -1, 0, 1, 0, 100, true);
				}
				if (rnd.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_CHAR.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (rnd.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_CHAR.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (rnd.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (rnd.nextInt(100) < 5 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				runGenerator(MAGMA_CHAR, world, random, chunkX, chunkZ, 25, 0, 128);

			} else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_SHAKURAS) {
				runGenerator(COAL_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(COPPER_SHAKURAS, world, random, chunkX, chunkZ, 15, 4, 64);
				runGenerator(DIAMOND_SHAKURAS, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_SHAKURAS, world, random, chunkX, chunkZ, 2, 0, 32);
				runGenerator(IRON_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 64);
				runGenerator(LAPIS_SHAKURAS, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(MINERAL_SHAKURAS, world, random, chunkX, chunkZ, 12, 28, 50);
				runGenerator(REDSTONE_SHAKURAS, world, random, chunkX, chunkZ, 8, 0, 16);
				runGenerator(RICHMINERAL_SHAKURAS, world, random, chunkX, chunkZ, 6, 4, 28);
				runGenerator(TITANIUM_SHAKURAS, world, random, chunkX, chunkZ, 3, 4, 28);
				runGenerator(URANIUM_SHAKURAS, world, random, chunkX, chunkZ, 1, 4, 20);
				runGenerator(DIRT_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_SHAKURAS, world, random, chunkX, chunkZ, 10, 0, 128);

				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiomeForCoordsBody(new BlockPos(chunkX + 8, 0, chunkZ + 8)) == BiomeHandler.biomeShakurasCity) {
					runGenerator(PROTOSS_PYLON, 1, 2, world, random, chunkX, chunkZ, 0, 3, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiomeForCoordsBody(new BlockPos(chunkX + 8, 0, chunkZ + 8)) == BiomeHandler.biomeShakurasCity) {
					runGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiomeForCoordsBody(new BlockPos(chunkX + 8, 0, chunkZ + 8)) == BiomeHandler.biomeShakurasCity) {
					runGenerator(PROTOSS_CYBERNETICS_CORE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (rnd.nextInt(100) < 3 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_SHAKURAS.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (rnd.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_SHAKURAS.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (rnd.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (rnd.nextInt(100) < 5 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
			}else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_SLAYN) {
				
			}else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KORHAL) {
				runGenerator(COAL_KORHAL, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(COPPER_KORHAL, world, random, chunkX, chunkZ, 15, 4, 64);
				runGenerator(DIAMOND_KORHAL, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_KORHAL, world, random, chunkX, chunkZ, 2, 0, 32);
				runGenerator(IRON_KORHAL, world, random, chunkX, chunkZ, 20, 0, 64);
				runGenerator(LAPIS_KORHAL, world, random, chunkX, chunkZ, 1, 0, 16);
				//runGenerator(MINERAL_KORHAL, world, random, chunkX, chunkZ, 12, 28, 50);
				runGenerator(REDSTONE_KORHAL, world, random, chunkX, chunkZ, 8, 0, 16);
				//runGenerator(RICHMINERAL_KORHAL, world, random, chunkX, chunkZ, 6, 4, 28);
				runGenerator(TITANIUM_KORHAL, world, random, chunkX, chunkZ, 3, 4, 28);
				runGenerator(DIRT_KORHAL, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_KORHAL, world, random, chunkX, chunkZ, 10, 0, 128);
				
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiomeForCoordsBody(new BlockPos(chunkX + 8, 0, chunkZ + 8)) == BiomeHandler.biomeKorhalCity) {
					runGenerator(TERRAN_BUNKER, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (rnd.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.RED_SANDSTONE.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (rnd.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.RED_SANDSTONE.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
			}else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KALDIR) {

			}
			break;
		}

	}
}