package io.github.scmcmod.handlers;

import java.util.ArrayList;
import java.util.List;

import io.github.scmcmod.SCConstants;
import io.github.scmcmod.Starcraft;
import io.github.scmcmod.entity.EntityHydraliskSpike;
import io.github.scmcmod.entity.EntityMutaliskGlaiveWurm;
import io.github.scmcmod.entity.living.EntityArtosilope;
import io.github.scmcmod.entity.living.EntityBrakk;
import io.github.scmcmod.entity.living.EntityBroodling;
import io.github.scmcmod.entity.living.EntityBrutalisk;
import io.github.scmcmod.entity.living.EntityCivilian;
import io.github.scmcmod.entity.living.EntityDarkProbe;
import io.github.scmcmod.entity.living.EntityDarkTemplar;
import io.github.scmcmod.entity.living.EntityHydralisk;
import io.github.scmcmod.entity.living.EntityHydraliskPrimal;
import io.github.scmcmod.entity.living.EntityHydraliskPrimalDehaka;
import io.github.scmcmod.entity.living.EntityInfestedCivilian;
import io.github.scmcmod.entity.living.EntityJimRaynor;
import io.github.scmcmod.entity.living.EntityKakaru;
import io.github.scmcmod.entity.living.EntityLarva;
import io.github.scmcmod.entity.living.EntityLarvaCocoon;
import io.github.scmcmod.entity.living.EntityMarine;
import io.github.scmcmod.entity.living.EntityMutalisk;
import io.github.scmcmod.entity.living.EntityMutaliskBroodlord;
import io.github.scmcmod.entity.living.EntityMutaliskPrimal;
import io.github.scmcmod.entity.living.EntityMutaliskPrimalDehaka;
import io.github.scmcmod.entity.living.EntityMutaliskViper;
import io.github.scmcmod.entity.living.EntityNafash;
import io.github.scmcmod.entity.living.EntityPredator;
import io.github.scmcmod.entity.living.EntityProbe;
import io.github.scmcmod.entity.living.EntityProtossReaver;
import io.github.scmcmod.entity.living.EntityPurifierProbe;
import io.github.scmcmod.entity.living.EntityQueen;
import io.github.scmcmod.entity.living.EntityScarab;
import io.github.scmcmod.entity.living.EntityTastelope;
import io.github.scmcmod.entity.living.EntityTyrannozor;
import io.github.scmcmod.entity.living.EntityTyrannozorDehaka;
import io.github.scmcmod.entity.living.EntityUrsadon;
import io.github.scmcmod.entity.living.EntityUrsadonMatriarch;
import io.github.scmcmod.entity.living.EntityVoidProbe;
import io.github.scmcmod.entity.living.EntityZealot;
import io.github.scmcmod.entity.living.EntityZeratul;
import io.github.scmcmod.entity.living.EntityZergling;
import io.github.scmcmod.entity.living.EntityZerglingBoost;
import io.github.scmcmod.entity.living.EntityZerglingPrimal1;
import io.github.scmcmod.entity.living.EntityZerglingPrimal2;
import io.github.scmcmod.entity.living.EntityZerglingPrimal3;
import io.github.scmcmod.entity.living.EntityZerglingPrimalDehaka;
import io.github.scmcmod.entity.living.EntityZerglingPrimalDehakaBoost;
import io.github.scmcmod.entity.living.EntityZerglingRaptor;
import io.github.scmcmod.entity.living.EntityZerglingSwarmling;
import io.github.scmcmod.entity.vehicles.EntityScout;
import io.github.scmcmod.entity.vehicles.EntityWraith;
import io.github.scmcmod.tileentity.TileEntityBrambles;
import io.github.scmcmod.tileentity.TileEntityEntitySpawner;
import io.github.scmcmod.tileentity.TileEntityGasCollector;
import io.github.scmcmod.tileentity.TileEntityPlanetTeleporter;
import io.github.scmcmod.tileentity.TileEntityProtossFurnace;
import io.github.scmcmod.tileentity.TileEntityProtossPowerCore;
import io.github.scmcmod.tileentity.TileEntityProtossWormhole;
import io.github.scmcmod.tileentity.TileEntitySolarCore;
import io.github.scmcmod.tileentity.TileEntityStarcraftFurnace;
import io.github.scmcmod.tileentity.TileEntityStarcraftSkull;
import io.github.scmcmod.tileentity.TileEntityZerusGlowPod;
import io.github.scmcmod.tileentity.TileEntityZerusLightcap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Handles all the entities and tile entities in Starcraft.
 * 
 * @author Ocelot5836
 */
public class EntityHandler
{

	private static List<Class<? extends TileEntity>> tileEntities;

