package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.enums.MetaHandler.EnergyType;
import io.github.scmcmod.handlers.IMetaRenderHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemEnergy extends SCItem implements IMetaRenderHandler
{

	public ItemEnergy()
	{
		super("energy");
		setCreativeTab(SCCreativeTabs.MISC);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (this.isInCreativeTab(tab))
		{
			for (int i = 0; i < EnergyType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < EnergyType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + EnergyType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + EnergyType.PURE.getName();
	}

	@Override
	public int getItemCount()
	{
		return EnergyType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "energy." + MetaHandler.EnergyType.values()[meta].getName();
	}
}