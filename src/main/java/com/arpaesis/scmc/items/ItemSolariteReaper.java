package com.arpaesis.scmc.items;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.material.WeaponMaterials;

public class ItemSolariteReaper extends SCRangedMeleeWeapon
{

	public ItemSolariteReaper()
	{
		super("protoss.weapon.solaritereaper", WeaponMaterials.SOLARITEREAPER_MATERIAL, 8, 5);
		this.setCreativeTab(SCCreativeTabs.PROTOSS);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.setMaxDamage(300);
	}
}