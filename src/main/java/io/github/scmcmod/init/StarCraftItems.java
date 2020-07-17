package io.github.scmcmod.init;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.items.*;
import net.minecraft.item.Item;
import net.rom.registry.ReadOnlyRegistry;

public class StarCraftItems {

	public static final Item TEST = new ItemTest();

	// Vespene/Terrazine/Gas Container
	public static final Item GAS_CONTAINER = new ItemGasContainer();
	public static final Item VESPENE = new ItemVespene();
	public static final Item TERRAZINE = new ItemTerrazine();

	// Misc
	public static final Item MINERAL_SHARD = new ItemMineralShard();
	public static final Item PHOSPHORUS = new SCItem("phosphorus").setCreativeTab(SCCreativeTabs.MISC);
	public static final Item ENERGY = new ItemEnergy();
	public static final Item DUST = new ItemDust();
	public static final Item PLEDGE = new SCItem("pledge").setCreativeTab(SCCreativeTabs.MISC);
	public static final Item INGOT = new ItemIngot();
//	public static final Item CARBOTIFIER;
//	public static final Item LOG;

	// Protoss
	public static final Item PROTOSS_INGOT = new ItemProtossIngot();
	public static final Item PSI_BLADE_FOCUSER_UNCHARGED = new ItemPsiBladeFocuserUncharged();
	public static final Item PROTOSS_UPGRADE = new ItemProtossUpgrade();
	public static final Item KHAYDARIN_CRYSTAL = new ItemKhaydarinCrystal();
//	public static final Item PROTOSS_STRUCTURE_SPAWNER;

	// Terran
	public static final Item STIMPACK = new ItemStimpack();
	public static final Item MARINE_HELMET_VISOR = new SCItem("terran.marine.helmet.visor").setCreativeTab(SCCreativeTabs.TERRAN);
//	public static final Item TERRAN_STRUCTURE_SPAWNER;

	// Terran Weapons
	public static final ItemC14GaussRifle C14_GAUSS_RIFLE = new ItemC14GaussRifle();
	public static final ItemGunParts C14_GAUSS_RIFLE_PARTS = new ItemGunParts("terran.riflec14.part", 3).setCreativeTab(SCCreativeTabs.TERRAN);
	public static final ItemFlamethrower FLAMETHROWER = new ItemFlamethrower();
	public static final ItemGunParts FLAMETHROWER_PARTS = new ItemGunParts("terran.flamethrower.part", 4).setCreativeTab(SCCreativeTabs.TERRAN);
	public static final ItemSolariteReaper SOLARITE_REAPER = new ItemSolariteReaper();
	public static final Item BULLET_MAGAZINE = new ItemMagazine();

	// Zerg
	public static final Item ZERG_CARAPACE = new ItemZergCarapace();
	public static final Item CREEP_RESIN = new SCItem("zerg.creepresin").setCreativeTab(SCCreativeTabs.ZERG);
	public static final Item ORGANIC_TISSUE = new SCItem("zerg.tissue").setCreativeTab(SCCreativeTabs.ZERG);
	public static final Item BIOMASS = new SCItem("biomass").setCreativeTab(SCCreativeTabs.ZERG);
//	public static final Item ZERG_STRUCTURE_SPAWNER;

	// Tab Icons
	public static final Item ICON = new ItemIcon();

	// Testing
//	public static Item TERRAN_POWER_CELL;

	public static void registerAll(ReadOnlyRegistry registry) {
		registry.registerItem(TEST, "test.item");
		registry.registerItem(GAS_CONTAINER, "container");
		registry.registerItem(VESPENE, "vespene");
		registry.registerItem(TERRAZINE, "terrazine");
		registry.registerItem(MINERAL_SHARD, "mineral");
		registry.registerItem(PHOSPHORUS, "phosphorus");
		registry.registerItem(ENERGY, "energy");
		registry.registerItem(DUST, "dust");
		registry.registerItem(PLEDGE, "pledge");
		registry.registerItem(PLEDGE, "ingot");
		registry.registerItem(PROTOSS_INGOT, "protoss.ingot");
		registry.registerItem(PSI_BLADE_FOCUSER_UNCHARGED, "protoss.focuser");
		registry.registerItem(PROTOSS_UPGRADE, "protoss.upgrade");
		registry.registerItem(KHAYDARIN_CRYSTAL, "protoss.khaydarincrystal");
		registry.registerItem(STIMPACK, "stimpack");
		registry.registerItem(MARINE_HELMET_VISOR, "terran.marine.helmet.visor");
		registry.registerItem(C14_GAUSS_RIFLE, "terran.riflec14");
		registry.registerItem(C14_GAUSS_RIFLE_PARTS, "terran.riflec14.part");
		registry.registerItem(FLAMETHROWER, "terran.flamethrower");
		registry.registerItem(FLAMETHROWER_PARTS, "terran.flamethrower.part");
		registry.registerItem(SOLARITE_REAPER, "protoss.weapon.solaritereaper");
		registry.registerItem(BULLET_MAGAZINE, "terran.magazine");
		registry.registerItem(ZERG_CARAPACE, "zerg.icarapace");
		registry.registerItem(CREEP_RESIN, "zerg.creepresin");
		registry.registerItem(ORGANIC_TISSUE, "zerg.tissue");
		registry.registerItem(BIOMASS, "biomass");
		registry.registerItem(ICON, "icon");
	}

}
