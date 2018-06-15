package com.ruthless_bug13.rapi.api.tileentity;

import java.util.List;

/**
 * @author Ruthless_Bug13
 * 
 * Used to create cables.
 */
//TODO: MOVE TO CORE MOD
public abstract class TileEntityEnergyConnector extends TileEntityEnergy
{
	public TileEntityEnergyConnector(String name, double maxEnergy, double energyPerTick, double maxInput, double maxOutput) 
	{
		super(name, maxEnergy, energyPerTick, maxInput, maxOutput);
	}
	
	@Override
	public abstract void OnOverflow();
	@Override
	public abstract void OnEnergySent(List<TileEntityEnergy> updatedTiles);
}