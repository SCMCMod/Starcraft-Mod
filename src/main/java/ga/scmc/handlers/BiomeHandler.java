package ga.scmc.handlers;

import ga.scmc.worldgen.dimchar.BiomeGenCharAshHills;
import ga.scmc.worldgen.dimchar.BiomeGenCharAshPlains;
import ga.scmc.worldgen.dimchar.BiomeGenCharAshPlateau;
import ga.scmc.worldgen.dimchar.BiomeGenCharCreepInfestation;
import ga.scmc.worldgen.dimchar.BiomeGenCharGlassPlains;
import ga.scmc.worldgen.dimchar.BiomeGenCharHills;
import ga.scmc.worldgen.dimchar.BiomeGenCharLavaOcean;
import ga.scmc.worldgen.dimchar.BiomeGenCharOutskirts;
import ga.scmc.worldgen.dimchar.BiomeGenCharScar;
import ga.scmc.worldgen.dimkorhal.BiomeGenKorhalCity;
import ga.scmc.worldgen.dimkorhal.BiomeGenKorhalDesert;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasCity;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasDesert;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasHills;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasMountains;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasOcean;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomeHandler extends Biome {

	public static Biome biomeAshPlains;
	public static Biome biomeAshPlateau;
	public static Biome biomeCharCreepInfestation;
	public static Biome biomeCharScars;
	public static Biome biomeLavaOcean;
	public static Biome biomeGlassPlains;
	public static Biome biomeAshHills;
	public static Biome biomeCharHills;
	public static Biome biomeCharOutskirts;
	
	public static Biome biomeShakurasDesert;
	public static Biome biomeShakurasHills;
	public static Biome biomeShakurasOcean;
	public static Biome biomeShakurasMountains;
	public static Biome biomeShakurasCity;
	
	public static Biome biomeSlaynDesert;
	public static Biome biomeSlaynHills;
	public static Biome biomeSlaynOcean;
	public static Biome biomeSlaynMountains;

	public static Biome biomeKorhalDesert;
	public static Biome biomeKorhalCity;
	
	public static void preInit() {
		registerBiomes();
		GameRegistry.register(biomeAshPlains);
		GameRegistry.register(biomeAshPlateau);
		GameRegistry.register(biomeGlassPlains);
		GameRegistry.register(biomeCharCreepInfestation);
		GameRegistry.register(biomeCharScars);
		GameRegistry.register(biomeLavaOcean);
		GameRegistry.register(biomeCharHills);
		GameRegistry.register(biomeCharOutskirts);
		
		GameRegistry.register(biomeShakurasDesert);
		GameRegistry.register(biomeShakurasHills);
		GameRegistry.register(biomeShakurasOcean);
		GameRegistry.register(biomeShakurasMountains);
		
		//GameRegistry.register(biomeSlaynDesert);
		//GameRegistry.register(biomeSlaynHills);
		//GameRegistry.register(biomeSlaynOcean);
		//GameRegistry.register(biomeSlaynMountains);

		GameRegistry.register(biomeKorhalDesert);
		GameRegistry.register(biomeKorhalCity);
	}

	public static void registerBiomes() {

		biomeCharCreepInfestation = new BiomeGenCharCreepInfestation(
				(new Biome.BiomeProperties("Char Infestation")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeAshPlains = new BiomeGenCharAshPlains(
				(new Biome.BiomeProperties("Char Ash Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeAshHills = new BiomeGenCharAshHills(
				(new Biome.BiomeProperties("Char Ash Hills")).setBaseHeight(0.25F).setHeightVariation(0.45F).setTemperature(2.0F).setRainfall(0.3F));
		biomeAshPlateau = new BiomeGenCharAshPlateau(
				(new Biome.BiomeProperties("Char Ash Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(2.0F).setRainfall(0.3F));
		biomeGlassPlains = new BiomeGenCharGlassPlains(
				(new Biome.BiomeProperties("Char Glass Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeCharScars = new BiomeGenCharScar((new Biome.BiomeProperties("Char Scars")).setBaseHeight(-0.5F).setHeightVariation(0.0F).setTemperature(2.0F));
		biomeLavaOcean = new BiomeGenCharLavaOcean((new Biome.BiomeProperties("Char Deep Ocean")).setBaseHeight(-1.5F).setHeightVariation(0.35F).setTemperature(2.0F));
		biomeCharHills = new BiomeGenCharHills(
				(new Biome.BiomeProperties("Char Hills")).setBaseHeight(0.25F).setHeightVariation(0.15F).setTemperature(2.0F).setRainfall(0.3F));
		biomeCharOutskirts = new BiomeGenCharOutskirts(
				(new Biome.BiomeProperties("Char Outskirts")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		
		
		biomeShakurasDesert = new BiomeGenShakurasDesert(
				(new Biome.BiomeProperties("Shakuras Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(0.3F));
		biomeShakurasHills = new BiomeGenShakurasHills(
				(new Biome.BiomeProperties("Shakuras Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F));
		biomeShakurasOcean = new BiomeGenShakurasOcean((new Biome.BiomeProperties("Shakuras Deep Ocean")).setBaseHeight(-1.5F).setHeightVariation(0.35F).setTemperature(0.3F));
		biomeShakurasMountains = new BiomeGenShakurasMountains(
				(new Biome.BiomeProperties("Shakuras Mountains")).setBaseHeight(1.0F).setHeightVariation(0.55F).setTemperature(0.3F).setRainfall(0.3F));
		biomeShakurasCity = new BiomeGenShakurasCity(
				(new Biome.BiomeProperties("Shakuras City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.3F).setRainfall(0.3F));
		
	//	biomeSlaynDesert = new BiomeGenSlaynDesert(
				//(new Biome.BiomeProperties("Slayn Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(1.0F));
		
		biomeKorhalDesert = new BiomeGenKorhalDesert(
				(new Biome.BiomeProperties("Korhal Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(0.3F));
		biomeKorhalCity = new BiomeGenKorhalCity(
				(new Biome.BiomeProperties("Korhal City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.3F).setRainfall(0.3F));
		
		// add or remove spawn biomes here

		BiomeManager.addSpawnBiome(BiomeHandler.biomeAshPlains);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeAshHills);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeAshPlateau);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeShakurasHills);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeKorhalCity);

		BiomeManager.removeSpawnBiome(BiomeHandler.biomeShakurasCity);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeKorhalDesert);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeShakurasOcean);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeLavaOcean);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeGlassPlains);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeCharScars);

	}

	public BiomeHandler(BiomeProperties par1) {
		super(par1);
	}
}