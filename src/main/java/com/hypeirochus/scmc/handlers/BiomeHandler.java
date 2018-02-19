package com.hypeirochus.scmc.handlers;

import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.worldgen.dimaiur.BiomeGenAiurJungle;
import com.hypeirochus.scmc.worldgen.dimaiur.BiomeGenAiurMountains;
import com.hypeirochus.scmc.worldgen.dimaiur.BiomeGenAiurPlains;
import com.hypeirochus.scmc.worldgen.dimaiur.BiomeGenAiurProtossCity;
import com.hypeirochus.scmc.worldgen.dimchar.BiomeGenCharAshPlains;
import com.hypeirochus.scmc.worldgen.dimchar.BiomeGenCharGlassPlains;
import com.hypeirochus.scmc.worldgen.dimchar.BiomeGenCharHills;
import com.hypeirochus.scmc.worldgen.dimchar.BiomeGenCharLavaOcean;
import com.hypeirochus.scmc.worldgen.dimchar.BiomeGenCharScar;
import com.hypeirochus.scmc.worldgen.dimchar.BiomeGenCharZergHive;
import com.hypeirochus.scmc.worldgen.dimkaldir.BiomeGenKaldirIcePlains;
import com.hypeirochus.scmc.worldgen.dimkaldir.BiomeGenKaldirMountains;
import com.hypeirochus.scmc.worldgen.dimkaldir.BiomeGenKaldirProtossCity;
import com.hypeirochus.scmc.worldgen.dimkaldir.BiomeGenKaldirSnowPlains;
import com.hypeirochus.scmc.worldgen.dimkaldir.BiomeGenKaldirZergHive;
import com.hypeirochus.scmc.worldgen.dimkorhal.BiomeGenKorhalCity;
import com.hypeirochus.scmc.worldgen.dimkorhal.BiomeGenKorhalDesert;
import com.hypeirochus.scmc.worldgen.dimshakuras.BiomeGenShakurasDesert;
import com.hypeirochus.scmc.worldgen.dimshakuras.BiomeGenShakurasHills;
import com.hypeirochus.scmc.worldgen.dimshakuras.BiomeGenShakurasMountains;
import com.hypeirochus.scmc.worldgen.dimshakuras.BiomeGenShakurasOcean;
import com.hypeirochus.scmc.worldgen.dimshakuras.BiomeGenShakurasProtossCity;
import com.hypeirochus.scmc.worldgen.dimslayn.BiomeGenSlaynDesert;
import com.hypeirochus.scmc.worldgen.dimslayn.BiomeGenSlaynHills;
import com.hypeirochus.scmc.worldgen.dimslayn.BiomeGenSlaynMountains;
import com.hypeirochus.scmc.worldgen.dimslayn.BiomeGenSlaynOcean;
import com.hypeirochus.scmc.worldgen.dimslayn.BiomeGenSlaynProtossCity;
import com.hypeirochus.scmc.worldgen.dimspace.BiomeGenSpace;
import com.hypeirochus.scmc.worldgen.dimzerus.BiomeGenZerusJungle;
import com.hypeirochus.scmc.worldgen.dimzerus.BiomeGenZerusMountains;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;

public class BiomeHandler extends Biome {

	private static List<Biome> biomes;

	public static Biome biomeCharZergHive;

	public static Biome biomeCharAshPlains;
	public static Biome biomeCharAshHills;
	public static Biome biomeCharAshPlateau;

	public static Biome biomeCharScars;
	public static Biome biomeCharLavaOcean;
	public static Biome biomeCharLavaDeepOcean;

	public static Biome biomeCharGlassPlains;
	public static Biome biomeCharGlassHills;
	public static Biome biomeCharGlassPlateau;

	public static Biome biomeCharHills;

	public static Biome biomeShakurasDesert;
	public static Biome biomeShakurasDesertHills;
	public static Biome biomeShakurasDesertHillsPlus;
	public static Biome biomeShakurasDesertPlateau;
	public static Biome biomeShakurasHills;
	public static Biome biomeShakurasOcean;
	public static Biome biomeShakurasDeepOcean;
	public static Biome biomeShakurasMountains;
	public static Biome biomeShakurasMountainsPlus;
	public static Biome biomeShakurasProtossCity;

	public static Biome biomeSlaynDesert;
	public static Biome biomeSlaynDesertHills;
	public static Biome biomeSlaynDesertHillsPlus;
	public static Biome biomeSlaynDesertPlateau;
	public static Biome biomeSlaynHills;
	public static Biome biomeSlaynOcean;
	public static Biome biomeSlaynMountains;
	public static Biome biomeSlaynProtossCity;

