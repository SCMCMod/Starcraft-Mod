package io.github.scmcmod.worldgen.dimchar;

import io.github.scmcmod.init.StarCraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.MapGenCaves;

public class CharGenCaves extends MapGenCaves
{

	@Override
	protected boolean canReplaceBlock(IBlockState p_175793_1_, IBlockState p_175793_2_)
	{
		Block test = p_175793_1_.getBlock();
		// TODO: Check for char ash once it is re-added to the game.
		return (test == StarCraftBlocks.STONE_CHAR || test == StarCraftBlocks.DIRT_CHAR || test == StarCraftBlocks.ZERG_CREEP ? true : (test == Blocks.SAND || test == Blocks.GRAVEL) && p_175793_2_.getMaterial() != Material.LAVA);
	}
}
