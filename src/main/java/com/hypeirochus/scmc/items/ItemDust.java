package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.DustType;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemDust extends StarcraftItem implements IMetaRenderHandler
{

	public ItemDust()
	{
		super("dust");
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (this.isInCreativeTab(tab))
		{
			for (int i = 0; i < DustType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		for (int i = 0; i < DustType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getUnlocalizedName() + "." + DustType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getUnlocalizedName() + "." + DustType.STEEL.getName();
	}

	@Override
	public int getItemCount()
	{
		return DustType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "dust." + DustType.values()[meta].getName();
	}
}