package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.enums.MetaHandler.FocuserType;
import io.github.scmcmod.handlers.IMetaRenderHandler;
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
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < FocuserType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + FocuserType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + FocuserType.AIUR.getName();
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