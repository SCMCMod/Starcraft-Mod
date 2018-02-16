package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.material.WeaponMaterials;

import net.minecraft.item.ItemSword;

public class ItemSolariteReaper extends ItemSword {

	public ItemSolariteReaper() {
		super(WeaponMaterials.PSIBLADE_MATERIAL);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		setFull3D();
		setUnlocalizedName("solariteReaper");
		setRegistryName("solariteReaper");
		setMaxStackSize(1);
	}
}
