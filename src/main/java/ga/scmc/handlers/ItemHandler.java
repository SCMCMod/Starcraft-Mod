package ga.scmc.handlers;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.ItemC14GaussRifle;
import ga.scmc.items.ItemCarbotifier;
import ga.scmc.items.ItemFlamethrower;
import ga.scmc.items.ItemLog;
import ga.scmc.items.ItemMarineHelmetVisor;
import ga.scmc.items.ItemPhosphorus;
import ga.scmc.items.ItemSolariteReaper;
import ga.scmc.items.ItemStimpack;
import ga.scmc.items.ItemTest;
import ga.scmc.items.metaitems.ItemC14GaussRifleParts;
import ga.scmc.items.metaitems.ItemDust;
import ga.scmc.items.metaitems.ItemEnergy;
import ga.scmc.items.metaitems.ItemFlamethrowerParts;
import ga.scmc.items.metaitems.ItemGasContainer;
import ga.scmc.items.metaitems.ItemIngot;
import ga.scmc.items.metaitems.ItemKhaydarinCrystal;
import ga.scmc.items.metaitems.ItemMagazine;
import ga.scmc.items.metaitems.ItemMineralShard;
import ga.scmc.items.metaitems.ItemPledge;
import ga.scmc.items.metaitems.ItemProtossIngot;
import ga.scmc.items.metaitems.ItemProtossUpgrade;
import ga.scmc.items.metaitems.ItemPsiBladeFocuserUncharged;
import ga.scmc.items.metaitems.ItemTerrazine;
import ga.scmc.items.metaitems.ItemVespene;
import ga.scmc.items.metaitems.ItemZergCarapace;
import ga.scmc.items.structurespawns.ItemProtossCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkWarpGateSpawner;
import ga.scmc.items.structurespawns.ItemProtossPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidWarpGateSpawner;
import ga.scmc.items.structurespawns.ItemProtossWarpGateSpawner;
import ga.scmc.items.structurespawns.ItemTerranBarracksSpawner;
import ga.scmc.items.structurespawns.ItemTerranBunkerSpawner;
import ga.scmc.items.structurespawns.ItemTerranCommandCenterSpawner;
import ga.scmc.items.structurespawns.ItemZergHydraliskDenSpawner;
import ga.scmc.items.structurespawns.ItemZergSpawningPoolSpawner;
import ga.scmc.items.structurespawns.ItemZergSpireSpawner;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class ItemHandler {

	public static Item					MINERAL_SHARD							= new ItemMineralShard();
	public static Item					PHOSPHORUS								= new ItemPhosphorus();

	public static Item					GAS_CONTAINER							= new ItemGasContainer();
	public static Item					VESPENE									= new ItemVespene();
	public static Item					TERRAZINE								= new ItemTerrazine();

	public static Item					ENERGY									= new ItemEnergy();
	public static Item					DUST									= new ItemDust();
	public static Item					PLEDGE									= new ItemPledge();
	public static Item					INGOT									= new ItemIngot();
	public static Item					PROTOSS_INGOT							= new ItemProtossIngot();
	public static ItemC14GaussRifle		C14_GAUSS_RIFLE							= new ItemC14GaussRifle();
	public static ItemSolariteReaper	SOLARITE_REAPER							= new ItemSolariteReaper();
	public static Item					C14_PARTS								= new ItemC14GaussRifleParts();
	public static Item					FLAMETHROWER_PARTS						= new ItemFlamethrowerParts();
	public static ItemFlamethrower		FLAMETHROWER							= new ItemFlamethrower();
	public static Item					BULLET_MAGAZINE							= new ItemMagazine();
	public static Item					PSI_BLADE_FOCUSER_UNCHARGED				= new ItemPsiBladeFocuserUncharged();
	public static Item					ZERG_CARAPACE							= new ItemZergCarapace();
	public static Item					CREEP_RESIN								= new Item().setUnlocalizedName("zerg.creepresin").setRegistryName("zerg.creepresin").setCreativeTab(StarcraftCreativeTabs.ZERG);
	public static Item					ORGANIC_TISSUE							= new Item().setUnlocalizedName("zerg.tissue").setRegistryName("zerg.tissue").setCreativeTab(StarcraftCreativeTabs.ZERG);
	public static Item					BIOMASS									= new Item().setUnlocalizedName("biomass").setRegistryName("biomass").setCreativeTab(StarcraftCreativeTabs.ZERG);

	public static Item					NUCLEAR_MISSILE							= new Item().setUnlocalizedName("terran.nuclearmisile").setRegistryName("terran.nuclearmisile").setCreativeTab(StarcraftCreativeTabs.TERRAN);
	public static Item					STIMPACK								= new ItemStimpack();
	public static Item					CARBOTIFIER								= new ItemCarbotifier();
	public static Item					LOG										= new ItemLog();

	public static Item					PROTOSS_UPGRADE							= new ItemProtossUpgrade();
	public static Item					MARINE_HELMET_VISOR						= new ItemMarineHelmetVisor();

	public static Item					KHAYDARIN_CRYSTAL						= new ItemKhaydarinCrystal();

	public static Item					SPAWNER_PROTOSS_DARK_CYBERNETICSCORE	= new ItemProtossDarkCyberneticsCoreSpawner();
	public static Item					SPAWNER_PROTOSS_VOID_CYBERNETICSCORE	= new ItemProtossVoidCyberneticsCoreSpawner();
	public static Item					SPAWNER_PROTOSS_CYBERNETICSCORE			= new ItemProtossCyberneticsCoreSpawner();
	public static Item					SPAWNER_PROTOSS_DARK_PYLON				= new ItemProtossDarkPylonSpawner();
	public static Item					SPAWNER_PROTOSS_VOID_PYLON				= new ItemProtossVoidPylonSpawner();
	public static Item					SPAWNER_PROTOSS_PYLON					= new ItemProtossPylonSpawner();
	public static Item					SPAWNER_PROTOSS_DARK_WARPGATE			= new ItemProtossDarkWarpGateSpawner();
	public static Item					SPAWNER_PROTOSS_VOID_WARPGATE			= new ItemProtossVoidWarpGateSpawner();
	public static Item					SPAWNER_PROTOSS_WARPGATE				= new ItemProtossWarpGateSpawner();

	public static Item					SPAWNER_TERRAN_BUNKER					= new ItemTerranBunkerSpawner();
	public static Item					SPAWNER_TERRAN_BARRACKS					= new ItemTerranBarracksSpawner();
	public static Item					SPAWNER_TERRAN_COMMAND_CENTER			= new ItemTerranCommandCenterSpawner();

	public static Item					SPAWNER_ZERG_SPAWNINGPOOL				= new ItemZergSpawningPoolSpawner();
	public static Item					SPAWNER_ZERG_SPIRE						= new ItemZergSpireSpawner();
	public static Item					SPAWNER_ZERG_HYDRALISKDEN				= new ItemZergHydraliskDenSpawner();

	public static Item					ICON_PROTOSS							= new Item().setUnlocalizedName("icon.protoss").setRegistryName("icon.protoss").setCreativeTab(null);
	public static Item					ICON_TERRAN								= new Item().setUnlocalizedName("icon.terran").setRegistryName("icon.terran").setCreativeTab(null);
	public static Item					ICON_ZERG								= new Item().setUnlocalizedName("icon.zerg").setRegistryName("icon.zerg").setCreativeTab(null);

	public static Item					TEST									= new ItemTest();

	static {
		ArmorHandler.init();
		WeaponHandler.init();
		ToolHandler.init();
		register();
	}

	/**
	 * Registers all mod items. Calls registration of sub-packages.
	 */
	public static void register() {

		FluidRegistry.addBucketForFluid(FluidHandler.ACID);
		FluidRegistry.addBucketForFluid(FluidHandler.BLOOD);
		FluidRegistry.addBucketForFluid(FluidHandler.VESPENE);
		FluidRegistry.addBucketForFluid(FluidHandler.TERRAZINE);
		FluidRegistry.addBucketForFluid(FluidHandler.TAR);

		registerItem(MINERAL_SHARD);
		registerItem(PHOSPHORUS);

		registerItem(GAS_CONTAINER);
		registerItem(VESPENE);
		registerItem(TERRAZINE);

		registerItem(ENERGY);
		registerItem(DUST);
		registerItem(PLEDGE);
		registerItem(INGOT);
		registerItem(PROTOSS_INGOT);
		registerItem(C14_GAUSS_RIFLE);
		registerItem(FLAMETHROWER);
		registerItem(SOLARITE_REAPER);
		registerItem(C14_PARTS);
		registerItem(FLAMETHROWER_PARTS);
		registerItem(BULLET_MAGAZINE);
		registerItem(PSI_BLADE_FOCUSER_UNCHARGED);
		registerItem(ZERG_CARAPACE);
		registerItem(CREEP_RESIN);
		registerItem(ORGANIC_TISSUE);
		registerItem(BIOMASS);

		// registerItem(NUCLEAR_MISSILE);
		registerItem(STIMPACK);
		registerItem(CARBOTIFIER);
		registerItem(LOG);

		registerItem(PROTOSS_UPGRADE);
		registerItem(MARINE_HELMET_VISOR);

		registerItem(KHAYDARIN_CRYSTAL);

		registerItem(SPAWNER_PROTOSS_DARK_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_VOID_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_DARK_PYLON);
		registerItem(SPAWNER_PROTOSS_VOID_PYLON);
		registerItem(SPAWNER_PROTOSS_PYLON);
		registerItem(SPAWNER_PROTOSS_DARK_WARPGATE);
		registerItem(SPAWNER_PROTOSS_VOID_WARPGATE);
		registerItem(SPAWNER_PROTOSS_WARPGATE);

		registerItem(SPAWNER_TERRAN_BUNKER);
		registerItem(SPAWNER_TERRAN_BARRACKS);
		registerItem(SPAWNER_TERRAN_COMMAND_CENTER);

		registerItem(SPAWNER_ZERG_SPAWNINGPOOL);
		registerItem(SPAWNER_ZERG_SPIRE);
		registerItem(SPAWNER_ZERG_HYDRALISKDEN);

		registerItem(ICON_PROTOSS);
		registerItem(ICON_TERRAN);
		registerItem(ICON_ZERG);

		registerItem(TEST);

		ArmorHandler.register();
		WeaponHandler.register();
		ToolHandler.register();
	}

	/**
	 * Register an item
	 * 
	 * @param item
	 *            The item
	 */
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
	}
}