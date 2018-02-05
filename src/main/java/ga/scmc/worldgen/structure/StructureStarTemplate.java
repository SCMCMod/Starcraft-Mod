package ga.scmc.worldgen.structure;

import java.util.Random;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.tileentity.TileEntitySolarCore;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureStarTemplate extends SCWorldGenerator {

	@Override
	public boolean generateStar(int starSize, int range, IBlockState block, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		for(int i = 0; i < starSize; i++) {
			for(int j = 0; j < starSize; j++) {
				for(int k = 0; k < starSize; k++) {
					world.setBlockState(pos.add(i, j, k), block);
				}
			}
		}

		world.setTileEntity(pos.add(starSize/2, starSize/2, starSize/2), new TileEntitySolarCore(range));
		world.setBlockState(pos.add(starSize/2, starSize/2, starSize/2), BlockHandler.SOLAR_CORE.getDefaultState(), 2);
		
		return true;
	}
}