package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabTerran extends CreativeTabs {

	public StarcraftCreativeTabTerran() {
		super("terran");
		setBackgroundImageName("item_search_terran.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.TERRAN.getID());
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
