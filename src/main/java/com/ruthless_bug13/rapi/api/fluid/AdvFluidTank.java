package com.ruthless_bug13.rapi.api.fluid;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidTank;

/**
 * @author Ruthless_Bug13
 * 
 * Used for TileEntities or ItemStacks to store fluids.
 */
public class AdvFluidTank implements IFluidTankAdapter, IFluidTank
{
	private FluidStack FluidType;
	private int Capacity;
	protected FluidTankInfo info;
	
	public AdvFluidTank(int capacity)
	{
		this(null, capacity);
	}
	
	public AdvFluidTank(Fluid fluid, int amount, int capacity)
	{
		this(new FluidStack(fluid, amount), capacity);
	}
	
	public AdvFluidTank(FluidStack type, int capacity)
	{
		SetCapacity(capacity);
		SetFluid(type);
	}
	
	/**
	 * Fills the fluid handler with @param resource.
	 */
	@Override
	public int fill(FluidStack resource, boolean doFill) 
	{
		if (resource != null) 
		{
			if (FluidType != null) 
			{
				if (!FluidType.isFluidEqual(resource))
					return 0;
				
				int fill = Math.min(Capacity - FluidType.amount, resource.amount);
				if (doFill && fill > 0)
					FluidType.amount += fill;

				return fill;
			}
			
			if (!doFill)
				return Math.min(Capacity, resource.amount);
			FluidType = new FluidStack(resource, Math.min(Capacity, resource.amount));

			return FluidType.amount;
		}
		
		return 0;
	}
	
	/**
	 * Drains the fluid handler with amount @param maxDrain.
	 */
	@Override
	public FluidStack drain(int maxDrain, boolean doDrain) 
	{
		if (FluidType != null)
		{
			if (FluidType.amount < maxDrain)
				maxDrain = FluidType.amount;

			FluidStack fluid = new FluidStack(FluidType, maxDrain);

			if (doDrain)
			{
				FluidType.amount -= maxDrain;
				if (FluidType.amount == 0)
					FluidType = null;
			}

			return fluid;
		}	
		return null;
	}
	
	/**
	 * Gets the fluid tank info.
	 */
	@Override
	public FluidTankInfo getInfo() 
	{
		return info = new FluidTankInfo(this);
	}
	
	/**
	 * Reads the fluid tank NBT data.
	 * 
	 * @param nbt - NBT tags to read from.
	 * @return - Returns tank NBT data.
	 */
	public AdvFluidTank ReadFromNBT(NBTTagCompound nbt)
	{
		SetCapacity(nbt.getInteger("Capacity"));

		FluidStack loadedFluid = (nbt.hasKey("Empty")) ? null : FluidStack.loadFluidStackFromNBT(nbt);
		SetFluid(loadedFluid);

		return this;
	}
	
	/**
	 * Writes the fluid tank NBT data.
	 * 
	 * @param nbt - NBT tags to write to.
	 * @return - Returns written tank NBT data.
	 */
	public NBTTagCompound WriteToNBT(NBTTagCompound nbt)
	{
		nbt.setInteger("Capacity", Capacity);

		if (FluidType != null)
		{
			FluidType.writeToNBT(nbt);
		} else
		{
			nbt.setString("Empty", "");
		}

		return nbt;
	}
	
	/**
	 * Sets the local FluidType to @param fluid.
	 * 
	 * @param fluid - Fluid to set local fluid to.
	 */
	public void SetFluid(FluidStack fluid)
	{
		if (fluid != null)
		{
			fluid.amount = Math.min(fluid.amount, Capacity);
		}
		FluidType = fluid;
	}
	
	/**
	 * Sets the local capacity to @param capacity.
	 * 
	 * @param capacity - Capacity to set local capacity to.
	 */
	public void SetCapacity(int capacity)
	{
		Capacity = (capacity >= 0) ? capacity : 0;
		
		if (FluidType != null)
		{
			FluidType.amount = Math.min(Capacity, FluidType.amount);
		}
	}
	
	/**
	 * Gets local fluid stack type.
	 */
	@Override
	public FluidStack getFluid() 
	{
		return FluidType;
	}
	
	/**
	 * Gets local fluid amount.
	 */
	@Override
	public int getFluidAmount() 
	{
		if (FluidType != null)
			return FluidType.amount;
		return 0;
	}
	
	/**
	 * Gets local fluid capacity.
	 */
	@Override
	public int getCapacity() 
	{
		return Capacity;
	}
}