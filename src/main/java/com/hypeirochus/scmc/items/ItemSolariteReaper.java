package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.material.WeaponMaterials;

public class ItemSolariteReaper extends StarcraftSword {

	public ItemSolariteReaper() {
		super("protoss.weapon.solaritereaper", WeaponMaterials.PSIBLADE_MATERIAL);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		setFull3D();
		setMaxStackSize(1);
	}
}
