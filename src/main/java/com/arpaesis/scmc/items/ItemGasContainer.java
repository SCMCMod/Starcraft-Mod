package com.arpaesis.scmc.items;

import com.arpaesis.scmc.blocks.metablocks.BlockGasCollector.GasCollectorType;
import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.enums.MetaHandler.ContainerType;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemGasContainer extends SCItem implements IMetaRenderHandler
{

	public ItemGasContainer()
	{
		super("container");
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (tab == CreativeTabs.SEARCH)
		{
			for (int i = 0; i < GasCollectorType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		} else
		{
			if (tab == SCCreativeTabs.PROTOSS)
				items.add(new ItemStack(this, 1, 0));
			if (tab == SCCreativeTabs.TERRAN)
				items.add(new ItemStack(this, 1, 1));
			if (tab == SCCreativeTabs.ZERG)
				items.add(new ItemStack(this, 1, 2));
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < ContainerType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + ContainerType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + ContainerType.PROTOSS.getName();
	}

	@Override
	public int getItemCount()
	{
		return ContainerType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "container." + MetaHandler.ContainerType.values()[meta].getName();
	}
}