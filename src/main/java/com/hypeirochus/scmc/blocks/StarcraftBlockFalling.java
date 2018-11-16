package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

//TODO: MOVE TO CORE MOD, AND make this generically named.
public class StarcraftBlockFalling extends BlockFalling
{

	private ItemBlock item;

	private final MapColor mapColor;
	private final int dustColor;

	public StarcraftBlockFalling(Material material, int dustColor)
	{
		super(material);
		this.mapColor = material.getMaterialMapColor();
		this.dustColor = dustColor;
	}

	public StarcraftBlockFalling(Material material, MapColor color, int dustColor)
	{
		super(material);
		this.mapColor = color;
		this.dustColor = dustColor;
	}

	public StarcraftBlockFalling(String name, RegistryType type, Material material, int dustColor)
	{
		this(name, type, material, material.getMaterialMapColor(), dustColor);
	}

	public StarcraftBlockFalling(RegistryType type, Material material, int dustColor)
	{
		this(type, material, material.getMaterialMapColor(), dustColor);
	}

	public StarcraftBlockFalling(String name, RegistryType type, Material material, MapColor color, int dustColor)
	{
		super(material);
		this.mapColor = color;
		this.dustColor = dustColor;
		this.setNames(name);
		this.registerPre(type);
	}

	public StarcraftBlockFalling(RegistryType type, Material material, MapColor color, int dustColor)
	{
		super(material);
		this.mapColor = color;
		this.dustColor = dustColor;
		this.registerPre(type);
	}

	public void registerPre(RegistryType type)
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
		} else
		{
			throw new IllegalArgumentException(String.format("The registry type %s for block %s is not currently supported. Either add support for it or change the type of registry.", type, this.getRegistryName()));
		}
	}

	public void setNames(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	@Override
	public StarcraftBlockFalling setSoundType(SoundType sound)
	{
		return (StarcraftBlockFalling) super.setSoundType(sound);
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass Class
	 * @param level Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 */
	public StarcraftBlockFalling setBlockHarvestLevel(String toolClass, int level)
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
	public StarcraftBlockFalling setBlockHarvestLevel(String toolClass, int level, IBlockState state)
	{
		setHarvestLevel(toolClass, level, state);
		return this;
	}

	public StarcraftBlockFalling setItemBlock(ItemBlock item)
	{
		this.item = item;
		return this;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		return mapColor;
	}

	@Override
	public int getDustColor(IBlockState state)
	{
		return dustColor;
	}
}