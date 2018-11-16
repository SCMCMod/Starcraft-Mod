package com.hypeirochus.scmc.creativetabs;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StarcraftCreativeTabFlora extends CreativeTabs
{

	public StarcraftCreativeTabFlora()
	{
		super("flora");
		// setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(BlockHandler.FLORA_ZERUS_GLOW_POD, 1, 0);
	}
}
