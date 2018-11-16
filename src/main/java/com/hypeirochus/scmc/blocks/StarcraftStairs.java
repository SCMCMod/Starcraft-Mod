package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

//TODO: MOVE TO CORE MOD, AND make this generically named.
public class StarcraftStairs extends BlockStairs
{

	private RegistryType type;
	private ItemBlock item;

	public StarcraftStairs(IBlockState material)
	{
		super(material);
	}

	public StarcraftStairs(String name, RegistryType type, IBlockState material)
	{
		super(material);
		this.type = type;
		this.setNames(name);
		this.registerPre();
	}

	public StarcraftStairs(RegistryType type, IBlockState material)
	{
		super(material);
		this.type = type;
		this.registerPre();
	}

	public void registerPre()
	{
		if (type == RegistryType.FULL)
		{
			if (item == null)
			{
				BlockHandler.registerFullBlock(this);
			} else
			{
				BlockHandler.registerBlockWithItemBlock(this, item);
			}
		} else if (type == RegistryType.BLOCK)
		{
			BlockHandler.register(this);
		}
	}

	public void setNames(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	@Override
	public StarcraftStairs setSoundType(SoundType sound)
	{
		return (StarcraftStairs) super.setSoundType(sound);
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass Class
	 * @param level Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 */
	public StarcraftStairs setBlockHarvestLevel(String toolClass, int level)
	{
		setHarvestLevel(toolClass, level);
		return this;
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass Class
	 * @param level Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 * @param state The specific state.
	 */
	public StarcraftStairs setBlockHarvestLevel(String toolClass, int level, IBlockState state)
	{
		setHarvestLevel(toolClass, level, state);
		return this;
	}

	public StarcraftStairs setItemBlock(ItemBlock item)
	{
		this.item = item;
		return this;
	}
}