package com.ruthless_bug13.rapi.api.energy;

import net.minecraft.item.ItemStack;

/**
 * @author Ruthless_Bug13
 */
//TODO: MOVE TO CORE MOD
public class EnergyItemHandler 
{
	/**
	 * Removes charge from an itemstack
	 * 
	 * @param itemStack - The itemstack to effect
	 * @param amount - The amount to effect it by
	 * @return Returns - the new charge amount
	 */
	public static double RemoveCharge(ItemStack itemStack, double amount)
	{
		if(itemStack != null)
		{
			if(itemStack.getItem() instanceof IEnergyItem)
			{
				IEnergyItem energizedItem = (IEnergyItem)itemStack.getItem();
				if(energizedItem.CanSend(itemStack))
				{
					double energyToUse = Math.min(energizedItem.GetMaxTransfer(itemStack), Math.min(energizedItem.GetDurability(itemStack), amount));
					energizedItem.SetDurability(itemStack, energizedItem.GetDurability(itemStack) - energyToUse);
					return energyToUse;
				}
			}
		}
		return 0;
	}
	
	/**
	 * Adds charge to an itemstack
	 * 
	 * @param itemStack - The itemstack to effect
	 * @param amount - The amount to effect it by
	 * @return Returns - the new charge amount
	 */
	public static double AddCharge(ItemStack itemStack, double amount)
	{
		if(itemStack != null)
		{
			if(itemStack.getItem() instanceof IEnergyItem)
			{
				IEnergyItem energizedItem = (IEnergyItem) itemStack.getItem();
				if(energizedItem.CanReceive(itemStack))
				{
					double energyToSend = Math.min(energizedItem.GetMaxTransfer(itemStack), Math.min(energizedItem.GetMaxDurability(itemStack) - energizedItem.GetDurability(itemStack), amount));
					energizedItem.SetDurability(itemStack, energizedItem.GetDurability(itemStack) + energyToSend);
					return energyToSend;
				}
			}
		}
		return 0;
	}
}