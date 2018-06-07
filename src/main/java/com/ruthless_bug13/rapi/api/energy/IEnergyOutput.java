package com.ruthless_bug13.rapi.api.energy;

import net.minecraft.util.EnumFacing;

/**
 * @author Ruthless_Bug13
 */
public interface IEnergyOutput 
{
	/**
	 * Pulls @param energy from @param side, with option of @param simulate
	 * 
	 * @param side - The side the energy is getting pulled from
	 * @param amount - The amount of energy being pulled
	 * @param simulate - Should this pull of energy simulate?
	 * @return Returns the new energy amount after pulling @param amount
	 */
	public double PullEnergy(EnumFacing side, double amount, boolean simulate);
	
	/**
	 * Asks if the @param side can output energy
	 * 
	 * @param side - Side to ask
	 * @return Returns true if the side can output
	 */
	public boolean CanOutputEnergy(EnumFacing side);
}