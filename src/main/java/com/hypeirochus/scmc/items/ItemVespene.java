package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.MineralType;
import com.hypeirochus.scmc.enums.MetaHandler.TerrazineType;
import com.hypeirochus.scmc.enums.MetaHandler.VespeneType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemVespene extends StarcraftItem {

	public ItemVespene() {
		super("vespene");
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < VespeneType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
		
		if(tab == StarcraftCreativeTabs.MISC)
			items.add(new ItemStack(this, 1, 0));
		if(tab == StarcraftCreativeTabs.PROTOSS)
			items.add(new ItemStack(this, 1, 1));
		if(tab == StarcraftCreativeTabs.TERRAN)
			items.add(new ItemStack(this, 1, 2));
		if(tab == StarcraftCreativeTabs.ZERG)
			items.add(new ItemStack(this, 1, 3));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < VespeneType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + VespeneType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + VespeneType.RAW.getName();
	}
}