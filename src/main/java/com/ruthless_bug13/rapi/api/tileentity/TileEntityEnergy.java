package com.ruthless_bug13.rapi.api.tileentity;

import java.util.List;

import com.ruthless_bug13.rapi.api.energy.IEnergyBlock;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

//TODO: MOVE TO CORE MOD
public abstract class TileEntityEnergy extends TileEntity implements IEnergyBlock, ITickable
{
	public double EnergyStored;
	public double MaxEnergy;
	public double BaseMaxEnergy;
	
	public double EnergyPerTick;
	
	public double MaxInput; 
	public double MaxOutput;
	
	public boolean CanInput;
	public boolean CanOutput;
	
	public boolean IsSafeGuarded = true;
	
	TileEntityEnergy lastRecievedTile;
	
	public TileEntityEnergy(String name, double maxEnergy, double energyPerTick, double maxInput, double maxOutput) 
	{
		MaxEnergy = maxEnergy;
		EnergyPerTick = energyPerTick;
		BaseMaxEnergy = MaxEnergy;
		MaxInput = maxInput;
		MaxOutput = maxOutput;
		CanInput = maxInput != 0;
		CanOutput = maxOutput != 0;
	}
	
	@Override
	public void update() 
	{
		if (EnergyStored > 0)
			SendEnergyToSides(world);
	}
	
	@Override
	public void SendEnergyToSides(World world) 
	{
		SendSafeEnergyToTile(PosToEnergyTile(world, pos.up()));
		SendSafeEnergyToTile(PosToEnergyTile(world, pos.down()));
		SendSafeEnergyToTile(PosToEnergyTile(world, pos.north()));
		SendSafeEnergyToTile(PosToEnergyTile(world, pos.east()));
		SendSafeEnergyToTile(PosToEnergyTile(world, pos.south()));
		SendSafeEnergyToTile(PosToEnergyTile(world, pos.west()));
	}
	
	public void SendSafeEnergyToTile(TileEntityEnergy tile) 
	{
		if (lastRecievedTile != null)
			if (tile == lastRecievedTile)
				return;
		
		if (tile != null)
		{
			if (tile.CanInput)
			{
				if (EnergyStored >= MaxOutput)
				{
					if (tile.EnergyStored + MaxOutput >= tile.MaxEnergy) 
					{
						tile.EnergyStored = tile.MaxEnergy;
						return;
					}
					
					tile.lastRecievedTile = this;
					EnergyStored =- MaxOutput;
					if (EnergyStored < 0)
						EnergyStored = 0;
					tile.SendSafeEnergy(MaxOutput);
				}
			}
		}
	}
	
	public void SendSafeEnergy(double amount) 
	{
		if (!IsSafeGuarded)
		{
			EnergyStored += amount;
		} else
		{
			if (EnergyStored + amount < MaxEnergy)
				EnergyStored += amount;
			else
				EnergyStored = MaxEnergy;
		}
		
		if (EnergyStored > MaxEnergy)
			OnOverflow();
	}
	
	public static TileEntityEnergy PosToEnergyTile(World world, BlockPos pos) 
	{
		return (TileEntityEnergy) world.getTileEntity(pos);
	}

	@Override
	public double PullEnergy(EnumFacing side, double amount, boolean simulate) 
	{
		double energyToGive = Math.min(GetEnergy(), amount);
		
		if (energyToGive < 0.0001 || (side != null && !SideIsOutput(side)))
		{
			return 0;
		}
		if (!simulate)
		{
			SetEnergy(GetEnergy() - energyToGive);
		}
		
		return energyToGive;
	}
	
	@Override
	public double ReceiveEnergy(EnumFacing side, double amount, boolean simulate) 
	{
		double energyToUse = Math.min(GetMaxEnergy() - GetEnergy(), amount);
		
		if (energyToUse < 0.0001 || (side != null && !SideIsInput(side)))
		{
			return 0;
		}
		if (!simulate)
		{
			SetEnergy(GetEnergy() + energyToUse);
		}
		
		return energyToUse;
	}
	
	public void SetSafeUnguarded() 
	{
		IsSafeGuarded = false;
	}
	
	@Override
	public double GetEnergy() 
	{
		return EnergyStored;
	}

	@Override
	public double GetMaxEnergy() 
	{
		return MaxEnergy;
	}

	@Override
	public void SetEnergy(double energy) 
	{
		EnergyStored = energy;
		
		if (EnergyStored > MaxEnergy)
			OnOverflow();
	}

	@Override
	public void SetMaxEnergy(double maxEnergy) 
	{
		MaxEnergy = maxEnergy;
	}
	
	@Override
	public double GetMaxOutput() 
	{
		return MaxOutput;
	}

	@Override
	public boolean CanReceiveEnergy(EnumFacing side) 
	{
		return CanInput;
	}

	@Override
	public boolean CanOutputEnergy(EnumFacing side) 
	{
		return CanOutput;
	}

	@Override
	public boolean SideIsOutput(EnumFacing side) 
	{
		return true;
	}

	@Override
	public boolean SideIsInput(EnumFacing side) 
	{
		return true;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbtTags)
	{
		super.readFromNBT(nbtTags);

		EnergyStored = nbtTags.getDouble("EnergyStored");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTags)
	{
		nbtTags.setDouble("EnergyStored", GetEnergy());
		
		return nbtTags;
	}
	
	public int GetScaledEnergyLevel(int i)
	{
		return (int) (GetEnergy() * i / GetMaxEnergy());
	}

	@Override
	public abstract void OnOverflow();
	public abstract void OnEnergySent(List<TileEntityEnergy> updatedTiles);	
}