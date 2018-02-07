package ga.scmc.worldgen;

import java.util.Random;

import ga.scmc.entity.living.EntityNafash;
import ga.scmc.handlers.BiomeHandler;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.StarcraftGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;

public class StarcraftWorldGenerationContainer extends StarcraftGenerator {

	/**
	 * The instance of this class. Used in WorldGenerationHandler.java to generate ores, structures, and bosses.
	 */
	public static final StarcraftWorldGenerationContainer instance = new StarcraftWorldGenerationContainer();
	public static boolean generationCompleted = false;
	
	
	/**
	 * The most basic generation checker for structures that spawn in the overworld.
	 * 
	 * @param world the world.
	 * @return true or false if the structure can spawn.
	 */
	public boolean checkCanGenerateOverworld(World world) {
		return world.getWorldInfo().isMapFeaturesEnabled() && world.getWorldInfo().getTerrainType() != WorldType.FLAT;
	}
	
	
	/**
	 * The basic generation checker combined with weight.
	 * 
	 * @param weight the chance (out of 100) that the structure has of spawning.
	 * @param world
	 * @return true or false if the structure can spawn.
	 */
	public boolean checkCanGenerateWeighted(int weight, World world) {
		return world.rand.nextInt(100) < weight && world.getWorldInfo().isMapFeaturesEnabled();
	}
	
	
	/**
	 * A more advanced generation checker. Makes the structure spawn in only the certain biome specified.
	 * 
	 * @param weight 
	 * @param world
	 * @param biome
	 * @param chunkX
	 * @param chunkZ
	 * @return true or false if the structure can spawn.
	 */
	public boolean checkCanGenerateWeightedBiomeSpecific(int weight, World world, Biome biome, int chunkX, int chunkZ) {
		return world.rand.nextInt(100) < weight && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == biome;
	}
	
	
	/**
	 * Generates structures and ores for the overworld.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runOreGenerator(COPPER_GENERIC, world, random, chunkX, chunkZ, 15, 4, 64);
		runOreGenerator(TITANIUM_GENERIC, world, random, chunkX, chunkZ, 3, 4, 28);

		if (checkCanGenerateOverworld(world)) {
			
			runTeamColorGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 10, 0, 100, true);
			runGenericFlagGenerator(TERRAN_BUNKER, world, random, chunkX, chunkZ, 0, 0, 0, 10, 0, 100, true);
			runGenericFlagGenerator(TERRAN_BARRACKS, world, random, chunkX, chunkZ, 0, 0, 0, 10, 0, 100, true);
			runGenericFlagGenerator(TERRAN_COMMAND_CENTER, world, random, chunkX, chunkZ, 0, 0, 0, 10, 0, 100, true);
			
		}	
	}
	
	/**
	 * Generates structures and ores for Char, the Zerg homeworld.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateChar(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runOreGenerator(COAL_CHAR, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(COPPER_CHAR, world, random, chunkX, chunkZ, 15, 4, 64);
		runOreGenerator(DIAMOND_CHAR, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(GOLD_CHAR, world, random, chunkX, chunkZ, 2, 0, 32);
		runOreGenerator(IRON_CHAR, world, random, chunkX, chunkZ, 20, 0, 64);
		runOreGenerator(LAPIS_CHAR, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(MINERAL_CHAR, world, random, chunkX, chunkZ, 12, 28, 50);
		runOreGenerator(REDSTONE_CHAR, world, random, chunkX, chunkZ, 8, 0, 16);
		runOreGenerator(RICHMINERAL_CHAR, world, random, chunkX, chunkZ, 6, 4, 28);
		runOreGenerator(TITANIUM_CHAR, world, random, chunkX, chunkZ, 3, 4, 28);
		runOreGenerator(URANIUM_CHAR, world, random, chunkX, chunkZ, 2, 4, 20);
		runOreGenerator(PHOSPHORUS_CHAR, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(DIRT_CHAR, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(GRAVEL_CHAR, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(MAGMA_CHAR, world, random, chunkX, chunkZ, 25, 0, 128);

		
		if (checkCanGenerateWeightedBiomeSpecific(50, world, BiomeHandler.biomeCharZergHive, chunkX, chunkZ)) 
			runGenericFlagGenerator(SPAWNING_POOL, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
		
		if (checkCanGenerateWeightedBiomeSpecific(45, world, BiomeHandler.biomeCharZergHive, chunkX, chunkZ)) 
			runGenericFlagGenerator(ZERG_SPIRE, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
		
		if (checkCanGenerateWeightedBiomeSpecific(45, world, BiomeHandler.biomeCharZergHive, chunkX, chunkZ)) 
			runGenericFlagGenerator(ZERG_HYDRALISK_DEN, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
		
		if (checkCanGenerateWeighted(10, world)) 
			runTeamColorGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, -1, 0, 1, 0, 100, true);
		
		if (checkCanGenerateWeighted(2, world)) 
			runDualBlockStateGenerator(GEYSER, BlockHandler.STONE_CHAR.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -32, 0, 1, 60, 80, true);
		
		if (checkCanGenerateWeighted(1, world)) 
			runDualBlockStateGenerator(GEYSER, BlockHandler.STONE_CHAR.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -32, 0, 1, 60, 80, true);
		
		if (checkCanGenerateWeighted(10, world)) 
			runMetaGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		
		if (checkCanGenerateWeighted(5, world)) 
			runMetaGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
	}
	
	
	/**
	 * Generates structures and ores for Kaldir, the frozen moon.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateKaldir(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runOreGenerator(COAL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(COPPER_GENERIC, world, random, chunkX, chunkZ, 7, 4, 64);
		runOreGenerator(DIAMOND_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(URANIUM_GENERIC, world, random, chunkX, chunkZ, 1, 4, 20);
		runOreGenerator(GOLD_GENERIC, world, random, chunkX, chunkZ, 1, 0, 32);
		runOreGenerator(IRON_GENERIC, world, random, chunkX, chunkZ, 10, 0, 64);
		runOreGenerator(LAPIS_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(MINERAL_GENERIC, world, random, chunkX, chunkZ, 6, 28, 50);
		runOreGenerator(REDSTONE_GENERIC, world, random, chunkX, chunkZ, 4, 0, 16);
		runOreGenerator(RICHMINERAL_GENERIC, world, random, chunkX, chunkZ, 3, 4, 28);
		runOreGenerator(TITANIUM_GENERIC, world, random, chunkX, chunkZ, 2, 4, 28);
		runOreGenerator(DIRT_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(GRAVEL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);

		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirProtossCity) {
			runTeamColorGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirProtossCity) {
			runTeamColorGenerator(PROTOSS_PYLON, 0, 0, world, random, chunkX, chunkZ, 0, 3, 0, 3, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirProtossCity) {
			runTeamColorGenerator(PROTOSS_CYBERNETICS_CORE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirZergHive) {
			runGenericFlagGenerator(SPAWNING_POOL, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirZergHive) {
			runGenericFlagGenerator(ZERG_SPIRE, world, random, chunkX, chunkZ, 0, 1, 0, 1, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKaldirZergHive) {
			runGenericFlagGenerator(ZERG_HYDRALISK_DEN, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
		}
		if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runDualBlockStateGenerator(GEYSER, Blocks.STONE.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
		}
		if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runDualBlockStateGenerator(GEYSER, Blocks.STONE.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
		}
		if (world.rand.nextInt(100) < 30 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runMetaGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		}
		if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runMetaGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		}
		//TODO: Fix this spawning... somehow - Hypeirochus
		if (world.rand.nextInt(100) < 100) {
			runBossGenerator(BOSS_SPAWNER, 50, new EntityNafash(world), TextFormatting.RED, world, random, chunkX, chunkZ, 0, -34, 0, 1, 0, 100, true);
		}
	}
	
	
	/**
	 * Generates structures and ores for Shakuras, the twilight planet.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateShakuras(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runOreGenerator(COAL_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(COPPER_SHAKURAS, world, random, chunkX, chunkZ, 15, 4, 64);
		runOreGenerator(DIAMOND_SHAKURAS, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(GOLD_SHAKURAS, world, random, chunkX, chunkZ, 2, 0, 32);
		runOreGenerator(IRON_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 64);
		runOreGenerator(LAPIS_SHAKURAS, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(MINERAL_SHAKURAS, world, random, chunkX, chunkZ, 12, 28, 50);
		runOreGenerator(REDSTONE_SHAKURAS, world, random, chunkX, chunkZ, 8, 0, 16);
		runOreGenerator(RICHMINERAL_SHAKURAS, world, random, chunkX, chunkZ, 6, 4, 28);
		runOreGenerator(TITANIUM_SHAKURAS, world, random, chunkX, chunkZ, 3, 4, 28);
		runOreGenerator(URANIUM_SHAKURAS, world, random, chunkX, chunkZ, 2, 4, 20);
		runOreGenerator(PHOSPHORUS_SHAKURAS, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(DIRT_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(GRAVEL_SHAKURAS, world, random, chunkX, chunkZ, 10, 0, 128);

		if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasProtossCity) {
			runTeamColorGenerator(PROTOSS_PYLON, 1, 2, world, random, chunkX, chunkZ, 0, 3, 0, 3, 0, 100, true);
		}
		if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasProtossCity) {
			runTeamColorGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
		if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeShakurasProtossCity) {
			runTeamColorGenerator(PROTOSS_CYBERNETICS_CORE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
		if (world.rand.nextInt(100) < 3 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runDualBlockStateGenerator(GEYSER, BlockHandler.STONE_SHAKURAS.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
		}
		if (world.rand.nextInt(100) < 1 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runDualBlockStateGenerator(GEYSER, BlockHandler.STONE_SHAKURAS.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
		}
		if (world.rand.nextInt(100) < 10 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runMetaGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		}
		if (world.rand.nextInt(100) < 5 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runMetaGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		}
	}
	
	
	/**
	 * Generates structures and ores for Zerus, home to the Primal Zerg.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateZerus(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runOreGenerator(COAL_ZERUS, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(COPPER_ZERUS, world, random, chunkX, chunkZ, 15, 4, 64);
		runOreGenerator(DIAMOND_ZERUS, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(GOLD_ZERUS, world, random, chunkX, chunkZ, 2, 0, 32);
		runOreGenerator(IRON_ZERUS, world, random, chunkX, chunkZ, 20, 0, 64);
		runOreGenerator(LAPIS_ZERUS, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(MINERAL_ZERUS, world, random, chunkX, chunkZ, 12, 28, 50);
		runOreGenerator(REDSTONE_ZERUS, world, random, chunkX, chunkZ, 8, 0, 16);
		runOreGenerator(RICHMINERAL_ZERUS, world, random, chunkX, chunkZ, 6, 4, 28);
		runOreGenerator(TITANIUM_ZERUS, world, random, chunkX, chunkZ, 3, 4, 28);
		runOreGenerator(URANIUM_ZERUS, world, random, chunkX, chunkZ, 2, 4, 20);
		runOreGenerator(PHOSPHORUS_ZERUS, world, random, chunkX, chunkZ, 5, 12, 48);
		runOreGenerator(DIRT_ZERUS, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(GRAVEL_ZERUS, world, random, chunkX, chunkZ, 10, 0, 128);	
		
		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			runTeamColorGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
	}
	
	
	/**
	 * Generates structures and ores for the Taldarim homeworld of Slayn.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateSlayn(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runOreGenerator(COAL_SLAYN, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(COPPER_SLAYN, world, random, chunkX, chunkZ, 15, 4, 64);
		runOreGenerator(DIAMOND_SLAYN, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(GOLD_SLAYN, world, random, chunkX, chunkZ, 2, 0, 32);
		runOreGenerator(IRON_SLAYN, world, random, chunkX, chunkZ, 20, 0, 64);
		runOreGenerator(LAPIS_SLAYN, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(MINERAL_SLAYN, world, random, chunkX, chunkZ, 12, 28, 50);
		runOreGenerator(REDSTONE_SLAYN, world, random, chunkX, chunkZ, 8, 0, 16);
		runOreGenerator(RICHMINERAL_SLAYN, world, random, chunkX, chunkZ, 6, 4, 28);
		runOreGenerator(TITANIUM_SLAYN, world, random, chunkX, chunkZ, 3, 4, 28);
		runOreGenerator(PHOSPHORUS_SLAYN, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(DIRT_SLAYN, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(GRAVEL_SLAYN, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(URANIUM_SLAYN, world, random, chunkX, chunkZ, 2, 4, 20);
		
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeSlaynProtossCity) {
			runTeamColorGenerator(PROTOSS_WARPGATE, 1, 4, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeSlaynProtossCity) {
			runTeamColorGenerator(PROTOSS_WARPGATE, 1, 4, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeSlaynProtossCity) {
			runTeamColorGenerator(PROTOSS_CYBERNETICS_CORE, 1, 4, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
		if (world.rand.nextInt(100) < 4 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runDualBlockStateGenerator(GEYSER, BlockHandler.STONE_SLAYN.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
		}
		if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runDualBlockStateGenerator(GEYSER, BlockHandler.STONE_SLAYN.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
		}
		if (world.rand.nextInt(100) < 60 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runMetaGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		}
		if (world.rand.nextInt(100) < 20 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runMetaGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		}
	}
	
	
	/**
	 * Generates structures and ores for the protoss homeworld of Aiur.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateAiur(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runOreGenerator(COAL_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(COPPER_GENERIC, world, random, chunkX, chunkZ, 15, 4, 64);
		runOreGenerator(DIAMOND_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(GOLD_GENERIC, world, random, chunkX, chunkZ, 2, 0, 32);
		runOreGenerator(IRON_GENERIC, world, random, chunkX, chunkZ, 20, 0, 64);
		runOreGenerator(LAPIS_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(MINERAL_GENERIC, world, random, chunkX, chunkZ, 12, 28, 50);
		runOreGenerator(REDSTONE_GENERIC, world, random, chunkX, chunkZ, 8, 0, 16);
		runOreGenerator(RICHMINERAL_GENERIC, world, random, chunkX, chunkZ, 6, 4, 28);
		runOreGenerator(TITANIUM_GENERIC, world, random, chunkX, chunkZ, 3, 4, 28);
		runOreGenerator(PHOSPHORUS_GENERIC, world, random, chunkX, chunkZ, 5, 12, 48);
		runOreGenerator(DIRT_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(GRAVEL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(URANIUM_GENERIC, world, random, chunkX, chunkZ, 2, 4, 20);
		
		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			runTeamColorGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 3, 0, 100, true);
		}
	}
	
	
	/**
	 * Generates structures and ores for Dominion capital of the Terrans.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateKorhal(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		runOreGenerator(COAL_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(COPPER_GENERIC, world, random, chunkX, chunkZ, 15, 4, 64);
		runOreGenerator(DIAMOND_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(GOLD_GENERIC, world, random, chunkX, chunkZ, 2, 0, 32);
		runOreGenerator(IRON_GENERIC, world, random, chunkX, chunkZ, 20, 0, 64);
		runOreGenerator(LAPIS_GENERIC, world, random, chunkX, chunkZ, 1, 0, 16);
		runOreGenerator(MINERAL_GENERIC, world, random, chunkX, chunkZ, 12, 28, 50);
		runOreGenerator(REDSTONE_GENERIC, world, random, chunkX, chunkZ, 8, 0, 16);
		runOreGenerator(RICHMINERAL_GENERIC, world, random, chunkX, chunkZ, 6, 4, 28);
		runOreGenerator(TITANIUM_GENERIC, world, random, chunkX, chunkZ, 3, 4, 28);
		runOreGenerator(PHOSPHORUS_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(DIRT_GENERIC, world, random, chunkX, chunkZ, 20, 0, 128);
		runOreGenerator(GRAVEL_GENERIC, world, random, chunkX, chunkZ, 10, 0, 128);
		runOreGenerator(URANIUM_GENERIC, world, random, chunkX, chunkZ, 2, 4, 20);

		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalTerranCity) {
			runGenericFlagGenerator(TERRAN_BUNKER, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalTerranCity) {
			runGenericFlagGenerator(TERRAN_BARRACKS, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
		}
		if (world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) == BiomeHandler.biomeKorhalTerranCity) {
			runGenericFlagGenerator(TERRAN_COMMAND_CENTER, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
		}
		if ( world.getWorldInfo().isMapFeaturesEnabled() && world.getBiome(new BlockPos(chunkX * 16, 0, chunkZ * 16)) != BiomeHandler.biomeKorhalTerranCity) {
			runTeamColorGenerator(PROTOSS_WARPGATE, 0, 3, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100, true);
		}
		if (world.rand.nextInt(100) < 4 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runDualBlockStateGenerator(GEYSER, Blocks.RED_SANDSTONE.getDefaultState(), BlockHandler.FLUID_VESPENE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
		}
		if (world.rand.nextInt(100) < 2 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runDualBlockStateGenerator(GEYSER, Blocks.RED_SANDSTONE.getDefaultState(), BlockHandler.FLUID_TERRAZINE.getDefaultState(), world, random, chunkX, chunkZ, 0, -35, 0, 1, 60, 80, true);
		}
		if (world.rand.nextInt(100) < 60 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runMetaGenerator(MINERAL_PATCH, 0, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		}
		if (world.rand.nextInt(100) < 20 && world.getWorldInfo().isMapFeaturesEnabled()) {
			runMetaGenerator(MINERAL_PATCH, 1, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 100);
		}
	}
	
	/**
	 * Generates structures and ores for deep space.
	 * 
	 * @param random A random object.
	 * @param chunkX The x position of the current chunk.
	 * @param chunkZ The z position of the current chunk.
	 * @param world the world.
	 * @param chunkGenerator the chunk generator.
	 * @param chunkProvider the chunk provider.
	 */
	public void generateSpace(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

		/** Earth **/
		if(this.generationCompleted == false) {
			this.runMultisurfacePlanetGenerator(MULTISURFACE_PLANET_TEMPLATE, 0, 21, 31, MetaBlockHandler.PLANET_SURFACE.getStateFromMeta(0), MetaBlockHandler.PLANET_SURFACE.getStateFromMeta(4), world, random, 0, 0, 0, new BlockPos(0, 128, 0));
			this.runStarGenerator(STAR_TEMPLATE, 51, 75, MetaBlockHandler.STAR_SURFACE.getStateFromMeta(2), world, random, 0, 0, 0, new BlockPos(200, 128, 0));
			this.generationCompleted = true;
		}
		
		if(random.nextInt(1500) == 0) 	runRandomStarGenerator(STAR_TEMPLATE, random.nextInt(50) + 25, world, random, chunkX, chunkZ, 0, 0, 0, 1, 0, 255);
		
		if(random.nextInt(300) < 10)	runOreGenerator(COAL_SPACE, world, random, chunkX, chunkZ, 1, 0, 255);
		if(random.nextInt(300) < 7)		runOreGenerator(COPPER_SPACE, world, random, chunkX, chunkZ, 1, 0, 255);
		if(random.nextInt(300) < 1)		runOreGenerator(DIAMOND_SPACE, world, random, chunkX, chunkZ, 1, 0, 255);
		if(random.nextInt(300) < 2)		runOreGenerator(GOLD_SPACE, world, random, chunkX, chunkZ, 1, 0, 255);
		if(random.nextInt(300) < 10)	runOreGenerator(IRON_SPACE, world, random, chunkX, chunkZ, 1, 0, 255);
	}
}