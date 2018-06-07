package com.ruthless_bug13.rapi.api.energy.base;

import java.util.List;

import javax.annotation.Nullable;

import com.hypeirochus.scmc.items.StarcraftItem;
import com.ruthless_bug13.rapi.api.ValueStorageHandler;
import com.ruthless_bug13.rapi.api.energy.IEnergyItem;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * @author Ruthless_Bug13
 * 
 * If extended by an item, it will be considered a energy item. Which can be drained of power, or charged with power.
 */
public class EnergyItem extends StarcraftItem implements IEnergyItem
{
	protected String EnergyToShow;
	public double maxEnergy;
	
	public EnergyItem(String name, double maxEnergy)
	{
		super(name);
		this.maxEnergy = maxEnergy;
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
		return MathHelper.rgb(66, 229, 244);
    }
	
	List<String> lore;
	
	protected void SetEnergyItemLore(List<String> list) 
	{
		lore = list;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		EnergyToShow = GetDurability(stack) + "/" + (maxEnergy != 0 ? maxEnergy : Double.MAX_VALUE);
		tooltip.add(EnergyToShow);
		/*if (lore.size() > 0)
		{
			for (String lorePart : lore) 
			{
				tooltip.add(lorePart);
			}
		}*/
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
		if (tab == this.getCreativeTab())
		{
			ItemStack uncharged = new ItemStack(this);
			items.add(uncharged);
			ItemStack charged = new ItemStack(this);
			SetDurability(charged, ((IEnergyItem) charged.getItem()).GetMaxDurability(charged));
			items.add(charged);
		}
    }
	
	@Override
	public double GetDurability(ItemStack itemStack) 
	{
		return ValueStorageHandler.GetDouble(itemStack, "EnergyStored");
	}

	@Override
	public void SetDurability(ItemStack itemStack, double amount) 
	{
		ValueStorageHandler.SetDouble(itemStack, "EnergyStored", Math.max(Math.min(amount, GetMaxDurability(itemStack)), 0));
	}

	@Override
	public double GetMaxDurability(ItemStack itemStack) 
	{
		return maxEnergy;
	}

	@Override
	public double GetMaxTransfer(ItemStack itemStack) 
	{
		return GetMaxDurability(itemStack) * 0.005;
	}

	@Override
	public boolean CanReceive(ItemStack itemStack) 
	{
		return GetMaxDurability(itemStack) - GetDurability(itemStack) > 0;
	}

	@Override
	public boolean CanSend(ItemStack itemStack) 
	{
		return GetDurability(itemStack) > 0;
	}
}