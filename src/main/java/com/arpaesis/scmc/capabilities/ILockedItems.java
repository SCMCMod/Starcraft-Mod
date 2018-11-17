package com.arpaesis.scmc.capabilities;

import java.util.List;

import net.minecraft.item.ItemStack;

public interface ILockedItems
{

	List<ItemStack> getLockedItems();

	void lockItem(ItemStack item);

	void unlockItem(ItemStack item);

	boolean isUnlocked(ItemStack item);

}
