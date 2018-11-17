package com.arpaesis.scmc.handlers;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.items.weapons.WeaponMasterPsiBlade;
import com.arpaesis.scmc.items.weapons.WeaponPsiBlade;
import com.arpaesis.scmc.items.weapons.WeaponSwordBase;
import com.arpaesis.scmc.items.weapons.WeaponWarpBlade;
import com.arpaesis.scmc.material.WeaponMaterials;

import net.minecraft.item.Item;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class WeaponHandler
{

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

	public static void init()
	{
		instantiate();
		register();
	}

	private static void instantiate()
	{
		PSI_BLADE = new WeaponPsiBlade(WeaponMaterials.PSIBLADE_MATERIAL).setTranslationKey("protoss.blade.psi.aiur").setRegistryName("protoss.blade.psi.aiur").setCreativeTab(SCCreativeTabs.PROTOSS);
		BANE_BLADE = new WeaponPsiBlade(WeaponMaterials.PSIBLADE_MATERIAL).setTranslationKey("protoss.blade.psi.dark").setRegistryName("protoss.blade.psi.dark").setCreativeTab(SCCreativeTabs.PROTOSS);
		WARP_BLADE = new WeaponWarpBlade(WeaponMaterials.WARPBLADE_MATERIAL).setTranslationKey("protoss.blade.warp.aiur").setRegistryName("protoss.blade.warp.aiur").setCreativeTab(SCCreativeTabs.PROTOSS);
		DARK_WARP_BLADE = new WeaponWarpBlade(WeaponMaterials.WARPBLADE_MATERIAL).setTranslationKey("protoss.blade.warp.dark").setRegistryName("protoss.blade.warp.dark").setCreativeTab(SCCreativeTabs.PROTOSS);
		MASTER_PSI_BLADE = new WeaponMasterPsiBlade(WeaponMaterials.MASTERPSIBLADE_MATERIAL);

		BALISONG = new WeaponSwordBase(WeaponMaterials.BALISONG_MATERIAL).setTranslationKey("balisong").setRegistryName("balisong").setCreativeTab(SCCreativeTabs.TERRAN);
		MILITARY_KNIFE = new WeaponSwordBase(WeaponMaterials.MILITARYKNIFE_MATERIAL).setTranslationKey("terran.knife.military").setRegistryName("terran.knife.military").setCreativeTab(SCCreativeTabs.TERRAN);
		MONOMOLECULAR_BLADE = new WeaponSwordBase(WeaponMaterials.MONOMOLECULARBLADE_MATERIAL).setTranslationKey("blade.monomolecular").setRegistryName("blade.monomolecular").setCreativeTab(SCCreativeTabs.TERRAN);
		COPPER_SWORD = new WeaponSwordBase(WeaponMaterials.COPPER_MATERIAL).setTranslationKey("copper.sword").setRegistryName("copper.sword").setCreativeTab(SCCreativeTabs.TERRAN);
		TITANIUM_SWORD = new WeaponSwordBase(WeaponMaterials.TITANIUM_MATERIAL).setTranslationKey("titanium.sword").setRegistryName("titanium.sword").setCreativeTab(SCCreativeTabs.TERRAN);
		STEEL_SWORD = new WeaponSwordBase(WeaponMaterials.STEEL_MATERIAL).setTranslationKey("steel.sword").setRegistryName("steel.sword").setCreativeTab(SCCreativeTabs.TERRAN);
	}

	private static void register()
	{
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

	public static void registerItem(Item item)
	{
		ItemHandler.register(item);
	}
}