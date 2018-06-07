package com.ruthless_bug13.rapi.api.energy.base.examples;

import java.util.List;

import com.ruthless_bug13.rapi.api.energy.EnergyItemHandler;
import com.ruthless_bug13.rapi.api.energy.IEnergyItem;
import com.ruthless_bug13.rapi.api.machine.IFuelHolder;
import com.ruthless_bug13.rapi.api.tileentity.TileEntityEnergy;
import com.ruthless_bug13.rapi.api.util.ChargeDepot;
import com.ruthless_bug13.rapi.api.util.ItemStackUtil;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;

/*public class TileEntityCoalGenerator extends TileEntityEnergy implements ITickable, IFuelHolder
{
	private int MaxBurnTime;
	private int BurnTime;
	
	public TileEntityCoalGenerator() 
	{
		super("machine.CoalGenerator", 2500, 10, 3, 0, 5);
	}
	
	public void update()
	{
		if(!world.isRemote)
		{
			if (inventory != null)
			{
				if (inventory.getStackInSlot(0) != null && BurnTime <= 0 && TileEntityFurnace.isItemFuel(inventory.getStackInSlot(0))) 
				{
					MaxBurnTime = TileEntityFurnace.getItemBurnTime(inventory.getStackInSlot(0)) - (30 * 45);
					BurnTime = TileEntityFurnace.getItemBurnTime(inventory.getStackInSlot(0)) - (30 * 45);
					ItemStackUtil.ReduceSize(inventory.getStackInSlot(0));
					if (inventory.getStackInSlot(0).getCount() <= 0) 
					{
						inventory.setStackInSlot(0, null);
					}
				} else if (BurnTime >= 1)
				{
					if (this.GetEnergy() < this.GetMaxEnergy())
						BurnTime--;
					if (this.GetEnergy() < this.GetMaxEnergy())
						this.EnergyStored += this.EnergyPerTick;
				}
				
				// Charging slots. (Optional)
				double ChargeRate = 1;
				ChargeDepot.AddChargeToChargable(inventory.getStackInSlot(1), this, ChargeRate);
				ChargeDepot.RemoveChargeFromChargable(inventory.getStackInSlot(2), this, 1);
			}
		}
	}

	@Override
	public int GetFuelAmount() 
	{
		return BurnTime;
	}

	@Override
	public int GetMaxFuelAmount() 
	{
		return MaxBurnTime;
	}

	@Override
	public void SetFuelAmount(int data) 
	{
		this.BurnTime = data;
	}

	@Override
	public void SetMaxFuel(int data) 
	{
		this.MaxBurnTime = data;
	}

	@Override
	public void OnOverflow() {}

	@Override
	public void OnEnergySent(List<TileEntityEnergy> updatedTiles) {}

	@Override
	public void BlockTick() {
		// TODO Auto-generated method stub
		
	}
}*/