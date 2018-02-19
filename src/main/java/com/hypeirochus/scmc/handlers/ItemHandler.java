package com.hypeirochus.scmc.handlers;

import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.items.ItemC14GaussRifle;
import com.hypeirochus.scmc.items.ItemCarbotifier;
import com.hypeirochus.scmc.items.ItemDust;
import com.hypeirochus.scmc.items.ItemEnergy;
import com.hypeirochus.scmc.items.ItemFlamethrower;
import com.hypeirochus.scmc.items.ItemGasContainer;
import com.hypeirochus.scmc.items.ItemGunParts;
import com.hypeirochus.scmc.items.ItemIcon;
import com.hypeirochus.scmc.items.ItemIngot;
import com.hypeirochus.scmc.items.ItemLog;
import com.hypeirochus.scmc.items.ItemMagazine;
import com.hypeirochus.scmc.items.ItemMineralShard;
import com.hypeirochus.scmc.items.ItemProtossIngot;
import com.hypeirochus.scmc.items.ItemPsiBladeFocuserUncharged;
import com.hypeirochus.scmc.items.ItemSolariteReaper;
import com.hypeirochus.scmc.items.ItemStimpack;
import com.hypeirochus.scmc.items.ItemTerrazine;
import com.hypeirochus.scmc.items.ItemVespene;
import com.hypeirochus.scmc.items.ItemZergCarapace;
import com.hypeirochus.scmc.items.StarcraftItem;

import net.minecraft.item.Item;

public class ItemHandler {

	public static List<Item> items;

	// Vespene/Terrazine/Gas Container
	public static Item GAS_CONTAINER;
	public static Item VESPENE;
	public static Item TERRAZINE;

	// Misc
	public static Item MINERAL_SHARD;
	public static Item PHOSPHORUS;
	public static Item ENERGY;
	public static Item DUST;
	public static Item PLEDGE;
	public static Item INGOT;
	public static Item CARBOTIFIER;
	public static Item LOG;

	// Protoss
	public static Item PROTOSS_INGOT;
	public static Item PSI_BLADE_FOCUSER_UNCHARGED;

	// Terran
	public static Item STIMPACK;

	// Terran Weapons
	public static ItemC14GaussRifle C14_GAUSS_RIFLE;
	public static ItemGunParts C14_GAUSS_RIFLE_PARTS;
	public static ItemFlamethrower FLAMETHROWER;
	public static ItemGunParts FLAMETHROWER_PARTS;
	public static ItemSolariteReaper SOLARITE_REAPER;
	public static Item BULLET_MAGAZINE;

	// Zerg
	public static Item ZERG_CARAPACE;
	public static Item CREEP_RESIN;
	public static Item ORGANIC_TISSUE;
	public static Item BIOMASS;

	// Tab Icons
	public static Item ICON;

	private static void init() {
		items = new ArrayList<Item>();

		instantiate();
	}

	private static void instantiate() {
		// Vespene/Terrazine/Gas Container
		GAS_CONTAINER = new ItemGasContainer();
		VESPENE = new ItemVespene();
		TERRAZINE = new ItemTerrazine();

		// Misc
		MINERAL_SHARD = new ItemMineralShard();
		PHOSPHORUS = new StarcraftItem("phosphorus").setCreativeTab(StarcraftCreativeTabs.MISC);
		ENERGY = new ItemEnergy();
		DUST = new ItemDust();
		PLEDGE = new StarcraftItem("pledge").setCreativeTab(StarcraftCreativeTabs.MISC);
		INGOT = new ItemIngot();
		CARBOTIFIER = new ItemCarbotifier();
		LOG = new ItemLog();

		// Protoss
		PROTOSS_INGOT = new ItemProtossIngot();
		PSI_BLADE_FOCUSER_UNCHARGED = new ItemPsiBladeFocuserUncharged();

		// Terran
		STIMPACK = new ItemStimpack();

		// Terran Weapons
		C14_GAUSS_RIFLE = new ItemC14GaussRifle();
		C14_GAUSS_RIFLE_PARTS = new ItemGunParts("terran.riflec14.part", 3).setCreativeTab(StarcraftCreativeTabs.TERRAN);
		FLAMETHROWER = new ItemFlamethrower();
		FLAMETHROWER_PARTS = new ItemGunParts("terran.flamethrower.part", 4).setCreativeTab(StarcraftCreativeTabs.TERRAN);
		SOLARITE_REAPER = new ItemSolariteReaper();
		BULLET_MAGAZINE = new ItemMagazine();

		// Zerg
		ZERG_CARAPACE = new ItemZergCarapace();
		CREEP_RESIN = new StarcraftItem("zerg.creepresin").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ORGANIC_TISSUE = new StarcraftItem("zerg.tissue").setCreativeTab(StarcraftCreativeTabs.ZERG);
		BIOMASS = new StarcraftItem("biomass").setCreativeTab(StarcraftCreativeTabs.ZERG);

		// Tab Icons
		ICON = new ItemIcon();
	}

	/**
	 * Registers an item.
	 * 
	 * @param item
	 *            The item to register
	 */
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