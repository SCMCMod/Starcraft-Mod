package ga.scmc.handlers;

import java.util.Random;

import ga.scmc.worldgen.StarcraftWorldGenMinable;
import ga.scmc.worldgen.structure.BossSpawner;
import ga.scmc.worldgen.structure.SCWorldGenerator;
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
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StarcraftGenerator {
			
	protected WorldGenerator TITANIUM_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_TITANIUM_CHAR.getDefaultState(), 8);
	protected WorldGenerator URANIUM_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_URANIUM_CHAR.getDefaultState(), 1);
	protected WorldGenerator COAL_CHAR 					= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_COAL_CHAR.getDefaultState(), 16);
	protected WorldGenerator COPPER_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_COPPER_CHAR.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_DIAMOND_CHAR.getDefaultState(), 8);
	protected WorldGenerator GOLD_CHAR 					= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_GOLD_CHAR.getDefaultState(), 8);
	protected WorldGenerator IRON_CHAR 					= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_IRON_CHAR.getDefaultState(), 8);
	protected WorldGenerator LAPIS_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_LAPIS_CHAR.getDefaultState(), 8);
	protected WorldGenerator MINERAL_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_MINERAL_CHAR.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_REDSTONE_CHAR.getDefaultState(), 8);
	protected WorldGenerator RICHMINERAL_CHAR 			= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_RICHMINERAL_CHAR.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_CHAR 			= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.ORE_PHOSPHORUS_CHAR.getDefaultState(), 8);
	protected WorldGenerator MAGMA_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.MAGMA_CHAR.getDefaultState(), 16);
	protected WorldGenerator DIRT_CHAR 					= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.DIRT_CHAR.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_CHAR 				= new StarcraftWorldGenMinable(BlockHandler.STONE_CHAR, BlockHandler.GRAVEL_CHAR.getDefaultState(), 33);

	protected WorldGenerator TITANIUM_SHAKURAS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_TITANIUM_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator URANIUM_SHAKURAS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_URANIUM_SHAKURAS.getDefaultState(), 1);
	protected WorldGenerator COAL_SHAKURAS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_COAL_SHAKURAS.getDefaultState(), 16);
	protected WorldGenerator COPPER_SHAKURAS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_COPPER_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_SHAKURAS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_DIAMOND_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator GOLD_SHAKURAS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_GOLD_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator IRON_SHAKURAS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_IRON_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator LAPIS_SHAKURAS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator MINERAL_SHAKURAS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_MINERAL_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_SHAKURAS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_REDSTONE_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator RICHMINERAL_SHAKURAS 		= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_RICHMINERAL_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_SHAKURAS 		= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.ORE_PHOSPHORUS_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator DIRT_SHAKURAS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.DIRT_SHAKURAS.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_SHAKURAS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SHAKURAS, BlockHandler.GRAVEL_SHAKURAS.getDefaultState(), 33);
	
	protected WorldGenerator TITANIUM_ZERUS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_TITANIUM_ZERUS.getDefaultState(), 8);
	protected WorldGenerator URANIUM_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_URANIUM_ZERUS.getDefaultState(), 1);
	protected WorldGenerator COAL_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_COAL_ZERUS.getDefaultState(), 16);
	protected WorldGenerator COPPER_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_COPPER_ZERUS.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_DIAMOND_ZERUS.getDefaultState(), 8);
	protected WorldGenerator GOLD_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_GOLD_ZERUS.getDefaultState(), 8);
	protected WorldGenerator IRON_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_IRON_ZERUS.getDefaultState(), 8);
	protected WorldGenerator LAPIS_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_LAPIS_ZERUS.getDefaultState(), 8);
	protected WorldGenerator MINERAL_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_MINERAL_ZERUS.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_ZERUS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_REDSTONE_ZERUS.getDefaultState(), 8);
	protected WorldGenerator RICHMINERAL_ZERUS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_RICHMINERAL_ZERUS.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_ZERUS 			= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.ORE_PHOSPHORUS_ZERUS.getDefaultState(), 8);
	protected WorldGenerator DIRT_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.DIRT_ZERUS.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_ZERUS 				= new StarcraftWorldGenMinable(BlockHandler.STONE_ZERUS, BlockHandler.GRAVEL_ZERUS.getDefaultState(), 33);
	
	protected WorldGenerator TITANIUM_SLAYN 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_TITANIUM_SLAYN.getDefaultState(), 8);
	protected WorldGenerator URANIUM_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_URANIUM_SLAYN.getDefaultState(), 1);
	protected WorldGenerator COAL_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_COAL_SLAYN.getDefaultState(), 16);
	protected WorldGenerator COPPER_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_COPPER_SLAYN.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_DIAMOND_SLAYN.getDefaultState(), 8);
	protected WorldGenerator GOLD_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_GOLD_SLAYN.getDefaultState(), 8);
	protected WorldGenerator IRON_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_IRON_SLAYN.getDefaultState(), 8);
	protected WorldGenerator LAPIS_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_LAPIS_SLAYN.getDefaultState(), 8);
	protected WorldGenerator MINERAL_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_MINERAL_SLAYN.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_SLAYN 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_REDSTONE_SLAYN.getDefaultState(), 8);
	protected WorldGenerator RICHMINERAL_SLAYN 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_RICHMINERAL_SLAYN.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_SLAYN 			= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.ORE_PHOSPHORUS_SLAYN.getDefaultState(), 8);
	protected WorldGenerator DIRT_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.DIRT_SLAYN.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_SLAYN 				= new StarcraftWorldGenMinable(BlockHandler.STONE_SLAYN, BlockHandler.GRAVEL_SLAYN.getDefaultState(), 33);

	protected WorldGenerator TITANIUM_GENERIC 			= new WorldGenMinable(BlockHandler.ORE_TITANIUM_OW.getDefaultState(), 8);
	protected WorldGenerator COAL_GENERIC 				= new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), 16);
	protected WorldGenerator COPPER_GENERIC 			= new WorldGenMinable(BlockHandler.ORE_COPPER_OW.getDefaultState(), 8);
	protected WorldGenerator DIAMOND_GENERIC 			= new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 8);
	protected WorldGenerator GOLD_GENERIC 				= new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), 8);
	protected WorldGenerator IRON_GENERIC 				= new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 8);
	protected WorldGenerator LAPIS_GENERIC 				= new WorldGenMinable(BlockHandler.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
	protected WorldGenerator REDSTONE_GENERIC 			= new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 8);
	protected WorldGenerator PHOSPHORUS_GENERIC 		= new WorldGenMinable(BlockHandler.ORE_PHOSPHORUS_OW.getDefaultState(), 8);
	protected WorldGenerator DIRT_GENERIC 				= new WorldGenMinable(Blocks.DIRT.getDefaultState(), 33);
	protected WorldGenerator GRAVEL_GENERIC 			= new WorldGenMinable(Blocks.GRAVEL.getDefaultState(), 33);
	protected WorldGenerator MINERAL_GENERIC 			= new WorldGenMinable(BlockHandler.ORE_MINERAL_OW.getDefaultState(), 8);
	protected WorldGenerator URANIUM_GENERIC 			= new WorldGenMinable(BlockHandler.ORE_URANIUM_OW.getDefaultState(), 1);
	protected WorldGenerator RICHMINERAL_GENERIC 		= new WorldGenMinable(BlockHandler.ORE_RICHMINERAL_OW.getDefaultState(), 8);

	protected SCWorldGenerator SPAWNING_POOL 			= new StructureZergSpawningPoolTemplate();
	protected SCWorldGenerator ZERG_HYDRALISK_DEN 		= new StructureZergHydraliskDenTemplate();
	protected SCWorldGenerator ZERG_SPIRE 				= new StructureZergSpireTemplate();
	
	protected SCWorldGenerator TERRAN_BUNKER 			= new StructureTerranBunkerTemplate();
	protected SCWorldGenerator TERRAN_BARRACKS 			= new StructureTerranBarracksTemplate();
	protected SCWorldGenerator TERRAN_COMMAND_CENTER 	= new StructureTerranCommandCenterTemplate();
	
	protected SCWorldGenerator PROTOSS_PYLON 			= new StructureProtossPylonTemplate();
	protected SCWorldGenerator PROTOSS_WARPGATE 		= new StructureProtossWarpGateTemplate();
	protected SCWorldGenerator PROTOSS_CYBERNETICS_CORE = new StructureProtossCyberneticsCoreTemplate();
	
	protected SCWorldGenerator GEYSER 					= new StructureGeyserTemplate();
	protected SCWorldGenerator MINERAL_PATCH 			= new StructureMineralPatchTemplate();
	
	protected SCWorldGenerator BOSS_SPAWNER 			= new BossSpawner();
	
	
	private static void checkHeight(int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}
	}
	
	protected static void runDualBlockStateGenerator(SCWorldGenerator generator, IBlockState state, IBlockState state2, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
		
		checkHeight(minHeight, maxHeight);
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generate(state, state2, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + rand.nextInt(16), minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + rand.nextInt(16)), flag);
		}
	}
	
	protected static void runBossGenerator(SCWorldGenerator generator, int range, Entity entityToSpawn, TextFormatting color, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
		
		checkHeight(minHeight, maxHeight);
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generate(range, entityToSpawn, color, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + rand.nextInt(16), minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + rand.nextInt(16)), flag);
		}
	}

	protected static void runTeamColorGenerator(SCWorldGenerator generator, int metaColor, int metaSecColor, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
		
		checkHeight(minHeight, maxHeight);
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generate(metaColor, metaSecColor, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + rand.nextInt(16), minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + rand.nextInt(16)), flag);
		}
	}

	protected static void runGenericGenerator(SCWorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight, boolean flag) {
		
		checkHeight(minHeight, maxHeight);
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generate(world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + rand.nextInt(16), minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + rand.nextInt(16)), flag);
		}
	}

	protected static void runMetaGenerator(SCWorldGenerator generator, int meta, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight) {
		
		checkHeight(minHeight, maxHeight);
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generate(meta, world, rand, offsetX, offsetY, offsetZ, new BlockPos(chunk_X * 16 + rand.nextInt(16), minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + rand.nextInt(16)));
		}
	}

	protected static void runOreGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		
		checkHeight(minHeight, maxHeight);
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generate(world, rand, new BlockPos(chunk_X * 16 + rand.nextInt(16), minHeight + rand.nextInt(heightDiff), chunk_Z * 16 + rand.nextInt(16)));
		}
	}
	
}
