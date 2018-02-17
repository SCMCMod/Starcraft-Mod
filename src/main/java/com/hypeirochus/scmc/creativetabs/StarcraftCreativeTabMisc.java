package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabMisc extends CreativeTabs {

	public StarcraftCreativeTabMisc() {
		super("misc");
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemHandler.ENERGY, 1, 0);
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
