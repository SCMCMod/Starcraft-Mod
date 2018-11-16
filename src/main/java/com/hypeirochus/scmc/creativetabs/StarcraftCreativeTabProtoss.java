package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabProtoss extends CreativeTabs
{

	public StarcraftCreativeTabProtoss()
	{
		super("protoss");
		setBackgroundImageName("item_search_protoss.png");

	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.PROTOSS.getID());
	}

	@Override
	public boolean hasSearchBar()
	{
		return true;
	}
}
