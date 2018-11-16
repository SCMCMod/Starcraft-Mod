package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.SCCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.enums.MetaHandler.FocuserType;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemPsiBladeFocuserUncharged extends SCItem implements IMetaRenderHandler
{

	public ItemPsiBladeFocuserUncharged()
	{
		super("protoss.focuser");
		setHasSubtypes(true);
		setCreativeTab(SCCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (isInCreativeTab(tab))
		{
			for (int i = 0; i < FocuserType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		for (int i = 0; i < FocuserType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getUnlocalizedName() + "." + FocuserType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getUnlocalizedName() + "." + FocuserType.AIUR.getName();
	}

	@Override
	public int getItemCount()
	{
		return FocuserType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "protoss.focuser." + MetaHandler.FocuserType.values()[meta].getName();
	}
}