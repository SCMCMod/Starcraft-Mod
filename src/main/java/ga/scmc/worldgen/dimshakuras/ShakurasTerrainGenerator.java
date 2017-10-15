package ga.scmc.worldgen.dimshakuras;

import java.util.Random;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.terraingen.InitNoiseGensEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ShakurasTerrainGenerator {

	private Biome[] biomesForGeneration;
	private final float[] biomeWeights;

	private double[] depthBuffer = new double[256];
	// A NoiseGeneratorOctaves used in generating terrain
	private NoiseGeneratorOctaves depthNoise;
	private double[] depthRegion;
	private final double[] heightMap;
	private double[] mainNoiseRegion;

	private NoiseGeneratorOctaves mainPerlinNoise;
	private NoiseGeneratorOctaves maxLimitPerlinNoise;
	private double[] maxLimitRegion;
	private NoiseGeneratorOctaves minLimitPerlinNoise;

	private double[] minLimitRegion;

	private Random random;
	private NoiseGeneratorPerlin surfaceNoise;

	private World world;

	public ShakurasTerrainGenerator() {
		heightMap = new double[825];

		biomeWeights = new float[25];
		for (int j = -2; j <= 2; ++j) {
			for (int k = -2; k <= 2; ++k) {
				float f = 10.0F / MathHelper.sqrt((j * j + k * k) + 0.2F);
				biomeWeights[j + 2 + (k + 2) * 5] = f;
			}
		}
	}

	public void generate(int chunkX, int chunkZ, ChunkPrimer primer) {
		generateHeightmap(chunkX * 4, 0, chunkZ * 4);

		for (int x4 = 0; x4 < 4; ++x4) {
			int l = x4 * 5;
			int i1 = (x4 + 1) * 5;

			for (int z4 = 0; z4 < 4; ++z4) {
				int k1 = (l + z4) * 33;
				int l1 = (l + z4 + 1) * 33;
				int i2 = (i1 + z4) * 33;
				int j2 = (i1 + z4 + 1) * 33;

				for (int height32 = 0; height32 < 32; ++height32) {
					double d0 = 0.125D;
					double d1 = heightMap[k1 + height32];
					double d2 = heightMap[l1 + height32];
					double d3 = heightMap[i2 + height32];
					double d4 = heightMap[j2 + height32];
					double d5 = (heightMap[k1 + height32 + 1] - d1) * d0;
					double d6 = (heightMap[l1 + height32 + 1] - d2) * d0;
					double d7 = (heightMap[i2 + height32 + 1] - d3) * d0;
					double d8 = (heightMap[j2 + height32 + 1] - d4) * d0;

					for (int h = 0; h < 8; ++h) {
						double d9 = 0.25D;
						double d10 = d1;
						double d11 = d2;
						double d12 = (d3 - d1) * d9;
						double d13 = (d4 - d2) * d9;
						int height = (height32 * 8) + h;

						for (int x = 0; x < 4; ++x) {
							double d14 = 0.25D;
							double d16 = (d11 - d10) * d14;
							double d15 = d10 - d16;

							for (int z = 0; z < 4; ++z) {
								if ((d15 += d16) > 0.0D) {
									primer.setBlockState(x4 * 4 + x, height32 * 8 + h, z4 * 4 + z, BlockHandler.STONE_SHAKURAS.getDefaultState());
								} else if (height < 63) {
									primer.setBlockState(x4 * 4 + x, height32 * 8 + h, z4 * 4 + z, Blocks.WATER.getDefaultState());
								}
							}

							d10 += d12;
							d11 += d13;
						}

						d1 += d5;
						d2 += d6;
						d3 += d7;
						d4 += d8;
					}
				}
			}
		}
	}

	private void generateHeightmap(int chunkX4, int chunkY4, int chunkZ4) {
		depthRegion = depthNoise.generateNoiseOctaves(depthRegion, chunkX4, chunkZ4, 5, 5, 200.0D, 200.0D, 0.5D);
		mainNoiseRegion = mainPerlinNoise.generateNoiseOctaves(mainNoiseRegion, chunkX4, chunkY4, chunkZ4, 5, 33, 5, 8.555150000000001D, 4.277575000000001D, 8.555150000000001D);
		minLimitRegion = minLimitPerlinNoise.generateNoiseOctaves(minLimitRegion, chunkX4, chunkY4, chunkZ4, 5, 33, 5, 684.412D, 684.412D, 684.412D);
		maxLimitRegion = maxLimitPerlinNoise.generateNoiseOctaves(maxLimitRegion, chunkX4, chunkY4, chunkZ4, 5, 33, 5, 684.412D, 684.412D, 684.412D);
		int l = 0;
		int i1 = 0;

		for (int j1 = 0; j1 < 5; ++j1) {
			for (int k1 = 0; k1 < 5; ++k1) {
				float f = 0.0F;
				float f1 = 0.0F;
				float f2 = 0.0F;
				byte b0 = 2;

				for (int l1 = -b0; l1 <= b0; ++l1) {
					for (int i2 = -b0; i2 <= b0; ++i2) {
						Biome biome = biomesForGeneration[j1 + 2 + (k1 + 2) * 10];
						float baseHeight = biome.getBaseHeight();
						float variation = biome.getHeightVariation();

						float f5 = biomeWeights[l1 + 2 + (i2 + 2) * 5] / (baseHeight + 2.0F);
						f += variation * f5;
						f1 += baseHeight * f5;
						f2 += f5;
					}
				}

				f /= f2;
				f1 /= f2;
				f = f * 0.9F + 0.1F;
				f1 = (f1 * 4.0F - 1.0F) / 8.0F;
				double d12 = depthRegion[i1] / 8000.0D;

				if (d12 < 0.0D) {
					d12 = -d12 * 0.3D;
				}

				d12 = d12 * 3.0D - 2.0D;

				if (d12 < 0.0D) {
					d12 /= 2.0D;

					if (d12 < -1.0D) {
						d12 = -1.0D;
					}

					d12 /= 1.4D;
					d12 /= 2.0D;
				} else {
					if (d12 > 1.0D) {
						d12 = 1.0D;
					}

					d12 /= 8.0D;
				}

				++i1;
				double d13 = f1;
				double d14 = f;
				d13 += d12 * 0.2D;
				d13 = d13 * 8.5D / 8.0D;
				double d5 = 8.5D + d13 * 4.0D;

				for (int j2 = 0; j2 < 33; ++j2) {
					double d6 = (j2 - d5) * 12.0D * 128.0D / 256.0D / d14;

					if (d6 < 0.0D) {
						d6 *= 4.0D;
					}

					double d7 = minLimitRegion[l] / 512.0D;
					double d8 = maxLimitRegion[l] / 512.0D;
					double d9 = (mainNoiseRegion[l] / 10.0D + 1.0D) / 2.0D;
					double d10 = MathHelper.clamp(d7, d8, d9) - d6;

					if (j2 > 29) {
						double d11 = ((j2 - 29) / 3.0F);
						d10 = d10 * (1.0D - d11) + -10.0D * d11;
					}

					heightMap[l] = d10;
					++l;
				}
			}
		}
	}

	public void replaceBiomeBlocks(int x, int z, ChunkPrimer primer, IChunkGenerator generator) {
		if (!ForgeEventFactory.onReplaceBiomeBlocks(generator, x, z, primer, world))
			return;
		depthBuffer = surfaceNoise.getRegion(depthBuffer, (x * 16), (z * 16), 16, 16, 0.0625D, 0.0625D, 1.0D);

		for (int i = 0; i < 16; ++i) {
			for (int j = 0; j < 16; ++j) {
				Biome biome = biomesForGeneration[j + i * 16];
				biome.genTerrainBlocks(world, random, primer, x * 16 + i, z * 16 + j, depthBuffer[j + i * 16]);
			}
		}
	}

	public void setBiomesForGeneration(Biome[] biomesForGeneration) {
		this.biomesForGeneration = biomesForGeneration;
	}

	public void setup(World world, Random rand) {
		this.world = world;
		random = rand;

		minLimitPerlinNoise = new NoiseGeneratorOctaves(rand, 16);
		maxLimitPerlinNoise = new NoiseGeneratorOctaves(rand, 16);
		mainPerlinNoise = new NoiseGeneratorOctaves(rand, 8);
		surfaceNoise = new NoiseGeneratorPerlin(rand, 4);
		NoiseGeneratorOctaves noiseGen5 = new NoiseGeneratorOctaves(rand, 10);
		depthNoise = new NoiseGeneratorOctaves(rand, 16);
		NoiseGeneratorOctaves mobSpawnerNoise = new NoiseGeneratorOctaves(rand, 8);

		InitNoiseGensEvent.ContextOverworld ctx = new InitNoiseGensEvent.ContextOverworld(minLimitPerlinNoise, maxLimitPerlinNoise, mainPerlinNoise, surfaceNoise, noiseGen5,
				depthNoise, mobSpawnerNoise);
		ctx = TerrainGen.getModdedNoiseGenerators(world, rand, ctx);
		minLimitPerlinNoise = ctx.getLPerlin1();
		maxLimitPerlinNoise = ctx.getLPerlin2();
		mainPerlinNoise = ctx.getPerlin();
		surfaceNoise = ctx.getHeight();
		// field_185983_b = ctx.getScale();
		depthNoise = ctx.getDepth();
		// field_185985_d = ctx.getForest();
	}
}