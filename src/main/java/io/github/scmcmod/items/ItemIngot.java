package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.enums.MetaHandler.IngotType;
import io.github.scmcmod.handlers.IMetaRenderHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemIngot extends SCItem implements IMetaRenderHandler
{

	public ItemIngot()
	{
		super("ingot");
		setCreativeTab(SCCreativeTabs.MISC);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (this.isInCreativeTab(tab))
		{
			for (int i = 0; i < IngotType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < IngotType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + IngotType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + IngotType.STEEL.getName();
	}

	@Override
	public int getItemCount()
	{
		return IngotType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "ingot." + MetaHandler.IngotType.values()[meta].getName();
	}
}