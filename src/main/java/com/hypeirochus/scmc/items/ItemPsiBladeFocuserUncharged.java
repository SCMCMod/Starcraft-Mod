package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.FocuserType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemPsiBladeFocuserUncharged extends StarcraftItem {

	public ItemPsiBladeFocuserUncharged() {
		super("protoss.focuser");
		setHasSubtypes(true);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (isInCreativeTab(tab)) {
			for (int i = 0; i < FocuserType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < FocuserType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + FocuserType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + FocuserType.AIUR.getName();
	}
}