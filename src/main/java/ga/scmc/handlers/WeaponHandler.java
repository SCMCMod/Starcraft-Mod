package ga.scmc.handlers;



import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.weapons.WeaponBase;
import ga.scmc.items.weapons.WeaponMasterPsiBlade;
import ga.scmc.items.weapons.WeaponPsiBlade;
import ga.scmc.items.weapons.WeaponWarpBlade;
import ga.scmc.lib.LogHelper;
import ga.scmc.material.WeaponMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class WeaponHandler {

	public static Item BALISONG;
	public static Item COPPER_SWORD;
	public static Item BANE_BLADE;
	public static Item MASTER_PSI_BLADE;
	public static Item DARK_WARP_BLADE;
	public static Item MILITARY_KNIFE;
	public static Item MONOMOLECULAR_BLADE;
	public static Item PSI_BLADE;
	public static Item STEEL_SWORD;
	public static Item TITANIUM_SWORD;
	public static Item WARP_BLADE;

	

	public static void init() {
		PSI_BLADE = new WeaponPsiBlade(WeaponMaterials.PSIBLADE_MATERIAL).setUnlocalizedName("psiBlade").setRegistryName("psi_blade").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		BANE_BLADE = new WeaponPsiBlade(WeaponMaterials.PSIBLADE_MATERIAL).setUnlocalizedName("darkPsiBlade").setRegistryName("dark_psi_blade").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		WARP_BLADE = new WeaponWarpBlade(WeaponMaterials.WARPBLADE_MATERIAL).setUnlocalizedName("warpBlade").setRegistryName("warp_blade").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		DARK_WARP_BLADE = new WeaponWarpBlade(WeaponMaterials.WARPBLADE_MATERIAL).setUnlocalizedName("darkWarpBlade").setRegistryName("dark_warp_blade").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		MASTER_PSI_BLADE = new WeaponMasterPsiBlade(WeaponMaterials.MASTERPSIBLADE_MATERIAL);

		BALISONG = new WeaponBase(WeaponMaterials.BALISONG_MATERIAL).setUnlocalizedName("balisong").setRegistryName("balisong").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		MILITARY_KNIFE = new WeaponBase(WeaponMaterials.MILITARYKNIFE_MATERIAL).setUnlocalizedName("militaryKnife").setRegistryName("military_knife").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		MONOMOLECULAR_BLADE = new WeaponBase(WeaponMaterials.MONOMOLECULARBLADE_MATERIAL).setUnlocalizedName("monomolecularBlade").setRegistryName("monomolecular_blade").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_SWORD = new WeaponBase(WeaponMaterials.COPPER_MATERIAL).setUnlocalizedName("copperSword").setRegistryName("copper_sword").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_SWORD = new WeaponBase(WeaponMaterials.TITANIUM_MATERIAL).setUnlocalizedName("titaniumSword").setRegistryName("titanium_sword").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_SWORD = new WeaponBase(WeaponMaterials.STEEL_MATERIAL).setUnlocalizedName("steelSword").setRegistryName("steel_sword").setCreativeTab(StarcraftCreativeTabs.TERRAN);

	}

	public static void register() {
		registerItem(PSI_BLADE);
		registerItem(BANE_BLADE);

		registerItem(WARP_BLADE);
		registerItem(DARK_WARP_BLADE);

		registerItem(MASTER_PSI_BLADE);

		registerItem(BALISONG);
		registerItem(MILITARY_KNIFE);
		registerItem(MONOMOLECULAR_BLADE);

		registerItem(COPPER_SWORD);
		registerItem(TITANIUM_SWORD);
		registerItem(STEEL_SWORD);
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
		if(ConfigurationHandler.BOOL_DEBUG_MODE_ENABLED == true) {
			LogHelper.logger.info("Registered Weapon: " + item.getUnlocalizedName().substring(5));
		}
	}
}