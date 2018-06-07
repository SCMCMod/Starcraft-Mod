package com.ruthless_bug13.rapi.api.tileentity;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.ruthless_bug13.rapi.api.fluid.AdvFluidTank;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.FluidTankProperties;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidTankProperties;

/**
 * @author Ruthless_Bug13
 * 
 * Use for Tile Entites that require fluid handling, which can also be used for machines that need fluid handling.
 */
public abstract class TileEntityFluidHandler extends TileEntityEnergy implements IFluidHandler
{
	protected IFluidTankProperties[] properties;
	private AdvFluidTank handler;
	
	public TileEntityFluidHandler(String name, int fluidCapacity) 
	{
		this(name, 0, 0, 0, 0, 0, 0);
	}
	
	public TileEntityFluidHandler(String name, int invSize, int fluidCapacity, double maxEnergy, double energyPerTick, double maxInput, double maxOutput) 
	{
		super(name, maxEnergy, energyPerTick, maxInput, maxOutput);
		handler = new AdvFluidTank(fluidCapacity);
	}

	@Override
	public IFluidTankProperties[] getTankProperties() 
	{
		if (this.properties == null)
			this.properties = FluidTankProperties.convert(new FluidTankInfo[] { handler.getInfo() });	
		return this.properties;
	}

	@Override
	public int fill(FluidStack resource, boolean doFill) 
	{
		return handler.fill(resource, doFill);
	}

	@Override
	public FluidStack drain(FluidStack resource, boolean doDrain) 
	{
		return handler.drain(resource.amount, doDrain);
	}

	@Override
	public FluidStack drain(int maxDrain, boolean doDrain) 
	{
		return handler.drain(maxDrain, doDrain);
	}
	
	@Override
	public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing)
	{
		return capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY || super.hasCapability(capability, facing);
	}

	@Override
	public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing)
	{
		if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) return (T) this;
		return super.getCapability(capability, facing);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbtTags)
	{
		super.readFromNBT(nbtTags);

		handler = handler.ReadFromNBT(nbtTags);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTags)
	{
		super.writeToNBT(nbtTags);

		handler.WriteToNBT(nbtTags);
		
		return nbtTags;
	}
	
	@Override
	public abstract void OnOverflow();
	@Override
	public abstract void OnEnergySent(List<TileEntityEnergy> updatedTiles);
}