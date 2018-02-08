package ga.scmc.worldgen.structure;

import java.util.Random;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.tileentity.TileEntityPlanetTeleporter;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureMultisurfacePlanetTemplate extends SCWorldGenerator {

	@Override
	public boolean generateMultisurfacePlanet(int id, int planetSize, int range, IBlockState block1, IBlockState block2, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		for (int i = 0; i < planetSize; i++) {
			for (int j = 0; j < planetSize; j++) {
				for (int k = 0; k < planetSize; k++) {
					if (rand.nextInt(100) < 70) {
						world.setBlockState(pos.add(i, j, k), block1);
					} else {
						world.setBlockState(pos.add(i, j, k), block2);
					}
				}
			}
		}

		world.setTileEntity(pos.add(planetSize / 2, planetSize / 2, planetSize / 2), new TileEntityPlanetTeleporter(id, range));
		world.setBlockState(pos.add(planetSize / 2, planetSize / 2, planetSize / 2), BlockHandler.PLANET_TELEPORTER.getDefaultState(), 2);

		return true;
	}
}