	/** The current entity id */
	private static int entityID = 0;

	public static void pre(FMLPreInitializationEvent event)
	{
		registerEntities();
	}

	public static void init(FMLInitializationEvent event)
	{
		registerTileEntities();
		registerSpawns();
	}

	/**
	 * A temporary method until an event for registering tile entities is added.
	 */
	private static void registerTileEntities()
	{
		Class<? extends TileEntity>[] tileEntities = getTileEntities();
		for (int i = 0; i < tileEntities.length; i++)
		{
			GameRegistry.registerTileEntity(tileEntities[i], new ResourceLocation(SCConstants.MODID, tileEntities[i].getSimpleName()));
		}
	}

	private static void init()
	{
		tileEntities = new ArrayList<Class<? extends TileEntity>>();

		instantiateTileEntities();
	}

	private static void instantiateTileEntities()
	{
		registerTileEntity(TileEntityBrambles.class);
		registerTileEntity(TileEntityEntitySpawner.class);
		registerTileEntity(TileEntityGasCollector.class);
		registerTileEntity(TileEntityPlanetTeleporter.class);
		registerTileEntity(TileEntityProtossFurnace.class);
		registerTileEntity(TileEntityProtossPowerCore.class);
		registerTileEntity(TileEntityProtossWormhole.class);
		registerTileEntity(TileEntitySolarCore.class);
		registerTileEntity(TileEntitySolarCore.class);
		registerTileEntity(TileEntityStarcraftFurnace.class);
		registerTileEntity(TileEntityStarcraftSkull.class);
		registerTileEntity(TileEntityZerusGlowPod.class);
		registerTileEntity(TileEntityZerusLightcap.class);
	}

	/**
	 * Registers the specified entities.
	 */
	private static void registerEntities()
	{
		registerEntity(EntityZealot.class, "zealot", 64, 1, true, 13022529, 2412228);
		registerEntity(EntityProtossReaver.class, "protossReaver", 64, 1, true, 13022529, 2412228);
		registerEntity(EntityScarab.class, "scarab", 64, 1, true);
		registerEntity(EntityProbe.class, "probe", 64, 1, true, 13022529, 2412228);
		registerEntity(EntityDarkTemplar.class, "darkTemplar", 64, 1, true, 5066061, 45824);
		registerEntity(EntityVoidProbe.class, "voidProbe", 64, 1, true, 1447446, 45824);

		registerEntity(EntityDarkProbe.class, "darkProbe", 64, 1, true, 1447446, 13369344);

		registerEntity(EntityPurifierProbe.class, "purifierProbe", 64, 1, true, 13092807, 16019722);

		registerEntity(EntityZeratul.class, "zeratul", 64, 1, true, 5066061, 45824);

		registerEntity(EntityBrutalisk.class, "brutalisk", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityHydralisk.class, "hydralisk", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityZergling.class, "zerglingSC2", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityZerglingRaptor.class, "zerglingRaptor", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityZerglingSwarmling.class, "zerglingSwarmling", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityZerglingBoost.class, "zerglingBoost", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityLarva.class, "larva", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityLarvaCocoon.class, "larvaCocoon", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityBroodling.class, "broodling", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityInfestedCivilian.class, "infestedCivilian", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityQueen.class, "queen", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityNafash.class, "nafash", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityMutalisk.class, "mutalisk", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityMutaliskBroodlord.class, "mutaliskBroodlord", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityMutaliskPrimal.class, "mutaliskPrimal", 64, 1, true, 6986824, 65535);
		registerEntity(EntityMutaliskViper.class, "mutaliskViper", 64, 1, true, 11403519, 7684608);
		registerEntity(EntityZerglingPrimal1.class, "zerglingPrimal1", 64, 1, true, 6986824, 65535);
		registerEntity(EntityZerglingPrimal2.class, "zerglingPrimal2", 64, 1, true, 6986824, 65535);
		registerEntity(EntityZerglingPrimal3.class, "zerglingPrimal3", 64, 1, true, 6986824, 65535);
		registerEntity(EntityHydraliskPrimal.class, "hydraliskPrimal", 64, 1, true, 6986824, 65535);
		registerEntity(EntityTyrannozor.class, "tyrannozor", 64, 1, true, 6986824, 65535);
		registerEntity(EntityBrakk.class, "brakk", 64, 1, true, 6986824, 65535);
		registerEntity(EntityMutaliskPrimalDehaka.class, "mutaliskPrimalDehaka", 64, 1, true, 8952745, 15066368);
		registerEntity(EntityTyrannozorDehaka.class, "tyrannozorDehaka", 64, 1, true, 8952745, 15066368);
		registerEntity(EntityZerglingPrimalDehaka.class, "zerglingPrimalDehaka", 64, 1, true, 8952745, 15066368);
		registerEntity(EntityZerglingPrimalDehakaBoost.class, "zerglingPrimalDehakaBoost", 64, 1, true, 8952745, 15066368);
		registerEntity(EntityHydraliskPrimalDehaka.class, "hydraliskPrimalDehaka", 64, 1, true, 8952745, 15066368);

		registerEntity(EntityCivilian.class, "civilian", 64, 1, true, 7566195, 16639);
		registerEntity(EntityPredator.class, "predator", 64, 1, true, 7566195, 16639);
		registerEntity(EntityMarine.class, "marine", 64, 1, true, 7566195, 16639);
		registerEntity(EntityJimRaynor.class, "jimRaynor", 64, 1, true, 7566195, 16639);

		registerEntity(EntityHydraliskSpike.class, "HydraliskSpike", 64, 1, true);
		registerEntity(EntityMutaliskGlaiveWurm.class, "MutaliskGlaiveWurm", 64, 1, true);

		registerEntity(EntityWraith.class, "wraith", 64, 1, true);
		registerEntity(EntityScout.class, "scout", 64, 1, true);

		registerEntity(EntityArtosilope.class, "artosilope", 64, 1, true, 4226620, 12038721);
		registerEntity(EntityTastelope.class, "tastelope", 64, 1, true, 6847625, 13157029);
		registerEntity(EntityKakaru.class, "kakaru", 64, 1, true, 6632556, 14183716);
		registerEntity(EntityUrsadon.class, "ursadon", 64, 1, true, 13686740, 8175830);
		registerEntity(EntityUrsadonMatriarch.class, "ursadonMatriarch", 64, 1, true, 13686740, 15296610);
	}

