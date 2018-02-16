package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StarcraftCreativeTabFlora extends CreativeTabs {

	public StarcraftCreativeTabFlora() {
		super("flora");
		// setBackgroundImageName("item_search.png");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlockHandler.FLORA_ZERUS_GLOW_POD);
	}

	@Override
	public boolean hasSearchBar() {
		return false;
	}
}
