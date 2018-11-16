package com.hypeirochus.scmc.worldgen.dimshakuras;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.MapGenCaves;

public class ShakurasGenCaves extends MapGenCaves
{

	@Override
	protected boolean canReplaceBlock(IBlockState p_175793_1_, IBlockState p_175793_2_)
	{
		Block test = p_175793_1_.getBlock();
		return (test == BlockHandler.STONE_SHAKURAS || test == BlockHandler.DIRT_SHAKURAS || test == BlockHandler.SAND_SHAKURAS ? true : (test == Blocks.SAND || test == Blocks.GRAVEL) && p_175793_2_.getMaterial() != Material.LAVA);
	}
}
