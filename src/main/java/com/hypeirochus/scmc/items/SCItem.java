package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SCItem extends Item
{

	public SCItem()
	{
	}

	public SCItem(String name)
	{
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		ItemHandler.register(this);
	}

	@Override
	public SCItem setCreativeTab(CreativeTabs tab)
	{
		return (SCItem) super.setCreativeTab(tab);
	}
}