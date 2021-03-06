package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.MetaHandler.DustType;
import io.github.scmcmod.handlers.IMetaRenderHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemDust extends SCItem implements IMetaRenderHandler
{

	public ItemDust()
	{
		super("dust");
		setCreativeTab(SCCreativeTabs.MISC);
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
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < DustType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + DustType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + DustType.STEEL.getName();
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