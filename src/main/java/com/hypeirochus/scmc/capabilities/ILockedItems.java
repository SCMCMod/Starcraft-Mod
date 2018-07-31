package com.hypeirochus.scmc.capabilities;

import net.minecraft.item.ItemStack;

import java.util.List;

public interface ILockedItems {

    List<ItemStack> getLockedItems();

    void lockItem(ItemStack item);

    void unlockItem(ItemStack item);

    boolean isUnlocked(ItemStack item);

}
