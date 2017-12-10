package ga.scmc.handlers;

import java.util.Random;

import ga.scmc.worldgen.dimchar.CharWorldGenMinable;
import ga.scmc.worldgen.dimshakuras.ShakurasWorldGenMinable;
import ga.scmc.worldgen.structure.StructureGeyserTemplate;
import ga.scmc.worldgen.structure.StructureMineralPatchTemplate;
import ga.scmc.worldgen.structure.StructureProtossCyberneticsCoreTemplate;
import ga.scmc.worldgen.structure.StructureProtossPylonTemplate;
import ga.scmc.worldgen.structure.StructureProtossWarpGateTemplate;
import ga.scmc.worldgen.structure.StructureTerranBarracksTemplate;
import ga.scmc.worldgen.structure.StructureTerranBunkerTemplate;
import ga.scmc.worldgen.structure.StructureTerranCommandCenterTemplate;
import ga.scmc.worldgen.structure.StructureZergHydraliskDenTemplate;
import ga.scmc.worldgen.structure.StructureZergSpawningPoolTemplate;
import ga.scmc.worldgen.structure.StructureZergSpireTemplate;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The base for all world generation in SCMC.
 */
public class WorldGenerationHandler extends StarcraftGenerator implements IWorldGenerator {

	public static final WorldGenerationHandler INSTANCE = new WorldGenerationHandler();

	public static void preInit() {
		GameRegistry.registerWorldGenerator(INSTANCE, 0);
	}

