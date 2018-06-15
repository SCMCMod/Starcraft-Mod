package com.ruthless_bug13.rapi.api.pipe;

import com.ruthless_bug13.rapi.api.IOverFlowable;
import com.ruthless_bug13.rapi.api.machine.IAugmentable;

/**
 * @author Ruthless_Bug13
 * 
 * If extended by a block, the block is considered a fluid pipe and can carry fluids.
 */
//TODO: MOVE TO CORE MOD
public interface IFluidPipe extends IPipeConnection, IOverFlowable, IAugmentable
{
}