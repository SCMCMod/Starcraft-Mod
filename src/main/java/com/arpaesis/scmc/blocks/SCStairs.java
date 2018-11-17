package com.arpaesis.scmc.blocks;

import com.arpaesis.scmc.handlers.BlockHandler;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

//TODO: MOVE TO CORE MOD, AND make this generically named.
public class SCStairs extends BlockStairs
{

	private RegistryType type;
	private ItemBlock item;

	public SCStairs(IBlockState material)
	{
		super(material);
	}

	public SCStairs(String name, RegistryType type, IBlockState material)
	{
		super(material);
		this.type = type;
		this.setNames(name);
		this.registerPre();
	}

	public SCStairs(RegistryType type, IBlockState material)
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
	public SCStairs setSoundType(SoundType sound)
	{
		return (SCStairs) super.setSoundType(sound);
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass Class
	 * @param level Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 */
	public SCStairs setBlockHarvestLevel(String toolClass, int level)
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
	public SCStairs setBlockHarvestLevel(String toolClass, int level, IBlockState state)
	{
		setHarvestLevel(toolClass, level, state);
		return this;
	}

	public SCStairs setItemBlock(ItemBlock item)
	{
		this.item = item;
		return this;
	}
}