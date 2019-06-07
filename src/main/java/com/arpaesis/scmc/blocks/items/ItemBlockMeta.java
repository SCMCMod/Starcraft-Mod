package com.arpaesis.scmc.blocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Creates an ItemBlock for the blocks that have meta data. Must be specified by
 * the block in registry.
 * 
 * @see ItemBlock
 */
//TODO: MOVE TO CORE MOD
public class ItemBlockMeta extends ItemBlock
{
	public ItemBlockMeta(Block block)
	{
		super(block);

		if (!(block instanceof IMetaBlockName))
		{
			throw new IllegalArgumentException(String.format("The given Block %s is not an instance of IMetaBlockName!", block.getRegistryName()));
		}

		setHasSubtypes(true);
		setMaxDamage(0);
	}

	@Override
	public String getUnlocalizedNameInefficiently(ItemStack stack)
	{
		return this.getTranslationKey() + "." + ((IMetaBlockName) this.block).getSpecialName(stack);
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
}
