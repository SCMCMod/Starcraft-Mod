package com.hypeirochus.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabZerg extends CreativeTabs {

	public StarcraftCreativeTabZerg() {
		super("zerg");
		setBackgroundImageName("item_search_zerg.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		// return ItemHandler.ICON_ZERG;
		return ItemStack.EMPTY;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}