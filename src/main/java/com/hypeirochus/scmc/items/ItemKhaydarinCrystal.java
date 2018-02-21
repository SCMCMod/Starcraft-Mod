package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.blocks.metablocks.BlockKhaydarinCrystal;
import com.hypeirochus.scmc.blocks.metablocks.BlockKhaydarinCrystal.PylonCrystalType;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class ItemKhaydarinCrystal extends StarcraftItem implements IMetaRenderHandler {

	public ItemKhaydarinCrystal() {
		super("protoss.khaydarincrystal");
		setHasSubtypes(true);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		for (int i = 0; i < BlockKhaydarinCrystal.PylonCrystalType.values().length; i++) {
			items.add(new ItemStack(this, 1, i));
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
	public int getItemCount() {
		return BlockKhaydarinCrystal.PylonCrystalType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "protoss.khaydarincrystal." + BlockKhaydarinCrystal.PylonCrystalType.values()[meta].getName();
	}
}