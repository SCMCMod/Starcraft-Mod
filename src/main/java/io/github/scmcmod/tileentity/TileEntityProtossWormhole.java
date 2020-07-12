package io.github.scmcmod.tileentity;

import io.github.scmcmod.init.StarCraftBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class TileEntityProtossWormhole extends TileEntity
{

	public int getColor()
	{
		IBlockState block = world.getBlockState(pos.down(3));

		if (block == StarCraftBlocks.PROTOSS_ENERGY_STABILIZER.getDefaultState())
		{
			return 0x5542CEF4;
		}

		if (block == StarCraftBlocks.PROTOSS_DARK_ENERGY_STABILIZER.getDefaultState())
		{
			return 0x55FF0000;
		}

		if (block == StarCraftBlocks.PROTOSS_VOID_ENERGY_STABILIZER.getDefaultState())
		{
			return 0x5500FF00;
		}

		return 0x55ffffff;
	}
}