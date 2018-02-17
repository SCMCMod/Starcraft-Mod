package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StarcraftItem extends Item {

	public StarcraftItem() {
	}

	public StarcraftItem(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		ItemHandler.register(this);
	}

	@Override
	public StarcraftItem setCreativeTab(CreativeTabs tab) {
		return (StarcraftItem) super.setCreativeTab(tab);
	}
}