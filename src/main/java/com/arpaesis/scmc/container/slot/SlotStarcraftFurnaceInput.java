package com.arpaesis.scmc.container.slot;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotStarcraftFurnaceInput extends SlotItemHandler
{

	public SlotStarcraftFurnaceInput(IItemHandler inv, int slotIndex, int xPosition, int yPosition)
	{
		super(inv, slotIndex, xPosition, yPosition);
	}

	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return FurnaceRecipes.instance().getSmeltingResult(stack) != null;
	}
}
