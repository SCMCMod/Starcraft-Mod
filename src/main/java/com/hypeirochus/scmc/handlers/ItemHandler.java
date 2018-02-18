package com.hypeirochus.scmc.handlers;

import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.items.ItemC14GaussRifle;
import com.hypeirochus.scmc.items.ItemDust;
import com.hypeirochus.scmc.items.ItemEnergy;
import com.hypeirochus.scmc.items.ItemFlamethrower;
import com.hypeirochus.scmc.items.ItemGasContainer;
import com.hypeirochus.scmc.items.ItemIngot;
import com.hypeirochus.scmc.items.ItemMagazine;
import com.hypeirochus.scmc.items.ItemMineralShard;
import com.hypeirochus.scmc.items.ItemProtossIngot;
import com.hypeirochus.scmc.items.ItemSolariteReaper;
import com.hypeirochus.scmc.items.ItemTerrazine;
import com.hypeirochus.scmc.items.ItemVespene;
import com.hypeirochus.scmc.items.StarcraftItem;

import net.minecraft.item.Item;

public class ItemHandler {

	public static List<Item> items;

	public static Item MINERAL_SHARD;
	public static Item PHOSPHORUS;
	public static Item GAS_CONTAINER;
	public static Item VESPENE;
	public static Item TERRAZINE;
	public static Item ENERGY;
	public static Item DUST;
	public static Item INGOT;

	public static Item PROTOSS_INGOT;
	public static ItemC14GaussRifle C14_GAUSS_RIFLE;
	public static ItemFlamethrower FLAMETHROWER;
	public static ItemSolariteReaper SOLARITE_REAPER;
	public static Item BULLET_MAGAZINE;

	private static void init() {
		items = new ArrayList<Item>();

		instantiate();
	}

	private static void instantiate() {
		MINERAL_SHARD = new ItemMineralShard();
		PHOSPHORUS = new StarcraftItem("phosphorus").setCreativeTab(StarcraftCreativeTabs.MISC);

		GAS_CONTAINER = new ItemGasContainer();
		VESPENE = new ItemVespene();
		TERRAZINE = new ItemTerrazine();
		ENERGY = new ItemEnergy();
		DUST = new ItemDust();
		INGOT = new ItemIngot();
		PROTOSS_INGOT = new ItemProtossIngot();
		C14_GAUSS_RIFLE = new ItemC14GaussRifle();
		FLAMETHROWER = new ItemFlamethrower();
		SOLARITE_REAPER = new ItemSolariteReaper();
		BULLET_MAGAZINE = new ItemMagazine();
	}

	public static void register(Item item) {
		items.add(item);
	}

	/**
	 * Used for registry.
	 * 
	 * @return The list of items to be registered
	 */
	public static Item[] getItems() {
		if (items == null)
			init();
		return items.toArray(new Item[items.size()]);
	}
}