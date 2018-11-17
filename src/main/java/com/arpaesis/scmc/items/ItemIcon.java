package com.arpaesis.scmc.items;

import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.enums.MetaHandler.IconType;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemIcon extends SCItem implements IMetaRenderHandler
{

	public ItemIcon()
	{
		super("icon");
		setHasSubtypes(true);
		setCreativeTab(null);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < IconType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + IconType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + IconType.PROTOSS.getName();
	}

	@Override
	public int getItemCount()
	{
		return IconType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "icon." + MetaHandler.IconType.values()[meta].getName();
	}
}