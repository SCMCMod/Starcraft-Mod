package com.ruthless_bug13.rapi.api.energy;

import net.minecraft.util.EnumFacing;

/**
 * @author Ruthless_Bug13
 */
public interface IEnergyInput 
{
	/**
	 * Receives @param energy from @param side, with option of @param simulate
	 * 
	 * @param side - The side the energy is getting received from
	 * @param amount - The amount of energy being pulled
	 * @param simulate - Should this receive of energy simulate?
	 * @return Returns the new energy amount after receiving @param amount
	 */
	public double ReceiveEnergy(EnumFacing side, double amount, boolean simulate);
	
	/**
	 * Asks if the @param side can receive energy
	 * 
	 * @param side - Side to ask
	 * @return Returns true if the side can receive
	 */
	public boolean CanReceiveEnergy(EnumFacing side);
}