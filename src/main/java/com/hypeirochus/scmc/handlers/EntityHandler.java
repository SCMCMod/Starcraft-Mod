package com.hypeirochus.scmc.handlers;

import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.Starcraft;
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

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Handles all the entities and tile entities in Starcraft.
 * 
 * @author Ocelot5836
 */
public class EntityHandler {

	private static List<Class<? extends TileEntity>> tileEntities;

	/**
	 * Initializes all the mod's entities and tile entities.
	 * 
	 * @param event
	 *            The forge event
	 */
	public static void init(FMLInitializationEvent event) {
		registerTileEntities();
	}

	/**
	 * A temporary method until an event for registering tile entities is added.
	 */
	private static void registerTileEntities() {
		Class[] tileEntities = getTileEntities();
		for (int i = 0; i < tileEntities.length; i++) {
			GameRegistry.registerTileEntity(tileEntities[i], Starcraft.RL_BASE + tileEntities[i].getSimpleName());
		}
	}

	private static void init() {
		tileEntities = new ArrayList<Class<? extends TileEntity>>();

		instantiateTileEntities();
	}

	private static void instantiateTileEntities() {
		register(TileEntityBrambles.class);
		register(TileEntityEntitySpawner.class);
		register(TileEntityGasCollector.class);
		register(TileEntityPlanetTeleporter.class);
		register(TileEntityProtossFurnace.class);
		register(TileEntityProtossPowerCore.class);
		register(TileEntityProtossWormhole.class);
		register(TileEntitySolarCore.class);
		register(TileEntitySolarCore.class);
		register(TileEntityStarcraftFurnace.class);
		register(TileEntityStarcraftSkull.class);
		register(TileEntityZerusGlowPod.class);
		register(TileEntityZerusLightcap.class);
	}

	/**
	 * Registers a tile entity.
	 * 
	 * @param te
	 *            The tile entity to register
	 */
	public static void register(Class te) {
		tileEntities.add(te);
	}

	/**
	 * Used for registration.
	 * 
	 * @return The list of registered tile entities
	 */
	public static Class<? extends TileEntity>[] getTileEntities() {
		if (tileEntities == null)
			init();
		return tileEntities.toArray(new Class[tileEntities.size()]);
	}
}