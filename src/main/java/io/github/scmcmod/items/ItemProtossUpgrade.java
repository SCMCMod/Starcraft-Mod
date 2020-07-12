package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.MetaHandler.ProtossUpgradeType;
import io.github.scmcmod.handlers.IMetaRenderHandler;
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
public class ItemProtossUpgrade extends SCItem implements IMetaRenderHandler
{

	public ItemProtossUpgrade()
	{
		super("protoss.upgrade");
		setHasSubtypes(true);
		setMaxStackSize(1);
		setCreativeTab(SCCreativeTabs.PROTOSS);
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
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < ProtossUpgradeType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + ProtossUpgradeType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + ProtossUpgradeType.SPEED.getName();
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