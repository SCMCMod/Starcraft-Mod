package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.ProtossUpgradeType;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class ItemProtossUpgrade extends StarcraftItem implements IMetaRenderHandler
{

	public ItemProtossUpgrade()
	{
		super("protoss.upgrade");
		setHasSubtypes(true);
		setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (this.isInCreativeTab(tab))
		{
			for (int i = 0; i < ProtossUpgradeType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		for (int i = 0; i < ProtossUpgradeType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getUnlocalizedName() + "." + ProtossUpgradeType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getUnlocalizedName() + "." + ProtossUpgradeType.SPEED.getName();
	}

	@Override
	public int getItemCount()
	{
		return ProtossUpgradeType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "protoss.upgrade." + ProtossUpgradeType.values()[meta].getName();
	}
}