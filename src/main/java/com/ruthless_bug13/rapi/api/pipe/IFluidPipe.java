package com.ruthless_bug13.rapi.api.pipe;

import com.ruthless_bug13.rapi.api.IOverFlowable;
import com.ruthless_bug13.rapi.api.machine.IAugmentable;

import net.minecraftforge.fluids.FluidStack;

/**
 * @author Ruthless_Bug13
 * 
 * If extended by a block, the block is considered a fluid pipe and can carry fluids.
 */
public interface IFluidPipe extends IPipeConnection, IOverFlowable, IAugmentable
{
}