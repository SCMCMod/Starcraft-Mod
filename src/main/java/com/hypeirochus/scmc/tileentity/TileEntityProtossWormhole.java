package com.hypeirochus.scmc.tileentity;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 *
 */
public class TileEntityProtossWormhole extends TileEntity {

	public int getColor() {
		IBlockState block = world.getBlockState(pos.down(3));

//		if (block == BlockHandler.PROTOSS_ENERGY_STABILIZER.getDefaultState()) {
//			return 0xFF42CEF4;
//		}
//
//		if (block == BlockHandler.PROTOSS_DARK_ENERGY_STABILIZER.getDefaultState()) {
//			return 0xFFFF0000;
//		}
//
//		if (block == BlockHandler.PROTOSS_VOID_ENERGY_STABILIZER.getDefaultState()) {
//			return 0xFF00FF00;
//		}

		return 0;
	}
}