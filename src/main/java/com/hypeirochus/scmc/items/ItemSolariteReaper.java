package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.SCCreativeTabs;
import com.hypeirochus.scmc.material.WeaponMaterials;

public class ItemSolariteReaper extends SCRangedMeleeWeapon
{

	public ItemSolariteReaper()
	{
		super("protoss.weapon.solaritereaper", WeaponMaterials.SOLARITEREAPER_MATERIAL, 8, 5);
		setCreativeTab(SCCreativeTabs.PROTOSS);
		setFull3D();
		setMaxStackSize(1);
	}
}