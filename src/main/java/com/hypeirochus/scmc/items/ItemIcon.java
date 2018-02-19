package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.enums.MetaHandler.IconType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemIcon extends StarcraftItem {

	public ItemIcon() {
		super("icon");
		setHasSubtypes(true);
		setCreativeTab(null);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < IconType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + IconType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + IconType.PROTOSS.getName();
	}
}