package com.arpaesis.scmc.items;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.enums.MetaHandler.MineralType;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemMineralShard extends SCItem implements IMetaRenderHandler
{

	public ItemMineralShard()
	{
		super("mineral");
		setCreativeTab(SCCreativeTabs.MISC);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (this.isInCreativeTab(tab))
		{
			for (int i = 0; i < MineralType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < MineralType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + MineralType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + MineralType.BLUE.getName();
	}

	@Override
	public int getItemCount()
	{
		return MineralType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "mineral." + MineralType.values()[meta].getName();
	}
}