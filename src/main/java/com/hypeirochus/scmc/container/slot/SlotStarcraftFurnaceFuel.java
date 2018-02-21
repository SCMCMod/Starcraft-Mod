package com.hypeirochus.scmc.container.slot;

import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * A slot which handles the furnace fuel
 * 
 * @author CJMinecraft
 */
public class SlotStarcraftFurnaceFuel extends SlotItemHandler {

	public SlotStarcraftFurnaceFuel(IItemHandler inv, int slotIndex, int xPosition, int yPosition) {
		super(inv, slotIndex, xPosition, yPosition);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityFurnace.isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack);
	}

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return SlotFurnaceFuel.isBucket(stack) ? 1 : super.getItemStackLimit(stack);
	}
}