package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.material.WeaponMaterials;

public class ItemSolariteReaper extends StarcraftRangedMeleeWeapon {

	public ItemSolariteReaper() {
		super("protoss.weapon.solaritereaper", WeaponMaterials.SOLARITEREAPER_MATERIAL, 8, 5);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		setFull3D();
		setMaxStackSize(1);
	}
}
