package ga.scmc.worldgen.dimkaldir;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.MapGenCaves;

public class KaldirGenCaves extends MapGenCaves {

	@Override
	protected boolean canReplaceBlock(IBlockState p_175793_1_, IBlockState p_175793_2_) {
		Block test = p_175793_1_.getBlock();
		return (test == BlockHandler.FROZEN_STONE_KALDIR || test == Blocks.SNOW || test == Blocks.SNOW_LAYER || test == Blocks.ICE  || test == Blocks.PACKED_ICE ? true
				: (test == Blocks.SAND || test == Blocks.GRAVEL) && p_175793_2_.getMaterial() != Material.LAVA);
	}
}
