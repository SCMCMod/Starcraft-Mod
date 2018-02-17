package com.hypeirochus.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabProtoss extends CreativeTabs {

	public StarcraftCreativeTabProtoss() {
		super("protoss");
		setBackgroundImageName("item_search_protoss.png");

	}

	@Override
	public ItemStack getTabIconItem() {
		// return ItemHandler.ICON_PROTOSS;
		return ItemStack.EMPTY;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
