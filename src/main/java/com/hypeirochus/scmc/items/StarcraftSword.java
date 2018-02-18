package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class StarcraftSword extends ItemSword {

	public StarcraftSword(ToolMaterial material) {
		super(material);
	}

	public StarcraftSword(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		ItemHandler.register(this);
	}

	@Override
	public StarcraftSword setCreativeTab(CreativeTabs tab) {
		return (StarcraftSword) super.setCreativeTab(tab);
	}
}