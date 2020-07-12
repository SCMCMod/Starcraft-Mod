package com.arpaesis.scmc.handlers;

import java.util.ArrayList;
import java.util.List;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.items.ItemC14GaussRifle;
import com.arpaesis.scmc.items.ItemDust;
import com.arpaesis.scmc.items.ItemEnergy;
import com.arpaesis.scmc.items.ItemFlamethrower;
import com.arpaesis.scmc.items.ItemGasContainer;
import com.arpaesis.scmc.items.ItemGunParts;
import com.arpaesis.scmc.items.ItemIcon;
import com.arpaesis.scmc.items.ItemIngot;
import com.arpaesis.scmc.items.ItemKhaydarinCrystal;
import com.arpaesis.scmc.items.ItemMagazine;
import com.arpaesis.scmc.items.ItemMineralShard;
import com.arpaesis.scmc.items.ItemProtossIngot;
import com.arpaesis.scmc.items.ItemProtossUpgrade;
import com.arpaesis.scmc.items.ItemPsiBladeFocuserUncharged;
import com.arpaesis.scmc.items.ItemSolariteReaper;
import com.arpaesis.scmc.items.ItemStimpack;
import com.arpaesis.scmc.items.ItemTerrazine;
import com.arpaesis.scmc.items.ItemTest;
import com.arpaesis.scmc.items.ItemVespene;
import com.arpaesis.scmc.items.ItemZergCarapace;
import com.arpaesis.scmc.items.SCItem;

import net.minecraft.item.Item;

public class ItemHandler
{

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

	private static void init()
	{
		items = new ArrayList<Item>();

		instantiate();

		WeaponHandler.init();
		ToolHandler.init();
		ArmorHandler.init();
	}

	private static void instantiate()
	{
		TEST = new ItemTest();

		// Vespene/Terrazine/Gas Container
		GAS_CONTAINER = new ItemGasContainer();
		VESPENE = new ItemVespene();
		TERRAZINE = new ItemTerrazine();

		// Misc
		MINERAL_SHARD = new ItemMineralShard();
		PHOSPHORUS = new SCItem("phosphorus").setCreativeTab(SCCreativeTabs.MISC);
		ENERGY = new ItemEnergy();
		DUST = new ItemDust();
		PLEDGE = new SCItem("pledge").setCreativeTab(SCCreativeTabs.MISC);
		INGOT = new ItemIngot();
		// TODO: This item crashes serverside, something related to sound. Add it back
		// once we get around to carbotifying.
		// CARBOTIFIER = new ItemCarbotifier();

		// Protoss
		PROTOSS_INGOT = new ItemProtossIngot();
		PSI_BLADE_FOCUSER_UNCHARGED = new ItemPsiBladeFocuserUncharged();
		PROTOSS_UPGRADE = new ItemProtossUpgrade();
		KHAYDARIN_CRYSTAL = new ItemKhaydarinCrystal();

		// Terran
		STIMPACK = new ItemStimpack();
		MARINE_HELMET_VISOR = new SCItem("terran.marine.helmet.visor").setCreativeTab(SCCreativeTabs.TERRAN);

		// Terran Weapons
		C14_GAUSS_RIFLE = new ItemC14GaussRifle();
		C14_GAUSS_RIFLE_PARTS = new ItemGunParts("terran.riflec14.part", 3).setCreativeTab(SCCreativeTabs.TERRAN);
		FLAMETHROWER = new ItemFlamethrower();
		FLAMETHROWER_PARTS = new ItemGunParts("terran.flamethrower.part", 4).setCreativeTab(SCCreativeTabs.TERRAN);
		SOLARITE_REAPER = new ItemSolariteReaper();
		BULLET_MAGAZINE = new ItemMagazine();

		// Zerg
		ZERG_CARAPACE = new ItemZergCarapace();
		CREEP_RESIN = new SCItem("zerg.creepresin").setCreativeTab(SCCreativeTabs.ZERG);
		ORGANIC_TISSUE = new SCItem("zerg.tissue").setCreativeTab(SCCreativeTabs.ZERG);
		BIOMASS = new SCItem("biomass").setCreativeTab(SCCreativeTabs.ZERG);

		// Tab Icons
		ICON = new ItemIcon();

	}

	/**
	 * Registers an item.
	 * 
	 * @param item The item to register
	 */
	public static void register(Item item)
	{
		items.add(item);
	}

	/**
	 * Used for registry.
	 * 
	 * @return The list of items to be registered
	 */
	public static Item[] getItems()
	{
		if (items == null)
			init();
		return items.toArray(new Item[items.size()]);
	}
}