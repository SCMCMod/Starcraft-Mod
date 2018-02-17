package com.hypeirochus.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabBooks extends CreativeTabs {

	public StarcraftCreativeTabBooks() {
		super("books");
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		// return ItemHandler.LOG;
		return ItemStack.EMPTY;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
