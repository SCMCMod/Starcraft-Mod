package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler {

	public static final ResourceLocation TERRAN_BUNKER = register("chests/terran_bunker");

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