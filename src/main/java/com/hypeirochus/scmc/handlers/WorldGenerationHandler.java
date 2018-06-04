package com.hypeirochus.scmc.handlers;

import java.util.Random;

import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.worldgen.StarcraftWorldGenerationContainer;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
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

	public static void init() {
		GameRegistry.registerWorldGenerator(INSTANCE, 0);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			StarcraftWorldGenerationContainer.INSTANCE.generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		default:
			if (world.provider.getDimension() == DimensionHandler.char_dt.getId())
				StarcraftWorldGenerationContainer.INSTANCE.generateChar(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == DimensionHandler.shakuras_dt.getId())
				StarcraftWorldGenerationContainer.INSTANCE.generateShakuras(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == DimensionHandler.slayn_dt.getId())
				StarcraftWorldGenerationContainer.INSTANCE.generateSlayn(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == DimensionHandler.korhal_dt.getId())
				StarcraftWorldGenerationContainer.INSTANCE.generateKorhal(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == DimensionHandler.kaldir_dt.getId())
				StarcraftWorldGenerationContainer.INSTANCE.generateKaldir(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == DimensionHandler.zerus_dt.getId())
				StarcraftWorldGenerationContainer.INSTANCE.generateZerus(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == DimensionHandler.aiur_dt.getId())
				StarcraftWorldGenerationContainer.INSTANCE.generateAiur(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == DimensionHandler.space_dt.getId())
				StarcraftWorldGenerationContainer.INSTANCE.generateSpace(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			break;
		}

	}

}