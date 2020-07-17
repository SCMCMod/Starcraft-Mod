package io.github.scmcmod.handlers;

import java.util.ArrayList;
import java.util.List;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.items.ItemC14GaussRifle;
import io.github.scmcmod.items.ItemDust;
import io.github.scmcmod.items.ItemEnergy;
import io.github.scmcmod.items.ItemFlamethrower;
import io.github.scmcmod.items.ItemGasContainer;
import io.github.scmcmod.items.ItemGunParts;
import io.github.scmcmod.items.ItemIcon;
import io.github.scmcmod.items.ItemIngot;
import io.github.scmcmod.items.ItemKhaydarinCrystal;
import io.github.scmcmod.items.ItemMagazine;
import io.github.scmcmod.items.ItemMineralShard;
import io.github.scmcmod.items.ItemProtossIngot;
import io.github.scmcmod.items.ItemProtossUpgrade;
import io.github.scmcmod.items.ItemPsiBladeFocuserUncharged;
import io.github.scmcmod.items.ItemSolariteReaper;
import io.github.scmcmod.items.ItemStimpack;
import io.github.scmcmod.items.ItemTerrazine;
import io.github.scmcmod.items.ItemTest;
import io.github.scmcmod.items.ItemVespene;
import io.github.scmcmod.items.ItemZergCarapace;
import io.github.scmcmod.items.SCItem;
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
//		items = new ArrayList<Item>();
//
//		instantiate();
//
//		WeaponHandler.init();
//		ToolHandler.init();
//		ArmorHandler.init();
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
