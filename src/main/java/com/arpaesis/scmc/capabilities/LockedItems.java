package com.arpaesis.scmc.capabilities;

import java.util.ArrayList;
import java.util.List;

import com.arpaesis.scmc.Starcraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class LockedItems implements ILockedItems
{

	private List<ItemStack> lockedItems;

	public LockedItems()
	{
		this.lockedItems = new ArrayList<>();
		for (ResourceLocation key : ForgeRegistries.ITEMS.getKeys())
		{
			if (key.getResourceDomain().equals(Starcraft.MOD_ID))
			{
				Item item = ForgeRegistries.ITEMS.getValue(key);
				if (item.getHasSubtypes())
				{
					NonNullList<ItemStack> subItems = NonNullList.create();
					item.getSubItems(item.getCreativeTab(), subItems);
					this.lockedItems.addAll(subItems);
				} else
				{
					this.lockedItems.add(new ItemStack(item));
				}
			}
		}
	}

	@Override
	public List<ItemStack> getLockedItems()
	{
		return this.lockedItems;
	}

	@Override
	public void lockItem(ItemStack item)
	{
		this.lockedItems.add(item);
	}

	@Override
	public void unlockItem(ItemStack item)
	{
		this.lockedItems.stream().filter(lockedItem -> ItemStack.areItemsEqual(lockedItem, item)).forEach(lockedItem -> this.lockedItems.remove(lockedItem));
	}

	@Override
	public boolean isUnlocked(ItemStack item)
	{
		for (ItemStack lockedItem : this.lockedItems)
			if (ItemStack.areItemsEqual(lockedItem, item))
				return false;
		return true;
	}
}
