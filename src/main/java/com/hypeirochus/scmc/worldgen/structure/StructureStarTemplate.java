package com.hypeirochus.scmc.worldgen.structure;

import java.util.Random;

import com.hypeirochus.scmc.blocks.metablocks.BlockStarSurface;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.tileentity.TileEntitySolarCore;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureStarTemplate extends SCWorldGenerator {

	public int	checkCounter;
	public int	metaStarColor	= 0;

	@Override
	public boolean generateStar(int starSize, int range, IBlockState block, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {

		System.out.println("generating stars!");
		for (int i = 0; i < starSize; i++) {
			for (int j = 0; j < starSize; j++) {
				for (int k = 0; k < starSize; k++) {
					world.setBlockState(pos.add(i, j, k), block);
				}
			}
		}

		world.setTileEntity(pos.add(starSize / 2, starSize / 2, starSize / 2), new TileEntitySolarCore(range));
		world.setBlockState(pos.add(starSize / 2, starSize / 2, starSize / 2), BlockHandler.SOLAR_CORE.getDefaultState(), 2);

		return true;
	}

	@Override
	public boolean generateRandomStar(int starSize, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {

		preselectStarColor(rand);

		for (int i = 0; i < starSize; i++) {
			for (int j = 0; j < starSize; j++) {
				for (int k = 0; k < starSize; k++) {
					world.setBlockState(pos.add(i, j, k), BlockHandler.STAR_SURFACE.getStateFromMeta(metaStarColor));
				}
			}
		}

		world.setTileEntity(pos.add(starSize / 2, starSize / 2, starSize / 2), new TileEntitySolarCore(starSize + 25));
		world.setBlockState(pos.add(starSize / 2, starSize / 2, starSize / 2), BlockHandler.SOLAR_CORE.getDefaultState(), 2);

		return true;
	}

	public void preselectStarColor(Random rand) {
		this.metaStarColor = rand.nextInt(BlockStarSurface.StarSurfaceType.values().length);
	}
}