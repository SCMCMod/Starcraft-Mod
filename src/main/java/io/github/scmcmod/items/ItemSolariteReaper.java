package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.material.WeaponMaterials;

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