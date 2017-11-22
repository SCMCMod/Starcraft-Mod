package ga.scmc.worldgen.dimkorhal;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.MapGenCaves;

public class KorhalGenCaves extends MapGenCaves {

	@Override
	protected boolean canReplaceBlock(IBlockState p_175793_1_, IBlockState p_175793_2_) {
		Block test = p_175793_1_.getBlock();
		return (test == Blocks.STONE || test == Blocks.RED_SANDSTONE || test == Blocks.SAND ? true
				: (test == Blocks.SAND || test == Blocks.GRAVEL) && p_175793_2_.getMaterial() != Material.LAVA);
	}
}
