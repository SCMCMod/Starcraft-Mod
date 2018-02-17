package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.DustType;
import com.hypeirochus.scmc.enums.MetaHandler.IngotType;
import com.hypeirochus.scmc.enums.MetaHandler.ProtossIngotType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemProtossIngot extends StarcraftItem {

	public ItemProtossIngot() {
		super("protoss.ingot");
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < ProtossIngotType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < ProtossIngotType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + ProtossIngotType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + ProtossIngotType.KHALAI.getName();
	}
}