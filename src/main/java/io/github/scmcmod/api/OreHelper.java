package io.github.scmcmod.api;

import io.github.scmcmod.handlers.DimensionHandler;
import io.github.scmcmod.init.StarCraftBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

public class OreHelper {

    public static IBlockState getDimensionOreBase(DimensionType dimension) {
    	switch (dimension) {
			case OVERWORLD:
				return Blocks.STONE.getDefaultState();
			case NETHER:
				return Blocks.NETHERRACK.getDefaultState();
			case THE_END:
				return Blocks.END_STONE.getDefaultState();
			default:
				break;
		}
		if (dimension == DimensionHandler.char_dt)
			return StarCraftBlocks.STONE_CHAR.getDefaultState();
		if (dimension == DimensionHandler.shakuras_dt)
			return StarCraftBlocks.STONE_SHAKURAS.getDefaultState();
		if (dimension == DimensionHandler.slayn_dt)
			return StarCraftBlocks.STONE_SLAYN.getDefaultState();
		if (dimension == DimensionHandler.zerus_dt)
			return StarCraftBlocks.STONE_ZERUS.getDefaultState();
		return Blocks.STONE.getDefaultState();
    }

}
