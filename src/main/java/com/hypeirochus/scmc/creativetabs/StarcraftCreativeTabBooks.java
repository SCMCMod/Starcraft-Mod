package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabBooks extends CreativeTabs
{

	public StarcraftCreativeTabBooks()
	{
		super("books");
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemHandler.LOG, 1, 0);
	}

	@Override
	public boolean hasSearchBar()
	{
		return true;
	}
}
