package com.ruthless_bug13.rapi.api.pipe;

import com.ruthless_bug13.rapi.api.IOverFlowable;

import net.minecraft.util.EnumFacing;

/**
 * @author Ruthless_Bug13
 * 
 * If extended by a block, the block is considered a connection block for other pipe/fluid pipes/item pipes.
 */
//TODO: MOVE TO CORE MOD
public interface IPipeConnection extends IOverFlowable
{
	/**
	 * Check if the pipe can connect from @param side.
	 * 
	 * @param side - Side it should check.
	 * @return - Returns true if it can connect.
	 */
	boolean CanTubeConnect(EnumFacing side);
}