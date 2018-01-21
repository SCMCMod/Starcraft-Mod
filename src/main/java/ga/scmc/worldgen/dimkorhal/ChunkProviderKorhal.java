package ga.scmc.worldgen.dimkorhal;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import ga.scmc.handlers.BiomeHandler;
import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.BlockFalling;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.gen.MapGenBase;
import net.minecraftforge.event.terraingen.InitMapGenEvent.EventType;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderKorhal implements IChunkGenerator {

	private Biome[] biomesForGeneration;
	private MapGenBase caveGenerator = new KorhalGenCaves();
	private MapGenBase ravineGenerator = new KorhalGenRavine();
	private Random random = new Random();

	private KorhalTerrainGenerator terraingen = new KorhalTerrainGenerator();
	private final World worldObj;
    private ChunkProviderSettings settings;
    
	public ChunkProviderKorhal(World worldObj) {
		this.worldObj = worldObj;
		long seed = worldObj.getSeed();
		random = new Random((seed + 516) * 314);
		terraingen.setup(worldObj, random);
		caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, EventType.CAVE);
		ravineGenerator = TerrainGen.getModdedMapGen(ravineGenerator, EventType.RAVINE);
        this.settings = ChunkProviderSettings.Factory.jsonToFactory(worldObj.getWorldInfo().getGeneratorOptions()).build();
	}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		return false;
	}

	@Override
	public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		Biome biome = worldObj.getBiomeForCoordsBody(pos);
		return biome.getSpawnableList(creatureType);
	}

	@Nullable
	@Override
	public BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position) {
		return null;
	}

	@Override
	public void populate(int x, int z) {
		int i = x * 16;
		int j = z * 16;
		BlockPos blockpos = new BlockPos(i, 0, j);
		Biome biome = worldObj.getBiomeForCoordsBody(blockpos.add(16, 0, 16));

			if (biome != BiomeHandler.biomeKorhalTerranCity && biome != BiomeHandler.biomeKorhalTerranCity && this.settings.useWaterLakes && this.random.nextInt(this.settings.waterLakeChance * 10) == 0)
	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, this.random, x, z, false, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE))
	        {
	            int i1 = this.random.nextInt(16) + 8;
	            int j1 = this.random.nextInt(256);
	            int k1 = this.random.nextInt(16) + 8;
	            (new KorhalGenCustomLakes(Blocks.WATER)).generate(worldObj, this.random, blockpos.add(i1, j1, k1));
	        }

	        if (biome != BiomeHandler.biomeKorhalTerranCity && biome != BiomeHandler.biomeKorhalTerranCity && this.random.nextInt(this.settings.lavaLakeChance / 5) == 0 && this.settings.useLavaLakes)
	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, this.random, x, z, false, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA))
	        {
	            int i2 = this.random.nextInt(16) + 8;
	            int l2 = this.random.nextInt(this.random.nextInt(248) + 8);
	            int k3 = this.random.nextInt(16) + 8;

	            if (l2 < worldObj.getSeaLevel() || this.random.nextInt(this.settings.lavaLakeChance / 8) == 0)
	            {
	                (new KorhalGenCustomLakes(Blocks.LAVA)).generate(worldObj, this.random, blockpos.add(i2, l2, k3));
	            }
	        }
	        
	        if (biome != BiomeHandler.biomeKorhalTerranCity && biome != BiomeHandler.biomeKorhalTerranCity && this.random.nextInt(this.settings.lavaLakeChance / 10) == 0 && this.settings.useLavaLakes)
	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, this.random, x, z, false, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA))
	        {
	            int i2 = this.random.nextInt(16) + 8;
	            int l2 = this.random.nextInt(this.random.nextInt(248) + 8);
	            int k3 = this.random.nextInt(16) + 8;

	            if (l2 < worldObj.getSeaLevel() || this.random.nextInt(this.settings.lavaLakeChance / 8) == 0)
	            {
	                (new KorhalGenCustomLakes(BlockHandler.FLUID_TAR)).generate(worldObj, this.random, blockpos.add(i2, l2, k3));
	            }
	        }
		// Make sure animals appropriate to the biome spawn here when the chunk
		// is generated
		WorldEntitySpawner.performWorldGenSpawning(worldObj, biome, i + 8, j + 8, 16, 16, random);
		BlockFalling.fallInstantly = false;
	}

	@Override
	public Chunk provideChunk(int x, int z) {
		ChunkPrimer chunkprimer = new ChunkPrimer();

		// Setup biomes for terraingen
		biomesForGeneration = worldObj.getBiomeProvider().getBiomesForGeneration(biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
		terraingen.setBiomesForGeneration(biomesForGeneration);
		terraingen.generate(x, z, chunkprimer);

		// Setup biomes again for actual biome decoration
		biomesForGeneration = worldObj.getBiomeProvider().getBiomes(biomesForGeneration, x * 16, z * 16, 16, 16);
		terraingen.setBiomesForGeneration(biomesForGeneration);

		// This will replace stone with the biome specific stuff
		terraingen.replaceBiomeBlocks(x, z, chunkprimer, this);

		// Generate caves
		caveGenerator.generate(worldObj, x, z, chunkprimer);
		
		// Generate ravines
		ravineGenerator.generate(worldObj, x, z, chunkprimer);

		Chunk chunk = new Chunk(worldObj, chunkprimer, x, z);

		byte[] biomeArray = chunk.getBiomeArray();
		for(int i = 0; i < biomeArray.length; ++i) {
			biomeArray[i] = (byte) Biome.getIdForBiome(biomesForGeneration[i]);
		}

		chunk.generateSkylightMap();
		return chunk;
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {

	}
}