package com.hypeirochus.scmc.items.metaitems;

import java.util.List;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.EnumMetaItem.DustType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDust extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemDust() {
		setUnlocalizedName("dust");
		setRegistryName("dust");
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < DustType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link DustType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < DustType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + DustType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + DustType.IRON.getName();
	}
}