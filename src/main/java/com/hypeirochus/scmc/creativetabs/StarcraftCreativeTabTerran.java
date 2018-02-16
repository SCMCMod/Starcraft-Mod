package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StarcraftCreativeTabTerran extends CreativeTabs {

	public StarcraftCreativeTabTerran() {
		super("terran");
		setBackgroundImageName("item_search_terran.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemHandler.ICON_TERRAN;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
