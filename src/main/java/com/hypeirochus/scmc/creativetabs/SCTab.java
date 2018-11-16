package com.hypeirochus.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SCTab extends CreativeTabs
{

	public String backgroundName = "";
	
	public SCTab(String label, String backgroundName)
	{
		super(label);
		setBackgroundImageName(backgroundName);
	}

	@Override
	public boolean hasSearchBar()
	{
		return true;
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return null;
	}
}
