package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;

import net.minecraft.item.Item;

public class ItemPledge extends Item {

	/**
	 * Default constructor. just sets the unlocalized name and the registry name.
	 */
	public ItemPledge() {
		setUnlocalizedName("pledge");
		setRegistryName("pledge");
		setHasSubtypes(true);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}