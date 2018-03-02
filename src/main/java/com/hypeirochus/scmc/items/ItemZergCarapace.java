package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.CarapaceType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemZergCarapace extends StarcraftItem implements IMetaRenderHandler {

	public ItemZergCarapace() {
		super("zerg.icarapace");
		setHasSubtypes(true);
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (isInCreativeTab(tab)) {
			for (int i = 0; i < CarapaceType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < CarapaceType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + CarapaceType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + CarapaceType.T1.getName();
	}

	@Override
	public int getItemCount() {
		return CarapaceType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "zerg.icarapace." + CarapaceType.values()[meta].getName();
	}
}