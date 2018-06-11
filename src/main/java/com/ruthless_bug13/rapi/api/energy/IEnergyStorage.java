package com.ruthless_bug13.rapi.api.energy;

/**
 * @author Ruthless_Bug13
 */
//TODO: MOVE TO CORE MOD
public interface IEnergyStorage 
{
	/**
	 * @return Returns the energy
	 */
	public double GetEnergy();
	
	/**
	 * @return Returns the maximum amount of energy that can be stored
	 */
	public double GetMaxEnergy();
	
	/**
	 * Sets the local energy to @param energy
	 * 
	 * @param energy - Energy to set to
	 */
	public void SetEnergy(double energy);
	
	/**
	 * Sets the local max energy @param maxEnergy
	 * 
	 * @param maxEnergy - Max energy value to set to
	 */
	public void SetMaxEnergy(double maxEnergy);
}