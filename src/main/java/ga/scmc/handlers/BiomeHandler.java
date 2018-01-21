package ga.scmc.handlers;

import ga.scmc.worldgen.dimchar.BiomeGenCharAshHills;
import ga.scmc.worldgen.dimchar.BiomeGenCharAshPlains;
import ga.scmc.worldgen.dimchar.BiomeGenCharAshPlateau;
import ga.scmc.worldgen.dimchar.BiomeGenCharGlassPlains;
import ga.scmc.worldgen.dimchar.BiomeGenCharHills;
import ga.scmc.worldgen.dimchar.BiomeGenCharLavaOcean;
import ga.scmc.worldgen.dimchar.BiomeGenCharOutskirts;
import ga.scmc.worldgen.dimchar.BiomeGenCharScar;
import ga.scmc.worldgen.dimchar.BiomeGenCharZergHive;
import ga.scmc.worldgen.dimkaldir.BiomeGenKaldirIcePlains;
import ga.scmc.worldgen.dimkaldir.BiomeGenKaldirMountains;
import ga.scmc.worldgen.dimkaldir.BiomeGenKaldirProtossCity;
import ga.scmc.worldgen.dimkaldir.BiomeGenKaldirSnowPlains;
import ga.scmc.worldgen.dimkaldir.BiomeGenKaldirZergHive;
import ga.scmc.worldgen.dimkorhal.BiomeGenKorhalCity;
import ga.scmc.worldgen.dimkorhal.BiomeGenKorhalDesert;
import ga.scmc.worldgen.dimkorhal.BiomeGenKorhalDesertHills;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasDesert;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasHills;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasMountains;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasOcean;
import ga.scmc.worldgen.dimshakuras.BiomeGenShakurasProtossCity;
import ga.scmc.worldgen.dimslayn.BiomeGenSlaynHills;
import ga.scmc.worldgen.dimslayn.BiomeGenSlaynMountains;
import ga.scmc.worldgen.dimslayn.BiomeGenSlaynOcean;
import ga.scmc.worldgen.dimslayn.BiomeGenSlaynProtossCity;
import ga.scmc.worldgen.dimslayn.BiomeGenSlaynWastelands;
import ga.scmc.worldgen.dimzerus.BiomeGenZerusJungle;
import ga.scmc.worldgen.dimzerus.BiomeGenZerusMountains;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomeHandler extends Biome {

	public static Biome biomeAshPlains;
	public static Biome biomeAshPlateau;
	public static Biome biomeCharZergHive;
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
	public static Biome biomeShakurasProtossCity;

	public static Biome biomeSlaynWastelands;
	public static Biome biomeSlaynHills;
	public static Biome biomeSlaynOcean;
	public static Biome biomeSlaynMountains;
	public static Biome biomeSlaynProtossCity;

	public static Biome biomeKorhalDesert;
	public static Biome biomeKorhalDesertHills;
	public static Biome biomeKorhalTerranCity;

	public static Biome biomeKaldirIcePlains;
	public static Biome biomeKaldirSnowPlains;
	public static Biome biomeKaldirMountains;
	public static Biome biomeKaldirProtossCity;
	public static Biome biomeKaldirZergHive;

	public static Biome biomeZerusJungle;
	public static Biome biomeZerusMountains;
	public static Biome biomeZerusOcean;

	public static Biome biomeAiurJungle;
	public static Biome biomeAiurMountains;
	public static Biome biomeAiurOcean;
	public static Biome biomeAiurProtossCity;

	public static Biome biomeAiurPlains;

	public static void preInit() {
		registerBiomes();
		GameRegistry.register(biomeAshPlains);
		GameRegistry.register(biomeAshPlateau);
		GameRegistry.register(biomeGlassPlains);
		GameRegistry.register(biomeCharZergHive);
		GameRegistry.register(biomeCharScars);
		GameRegistry.register(biomeLavaOcean);
		GameRegistry.register(biomeCharHills);
		GameRegistry.register(biomeCharOutskirts);

		GameRegistry.register(biomeShakurasDesert);
		GameRegistry.register(biomeShakurasProtossCity);
		GameRegistry.register(biomeShakurasHills);
		GameRegistry.register(biomeShakurasOcean);
		GameRegistry.register(biomeShakurasMountains);

		GameRegistry.register(biomeSlaynWastelands);
		GameRegistry.register(biomeSlaynHills);
		GameRegistry.register(biomeSlaynOcean);
		GameRegistry.register(biomeSlaynMountains);
		GameRegistry.register(biomeSlaynProtossCity);

		GameRegistry.register(biomeKorhalDesert);
		GameRegistry.register(biomeKorhalDesertHills);
		GameRegistry.register(biomeKorhalTerranCity);

		GameRegistry.register(biomeZerusMountains);
		GameRegistry.register(biomeZerusJungle);
		
		GameRegistry.register(biomeKaldirIcePlains);
		GameRegistry.register(biomeKaldirSnowPlains);
		GameRegistry.register(biomeKaldirMountains);
		GameRegistry.register(biomeKaldirProtossCity);
		GameRegistry.register(biomeKaldirZergHive);
	}

	public static void registerBiomes() {

		biomeCharZergHive = new BiomeGenCharZergHive((new Biome.BiomeProperties("Char Zerg Hive")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeAshPlains = new BiomeGenCharAshPlains((new Biome.BiomeProperties("Char Ash Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeAshHills = new BiomeGenCharAshHills((new Biome.BiomeProperties("Char Ash Hills")).setBaseHeight(0.25F).setHeightVariation(0.45F).setTemperature(2.0F).setRainfall(0.3F));
		biomeAshPlateau = new BiomeGenCharAshPlateau((new Biome.BiomeProperties("Char Ash Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(2.0F).setRainfall(0.3F));
		biomeGlassPlains = new BiomeGenCharGlassPlains((new Biome.BiomeProperties("Char Glass Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeCharScars = new BiomeGenCharScar((new Biome.BiomeProperties("Char Scars")).setBaseHeight(-0.5F).setHeightVariation(0.0F).setTemperature(2.0F));
		biomeLavaOcean = new BiomeGenCharLavaOcean((new Biome.BiomeProperties("Char Deep Ocean")).setBaseHeight(-1.5F).setHeightVariation(0.35F).setTemperature(2.0F));
		biomeCharHills = new BiomeGenCharHills((new Biome.BiomeProperties("Char Hills")).setBaseHeight(0.25F).setHeightVariation(0.15F).setTemperature(2.0F).setRainfall(0.3F));
		biomeCharOutskirts = new BiomeGenCharOutskirts((new Biome.BiomeProperties("Char Outskirts")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));

		biomeShakurasDesert = new BiomeGenShakurasDesert((new Biome.BiomeProperties("Shakuras Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(0.3F));
		biomeShakurasHills = new BiomeGenShakurasHills((new Biome.BiomeProperties("Shakuras Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F));
		biomeShakurasOcean = new BiomeGenShakurasOcean((new Biome.BiomeProperties("Shakuras Deep Ocean")).setBaseHeight(-1.5F).setHeightVariation(0.35F).setTemperature(0.3F));
		biomeShakurasMountains = new BiomeGenShakurasMountains((new Biome.BiomeProperties("Shakuras Mountains")).setBaseHeight(1.0F).setHeightVariation(0.55F).setTemperature(0.3F).setRainfall(0.3F));
		biomeShakurasProtossCity = new BiomeGenShakurasProtossCity((new Biome.BiomeProperties("Shakuras Protoss City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.3F).setRainfall(0.3F));
		
		biomeSlaynWastelands = new BiomeGenSlaynWastelands((new Biome.BiomeProperties("Slayn Wastelands")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(0.3F));
		biomeSlaynHills = new BiomeGenSlaynHills((new Biome.BiomeProperties("Slayn Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F));
		biomeSlaynOcean = new BiomeGenSlaynOcean((new Biome.BiomeProperties("Slayn Deep Ocean")).setBaseHeight(-1.5F).setHeightVariation(0.35F).setTemperature(0.3F));
		biomeSlaynMountains = new BiomeGenSlaynMountains((new Biome.BiomeProperties("Slayn Mountains")).setBaseHeight(1.0F).setHeightVariation(0.55F).setTemperature(0.3F).setRainfall(0.3F));
		biomeSlaynProtossCity = new BiomeGenSlaynProtossCity((new Biome.BiomeProperties("Slayn Protoss City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.3F).setRainfall(0.3F));
		
		biomeKorhalDesert = new BiomeGenKorhalDesert((new Biome.BiomeProperties("Korhal Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(0.3F));
		biomeKorhalDesertHills = new BiomeGenKorhalDesertHills((new Biome.BiomeProperties("Korhal Desert Hills")).setBaseHeight(0.0F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F));
		biomeKorhalTerranCity = new BiomeGenKorhalCity((new Biome.BiomeProperties("Korhal Terran City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.3F).setRainfall(0.3F));
		
		biomeZerusMountains = new BiomeGenZerusMountains((new Biome.BiomeProperties("Zerus Mountains")).setBaseHeight(1.0F).setHeightVariation(0.55F).setTemperature(0.1F).setRainfall(0.5F));
		biomeZerusJungle = new BiomeGenZerusJungle((new Biome.BiomeProperties("Zerus Jungle")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.1F).setRainfall(0.5F));
		
		biomeKaldirIcePlains = new BiomeGenKaldirIcePlains((new Biome.BiomeProperties("Kaldir Ice Plains")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.1F).setRainfall(0.5F));
		biomeKaldirSnowPlains = new BiomeGenKaldirSnowPlains((new Biome.BiomeProperties("Kaldir Snow Plains")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.1F).setRainfall(0.5F));
		biomeKaldirMountains = new BiomeGenKaldirMountains((new Biome.BiomeProperties("Kaldir Mountains")).setBaseHeight(1.0F).setHeightVariation(0.55F).setTemperature(0.1F).setRainfall(0.5F));
		biomeKaldirProtossCity = new BiomeGenKaldirProtossCity((new Biome.BiomeProperties("Kaldir Protosss City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.1F).setRainfall(0.5F));
		biomeKaldirZergHive = new BiomeGenKaldirZergHive((new Biome.BiomeProperties("Kaldir Zerg Hive")).setBaseHeight(0.0F).setHeightVariation(0.1F).setTemperature(2.0F).setRainfall(0.5F));
		
		// add or remove spawn biomes here

		BiomeManager.addSpawnBiome(BiomeHandler.biomeAshPlains);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeAshHills);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeAshPlateau);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeShakurasHills);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeKorhalDesert);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeKorhalDesertHills);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeKaldirIcePlains);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeKaldirSnowPlains);

		BiomeManager.removeSpawnBiome(BiomeHandler.biomeCharZergHive);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeKaldirZergHive);
		
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeShakurasProtossCity);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeKaldirProtossCity);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeSlaynProtossCity);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeAiurProtossCity);
		
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeShakurasOcean);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeLavaOcean);
		
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeGlassPlains);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeCharScars);

	}

	public BiomeHandler(BiomeProperties par1) {
		super(par1);
	}
}