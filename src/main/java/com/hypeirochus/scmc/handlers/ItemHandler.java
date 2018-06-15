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
import com.hypeirochus.scmc.items.ItemKhaydarinCrystal;
import com.hypeirochus.scmc.items.ItemLog;
import com.hypeirochus.scmc.items.ItemMagazine;
import com.hypeirochus.scmc.items.ItemMineralShard;
import com.hypeirochus.scmc.items.ItemProtossIngot;
import com.hypeirochus.scmc.items.ItemProtossUpgrade;
import com.hypeirochus.scmc.items.ItemPsiBladeFocuserUncharged;
import com.hypeirochus.scmc.items.ItemSolariteReaper;
import com.hypeirochus.scmc.items.ItemStimpack;
import com.hypeirochus.scmc.items.ItemTerrazine;
import com.hypeirochus.scmc.items.ItemTest;
import com.hypeirochus.scmc.items.ItemVespene;
import com.hypeirochus.scmc.items.ItemZergCarapace;
import com.hypeirochus.scmc.items.StarcraftItem;
import com.hypeirochus.scmc.items.structurespawner.ItemProtossStructureSpawner;
import com.hypeirochus.scmc.items.structurespawner.ItemTerranStructureSpawner;
import com.hypeirochus.scmc.items.structurespawner.ItemZergStructureSpawner;
import com.ruthless_bug13.rapi.api.energy.base.EnergyItem;

import net.minecraft.item.Item;

public class ItemHandler {

	public static List<Item> items;
	
	public static Item TEST;

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
	public static Item PROTOSS_UPGRADE;
	public static Item KHAYDARIN_CRYSTAL;
	public static Item PROTOSS_STRUCTURE_SPAWNER;

	// Terran
	public static Item STIMPACK;
	public static Item MARINE_HELMET_VISOR;
	public static Item TERRAN_STRUCTURE_SPAWNER;

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
	public static Item ZERG_STRUCTURE_SPAWNER;

	// Tab Icons
	public static Item ICON;
	
	// Testing
	public static Item TERRAN_POWER_CELL;

	private static void init() {
		items = new ArrayList<Item>();

		instantiate();

		WeaponHandler.init();
		ToolHandler.init();
		ArmorHandler.init();
	}

	private static void instantiate() {
		TEST = new ItemTest();
		
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
		PROTOSS_UPGRADE = new ItemProtossUpgrade();
		KHAYDARIN_CRYSTAL = new ItemKhaydarinCrystal();
		PROTOSS_STRUCTURE_SPAWNER = new ItemProtossStructureSpawner();

		// Terran
		STIMPACK = new ItemStimpack();
		MARINE_HELMET_VISOR = new StarcraftItem("terran.marine.helmet.visor").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TERRAN_STRUCTURE_SPAWNER = new ItemTerranStructureSpawner();

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
		ZERG_STRUCTURE_SPAWNER = new ItemZergStructureSpawner();

		// Tab Icons
		ICON = new ItemIcon();
		
		// Testing
		TERRAN_POWER_CELL = new EnergyItem("terran.powercell", 10000).setCreativeTab(StarcraftCreativeTabs.TERRAN);
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