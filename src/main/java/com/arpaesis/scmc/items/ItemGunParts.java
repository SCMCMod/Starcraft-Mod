package com.arpaesis.scmc.items;

import com.arpaesis.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * Represents the parts that can be required to construct a gun or advanced
 * weapon.
 * 
 * @author Ocelot5836
 */
public class ItemGunParts extends SCItem implements IMetaRenderHandler
{

	private final String name;
	private final int numParts;

	public ItemGunParts(String name, int numParts)
	{
		super(name);
		this.name = name;
		this.numParts = numParts;
		this.setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (isInCreativeTab(tab))
		{
			for (int i = 0; i < numParts; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < numParts; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + i;
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + ".0";
	}

	public int getNumParts()
	{
		return numParts;
	}

	@Override
	public ItemGunParts setCreativeTab(CreativeTabs tab)
	{
		return (ItemGunParts) super.setCreativeTab(tab);
	}

	@Override
	public int getItemCount()
	{
		return numParts;
	}

	@Override
	public String getName(int meta)
	{
		return this.name + "." + meta;
	}
}