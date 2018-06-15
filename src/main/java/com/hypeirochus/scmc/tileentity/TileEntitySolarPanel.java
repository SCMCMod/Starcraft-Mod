package com.hypeirochus.scmc.tileentity;

import java.util.List;

import com.ruthless_bug13.rapi.api.tileentity.TileEntityEnergy;
import com.ruthless_bug13.rapi.api.util.SolarUtil;

import net.minecraft.util.ITickable;

/**
 * @author Ruthless_Bug13
 * 
 * This is an example class!
 */
public class TileEntitySolarPanel extends TileEntityEnergy implements ITickable
{
	public float TimeOfDayMultiplier;
	
	public TileEntitySolarPanel() 
	{
		super("machine.solarpanel", 1000, 0.1, 0, 5);
		IsSafeGuarded = true;
	}
	
	@Override
	public void update() 
	{
		super.update();
				
		if (world.isDaytime())
			SendSafeEnergy(SolarUtil.GenerateSolarEnergy(world, EnergyPerTick));
	}
	
	@Override
	public void OnOverflow() {}
	@Override
	public void OnEnergySent(List<TileEntityEnergy> updatedTiles) {}
}