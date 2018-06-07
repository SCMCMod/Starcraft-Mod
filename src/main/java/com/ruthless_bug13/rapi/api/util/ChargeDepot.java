package com.ruthless_bug13.rapi.api.util;

import com.ruthless_bug13.rapi.api.energy.EnergyItemHandler;
import com.ruthless_bug13.rapi.api.tileentity.TileEntityEnergy;

import net.minecraft.item.ItemStack;

/**
 * @author Ruthless_Bug13
 * 
 * Used for charging stations, or machines that can charge items.
 */
public class ChargeDepot 
{
	/**
	 * Adds charge to @param stack inside @param tile with a rate of @param ChargeRate
	 * 
	 * @param stack - Stack to charge.
	 * @param tile - Tile to charge stack in.
	 * @param ChargeRate - Rate to charge stack.
	 * @return - Returns true if the item can be charged.
	 */
	public static boolean AddChargeToChargable(ItemStack stack, TileEntityEnergy tile, double ChargeRate) 
	{
		if (tile.EnergyStored + ChargeRate <= tile.MaxEnergy)
			EnergyItemHandler.AddCharge(stack, ChargeRate);
		return tile.EnergyStored + ChargeRate <= tile.MaxEnergy;
	}
	
	/**
	 * Removes charge from @param stack inside @param tile with a rate of @param DechargeRate
	 * 
	 * @param stack - Stack to remove charge from.
	 * @param tile - Tile to remove charge from stack in.
	 * @param ChargeRate - Rate to remove charge from the stack.
	 * @return - Returns true if the item can have charge removed.
	 */
	public static boolean RemoveChargeFromChargable(ItemStack stack, TileEntityEnergy tile, double DechargeRate) 
	{
		if (tile.EnergyStored >= DechargeRate)
			EnergyItemHandler.AddCharge(stack, DechargeRate);
		return tile.EnergyStored >= DechargeRate;
	}
}