package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.entity.EntityC14GaussRifleBullet;
import com.hypeirochus.scmc.entity.EntityFlamethrowerFlame;
import com.hypeirochus.scmc.entity.EntityHydraliskSpike;
import com.hypeirochus.scmc.entity.EntityMutaliskGlaiveWurm;
import com.hypeirochus.scmc.entity.living.EntityArtosilope;
import com.hypeirochus.scmc.entity.living.EntityBrakk;
import com.hypeirochus.scmc.entity.living.EntityBroodling;
import com.hypeirochus.scmc.entity.living.EntityBrutalisk;
import com.hypeirochus.scmc.entity.living.EntityCivilian;
import com.hypeirochus.scmc.entity.living.EntityDarkProbe;
import com.hypeirochus.scmc.entity.living.EntityDarkTemplar;
import com.hypeirochus.scmc.entity.living.EntityHydralisk;
import com.hypeirochus.scmc.entity.living.EntityHydraliskPrimal;
import com.hypeirochus.scmc.entity.living.EntityHydraliskPrimalDehaka;
import com.hypeirochus.scmc.entity.living.EntityInfestedCivilian;
import com.hypeirochus.scmc.entity.living.EntityJimRaynor;
import com.hypeirochus.scmc.entity.living.EntityKakaru;
import com.hypeirochus.scmc.entity.living.EntityLarva;
import com.hypeirochus.scmc.entity.living.EntityLarvaCocoon;
import com.hypeirochus.scmc.entity.living.EntityMarine;
import com.hypeirochus.scmc.entity.living.EntityMutalisk;
import com.hypeirochus.scmc.entity.living.EntityMutaliskBroodlord;
import com.hypeirochus.scmc.entity.living.EntityMutaliskPrimal;
import com.hypeirochus.scmc.entity.living.EntityMutaliskPrimalDehaka;
import com.hypeirochus.scmc.entity.living.EntityMutaliskViper;
import com.hypeirochus.scmc.entity.living.EntityNafash;
import com.hypeirochus.scmc.entity.living.EntityPredator;
import com.hypeirochus.scmc.entity.living.EntityProbe;
import com.hypeirochus.scmc.entity.living.EntityProtossReaver;
import com.hypeirochus.scmc.entity.living.EntityQueen;
import com.hypeirochus.scmc.entity.living.EntityScarab;
import com.hypeirochus.scmc.entity.living.EntityTastelope;
import com.hypeirochus.scmc.entity.living.EntityTyrannozor;
import com.hypeirochus.scmc.entity.living.EntityTyrannozorDehaka;
import com.hypeirochus.scmc.entity.living.EntityUrsadon;
import com.hypeirochus.scmc.entity.living.EntityUrsadonMatriarch;
import com.hypeirochus.scmc.entity.living.EntityVoidProbe;
import com.hypeirochus.scmc.entity.living.EntityZealot;
import com.hypeirochus.scmc.entity.living.EntityZeratul;
import com.hypeirochus.scmc.entity.living.EntityZergling;
import com.hypeirochus.scmc.entity.living.EntityZerglingBoost;
import com.hypeirochus.scmc.entity.living.EntityZerglingPrimal1;
import com.hypeirochus.scmc.entity.living.EntityZerglingPrimal2;
import com.hypeirochus.scmc.entity.living.EntityZerglingPrimal3;
import com.hypeirochus.scmc.entity.living.EntityZerglingPrimalDehaka;
import com.hypeirochus.scmc.entity.living.EntityZerglingPrimalDehakaBoost;
import com.hypeirochus.scmc.entity.living.EntityZerglingRaptor;
import com.hypeirochus.scmc.entity.living.EntityZerglingSwarmling;
import com.hypeirochus.scmc.lib.Library;
import com.hypeirochus.scmc.tileentity.TileEntityBrambles;
import com.hypeirochus.scmc.tileentity.TileEntityEntitySpawner;
import com.hypeirochus.scmc.tileentity.TileEntityGasCollector;
import com.hypeirochus.scmc.tileentity.TileEntityPlanetTeleporter;
import com.hypeirochus.scmc.tileentity.TileEntityProtossFurnace;
import com.hypeirochus.scmc.tileentity.TileEntityProtossPowerCore;
import com.hypeirochus.scmc.tileentity.TileEntityProtossWormhole;
import com.hypeirochus.scmc.tileentity.TileEntitySolarCore;
import com.hypeirochus.scmc.tileentity.TileEntityStarcraftFurnace;
import com.hypeirochus.scmc.tileentity.TileEntityStarcraftSkull;
import com.hypeirochus.scmc.tileentity.TileEntityZerusGlowPod;
import com.hypeirochus.scmc.tileentity.TileEntityZerusLightcap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class EntityHandler {

	/** The current entity id */
	private static int entityID = 0;

	public static void pre(FMLPreInitializationEvent event) {
		registerEntities();
		registerTileEntities();
	}

	public static void init(FMLInitializationEvent event) {
		EntityHandler.registerSpawns();
		EntityHandler.generateSpawnEgg();
	}

	/**
	 * Generates the spawn eggs for the specified entities.
	 */
	public static void generateSpawnEgg() {
		EntityRegistry.registerEgg(EntityZealot.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityProbe.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityProtossReaver.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityVoidProbe.class, 1447446, 45824);
		EntityRegistry.registerEgg(EntityDarkProbe.class, 1447446, 13369344);

		EntityRegistry.registerEgg(EntityDarkTemplar.class, 5066061, 45824);
		EntityRegistry.registerEgg(EntityZeratul.class, 5066061, 45824);

		EntityRegistry.registerEgg(EntityBrutalisk.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityHydralisk.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZergling.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZerglingRaptor.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZerglingSwarmling.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZerglingBoost.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityLarva.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityLarvaCocoon.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityBroodling.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityInfestedCivilian.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityQueen.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityNafash.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityMutalisk.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityMutaliskBroodlord.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityMutaliskViper.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityMutaliskPrimal.class, 6986824, 65535);
		EntityRegistry.registerEgg(EntityZerglingPrimal1.class, 6986824, 65535);
		EntityRegistry.registerEgg(EntityZerglingPrimal2.class, 6986824, 65535);
		EntityRegistry.registerEgg(EntityZerglingPrimal3.class, 6986824, 65535);
		EntityRegistry.registerEgg(EntityHydraliskPrimal.class, 6986824, 65535);
		EntityRegistry.registerEgg(EntityBrakk.class, 6986824, 65535);
		EntityRegistry.registerEgg(EntityTyrannozor.class, 6986824, 65535);
		EntityRegistry.registerEgg(EntityMutaliskPrimalDehaka.class, 8952745, 15066368);
		EntityRegistry.registerEgg(EntityTyrannozorDehaka.class, 8952745, 15066368);
		EntityRegistry.registerEgg(EntityZerglingPrimalDehaka.class, 8952745, 15066368);
		EntityRegistry.registerEgg(EntityZerglingPrimalDehakaBoost.class, 8952745, 15066368);
		EntityRegistry.registerEgg(EntityHydraliskPrimalDehaka.class, 8952745, 15066368);

		EntityRegistry.registerEgg(EntityCivilian.class, 7566195, 16639);
		EntityRegistry.registerEgg(EntityPredator.class, 7566195, 16639);
		EntityRegistry.registerEgg(EntityMarine.class, 7566195, 16639);
		EntityRegistry.registerEgg(EntityJimRaynor.class, 7566195, 16639);

		EntityRegistry.registerEgg(EntityTastelope.class, 6847625, 13157029);
		EntityRegistry.registerEgg(EntityArtosilope.class, 4226620, 12038721);
		EntityRegistry.registerEgg(EntityKakaru.class, 6632556, 14183716);
		EntityRegistry.registerEgg(EntityUrsadon.class, 13686740, 8175830);
		EntityRegistry.registerEgg(EntityUrsadonMatriarch.class, 13686740, 15296610);
	}

	private static void registerTileEntities() {
		registerTileEntity(TileEntityGasCollector.class);
		registerTileEntity(TileEntityProtossPowerCore.class);
		registerTileEntity(TileEntityProtossWormhole.class);
		registerTileEntity(TileEntityStarcraftSkull.class);
		registerTileEntity(TileEntityStarcraftFurnace.class);
		registerTileEntity(TileEntityProtossFurnace.class);
		registerTileEntity(TileEntityEntitySpawner.class);
		registerTileEntity(TileEntityPlanetTeleporter.class);
		registerTileEntity(TileEntitySolarCore.class);
		registerTileEntity(TileEntityZerusGlowPod.class);
		registerTileEntity(TileEntityBrambles.class);
		registerTileEntity(TileEntityZerusLightcap.class);
	}

	/**
	 * Registers the specified entities.
	 */
	private static void registerEntities() {
		registerEntity(EntityZealot.class, "zealot", 64, 1, true);
		registerEntity(EntityProtossReaver.class, "protossReaver", 64, 1, true);
		registerEntity(EntityScarab.class, "scarab", 64, 1, true);
		registerEntity(EntityProbe.class, "probe", 64, 1, true);
		registerEntity(EntityDarkTemplar.class, "darkTemplar", 64, 1, true);
		registerEntity(EntityVoidProbe.class, "voidProbe", 64, 1, true);
		registerEntity(EntityDarkProbe.class, "darkProbe", 64, 1, true);
		registerEntity(EntityZeratul.class, "zeratul", 64, 1, true);

		registerEntity(EntityBrutalisk.class, "brutalisk", 64, 1, true);
		registerEntity(EntityHydralisk.class, "hydralisk", 64, 1, true);
		registerEntity(EntityZergling.class, "zerglingSC2", 64, 1, true);
		registerEntity(EntityZerglingRaptor.class, "zerglingRaptor", 64, 1, true);
		registerEntity(EntityZerglingSwarmling.class, "zerglingSwarmling", 64, 1, true);
		registerEntity(EntityZerglingBoost.class, "zerglingBoost", 64, 1, true);
		registerEntity(EntityLarva.class, "larva", 64, 1, true);
		registerEntity(EntityLarvaCocoon.class, "larvaCocoon", 64, 1, true);
		registerEntity(EntityBroodling.class, "broodling", 64, 1, true);
		registerEntity(EntityInfestedCivilian.class, "infestedCivilian", 64, 1, true);
		registerEntity(EntityQueen.class, "queen", 64, 1, true);
		registerEntity(EntityNafash.class, "nafash", 64, 1, true);
		registerEntity(EntityMutalisk.class, "mutalisk", 64, 1, true);
		registerEntity(EntityMutaliskBroodlord.class, "mutaliskBroodlord", 64, 1, true);
		registerEntity(EntityMutaliskPrimal.class, "mutaliskPrimal", 64, 1, true);
		registerEntity(EntityMutaliskViper.class, "mutaliskViper", 64, 1, true);
		registerEntity(EntityZerglingPrimal1.class, "zerglingPrimal1", 64, 1, true);
		registerEntity(EntityZerglingPrimal2.class, "zerglingPrimal2", 64, 1, true);
		registerEntity(EntityZerglingPrimal3.class, "zerglingPrimal3", 64, 1, true);
		registerEntity(EntityHydraliskPrimal.class, "hydraliskPrimal", 64, 1, true);
		registerEntity(EntityTyrannozor.class, "tyrannozor", 64, 1, true);
		registerEntity(EntityBrakk.class, "brakk", 64, 1, true);
		registerEntity(EntityMutaliskPrimalDehaka.class, "mutaliskPrimalDehaka", 64, 1, true);
		registerEntity(EntityTyrannozorDehaka.class, "tyrannozorDehaka", 64, 1, true);
		registerEntity(EntityZerglingPrimalDehaka.class, "zerglingPrimalDehaka", 64, 1, true);
		registerEntity(EntityZerglingPrimalDehakaBoost.class, "zerglingPrimalDehakaBoost", 64, 1, true);
		registerEntity(EntityHydraliskPrimalDehaka.class, "hydraliskPrimalDehaka", 64, 1, true);

		registerEntity(EntityCivilian.class, "civilian", 64, 1, true);
		registerEntity(EntityPredator.class, "predator", 64, 1, true);
		registerEntity(EntityMarine.class, "marine", 64, 1, true);
		registerEntity(EntityJimRaynor.class, "jimRaynor", 64, 1, true);

		registerEntity(EntityC14GaussRifleBullet.class, "c14GaussRifleBullet", 64, 1, true);
		registerEntity(EntityHydraliskSpike.class, "HydraliskSpike", 64, 1, true);
		registerEntity(EntityMutaliskGlaiveWurm.class, "MutaliskGlaiveWurm", 64, 1, true);
		registerEntity(EntityFlamethrowerFlame.class, "flamethrowerFlame", 64, 1, true);

		registerEntity(EntityArtosilope.class, "artosilope", 64, 1, true);
		registerEntity(EntityTastelope.class, "tastelope", 64, 1, true);
		registerEntity(EntityKakaru.class, "kakaru", 64, 1, true);
		registerEntity(EntityUrsadon.class, "ursadon", 64, 1, true);
		registerEntity(EntityUrsadonMatriarch.class, "ursadonMatriarch", 64, 1, true);
	}

	/**
	 * Adds the entity's spawn location.
	 */
	public static void registerSpawns() {
		EntityRegistry.addSpawn(EntityZealot.class, 25, 1, 2, EnumCreatureType.MONSTER, BiomeHandler.biomeShakurasProtossCity, BiomeHandler.biomeKaldirProtossCity);
		EntityRegistry.addSpawn(EntityProbe.class, 7, 1, 3, EnumCreatureType.CREATURE, BiomeHandler.biomeShakurasProtossCity, BiomeHandler.biomeKaldirProtossCity);
		EntityRegistry.addSpawn(EntityProtossReaver.class, 1, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeShakurasProtossCity, BiomeHandler.biomeKaldirProtossCity);

		EntityRegistry.addSpawn(EntityDarkTemplar.class, 15, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeShakurasProtossCity);
		EntityRegistry.addSpawn(EntityVoidProbe.class, 7, 1, 3, EnumCreatureType.CREATURE, BiomeHandler.biomeShakurasProtossCity);

		EntityRegistry.addSpawn(EntityDarkProbe.class, 7, 1, 3, EnumCreatureType.CREATURE, BiomeHandler.biomeSlaynProtossCity);

		EntityRegistry.addSpawn(EntityBrutalisk.class, 1, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);
		EntityRegistry.addSpawn(EntityHydralisk.class, 9, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);
		EntityRegistry.addSpawn(EntityZergling.class, 25, 1, 5, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);
		EntityRegistry.addSpawn(EntityZerglingRaptor.class, 10, 1, 5, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);
		EntityRegistry.addSpawn(EntityZerglingSwarmling.class, 10, 1, 5, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);
		EntityRegistry.addSpawn(EntityZerglingBoost.class, 10, 1, 5, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);
		EntityRegistry.addSpawn(EntityLarva.class, 5, 1, 3, EnumCreatureType.CREATURE, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);
		EntityRegistry.addSpawn(EntityInfestedCivilian.class, 5, 1, 3, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);
		EntityRegistry.addSpawn(EntityQueen.class, 5, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive);

		EntityRegistry.addSpawn(EntityMutalisk.class, 5, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive, BiomeHandler.biomeSpace);
		EntityRegistry.addSpawn(EntityMutaliskBroodlord.class, 5, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive, BiomeHandler.biomeSpace);
		EntityRegistry.addSpawn(EntityMutaliskViper.class, 5, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeCharZergHive, BiomeHandler.biomeKaldirZergHive, BiomeHandler.biomeSpace);

		EntityRegistry.addSpawn(EntityCivilian.class, 10, 1, 3, EnumCreatureType.CREATURE, BiomeHandler.biomeKorhalTerranCity);
		EntityRegistry.addSpawn(EntityPredator.class, 10, 1, 3, EnumCreatureType.MONSTER, BiomeHandler.biomeKorhalTerranCity);
		EntityRegistry.addSpawn(EntityMarine.class, 10, 1, 3, EnumCreatureType.MONSTER, BiomeHandler.biomeKorhalTerranCity);

		EntityRegistry.addSpawn(EntityZerglingPrimal1.class, 15, 1, 3, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityZerglingPrimal2.class, 15, 1, 3, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityZerglingPrimal3.class, 15, 1, 3, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityTyrannozor.class, 1, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityZerglingPrimalDehaka.class, 15, 1, 6, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityZerglingPrimalDehakaBoost.class, 15, 1, 6, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityTyrannozorDehaka.class, 1, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityMutaliskPrimalDehaka.class, 5, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityHydraliskPrimalDehaka.class, 10, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityMutaliskPrimal.class, 20, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);
		EntityRegistry.addSpawn(EntityHydraliskPrimal.class, 20, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeZerusJungle);

		EntityRegistry.addSpawn(EntityKakaru.class, 7, 1, 1, EnumCreatureType.CREATURE, BiomeHandler.biomeShakurasHills, BiomeHandler.biomeShakurasMountains);

		EntityRegistry.addSpawn(EntityTastelope.class, 7, 1, 1, EnumCreatureType.CREATURE, BiomeHandler.biomeKaldirIcePlains, BiomeHandler.biomeKaldirSnowPlains);
		EntityRegistry.addSpawn(EntityUrsadon.class, 15, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeKaldirIcePlains, BiomeHandler.biomeKaldirSnowPlains);
		EntityRegistry.addSpawn(EntityUrsadonMatriarch.class, 7, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeKaldirIcePlains, BiomeHandler.biomeKaldirSnowPlains);

	}

	/**
	 * Registers an entity.
	 * 
	 * @param entityClass
	 *            The entity class
	 * @param entityName
	 *            A unique name for the entity
	 * @param trackingRange
	 *            The range at which MC will send tracking updates
	 * @param updateFrequency
	 *            The frequency of tracking updates
	 * @param sendsVelocityUpdates
	 *            Whether to send velocity information packets as well
	 */
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(entityClass, entityName, entityID++, Starcraft.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}

	private static void registerTileEntity(Class<? extends TileEntity> clazz) {
		GameRegistry.registerTileEntity(clazz, Library.RL_BASE + clazz.getSimpleName());
	}
}