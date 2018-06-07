package com.ruthless_bug13.rapi.api.energy;

import com.ruthless_bug13.rapi.api.IOverFlowable;
import com.ruthless_bug13.rapi.api.machine.IAugmentable;

import net.minecraft.util.EnumFacing;

/**
 * @author Ruthless_Bug13
 */
public interface IEnergyConnector extends IEnergyBlock
{
	/**
	 * Check if the connector can connect from @param side.
	 * 
	 * @param side - Side it should check.
	 * @return - Returns true if it can connect.
	 */
	boolean CanTubeConnect(EnumFacing side);
}