	/**
	 * Adds the entity's spawn location.
	 */
	public static void registerSpawns()
	{
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
		EntityRegistry.addSpawn(EntityArtosilope.class, 7, 1, 1, EnumCreatureType.CREATURE, BiomeHandler.biomeZerusJungle);

		EntityRegistry.addSpawn(EntityKakaru.class, 7, 1, 1, EnumCreatureType.CREATURE, BiomeHandler.biomeShakurasHills, BiomeHandler.biomeShakurasMountains);

		EntityRegistry.addSpawn(EntityTastelope.class, 7, 1, 1, EnumCreatureType.CREATURE, BiomeHandler.biomeKaldirIcePlains, BiomeHandler.biomeKaldirSnowPlains);
		EntityRegistry.addSpawn(EntityUrsadon.class, 15, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeKaldirIcePlains, BiomeHandler.biomeKaldirSnowPlains);
		EntityRegistry.addSpawn(EntityUrsadonMatriarch.class, 7, 1, 1, EnumCreatureType.MONSTER, BiomeHandler.biomeKaldirIcePlains, BiomeHandler.biomeKaldirSnowPlains);

	}

	/**
	 * Registers an entity.
	 * 
	 * @param entityClass The entity class
	 * @param entityName A unique name for the entity
	 * @param trackingRange The range at which MC will send tracking updates
	 * @param updateFrequency The frequency of tracking updates
	 * @param sendsVelocityUpdates Whether to send velocity information packets as
	 *        well
	 */
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(SCConstants.MODID + entityName), entityClass, entityName, entityID++, Starcraft.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}

	/**
	 * Registers an entity and an egg.
	 * 
	 * @param entityClass The entity class
	 * @param entityName A unique name for the entity
	 * @param trackingRange The range at which MC will send tracking updates
	 * @param updateFrequency The frequency of tracking updates
	 * @param sendsVelocityUpdates Whether to send velocity information packets as
	 *        well
	 * @param primaryColor The primary color for the egg
	 * @param secondaryColor The secondary color for the egg
	 */
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int primaryColor, int secondaryColor)
	{
		ResourceLocation name = new ResourceLocation(SCConstants.MODID + entityName);
		EntityRegistry.registerModEntity(name, entityClass, entityName, entityID++, Starcraft.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		EntityRegistry.registerEgg(name, primaryColor, secondaryColor);
	}

	/**
	 * Registers a tile entity.
	 * 
	 * @param te The tile entity to register
	 */
	public static void registerTileEntity(Class<? extends TileEntity> te)
	{
		tileEntities.add(te);
	}

	/**
	 * Used for registration.
	 * 
	 * @return The list of registered tile entities
	 */
	public static Class<? extends TileEntity>[] getTileEntities()
	{
		if (tileEntities == null)
			init();
		return tileEntities.toArray(new Class[tileEntities.size()]);
	}
}