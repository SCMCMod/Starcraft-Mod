package io.github.scmcmod.items;

import io.github.scmcmod.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class SCSword extends ItemSword
{

	public SCSword(ToolMaterial material)
	{
		super(material);
	}

	public SCSword(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(name);
		this.setTranslationKey(name);
		ItemHandler.register(this);
	}

	@Override
	public SCSword setCreativeTab(CreativeTabs tab)
	{
		return (SCSword) super.setCreativeTab(tab);
	}
}