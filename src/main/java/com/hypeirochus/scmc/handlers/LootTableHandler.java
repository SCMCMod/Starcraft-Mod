package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler {

	public static final ResourceLocation TERRAN_BUNKER = register("chests/terran_bunker");
	
	public static final ResourceLocation ENTITY_BRAKK = register("entities/zerg/brakk");
	public static final ResourceLocation ENTITY_BRUTALISK = register("entities/zerg/brutalisk");
	public static final ResourceLocation ENTITY_CIVILIAN = register("entities/terran/civilian");
	public static final ResourceLocation ENTITY_PROBE = register("entities/protoss/probe");
	public static final ResourceLocation ENTITY_PROBE_VOID = register("entities/protoss/probe_void");
	public static final ResourceLocation ENTITY_PROBE_DARK = register("entities/protoss/probe_dark");

	/**
	 * Register a {@link LootTable} with the specified ID.
	 *
	 * @param id
	 *            The ID of the LootTable without the testmod3: prefix
	 * @return The ID of the LootTable
	 */
	private static ResourceLocation register(String id) {
		return LootTableList.register(new ResourceLocation(Starcraft.MOD_ID, id));
	}
}