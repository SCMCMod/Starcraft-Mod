package com.arpaesis.scmc.items;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.enums.MetaHandler.VespeneType;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemVespene extends SCItem implements IMetaRenderHandler
{

	public ItemVespene()
	{
		super("vespene");
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (tab == CreativeTabs.SEARCH)
		{
			for (int i = 0; i < VespeneType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		} else
		{
			if (tab == SCCreativeTabs.MISC)
				items.add(new ItemStack(this, 1, 0));
			if (tab == SCCreativeTabs.PROTOSS)
				items.add(new ItemStack(this, 1, 1));
			if (tab == SCCreativeTabs.TERRAN)
				items.add(new ItemStack(this, 1, 2));
			if (tab == SCCreativeTabs.ZERG)
				items.add(new ItemStack(this, 1, 3));
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < VespeneType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + VespeneType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + VespeneType.RAW.getName();
	}

	@Override
	public int getItemCount()
	{
		return MetaHandler.VespeneType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "vespene." + MetaHandler.VespeneType.values()[meta].getName();
	}
}