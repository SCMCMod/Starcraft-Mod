package com.ruthless_bug13.rapi.api.tileentity;

import java.util.List;

/**
 * @author Ruthless_Bug13
 * 
 * Used to create cables.
 */
public abstract class TileEntityEnergyConnector extends TileEntityEnergy
{
	public TileEntityEnergyConnector(String name, double maxEnergy, double energyPerTick, int size, double maxInput, double maxOutput) 
	{
		super(name, maxEnergy, energyPerTick, size, maxInput, maxOutput);
	}
	
	@Override
	public abstract void OnOverflow();
	@Override
	public abstract void OnEnergySent(List<TileEntityEnergy> updatedTiles);
}