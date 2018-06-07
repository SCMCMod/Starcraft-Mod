package com.ruthless_bug13.rapi.api.util;

import net.minecraft.item.ItemStack;

/**
 * @author Ruthless_Bug13
 * 
 * Just some special ItemStck utilities I made. They probably already exist, I just couldn't find them.
 */
public class ItemStackUtil 
{
	/**
	 * @param stack - Stack to reduce size.
	 * @return - Returns the ItemStack once the size is decreased by 1.
	 */
	public static ItemStack ReduceSize(ItemStack stack) 
	{
		stack.setCount(stack.getCount() - 1);
		return stack;
	}
}