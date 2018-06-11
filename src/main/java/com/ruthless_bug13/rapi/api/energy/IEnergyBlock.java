package com.ruthless_bug13.rapi.api.energy;

import com.ruthless_bug13.rapi.api.IOverFlowable;
import com.ruthless_bug13.rapi.api.machine.IAugmentable;

import net.minecraft.world.World;

/**
 * @author Ruthless_Bug13
 * 
 * If implemented by a block, it can be considered a energy block. Which will be wrapped by any energy mods that use @IEnergyWrapper.
 */
//TODO: MOVE TO CORE MOD
public interface IEnergyBlock extends IEnergyWrapper, IOverFlowable, IAugmentable
{
	/**
	 * Sends energy updates to all blocks around the energy source.
	 * 
	 * @param world - The World the tile is in.
	 * @param block - The block sending energy updates.
	 */
	public void SendEnergyToSides(World world);
}