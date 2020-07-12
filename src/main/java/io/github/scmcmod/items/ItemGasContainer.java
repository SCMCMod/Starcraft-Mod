package io.github.scmcmod.items;

import io.github.scmcmod.blocks.metablocks.BlockGasCollector.GasCollectorType;
import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.enums.MetaHandler.ContainerType;
import io.github.scmcmod.handlers.IMetaRenderHandler;
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