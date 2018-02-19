package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabZerg extends CreativeTabs {

	public StarcraftCreativeTabZerg() {
		super("zerg");
		setBackgroundImageName("item_search_zerg.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.ZERG.getID());
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}