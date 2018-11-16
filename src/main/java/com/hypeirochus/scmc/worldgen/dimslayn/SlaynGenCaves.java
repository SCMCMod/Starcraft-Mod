package com.hypeirochus.scmc.worldgen.dimslayn;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.MapGenCaves;

public class SlaynGenCaves extends MapGenCaves
{

	@Override
	protected boolean canReplaceBlock(IBlockState p_175793_1_, IBlockState p_175793_2_)
	{
		Block test = p_175793_1_.getBlock();
		return (test == BlockHandler.STONE_SLAYN || test == Blocks.GRASS ? true : (test == BlockHandler.SAND_SLAYN || test == BlockHandler.GRAVEL_SLAYN || test == BlockHandler.DIRT_SLAYN) && p_175793_2_.getMaterial() != Material.LAVA);
	}
}
