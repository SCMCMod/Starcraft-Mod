package com.hypeirochus.scmc.items;

import javax.management.RuntimeErrorException;

import com.hypeirochus.scmc.blocks.metablocks.BlockGasCollector.GasCollectorType;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.enums.MetaHandler.ContainerType;
import com.hypeirochus.scmc.enums.MetaHandler.VespeneType;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemGasContainer extends StarcraftItem implements IMetaRenderHandler {

	public ItemGasContainer() {
		super("container");
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (tab == CreativeTabs.SEARCH) {
			for (int i = 0; i < GasCollectorType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		} else {
			if (tab == StarcraftCreativeTabs.PROTOSS)
				items.add(new ItemStack(this, 1, 0));
			if (tab == StarcraftCreativeTabs.TERRAN)
				items.add(new ItemStack(this, 1, 1));
			if (tab == StarcraftCreativeTabs.ZERG)
				items.add(new ItemStack(this, 1, 2));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < ContainerType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + ContainerType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + ContainerType.PROTOSS.getName();
	}

	@Override
	public int getItemCount() {
		return ContainerType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "container." + MetaHandler.ContainerType.values()[meta].getName();
	}
}