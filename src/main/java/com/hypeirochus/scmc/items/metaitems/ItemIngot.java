package com.hypeirochus.scmc.items.metaitems;

import java.util.List;

import com.hypeirochus.scmc.blocks.metablocks.BlockTerranMetal;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.EnumMetaItem.IngotType;
import com.hypeirochus.scmc.handlers.MetaBlockHandler;
import com.hypeirochus.scmc.items.IItemCompressable;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIngot extends Item implements IItemCompressable {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemIngot() {
		setUnlocalizedName("ingot");
		setRegistryName("ingot");
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < IngotType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link IngotType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < IngotType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + IngotType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + IngotType.COPPER.getName();
	}

	@Override
	public ItemStack getCompressedForm(int metadata) {
		if (metadata < BlockTerranMetal.CompressedMetalType.values().length) {
			return new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, metadata == 0 ? 0 : metadata == 1 ? 2 : 1);
		}
		return null;
	}
}