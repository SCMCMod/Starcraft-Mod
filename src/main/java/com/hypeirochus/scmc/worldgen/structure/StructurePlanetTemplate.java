package com.hypeirochus.scmc.worldgen.structure;

import java.util.Random;

import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.tileentity.TileEntityPlanetTeleporter;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructurePlanetTemplate extends SCWorldGenerator {

	@Override
	public boolean generatePlanet(int id, int planetSize, int range, IBlockState block, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		for (int i = 0; i < planetSize; i++) {
			for (int j = 0; j < planetSize; j++) {
				for (int k = 0; k < planetSize; k++) {
					world.setBlockState(pos.add(i, j, k), block);
				}
			}
		}

		world.setTileEntity(pos.add(planetSize / 2, planetSize / 2, planetSize / 2), new TileEntityPlanetTeleporter(id, range));
		world.setBlockState(pos.add(planetSize / 2, planetSize / 2, planetSize / 2), BlockHandler.PLANET_TELEPORTER.getDefaultState(), 2);

		return true;
	}
}