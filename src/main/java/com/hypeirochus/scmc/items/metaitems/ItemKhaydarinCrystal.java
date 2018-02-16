package com.hypeirochus.scmc.items.metaitems;

import java.util.List;

import com.hypeirochus.scmc.blocks.metablocks.BlockKhaydarinCrystal;
import com.hypeirochus.scmc.blocks.metablocks.BlockKhaydarinCrystal.PylonCrystalType;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.MetaBlockHandler;
import com.hypeirochus.scmc.items.IItemCompressable;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author Ocelot5836
 */
public class ItemKhaydarinCrystal extends Item implements IItemCompressable {

	public ItemKhaydarinCrystal() {
		setUnlocalizedName("protoss.khaydarincrystal");
		setRegistryName("protoss.khaydarincrystal");
		setHasSubtypes(true);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < BlockKhaydarinCrystal.PylonCrystalType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < BlockKhaydarinCrystal.PylonCrystalType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + BlockKhaydarinCrystal.PylonCrystalType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + PylonCrystalType.PURE.getName();
	}

	@Override
	public ItemStack getCompressedForm(int metadata) {
		if (metadata < BlockKhaydarinCrystal.PylonCrystalType.values().length)
			return new ItemStack(MetaBlockHandler.PYLON_CRYSTAL, 1, metadata);
		return null;
	}
}