	public WorldGenerationHandler() {
		COPPER_OVERWORLD = new WorldGenMinable(BlockHandler.ORE_COPPER_OW.getDefaultState(), 8);
		TITANIUM_OVERWORLD = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
		PHOSPHORUS_OVERWORLD = new WorldGenMinable(BlockHandler.ORE_PHOSPHORUS_OW.getDefaultState(), 4);
				
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
		PHOSPHORUS_CHAR = new CharWorldGenMinable(BlockHandler.ORE_PHOSPHORUS_CHAR.getDefaultState(), 4);
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
		PHOSPHORUS_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_PHOSPHORUS_SHAKURAS.getDefaultState(), 4);
		DIRT_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.DIRT_SHAKURAS.getDefaultState(), 33);
		GRAVEL_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.GRAVEL_SHAKURAS.getDefaultState(), 33);

		TITANIUM_GENERIC = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
		COAL_GENERIC = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), 16);
		COPPER_GENERIC = new WorldGenMinable(BlockHandler.ORE_COPPER_OW.getDefaultState(), 8);
		DIAMOND_GENERIC = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 8);
		GOLD_GENERIC = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), 8);
		IRON_GENERIC = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 8);
		LAPIS_GENERIC = new WorldGenMinable(BlockHandler.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
		REDSTONE_GENERIC = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 8);
		TITANIUM_GENERIC = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
		DIRT_GENERIC = new WorldGenMinable(Blocks.DIRT.getDefaultState(), 33);
		GRAVEL_GENERIC = new WorldGenMinable(Blocks.GRAVEL.getDefaultState(), 33);
		MINERAL_GENERIC = new WorldGenMinable(BlockHandler.ORE_MINERAL_OW.getDefaultState(), 8);
		RICHMINERAL_GENERIC = new WorldGenMinable(BlockHandler.ORE_RICHMINERAL_OW.getDefaultState(), 8);

		SPAWNING_POOL = new StructureZergSpawningPoolTemplate();
		ZERG_HYDRALISK_DEN = new StructureZergHydraliskDenTemplate();
		ZERG_SPIRE = new StructureZergSpireTemplate();
		TERRAN_BUNKER = new StructureTerranBunkerTemplate();
		TERRAN_BARRACKS = new StructureTerranBarracksTemplate();
		TERRAN_COMMAND_CENTER = new StructureTerranCommandCenterTemplate();
		PROTOSS_PYLON = new StructureProtossPylonTemplate();
		PROTOSS_WARPGATE = new StructureProtossWarpGateTemplate();
		PROTOSS_CYBERNETICS_CORE = new StructureProtossCyberneticsCoreTemplate();
		GEYSER = new StructureGeyserTemplate();

		MINERAL_PATCH = new StructureMineralPatchTemplate();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: // Overworld
			runGenerator(COPPER_OVERWORLD, world, random, chunkX, chunkZ, 15, 4, 64);
			runGenerator(TITANIUM_OVERWORLD, world, random, chunkX, chunkZ, 3, 4, 28);
			if (world.rand.nextInt(100) < 25 && world.getWorldInfo().isMapFeaturesEnabled()) {
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
				runGenerator(PHOSPHORUS_CHAR, world, random, chunkX, chunkZ, 5, 12, 48);
				runGenerator(DIRT_CHAR, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_CHAR, world, random, chunkX, chunkZ, 10, 0, 128);

				if (world.rand.nextInt(100) < 50 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeCharCreepInfestation) {
					runGenerator(SPAWNING_POOL, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 45 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeCharCreepInfestation) {
					runGenerator(ZERG_SPIRE, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 45 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeCharCreepInfestation) {
					runGenerator(ZERG_HYDRALISK_DEN, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, -1, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_CHAR.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_CHAR.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 5 && world.getWorldInfo().isMapFeaturesEnabled()) {
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
				runGenerator(PHOSPHORUS_SHAKURAS, world, random, chunkX, chunkZ, 5, 12, 48);
				runGenerator(DIRT_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_SHAKURAS, world, random, chunkX, chunkZ, 10, 0, 128);

				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasCity) {
					runGenerator(PROTOSS_PYLON, 1, 2, world, random, chunkX, chunkZ, 0, 3, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasCity) {
					runGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasCity) {
					runGenerator(PROTOSS_CYBERNETICS_CORE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 3 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_SHAKURAS.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_SHAKURAS.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 5 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
			} else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_SLAYN) {

			} else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KORHAL) {
				runGenerator(COAL_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(COPPER_GENERIC, world, random, chunkX, chunkZ, 15, 4, 64);
				runGenerator(DIAMOND_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_GENERIC, world, random, chunkX, chunkZ, 2, 0, 32);
				runGenerator(IRON_GENERIC, world, random, chunkX, chunkZ, 20, 0, 64);
				runGenerator(LAPIS_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(MINERAL_GENERIC, world, random, chunkX, chunkZ, 12, 28, 50);
				runGenerator(REDSTONE_GENERIC, world, random, chunkX, chunkZ, 8, 0, 16);
				runGenerator(RICHMINERAL_GENERIC, world, random, chunkX, chunkZ, 6, 4, 28);
				runGenerator(TITANIUM_GENERIC, world, random, chunkX, chunkZ, 3, 4, 28);
				runGenerator(PHOSPHORUS_OVERWORLD, world, random, chunkX, chunkZ, 5, 12, 48);
				runGenerator(DIRT_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);

				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalCity) {
					runGenerator(TERRAN_BUNKER, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalCity) {
					runGenerator(TERRAN_BARRACKS, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalCity) {
					runGenerator(TERRAN_COMMAND_CENTER, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) != BiomeHandler.biomeKorhalCity) {
					runGenerator(PROTOSS_WARPGATE, 1, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.RED_SANDSTONE.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.RED_SANDSTONE.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 30 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 15 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
			} else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KALDIR) {
				runGenerator(COAL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(COPPER_GENERIC, world, random, chunkX, chunkZ, 7, 4, 64);
				runGenerator(DIAMOND_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_GENERIC, world, random, chunkX, chunkZ, 1, 0, 32);
				runGenerator(IRON_GENERIC, world, random, chunkX, chunkZ, 10, 0, 64);
				runGenerator(LAPIS_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(MINERAL_GENERIC, world, random, chunkX, chunkZ, 6, 28, 50);
				runGenerator(REDSTONE_GENERIC, world, random, chunkX, chunkZ, 4, 0, 16);
				runGenerator(RICHMINERAL_GENERIC, world, random, chunkX, chunkZ, 3, 4, 28);
				runGenerator(TITANIUM_GENERIC, world, random, chunkX, chunkZ, 2, 4, 28);
				runGenerator(DIRT_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);

				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirProtossCity) {
					runGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirProtossCity) {
					runGenerator(PROTOSS_PYLON, 0, 0, world, random, chunkX, chunkZ, 0, 3, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirProtossCity) {
					runGenerator(PROTOSS_CYBERNETICS_CORE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 50 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirCreepInfestation) {
					runGenerator(SPAWNING_POOL, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 45 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirCreepInfestation) {
					runGenerator(ZERG_SPIRE, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 45 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirCreepInfestation) {
					runGenerator(ZERG_HYDRALISK_DEN, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.STONE.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.STONE.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -34, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 5 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
			}
			break;
		}

	}
}