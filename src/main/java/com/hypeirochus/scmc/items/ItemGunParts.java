package com.hypeirochus.scmc.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * Represents the parts that can be required to construct a gun or advanced weapon.
 * 
 * @author Ocelot5836
 */
public class ItemGunParts extends StarcraftItem {

	private final int numParts;

	public ItemGunParts(String name, int numParts) {
		super(name);
		this.numParts = numParts;
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (isInCreativeTab(tab)) {
			for (int i = 0; i < numParts; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < numParts; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + i;
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + ".0";
	}
	
	public int getNumParts() {
		return numParts;
	}
	
	@Override
	public ItemGunParts setCreativeTab(CreativeTabs tab) {
		return (ItemGunParts) super.setCreativeTab(tab);
	}
}