package com.hypeirochus.scmc.container.slot;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public class SlotGasCollectorOutput extends SlotItemHandler
{

	public SlotGasCollectorOutput(IItemHandler handler, int slotIndex, int xPosition, int yPosition)
	{
		super(handler, slotIndex, xPosition, yPosition);
	}

	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return false;
	}
}