	public static Biome biomeKorhalDesert;
	public static Biome biomeKorhalDesertHills;
	public static Biome biomeKorhalTerranCity;

	public static Biome biomeKaldirIcePlains;
	public static Biome biomeKaldirIceHills;
	public static Biome biomeKaldirIcePlateau;
	public static Biome biomeKaldirSnowPlains;
	public static Biome biomeKaldirSnowHills;
	public static Biome biomeKaldirSnowPlateau;
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

	public static Biome biomeSpace;

	private static void init() {
		biomes = new ArrayList<Biome>();

		registerBiomes();
		/** Char registration **/
		register(biomeCharZergHive);

		register(biomeCharAshPlains);
		register(biomeCharAshHills);
		register(biomeCharAshPlateau);

		register(biomeCharGlassPlains);
		register(biomeCharGlassHills);
		register(biomeCharGlassPlateau);

		register(biomeCharScars);
		register(biomeCharLavaOcean);
		register(biomeCharLavaDeepOcean);
		register(biomeCharHills);

		/** Shakuras regristration **/
		register(biomeShakurasProtossCity);

		register(biomeShakurasDesert);
		register(biomeShakurasDesertHills);
		register(biomeShakurasDesertHillsPlus);
		register(biomeShakurasDesertPlateau);

		register(biomeShakurasHills);

		register(biomeShakurasOcean);
		register(biomeShakurasDeepOcean);

		register(biomeShakurasMountains);
		register(biomeShakurasMountainsPlus);

		/** Slayn registration **/
		register(biomeSlaynDesert);
		register(biomeSlaynHills);
		register(biomeSlaynOcean);
		register(biomeSlaynMountains);
		register(biomeSlaynProtossCity);

		/** Korhal registration **/
		register(biomeKorhalDesert);
		register(biomeKorhalDesertHills);
		register(biomeKorhalTerranCity);

		/** Zerus registration **/
		register(biomeZerusMountains);
		register(biomeZerusJungle);

		/** Kaldir registration **/
		register(biomeKaldirIcePlains);
		register(biomeKaldirIceHills);
		register(biomeKaldirIcePlateau);

		register(biomeKaldirSnowPlains);
		register(biomeKaldirSnowHills);
		register(biomeKaldirSnowPlateau);

		register(biomeKaldirMountains);

		register(biomeKaldirProtossCity);
		register(biomeKaldirZergHive);

		register(biomeSpace);
		
//		 DimensionHandler.init();
	}

