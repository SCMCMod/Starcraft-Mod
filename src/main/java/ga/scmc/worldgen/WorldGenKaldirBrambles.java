package ga.scmc.worldgen;

import java.util.Random;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenKaldirBrambles extends WorldGenerator {
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		for (int i = 0; i < 10; ++i) {
			int j = position.getX() + rand.nextInt(8) - rand.nextInt(8);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(8) - rand.nextInt(8);

			if (worldIn.isAirBlock(new BlockPos(j, k, l)) && BlockHandler.FLORA_KALDIR_BRAMBLES.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))) {
				worldIn.setBlockState(new BlockPos(j, k, l), BlockHandler.FLORA_KALDIR_BRAMBLES.getDefaultState(), 2);
			}
		}

		return true;
	}
}