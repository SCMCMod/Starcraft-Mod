package ga.scmc.handlers;

import java.util.Random;

import ga.scmc.entity.living.EntityNafash;
import ga.scmc.worldgen.dimchar.CharWorldGenMinable;
import ga.scmc.worldgen.dimshakuras.ShakurasWorldGenMinable;
import ga.scmc.worldgen.dimslayn.SlaynWorldGenMinable;
import ga.scmc.worldgen.dimzerus.ZerusWorldGenMinable;
import ga.scmc.worldgen.structure.BossSpawner;
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
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
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
		URANIUM_CHAR = new CharWorldGenMinable(BlockHandler.ORE_URANIUM_CHAR.getDefaultState(), 1);
		COAL_CHAR = new CharWorldGenMinable(BlockHandler.ORE_COAL_CHAR.getDefaultState(), 16);
		COPPER_CHAR = new CharWorldGenMinable(BlockHandler.ORE_COPPER_CHAR.getDefaultState(), 8);
		DIAMOND_CHAR = new CharWorldGenMinable(BlockHandler.ORE_DIAMOND_CHAR.getDefaultState(), 8);
		GOLD_CHAR = new CharWorldGenMinable(BlockHandler.ORE_GOLD_CHAR.getDefaultState(), 8);
		IRON_CHAR = new CharWorldGenMinable(BlockHandler.ORE_IRON_CHAR.getDefaultState(), 8);
		LAPIS_CHAR = new CharWorldGenMinable(BlockHandler.ORE_LAPIS_CHAR.getDefaultState(), 8);
		MINERAL_CHAR = new CharWorldGenMinable(BlockHandler.ORE_MINERAL_CHAR.getDefaultState(), 8);
		REDSTONE_CHAR = new CharWorldGenMinable(BlockHandler.ORE_REDSTONE_CHAR.getDefaultState(), 8);
		RICHMINERAL_CHAR = new CharWorldGenMinable(BlockHandler.ORE_RICHMINERAL_CHAR.getDefaultState(), 8);
		PHOSPHORUS_CHAR = new CharWorldGenMinable(BlockHandler.ORE_PHOSPHORUS_CHAR.getDefaultState(), 8);
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
		PHOSPHORUS_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.ORE_PHOSPHORUS_SHAKURAS.getDefaultState(), 8);
		DIRT_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.DIRT_SHAKURAS.getDefaultState(), 33);
		GRAVEL_SHAKURAS = new ShakurasWorldGenMinable(BlockHandler.GRAVEL_SHAKURAS.getDefaultState(), 33);
		
		TITANIUM_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_TITANIUM_ZERUS.getDefaultState(), 8);
		URANIUM_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_URANIUM_ZERUS.getDefaultState(), 1);
		COAL_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_COAL_ZERUS.getDefaultState(), 16);
		COPPER_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_COPPER_ZERUS.getDefaultState(), 8);
		DIAMOND_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_DIAMOND_ZERUS.getDefaultState(), 8);
		GOLD_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_GOLD_ZERUS.getDefaultState(), 8);
		IRON_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_IRON_ZERUS.getDefaultState(), 8);
		LAPIS_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_LAPIS_ZERUS.getDefaultState(), 8);
		MINERAL_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_MINERAL_ZERUS.getDefaultState(), 8);
		REDSTONE_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_REDSTONE_ZERUS.getDefaultState(), 8);
		RICHMINERAL_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_RICHMINERAL_ZERUS.getDefaultState(), 8);
		PHOSPHORUS_ZERUS = new ZerusWorldGenMinable(BlockHandler.ORE_PHOSPHORUS_ZERUS.getDefaultState(), 8);
		DIRT_ZERUS = new ZerusWorldGenMinable(BlockHandler.DIRT_ZERUS.getDefaultState(), 33);
		GRAVEL_ZERUS = new ZerusWorldGenMinable(BlockHandler.GRAVEL_ZERUS.getDefaultState(), 33);
		
		TITANIUM_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_TITANIUM_SLAYN.getDefaultState(), 8);
		URANIUM_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_URANIUM_SLAYN.getDefaultState(), 1);
		COAL_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_COAL_SLAYN.getDefaultState(), 16);
		COPPER_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_COPPER_SLAYN.getDefaultState(), 8);
		DIAMOND_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_DIAMOND_SLAYN.getDefaultState(), 8);
		GOLD_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_GOLD_SLAYN.getDefaultState(), 8);
		IRON_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_IRON_SLAYN.getDefaultState(), 8);
		LAPIS_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_LAPIS_SLAYN.getDefaultState(), 8);
		MINERAL_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_MINERAL_SLAYN.getDefaultState(), 8);
		REDSTONE_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_REDSTONE_SLAYN.getDefaultState(), 8);
		RICHMINERAL_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_RICHMINERAL_SLAYN.getDefaultState(), 8);
		PHOSPHORUS_SLAYN = new SlaynWorldGenMinable(BlockHandler.ORE_PHOSPHORUS_SLAYN.getDefaultState(), 8);
		DIRT_SLAYN = new SlaynWorldGenMinable(BlockHandler.DIRT_SLAYN.getDefaultState(), 33);
		GRAVEL_SLAYN = new SlaynWorldGenMinable(BlockHandler.GRAVEL_SLAYN.getDefaultState(), 33);

		TITANIUM_GENERIC = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
		COAL_GENERIC = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), 16);
		COPPER_GENERIC = new WorldGenMinable(BlockHandler.ORE_COPPER_OW.getDefaultState(), 8);
		DIAMOND_GENERIC = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 8);
		GOLD_GENERIC = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), 8);
		IRON_GENERIC = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 8);
		LAPIS_GENERIC = new WorldGenMinable(BlockHandler.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
		REDSTONE_GENERIC = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 8);
		PHOSPHORUS_GENERIC = new WorldGenMinable(BlockHandler.ORE_PHOSPHORUS_OW.getDefaultState(), 8);
		TITANIUM_GENERIC = new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
		DIRT_GENERIC = new WorldGenMinable(Blocks.DIRT.getDefaultState(), 33);
		GRAVEL_GENERIC = new WorldGenMinable(Blocks.GRAVEL.getDefaultState(), 33);
		MINERAL_GENERIC = new WorldGenMinable(BlockHandler.ORE_MINERAL_OW.getDefaultState(), 8);
		URANIUM_GENERIC = new WorldGenMinable(BlockHandler.ORE_URANIUM_OW.getDefaultState(), 1);
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
		
		BOSS_SPAWNER = new BossSpawner();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: // Overworld
			runGenerator(COPPER_OVERWORLD, world, random, chunkX, chunkZ, 15, 4, 64);
			runGenerator(TITANIUM_OVERWORLD, world, random, chunkX, chunkZ, 3, 4, 28);
			if (world.getWorldInfo().isMapFeaturesEnabled() && world.getWorldInfo().getTerrainType() != WorldType.FLAT) {
				runGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 10, 0, 100, true);
			}
			if (world.getWorldInfo().isMapFeaturesEnabled() && world.getWorldInfo().getTerrainType() != WorldType.FLAT) {
				runGenerator(TERRAN_BUNKER, world, random, chunkX, chunkZ, 0, 0, 0, 10, 0, 100, true);
			}
			if (world.getWorldInfo().isMapFeaturesEnabled() && world.getWorldInfo().getTerrainType() != WorldType.FLAT) {
				runGenerator(TERRAN_BARRACKS, world, random, chunkX, chunkZ, 0, 0, 0, 10, 0, 100, true);
			}
			if (world.getWorldInfo().isMapFeaturesEnabled() && world.getWorldInfo().getTerrainType() != WorldType.FLAT) {
				runGenerator(TERRAN_COMMAND_CENTER, world, random, chunkX, chunkZ, 0, 0, 0, 10, 0, 100, true);
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
				runGenerator(URANIUM_CHAR, world, random, chunkX, chunkZ, 2, 4, 20);
				runGenerator(PHOSPHORUS_CHAR, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(DIRT_CHAR, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_CHAR, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(MAGMA_CHAR, world, random, chunkX, chunkZ, 25, 0, 128);

				if (world.rand.nextInt(100) < 50 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeCharZergHive) {
					runGenerator(SPAWNING_POOL, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 45 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeCharZergHive) {
					runGenerator(ZERG_SPIRE, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 45 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeCharZergHive) {
					runGenerator(ZERG_HYDRALISK_DEN, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, -1, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_CHAR.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -32, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_CHAR.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -32, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 5 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}

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
				runGenerator(URANIUM_SHAKURAS, world, random, chunkX, chunkZ, 2, 4, 20);
				runGenerator(PHOSPHORUS_SHAKURAS, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(DIRT_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_SHAKURAS, world, random, chunkX, chunkZ, 10, 0, 128);

				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasProtossCity) {
					runGenerator(PROTOSS_PYLON, 1, 2, world, random, chunkX, chunkZ, 0, 3, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasProtossCity) {
					runGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasProtossCity) {
					runGenerator(PROTOSS_CYBERNETICS_CORE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 3 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_SHAKURAS.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_SHAKURAS.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 5 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
			} else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_SLAYN) {
				runGenerator(COAL_SLAYN, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(COPPER_SLAYN, world, random, chunkX, chunkZ, 15, 4, 64);
				runGenerator(DIAMOND_SLAYN, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_SLAYN, world, random, chunkX, chunkZ, 2, 0, 32);
				runGenerator(IRON_SLAYN, world, random, chunkX, chunkZ, 20, 0, 64);
				runGenerator(LAPIS_SLAYN, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(MINERAL_SLAYN, world, random, chunkX, chunkZ, 12, 28, 50);
				runGenerator(REDSTONE_SLAYN, world, random, chunkX, chunkZ, 8, 0, 16);
				runGenerator(RICHMINERAL_SLAYN, world, random, chunkX, chunkZ, 6, 4, 28);
				runGenerator(TITANIUM_SLAYN, world, random, chunkX, chunkZ, 3, 4, 28);
				runGenerator(PHOSPHORUS_SLAYN, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(DIRT_SLAYN, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_SLAYN, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(URANIUM_SLAYN, world, random, chunkX, chunkZ, 2, 4, 20);
				
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeSlaynProtossCity) {
					runGenerator(PROTOSS_WARPGATE, 1, 4, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeSlaynProtossCity) {
					runGenerator(PROTOSS_WARPGATE, 1, 4, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeSlaynProtossCity) {
					runGenerator(PROTOSS_CYBERNETICS_CORE, 1, 4, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 4 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_SLAYN.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, BlockHandler.STONE_SLAYN.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 60 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 20 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
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
				runGenerator(PHOSPHORUS_OVERWORLD, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(DIRT_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(URANIUM_GENERIC, world, random, chunkX, chunkZ, 2, 4, 20);

				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalTerranCity) {
					runGenerator(TERRAN_BUNKER, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalTerranCity) {
					runGenerator(TERRAN_BARRACKS, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalTerranCity) {
					runGenerator(TERRAN_COMMAND_CENTER, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if ( world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) != BiomeHandler.biomeKorhalTerranCity) {
					runGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 4 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.RED_SANDSTONE.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.RED_SANDSTONE.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 60 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 20 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
			} else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KALDIR) {
				runGenerator(COAL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);
				runGenerator(COPPER_GENERIC, world, random, chunkX, chunkZ, 7, 4, 64);
				runGenerator(DIAMOND_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(URANIUM_GENERIC, world, random, chunkX, chunkZ, 1, 4, 20);
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
					runGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirProtossCity) {
					runGenerator(PROTOSS_PYLON, 0, 0, world, random, chunkX, chunkZ, 0, 3, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirProtossCity) {
					runGenerator(PROTOSS_CYBERNETICS_CORE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirZergHive) {
					runGenerator(SPAWNING_POOL, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirZergHive) {
					runGenerator(ZERG_SPIRE, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
				}
				if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirZergHive) {
					runGenerator(ZERG_HYDRALISK_DEN, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
				}
				if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.STONE.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(GEYSER, Blocks.STONE.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
				}
				if (world.rand.nextInt(100) < 30 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
				}
				//TODO: Fix this spawning... somehow - Hypeirochus
				if (world.rand.nextInt(100) < 100) {
					runGenerator(BOSS_SPAWNER, 50, new EntityNafash(world), TextFormatting.RED, world, random, chunkX, chunkZ, 0, -34, 0, 1, 0, 0, true);
				}
			} else if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_ZERUS) {
				runGenerator(COAL_ZERUS, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(COPPER_ZERUS, world, random, chunkX, chunkZ, 15, 4, 64);
				runGenerator(DIAMOND_ZERUS, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_ZERUS, world, random, chunkX, chunkZ, 2, 0, 32);
				runGenerator(IRON_ZERUS, world, random, chunkX, chunkZ, 20, 0, 64);
				runGenerator(LAPIS_ZERUS, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(MINERAL_ZERUS, world, random, chunkX, chunkZ, 12, 28, 50);
				runGenerator(REDSTONE_ZERUS, world, random, chunkX, chunkZ, 8, 0, 16);
				runGenerator(RICHMINERAL_ZERUS, world, random, chunkX, chunkZ, 6, 4, 28);
				runGenerator(TITANIUM_ZERUS, world, random, chunkX, chunkZ, 3, 4, 28);
				runGenerator(URANIUM_ZERUS, world, random, chunkX, chunkZ, 2, 4, 20);
				runGenerator(PHOSPHORUS_ZERUS, world, random, chunkX, chunkZ, 5, 12, 48);
				runGenerator(DIRT_ZERUS, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(GRAVEL_ZERUS, world, random, chunkX, chunkZ, 10, 0, 128);	
				
				if (world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
			} else if(world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_AIUR) {
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
				runGenerator(URANIUM_GENERIC, world, random, chunkX, chunkZ, 2, 4, 20);
				
				if (world.getWorldInfo().isMapFeaturesEnabled()) {
					runGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
				}
			}
			break;
		}

	}
}