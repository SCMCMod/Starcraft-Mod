package com.ruthless_bug13.rapi.api.energy;

import net.minecraft.util.EnumFacing;

/*
 * If you want to hook into a different mod, add the power interfaces here.
 * 
 * @author Ruthless_Bug13
 */
//TODO: MOVE TO CORE MOD
public interface IEnergyWrapper extends IEnergyStorage, IEnergyInput, IEnergyOutput
{
	/**
	 * Checks if @param side is a energy output
	 * 
	 * @param side - Side to check
	 * @return Returns true if the side outputs energy
	 */
	boolean SideIsOutput(EnumFacing side);
	
	/**
	 * Checks if @param side is a energy input
	 * 
	 * @param side - Side to check
	 * @return Returns true if the side inputs energy
	 */
	boolean SideIsInput(EnumFacing side);
	
	/**
	 * Gets the max output
	 * 
	 * @return Returns the max output
	 */
	double GetMaxOutput();
}