	public static void registerBiomes() {

		/** Char biomes **/
		biomeCharZergHive = new BiomeGenCharZergHive((new Biome.BiomeProperties("Char Zerg Hive")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));

		biomeCharAshPlains = new BiomeGenCharAshPlains((new Biome.BiomeProperties("Char Ash Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F), "char_ash_plains");
		biomeCharAshHills = new BiomeGenCharAshPlains((new Biome.BiomeProperties("Char Ash Hills")).setBaseHeight(0.25F).setHeightVariation(0.45F).setTemperature(2.0F).setRainfall(0.3F), "char_ash_hills");
		biomeCharAshPlateau = new BiomeGenCharAshPlains((new Biome.BiomeProperties("Char Ash Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(2.0F).setRainfall(0.3F), "char_ash_plateau");

		biomeCharGlassPlains = new BiomeGenCharGlassPlains((new Biome.BiomeProperties("Char Glass Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F), "char_glass_plains");
		biomeCharGlassHills = new BiomeGenCharGlassPlains((new Biome.BiomeProperties("Char Glass Hills")).setBaseHeight(0.25F).setHeightVariation(0.045F).setTemperature(2.0F).setRainfall(0.3F), "char_glass_hills");
		biomeCharGlassPlateau = new BiomeGenCharGlassPlains((new Biome.BiomeProperties("Char Glass Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(2.0F).setRainfall(0.3F), "char_glass_plateau");

		biomeCharScars = new BiomeGenCharScar((new Biome.BiomeProperties("Char Scars")).setBaseHeight(-0.5F).setHeightVariation(0.0F).setTemperature(2.0F));
		biomeCharLavaOcean = new BiomeGenCharLavaOcean((new Biome.BiomeProperties("Char Ocean")).setBaseHeight(-0.5F).setHeightVariation(0.35F).setTemperature(2.0F), "char_ocean");
		biomeCharLavaDeepOcean = new BiomeGenCharLavaOcean((new Biome.BiomeProperties("Char Deep Ocean")).setBaseHeight(-1.0F).setHeightVariation(0.35F).setTemperature(2.0F), "char_deep_ocean");

		biomeCharHills = new BiomeGenCharHills((new Biome.BiomeProperties("Char Hills")).setBaseHeight(0.25F).setHeightVariation(0.15F).setTemperature(2.0F).setRainfall(0.3F));

		/** Shakuras biomes **/
		biomeShakurasProtossCity = new BiomeGenShakurasProtossCity((new Biome.BiomeProperties("Shakuras Protoss City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(0.3F).setRainfall(0.3F));

		biomeShakurasDesert = new BiomeGenShakurasDesert((new Biome.BiomeProperties("Shakuras Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(0.3F), "shakuras_desert");
		biomeShakurasDesertHills = new BiomeGenShakurasDesert((new Biome.BiomeProperties("Shakuras Desert Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F), "shakuras_desert_hills");
		biomeShakurasDesertHillsPlus = new BiomeGenShakurasDesert((new Biome.BiomeProperties("Shakuras Desert Hills+")).setBaseHeight(0.25F).setHeightVariation(0.045F).setTemperature(0.3F).setRainfall(0.3F), "shakuras_desert_hills+");
		biomeShakurasDesertPlateau = new BiomeGenShakurasDesert((new Biome.BiomeProperties("Shakuras Desert Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(0.3F).setRainfall(0.3F), "shakuras_desert_plateau");

		biomeShakurasHills = new BiomeGenShakurasHills((new Biome.BiomeProperties("Shakuras Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F));

		biomeShakurasOcean = new BiomeGenShakurasOcean((new Biome.BiomeProperties("Shakuras Ocean")).setBaseHeight(-0.5F).setHeightVariation(0.35F).setTemperature(0.3F), "shakuras_ocean");
		biomeShakurasDeepOcean = new BiomeGenShakurasOcean((new Biome.BiomeProperties("Shakuras Deep Ocean")).setBaseHeight(-1.0F).setHeightVariation(0.35F).setTemperature(0.3F), "shakuras_deep_ocean");

		biomeShakurasMountains = new BiomeGenShakurasMountains((new Biome.BiomeProperties("Shakuras Mountains")).setBaseHeight(0.75F).setHeightVariation(0.35F).setTemperature(0.3F).setRainfall(0.3F), "shakuras_mountains");
		biomeShakurasMountainsPlus = new BiomeGenShakurasMountains((new Biome.BiomeProperties("Shakuras Mountains+")).setBaseHeight(0.85F).setHeightVariation(0.55F).setTemperature(0.3F).setRainfall(0.3F), "shakuras_mountains+");

		/** Slayn biomes **/
		biomeSlaynProtossCity = new BiomeGenSlaynProtossCity((new Biome.BiomeProperties("Slayn Protoss City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(1.0F).setRainfall(0.3F));

		biomeSlaynDesert = new BiomeGenSlaynDesert((new Biome.BiomeProperties("Slayn Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(0.3F), "slayn_desert");
		biomeSlaynDesertHills = new BiomeGenSlaynDesert((new Biome.BiomeProperties("Slayn Desert Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F), "slayn_desert_hills");
		biomeSlaynDesertHillsPlus = new BiomeGenSlaynDesert((new Biome.BiomeProperties("Slayn Desert Hills+")).setBaseHeight(0.25F).setHeightVariation(0.45F).setTemperature(0.3F).setRainfall(0.3F), "slayn_desert_hills+");
		biomeSlaynDesertPlateau = new BiomeGenSlaynDesert((new Biome.BiomeProperties("Slayn Desert Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(0.3F).setRainfall(0.3F), "slayn_desert_plateau");

		biomeSlaynHills = new BiomeGenSlaynHills((new Biome.BiomeProperties("Slayn Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F));
		biomeSlaynOcean = new BiomeGenSlaynOcean((new Biome.BiomeProperties("Slayn Deep Ocean")).setBaseHeight(-1.0F).setHeightVariation(0.35F).setTemperature(0.3F));
		biomeSlaynMountains = new BiomeGenSlaynMountains((new Biome.BiomeProperties("Slayn Mountains")).setBaseHeight(0.75F).setHeightVariation(0.35F).setTemperature(0.3F).setRainfall(0.3F));

		/** Korhal biomes **/
		biomeKorhalTerranCity = new BiomeGenKorhalCity((new Biome.BiomeProperties("Korhal Terran City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(1.0F).setRainfall(0.3F));

		biomeKorhalDesert = new BiomeGenKorhalDesert((new Biome.BiomeProperties("Korhal Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.3F).setRainfall(0.3F), "korhal_desert");
		biomeKorhalDesertHills = new BiomeGenKorhalDesert((new Biome.BiomeProperties("Korhal Desert Hills")).setBaseHeight(0.0F).setHeightVariation(0.25F).setTemperature(0.3F).setRainfall(0.3F), "korhal_desert_hills");

		/** Zerus biomes **/
		biomeZerusMountains = new BiomeGenZerusMountains((new Biome.BiomeProperties("Zerus Mountains")).setBaseHeight(.75F).setHeightVariation(0.35F).setTemperature(1.0F).setRainfall(0.5F));
		biomeZerusJungle = new BiomeGenZerusJungle((new Biome.BiomeProperties("Zerus Jungle")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(1.0F).setRainfall(0.5F));

		/** Kaldir biomes **/
		biomeKaldirIcePlains = new BiomeGenKaldirIcePlains((new Biome.BiomeProperties("Kaldir Ice Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.1F).setRainfall(0.5F), "kaldir_ice_plains");
		biomeKaldirIceHills = new BiomeGenKaldirIcePlains((new Biome.BiomeProperties("Kaldir Ice Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.1F).setRainfall(0.5F), "kaldir_ice_hills");
		biomeKaldirIcePlateau = new BiomeGenKaldirIcePlains((new Biome.BiomeProperties("Kaldir Ice Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(0.1F).setRainfall(0.5F), "kaldir_ice_plateau");

		biomeKaldirSnowPlains = new BiomeGenKaldirSnowPlains((new Biome.BiomeProperties("Kaldir Snow Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.1F).setRainfall(0.5F), "kaldir_snow_plains");
		biomeKaldirSnowHills = new BiomeGenKaldirSnowPlains((new Biome.BiomeProperties("Kaldir Snow Hills")).setBaseHeight(0.25F).setHeightVariation(0.25F).setTemperature(0.1F).setRainfall(0.5F), "kaldir_snow_hills");
		biomeKaldirSnowPlateau = new BiomeGenKaldirSnowPlains((new Biome.BiomeProperties("Kaldir Snow Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(0.1F).setRainfall(0.5F), "kaldir_snow_plateau");

		biomeKaldirMountains = new BiomeGenKaldirMountains((new Biome.BiomeProperties("Kaldir Mountains")).setBaseHeight(0.75F).setHeightVariation(0.35F).setTemperature(0.1F).setRainfall(0.5F));

		biomeKaldirProtossCity = new BiomeGenKaldirProtossCity((new Biome.BiomeProperties("Kaldir Protoss City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(1.0F).setRainfall(0.5F));
		biomeKaldirZergHive = new BiomeGenKaldirZergHive((new Biome.BiomeProperties("Kaldir Zerg Hive")).setBaseHeight(0.0F).setHeightVariation(0.1F).setTemperature(1.0F).setRainfall(0.5F));

		biomeSpace = new BiomeGenSpace((new Biome.BiomeProperties("Space")).setBaseHeight(0.0F).setHeightVariation(0.0F).setTemperature(-500.0F).setRainfall(0.0F));

		/** Aiur biomes **/
		biomeAiurMountains = new BiomeGenAiurMountains((new Biome.BiomeProperties("Aiur Mountains")).setBaseHeight(0.75F).setHeightVariation(0.35F).setTemperature(0.1F).setRainfall(0.5F));
		biomeAiurJungle = new BiomeGenAiurJungle((new Biome.BiomeProperties("Aiur Jungle")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(1.0F).setRainfall(0.5F));
		biomeAiurPlains = new BiomeGenAiurPlains((new Biome.BiomeProperties("Aiur Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.1F).setRainfall(0.5F));
		biomeAiurProtossCity = new BiomeGenAiurProtossCity((new Biome.BiomeProperties("Aiur Protoss City")).setBaseHeight(0.0F).setHeightVariation(0).setTemperature(1.0F).setRainfall(0.5F));

		// add or remove spawn biomes here

		BiomeManager.addSpawnBiome(BiomeHandler.biomeCharAshPlains);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeCharAshHills);
		BiomeManager.addSpawnBiome(BiomeHandler.biomeCharAshPlateau);
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
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeShakurasDeepOcean);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeCharLavaOcean);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeCharLavaDeepOcean);

		BiomeManager.removeSpawnBiome(BiomeHandler.biomeCharGlassPlains);
		BiomeManager.removeSpawnBiome(BiomeHandler.biomeCharScars);

	}

	public static void register(Biome biome) {
		biomes.add(biome);
	}

	public BiomeHandler(BiomeProperties par1) {
		super(par1);
	}

	/**
	 * Used for registry.
	 * 
	 * @return All the registered biomes
	 */
	public static Biome[] getBiomes() {
		if (biomes == null)
			init();
		return biomes.toArray(new Biome[biomes.size()]);
	}
}