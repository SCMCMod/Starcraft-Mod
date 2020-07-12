package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.enums.MetaHandler.ProtossIngotType;
import io.github.scmcmod.handlers.IMetaRenderHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemProtossIngot extends SCItem implements IMetaRenderHandler
{

	public ItemProtossIngot()
	{
		super("protoss.ingot");
		setCreativeTab(SCCreativeTabs.PROTOSS);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (this.isInCreativeTab(tab))
		{
			for (int i = 0; i < ProtossIngotType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < ProtossIngotType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + ProtossIngotType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + ProtossIngotType.KHALAI.getName();
	}

	@Override
	public int getItemCount()
	{
		return ProtossIngotType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "protoss.ingot." + MetaHandler.ProtossIngotType.values()[meta].getName();
	}
}