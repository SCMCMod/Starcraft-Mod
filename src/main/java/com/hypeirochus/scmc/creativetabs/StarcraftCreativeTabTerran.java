package com.hypeirochus.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabTerran extends CreativeTabs {

	public StarcraftCreativeTabTerran() {
		super("terran");
		setBackgroundImageName("item_search_terran.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		// return ItemHandler.ICON_TERRAN;
		return ItemStack.EMPTY;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
