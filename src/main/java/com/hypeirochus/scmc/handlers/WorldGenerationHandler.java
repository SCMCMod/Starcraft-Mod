package com.hypeirochus.scmc.handlers;

import java.util.Random;

import com.hypeirochus.scmc.lib.FactorySettings;
import com.hypeirochus.scmc.worldgen.StarcraftWorldGenerationContainer;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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

	public static void pre(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(INSTANCE, 0);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			StarcraftWorldGenerationContainer.INSTANCE.generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		default:
			if (world.provider.getDimension() == FactorySettings.INT_DIMENSION_CHAR)
				StarcraftWorldGenerationContainer.INSTANCE.generateChar(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == FactorySettings.INT_DIMENSION_SHAKURAS)
				StarcraftWorldGenerationContainer.INSTANCE.generateShakuras(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == FactorySettings.INT_DIMENSION_SLAYN)
				StarcraftWorldGenerationContainer.INSTANCE.generateSlayn(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == FactorySettings.INT_DIMENSION_KORHAL)
				StarcraftWorldGenerationContainer.INSTANCE.generateKorhal(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == FactorySettings.INT_DIMENSION_KALDIR)
				StarcraftWorldGenerationContainer.INSTANCE.generateKaldir(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == FactorySettings.INT_DIMENSION_ZERUS)
				StarcraftWorldGenerationContainer.INSTANCE.generateZerus(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == FactorySettings.INT_DIMENSION_AIUR)
				StarcraftWorldGenerationContainer.INSTANCE.generateAiur(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == FactorySettings.INT_DIMENSION_SPACE)
				StarcraftWorldGenerationContainer.INSTANCE.generateSpace(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			break;
		}

	}

}