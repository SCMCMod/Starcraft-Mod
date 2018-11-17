package com.arpaesis.scmc.items;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.enums.MetaHandler.CarapaceType;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemZergCarapace extends SCItem implements IMetaRenderHandler
{

	public ItemZergCarapace()
	{
		super("zerg.icarapace");
		setHasSubtypes(true);
		setCreativeTab(SCCreativeTabs.ZERG);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (isInCreativeTab(tab))
		{
			for (int i = 0; i < CarapaceType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < CarapaceType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + CarapaceType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + CarapaceType.T1.getName();
	}

	@Override
	public int getItemCount()
	{
		return CarapaceType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "zerg.icarapace." + CarapaceType.values()[meta].getName();
	}
}