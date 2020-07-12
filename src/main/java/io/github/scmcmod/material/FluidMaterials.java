package io.github.scmcmod.material;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * NOTE: These do not work as fluids! Do NOT use! If you wish to change the map
 * color, consider using {@link Block#getMapColor(IBlockState)}
 */
public class FluidMaterials extends Material
{

	public FluidMaterials(MapColor color)
	{
		super(color);
		this.setReplaceable();
		this.setNoPushMobility();
	}

	/**
	 * Returns if blocks of these materials are liquids.
	 */
	public boolean isLiquid()
	{
		return true;
	}

	/**
	 * Returns if this material is considered solid or not
	 */
	public boolean blocksMovement()
	{
		return false;
	}

	/**
	 * Returns true if the block is a considered solid. This is true by default.
	 */
	public boolean isSolid()
	{
		return false;
	}
}