package ga.scmc.handlers;

import java.util.Random;

import ga.scmc.worldgen.StarcraftWorldGenerationContainer;
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

	public static void preInit() {
		GameRegistry.registerWorldGenerator(INSTANCE, 0);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			StarcraftWorldGenerationContainer.instance.generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		default:
			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_CHAR)
				StarcraftWorldGenerationContainer.instance.generateChar(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_SHAKURAS)
				StarcraftWorldGenerationContainer.instance.generateShakuras(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_SLAYN)
				StarcraftWorldGenerationContainer.instance.generateSlayn(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KORHAL)
				StarcraftWorldGenerationContainer.instance.generateKorhal(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KALDIR)
				StarcraftWorldGenerationContainer.instance.generateKaldir(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_ZERUS)
				StarcraftWorldGenerationContainer.instance.generateZerus(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_AIUR)
				StarcraftWorldGenerationContainer.instance.generateAiur(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			if (world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_SPACE)
				StarcraftWorldGenerationContainer.instance.generateSpace(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

			break;
		}

	}

}