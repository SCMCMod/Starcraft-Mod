package ga.scmc.handlers;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.weapons.WeaponLightBase;
import ga.scmc.items.weapons.WeaponMasterPsiBlade;
import ga.scmc.items.weapons.WeaponPsiBlade;
import ga.scmc.items.weapons.WeaponSwordBase;
import ga.scmc.items.weapons.WeaponWarpBlade;
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
		PSI_BLADE = new WeaponPsiBlade(WeaponMaterials.PSIBLADE_MATERIAL).setUnlocalizedName("protoss.blade.psi.aiur").setRegistryName("protoss.blade.psi.aiur").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		BANE_BLADE = new WeaponPsiBlade(WeaponMaterials.PSIBLADE_MATERIAL).setUnlocalizedName("protoss.blade.psi.dark").setRegistryName("protoss.blade.psi.dark").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		WARP_BLADE = new WeaponWarpBlade(WeaponMaterials.WARPBLADE_MATERIAL).setUnlocalizedName("protoss.blade.warp.aiur").setRegistryName("protoss.blade.warp.aiur").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		DARK_WARP_BLADE = new WeaponWarpBlade(WeaponMaterials.WARPBLADE_MATERIAL).setUnlocalizedName("protoss.blade.warp.dark").setRegistryName("protoss.blade.warp.dark").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		MASTER_PSI_BLADE = new WeaponMasterPsiBlade(WeaponMaterials.MASTERPSIBLADE_MATERIAL);

		BALISONG = new WeaponSwordBase(WeaponMaterials.BALISONG_MATERIAL).setUnlocalizedName("balisong").setRegistryName("balisong").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		MILITARY_KNIFE = new WeaponSwordBase(WeaponMaterials.MILITARYKNIFE_MATERIAL).setUnlocalizedName("terran.knife.military").setRegistryName("terran.knife.military").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		MONOMOLECULAR_BLADE = new WeaponLightBase(WeaponMaterials.MONOMOLECULARBLADE_MATERIAL).setUnlocalizedName("blade.monomolecular").setRegistryName("blade.monomolecular").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_SWORD = new WeaponSwordBase(WeaponMaterials.COPPER_MATERIAL).setUnlocalizedName("copper.sword").setRegistryName("copper.sword").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_SWORD = new WeaponSwordBase(WeaponMaterials.TITANIUM_MATERIAL).setUnlocalizedName("titanium.sword").setRegistryName("titanium.sword").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_SWORD = new WeaponSwordBase(WeaponMaterials.STEEL_MATERIAL).setUnlocalizedName("steel.sword").setRegistryName("steel.sword").setCreativeTab(StarcraftCreativeTabs.TERRAN);
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
	}
}