package ga.scmc.worldgen.dimzerus;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.MapGenCaves;

public class ZerusGenCaves extends MapGenCaves {

	@Override
	protected boolean canReplaceBlock(IBlockState p_175793_1_, IBlockState p_175793_2_) {
		Block test = p_175793_1_.getBlock();
		return (test == BlockHandler.STONE_ZERUS || test == Blocks.GRASS ? true
				: (test == BlockHandler.SAND_ZERUS || test == BlockHandler.GRAVEL_ZERUS) && p_175793_2_.getMaterial() != Material.LAVA);
	}
}
