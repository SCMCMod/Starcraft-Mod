package com.arpaesis.scmc.creativetabs;

import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.handlers.BlockHandler;
import com.arpaesis.scmc.handlers.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Holds all the classes creative tabs.
 */
public class SCCreativeTabs
{

	public static final CreativeTabs PROTOSS = new SCTab("protoss", "item_search_protoss.png")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.PROTOSS.getID());
		}
	};

	public static final CreativeTabs TERRAN = new SCTab("terran", "item_search_terran.png")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.TERRAN.getID());
		}
	};

	public static final CreativeTabs ZERG = new SCTab("zerg", "item_search_zerg.png")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.ZERG.getID());
		}
	};
	public static final CreativeTabs MISC = new SCTab("misc", "item_search.png")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(ItemHandler.ENERGY, 1, 0);
		}
	};
	public static final CreativeTabs FLORA = new SCTab("flora", "item_search.png")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(BlockHandler.FLORA_ZERUS_GLOW_POD, 1, 0);
		}
	};
	public static final CreativeTabs BOOKS = new SCTab("books", "item_search.png")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(ItemHandler.LOG, 1, 0);
		}
	};
}