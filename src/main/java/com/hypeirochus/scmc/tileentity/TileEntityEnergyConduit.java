package com.hypeirochus.scmc.tileentity;

import java.util.List;

import com.ruthless_bug13.rapi.api.tileentity.TileEntityEnergy;

public class TileEntityEnergyConduit extends TileEntityEnergy 
{
	public TileEntityEnergyConduit() 
	{
		super("terran.energyconduit", 100, 0, 5, 5);
		IsSafeGuarded = true;
	}
	
	@Override
	public void OnOverflow() {}
	@Override
	public void OnEnergySent(List<TileEntityEnergy> updatedTiles) {}
}