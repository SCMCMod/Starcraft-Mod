package com.ruthless_bug13.rapi.api.fluid.base;

import java.util.List;

import com.ruthless_bug13.rapi.api.ValueStorageHandler;
import com.ruthless_bug13.rapi.api.fluid.AdvFluidTank;
import com.ruthless_bug13.rapi.api.fluid.IFluidItem;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

//TODO: MOVE TO CORE MOD
public class FluidContainerItem extends Item implements IFluidItem
{
	protected AdvFluidTank handler;
	protected String FluidToShow;
	public double maxFluid;
	
	public FluidContainerItem(int maxFluid)
	{
		this(maxFluid, null);
	}
	
	public FluidContainerItem(int maxFluid, CreativeTabs tab)
	{
		super();
		this.maxFluid = maxFluid;
		this.setCreativeTab(tab);
		setMaxStackSize(1);
		handler = new AdvFluidTank(maxFluid);
	}
	
	@Override
	public boolean showDurabilityBar(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public double getDurabilityForDisplay(ItemStack stack)
	{
		return 1D - (GetDurability(stack) / GetMaxDurability(stack));
	}
	
	public int getRGBDurabilityForDisplay(ItemStack stack)
    {
		return MathHelper.rgb(244, 241, 65);
    }
	
	List<String> lore;
	
	protected void SetEnergyItemLore(List<String> list) 
	{
		lore = list;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		FluidToShow = GetDurability(stack) + "/" + (maxFluid != 0 ? maxFluid : Double.MAX_VALUE) + " MB's";
		if (lore.size() > 0)
		{
			for (String lorePart : lore) 
			{
				tooltip.add(lorePart);
			}
		}
	}
	
	@Override
	public double GetDurability(ItemStack stack) 
	{
		return ValueStorageHandler.GetDouble(stack, "FluidStored");
	}
	
	@Override
	public void SetDurability(ItemStack stack, double amount) 
	{
		ValueStorageHandler.SetDouble(stack, "FluidStored", Math.max(Math.min(amount, GetMaxDurability(stack)), 0));
	}
	
	@Override
	public double GetMaxDurability(ItemStack stack) 
	{
		return maxFluid;
	}
	
	@Override
	public double GetMaxTransfer(ItemStack stack) { return 1; }
	@Override
	public boolean CanReceive(ItemStack stack) { return true; }
	@Override
	public boolean CanSend(ItemStack stack) { return true; }	
}