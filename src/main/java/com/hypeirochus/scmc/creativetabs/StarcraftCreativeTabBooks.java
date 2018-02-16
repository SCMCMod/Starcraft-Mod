package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StarcraftCreativeTabBooks extends CreativeTabs {

	public StarcraftCreativeTabBooks() {
		super("books");
		setBackgroundImageName("item_search.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemHandler.LOG;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
