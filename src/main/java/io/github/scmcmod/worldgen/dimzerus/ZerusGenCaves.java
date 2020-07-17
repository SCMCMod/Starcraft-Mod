package io.github.scmcmod.worldgen.dimzerus;

import io.github.scmcmod.init.StarCraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.MapGenCaves;

public class ZerusGenCaves extends MapGenCaves
{

	@Override
	protected boolean canReplaceBlock(IBlockState p_175793_1_, IBlockState p_175793_2_)
	{
		Block test = p_175793_1_.getBlock();
		return (test == StarCraftBlocks.STONE_ZERUS || test == Blocks.GRASS ? true : (test == StarCraftBlocks.SAND_ZERUS || test == StarCraftBlocks.GRAVEL_ZERUS) && p_175793_2_.getMaterial() != Material.LAVA);
	}
}
