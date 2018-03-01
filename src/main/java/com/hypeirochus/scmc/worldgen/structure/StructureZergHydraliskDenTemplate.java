package com.hypeirochus.scmc.worldgen.structure;

import java.util.Random;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureZergHydraliskDenTemplate extends SCWorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		generate_r0(world, rand, offsetX, offsetY, offsetZ, pos, flag);
		return true;
	}

	public boolean generate_r0(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		if (flag) {
			if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(24, 0, 0)) || !LocationIsValidSpawn(world, pos.add(24, 0, 24)) || !LocationIsValidSpawn(world, pos.add(0, 0, 24))) {
				return false;
			}
		}
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 4, y + 0, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 0, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 0, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 0, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 0, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 0, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 0, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 0, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 8, y + 0, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 0, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 0, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 0, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 0, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 0, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 8, y + 0, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 9, y + 0, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 8, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 9, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 10, y + 0, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 8, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 9, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 10, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 11, y + 0, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 8, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 9, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 10, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 11, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 12, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 15, y + 0, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 8, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 9, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 10, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 11, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 12, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 13, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 14, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 15, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 16, y + 0, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 0, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 0, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 0, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 0, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 0, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 0, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 0, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 0, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 11, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 0, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 1, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 1, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 1, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 1, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 1, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 1, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 1, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 1, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 1, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 1, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 1, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 1, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 1, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 1, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 1, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 1, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 1, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 1, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 1, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 1, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 1, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 1, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 1, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 1, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 1, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 1, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 1, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 1, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 1, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 1, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 1, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 1, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 1, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 2, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 2, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 2, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 2, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 2, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 2, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 2, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 2, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 2, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 2, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 2, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 2, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 2, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 2, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 2, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 2, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 2, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 2, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 2, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 2, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 2, z + 6), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 2, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 2, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 2, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 2, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 2, z + 7), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 2, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 2, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 2, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 2, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 9), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 19, y + 2, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 2, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 2, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 2, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 2, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 2, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 2, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 2, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 2, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 2, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 2, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		spawn1(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { BlockHandler.ZERG_CREEP };
	}

	public boolean LocationIsValidSpawn(World world, BlockPos pos) {

		Block checkBlock = world.getBlockState(pos).getBlock();
		Material m = checkBlock.getDefaultState().getMaterial();
		Block blockAbove = world.getBlockState(pos.up()).getBlock();
		Block blockBelow = world.getBlockState(pos.down()).getBlock();

		for (Block i : GetValidSpawnBlocks()) {
			if (blockAbove != Blocks.AIR) {
				return false;
			}
			if (checkBlock == i) {
				return true;
			} else if (m == Material.PLANTS && blockBelow == i) {
				return true;
			}
		}
		return false;
	}

	public boolean spawn1(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 1, y + 2, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 2, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 2, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 2, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 2, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 2, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 2, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 2, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 2, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 2, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 2, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 2, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 2, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 2, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 2, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 2, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 2, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 21, y + 2, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 22, y + 2, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 2, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 2, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 21, y + 2, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 22, y + 2, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 2, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 2, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 2, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 21, y + 2, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 2, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 2, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 2, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 2, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 2, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 2, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 2, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 2, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 2, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 2, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 2, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 3, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 3, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 3, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 3, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 3, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 3, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 3, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 3, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 3, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 3, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 3, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 3, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 3, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 3, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 3, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 3, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 3, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 3, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 3, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 3, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 3, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 3, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 3, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 3, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 3, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 3, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 3, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 3, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 3, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 3, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 3, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 3, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 3, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 3, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 3, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 3, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 3, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 3, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 3, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 3, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 3, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 3, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 3, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 3, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 3, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 3, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 3, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 3, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 3, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 3, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 3, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 3, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 3, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 3, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 2, y + 3, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 3, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 3, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 3, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 2, y + 3, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 3, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 3, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 3, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 3, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 3, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 3, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 3, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 3, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 3, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 3, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 3, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 3, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 3, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 3, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 3, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 3, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 3, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 3, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 3, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 3, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 3, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 3, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 3, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 3, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 3, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 3, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 3, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 3, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 3, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 3, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 3, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		// TODO: make this a core block! world.setBlockState(pos.add(x+5, y+3, z+19,
		// Block.getBlockById(152));
		world.setBlockState(pos.add(x + 16, y + 3, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 3, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 3, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 3, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 3, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 3, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 3, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 3, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 3, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 3, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 3, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 3, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 3, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 3, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 3, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 3, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 3, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 3, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 3, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 3, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 3, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 3, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 3, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 3, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 3, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 3, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 3, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 3, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 3, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 3, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 3, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 3, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 3, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 3, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 3, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 3, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 3, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 3, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 3, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 4, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 4, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 4, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 4, z + 1), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 4, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 4, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 4, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 4, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 4, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 4, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 4, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 4, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 4, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 4, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 4, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 4, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 4, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 4, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 4, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 4, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 4, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 4, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 4, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 4, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 4, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 4, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 4, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 4, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 4, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 4, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 4, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 4, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 4, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 4, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 4, z + 6), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 4, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 4, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 4, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 4, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 4, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 4, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 4, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 4, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 4, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 4, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 4, z + 7), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 4, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 4, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 4, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 4, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 4, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 4, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 4, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 4, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 4, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 4, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 4, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 4, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 4, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 4, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 4, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 4, z + 9), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 19, y + 4, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 4, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 4, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 4, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 4, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 4, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 2, y + 4, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 4, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 4, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 4, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 2, y + 4, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 4, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 4, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 4, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 4, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 4, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 4, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 4, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 4, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 4, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 4, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 20, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 4, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 4, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 4, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 4, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 4, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 4, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 4, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 4, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 4, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 4, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 4, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 4, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 20, y + 4, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 4, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 4, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 4, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 4, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 4, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 4, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 4, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 4, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 4, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 4, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 24, y + 4, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 4, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 4, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 4, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 4, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 4, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 4, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 4, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 4, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 4, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 4, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 20, y + 4, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 4, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 4, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 4, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 4, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 4, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 4, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 4, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 4, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 4, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 4, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 4, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 4, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 4, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 4, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 4, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 4, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 5, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 5, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 5, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 5, z + 1), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 5, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 5, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		spawn2(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	public boolean spawn2(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 0, y + 5, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 5, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 5, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 5, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 3, y + 5, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 5, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 5, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 5, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 5, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 5, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 5, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 5, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 5, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 5, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 5, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 5, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 5, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 5, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 5, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 5, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 5, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 5, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 5, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 5, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 5, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 5, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 5, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 5, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 5, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 5, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 5, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 5, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 5, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 5, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 5, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 5, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 5, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 5, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 5, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 5, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 5, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 5, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 5, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 5, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 5, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 5, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 5, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 5, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 5, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 5, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 5, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 5, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 5, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 2, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 5, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 5, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 2, y + 5, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 5, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 5, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 5, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 5, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 5, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 5, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 5, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 5, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 5, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 5, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 5, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 5, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 5, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 5, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 5, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 20, y + 5, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 5, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 5, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 5, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 5, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 5, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 5, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 5, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 5, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 20, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 5, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 5, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 5, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 5, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 5, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 5, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 5, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 5, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 5, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 5, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 24, y + 5, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 5, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 5, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 5, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 5, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 5, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 5, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 5, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 5, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 5, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 5, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 5, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 5, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 5, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 18, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 19, y + 5, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 5, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 5, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 5, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 5, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 5, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 21, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 5, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 5, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 5, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 5, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 5, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 1), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 6, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 6, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 6, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 6, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 6, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 6, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 6, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 6, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 6, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 6, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 6, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 6, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 6, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 16, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 6, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 6, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 6, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 6, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 6, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 6, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 6, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 6, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 2, y + 6, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 6, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 6, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 6, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 6, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 6, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 6, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 2, y + 6, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 6, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 6, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 6, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 3, y + 6, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 6, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 6, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 6, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 20, y + 6, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 6, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 6, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 6, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 6, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 6, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 6, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 20, y + 6, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 6, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 20, y + 6, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 6, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 6, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 6, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 6, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 6, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 24, y + 6, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 6, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 6, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 6, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 6, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 6, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 6, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 6, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 6, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 6, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 6, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 6, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 6, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 6, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 6, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 6, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 6, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 6, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 6, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 6, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 6, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 10, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 11, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 17, y + 6, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 20, y + 6, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 21, y + 6, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 6, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 6, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 6, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 12, y + 6, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 13, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 6, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 6, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 1), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 7, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 7, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 1, y + 7, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 7, y + 7, z + 5), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 7, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 7, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 7, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 7, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 7, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 7, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 7, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 7, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 7, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 7, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 7, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 7, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 7, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 7, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 7, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 15, y + 7, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 7, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 7, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 7, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 14, y + 7, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 7, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 2, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 7, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 7, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 7, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 2, y + 7, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 3, y + 7, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 4, y + 7, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 7, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 7, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 7, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 7, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 7, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 7, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 3, y + 7, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 7, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 7, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 7, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 7, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 7, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 7, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 7, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 7, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 7, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 7, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 7, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 7, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 7, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 7, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 7, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 7, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 7, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 7, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 7, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 7, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		spawn3(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	public boolean spawn3(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 1, y + 7, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 7, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 7, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 7, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 7, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 19, y + 7, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 7, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 7, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 7, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 7, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 7, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 7, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 7, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 7, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 7, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 7, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 7, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 24, y + 7, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 7, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 7, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 7, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 7, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 7, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 7, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 7, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 7, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 7, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 7, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 7, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 7, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 7, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 7, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 7, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 7, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 7, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 7, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 7, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 7, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 7, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 7, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 7, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 10, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 11, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 15, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 16, y + 7, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 18, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 19, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 20, y + 7, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 21, y + 7, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 7, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 7, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 7, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 12, y + 7, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 13, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 7, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 7, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 7, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 7, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 7, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 7, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 7, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 7, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 7, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 1), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 8, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 4), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 2, y + 8, z + 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 8, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 8, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 8, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 8, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 8, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 8, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 8, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 8, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 2, y + 8, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 8, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 8, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 8, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 8, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 2, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 8, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 8, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 8, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 8, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 8, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 8, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 3, y + 8, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 5, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 8, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 8, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 8, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 3, y + 8, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 8, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 8, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 8, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 8, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 8, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 8, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 8, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 8, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 8, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 18, y + 8, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 8, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 8, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 8, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 8, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 8, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 8, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 8, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 8, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 24, y + 8, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 8, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 8, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 8, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 8, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 10, y + 8, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 11, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 17, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 18, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 19, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 8, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 21, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 8, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 12, y + 8, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 13, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 8, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 17, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 20, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 8, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 8, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 8, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 8, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 8, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 8, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 8, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 9, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 9, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 3), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 9, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 9, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 4, y + 9, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 9, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 9, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 9, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 9, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 9, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 9, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 9, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 9, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 9, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 9, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 9, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 4, y + 9, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 9, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 9, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 9, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 9, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 9, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 9, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 5, y + 9, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 9, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 9, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 9, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 9, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 9, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 9, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 9, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 4, y + 9, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 6, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 7, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 9, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 9, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 9, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 9, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 4, y + 9, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 8, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 9, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 9, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 9, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 9, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 9, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 9, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 9, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 14, y + 9, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 17, y + 9, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 9, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 9, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 9, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 9, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 9, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 9, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 9, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 9, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 9, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 9, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 9, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 9, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 9, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 9, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 9, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 9, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 9, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 9, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 9, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 9, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 9, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 9, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 9, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 9, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 9, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 9, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 10, y + 9, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 13, y + 9, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 20, y + 9, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 9, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 9, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 9, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 9, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 9, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 9, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 9, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 9, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 12, y + 9, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 13, y + 9, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 16, y + 9, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 9, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 9, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 9, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 9, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 9, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 9, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 10, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 10, z + 0), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 10, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 10, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 10, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 10, z + 2), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 10, z + 2), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 10, z + 3), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 10, z + 3), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 10, z + 3), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		spawn4(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	public boolean spawn4(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 7, y + 10, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 10, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 10, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 10, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 10, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 10, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 10, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 10, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 10, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 10, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 10, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 7, y + 10, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 10, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 10, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 10, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 10, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 6, y + 10, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 10, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 10, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 10, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 12, y + 10, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 10, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 5, y + 10, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 10, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 10, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 10, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 10, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 10, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 13, y + 10, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 10, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 5, y + 10, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 10, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 9, y + 10, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 10, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 10, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 10, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 10, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 10, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 10, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 10, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 10, z + 16), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 10, z + 16), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 10, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 10, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 10, y + 10, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 11, y + 10, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 12, y + 10, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(2));
		world.setBlockState(pos.add(x + 13, y + 10, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 10, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 10, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 10, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 10, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 10, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 8, y + 10, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 10, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 10, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 10, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 10, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 10, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 10, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 10, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 10, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 10, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 10, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 10, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 10, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 10, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 10, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 22, y + 10, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 24, y + 10, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 10, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 10, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 10, z + 21), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 22, y + 10, z + 21), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 23, y + 10, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 10, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 10, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 8, y + 10, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 9, y + 10, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 10, y + 10, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 13, y + 10, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 10, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 22, y + 10, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 10, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 10, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 10, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 10, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 10, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 10, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 12, y + 10, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 13, y + 10, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 10, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 10, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 21, y + 10, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 22, y + 10, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 10, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 10, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 10, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 10, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 10, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 11, z + 0), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 11, z + 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 11, z + 3), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 11, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 11, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 11, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 11, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 11, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 11, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 11, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 11, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 11, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 11, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 11, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 8, y + 11, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 11, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 11, z + 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 11, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 11, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 11, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 11, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 11, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 11, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 11, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 11, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 11, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 11, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 11, z + 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 11, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 11, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 11, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 11, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 11, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 11, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 11, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 11, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 11, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 11, z + 16), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 11, z + 16), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 8, y + 11, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 11, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 11, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 11, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 11, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 11, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 9, y + 11, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 11, z + 17), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 11, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 11, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 11, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 11, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 11, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 11, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 11, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 21, y + 11, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 11, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 11, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 11, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 11, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 11, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 11, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 11, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 11, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 11, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 11, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 11, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 11, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 10, y + 11, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 11, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 11, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 13, y + 11, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 11, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 11, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 11, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 11, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 11, y + 11, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 11, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 11, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 11, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 11, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 11, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 12, z + 0), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 12, z + 0), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 12, z + 1), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 12, z + 1), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 12, z + 2), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 12, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 12, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 12, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 12, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 12, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 12, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 12, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 12, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 12, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 12, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 12, z + 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 12, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 12, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 12, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 12, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 8, y + 12, z + 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 9, y + 12, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 12, z + 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 12, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 12, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 12, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 11, y + 12, z + 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 8, y + 12, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 9, y + 12, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 12, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 12, z + 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 12, y + 12, z + 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 12, z + 16), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 8, y + 12, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(6));
		world.setBlockState(pos.add(x + 9, y + 12, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 10, y + 12, z + 16), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 11, y + 12, z + 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 12, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 12, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 12, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 12, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 12, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 12, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 12, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 12, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		spawn5(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	public boolean spawn5(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 3, y + 12, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 12, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 12, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 12, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 12, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 12, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 12, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 6, y + 12, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 12, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 12, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 12, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 12, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 12, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 24, y + 12, z + 22), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 11, y + 12, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 12, y + 12, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 12, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 12, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 12, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 12, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 22, y + 12, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 23, y + 12, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 12, y + 12, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 12, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 12, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 12, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 12, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 13, z + 0), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 13, z + 0), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 13, z + 1), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 13, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 13, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 13, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 13, z + 9), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 13, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 13, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 13, z + 10), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 13, z + 10), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 13, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 13, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 13, z + 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 13, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 13, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 13, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 13, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 13, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 13, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 13, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 13, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 13, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 13, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 13, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 13, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 13, z + 21), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 13, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 13, z + 22), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 24, y + 13, z + 22), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 12, y + 13, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 13, y + 13, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 13, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 13, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 16, y + 13, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 13, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 24, y + 13, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 13, y + 13, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 13, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 13, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 13, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 14, z + 0), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 14, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 14, z + 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 14, z + 8), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 14, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 14, z + 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 14, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 14, z + 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 0, y + 14, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 1, y + 14, z + 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 14, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 14, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 14, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 5, y + 14, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 14, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 14, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 14, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 14, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 14, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 14, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 14, z + 22), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 13, y + 14, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 14, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 14, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 16, y + 14, z + 23), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 24, y + 14, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 13, y + 14, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 14, y + 14, z + 24), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 14, z + 24), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 14, z + 24), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 15, z + 1), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 15, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 15, z + 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		spawn6(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	public boolean spawn6(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 0, y + 15, z + 9), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 15, z + 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 15, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 15, z + 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 1, y + 15, z + 11), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 15, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 15, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 15, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 15, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 15, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 15, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 15, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 15, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 15, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 15, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 23, y + 15, z + 22), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 13, y + 15, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 14, y + 15, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 15, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 16, y + 15, z + 23), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 14, y + 15, z + 24), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 15, y + 15, z + 24), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 16, y + 15, z + 24), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 0, y + 16, z + 8), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 16, z + 9), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 16, z + 9), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 16, z + 10), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 16, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 16, z + 18), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 16, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 16, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 16, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 16, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 16, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 16, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 16, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 16, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 16, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 16, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 16, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 16, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 16, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 16, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 14, y + 16, z + 24), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 15, y + 16, z + 24), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 16, y + 16, z + 24), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 0, y + 17, z + 9), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 17, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 17, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 17, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 17, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 17, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 17, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 17, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 17, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 17, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 17, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 17, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 17, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 17, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 17, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 17, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 17, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 17, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 17, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 17, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		spawn7(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	public boolean spawn7(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 15, y + 17, z + 24), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 1, y + 18, z + 9), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 18, z + 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 18, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 18, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 18, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 18, z + 18), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 6, y + 18, z + 18), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 18, z + 18), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 18, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 18, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 18, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 18, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 18, z + 19), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 2, y + 18, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 18, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 18, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 18, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 18, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 7, y + 18, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 18, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 18, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 18, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 18, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 18, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 18, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 15, y + 18, z + 23), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 7, y + 19, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 19, z + 18), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 19, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 19, z + 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 19, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 19, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 19, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 19, z + 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 2, y + 19, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 19, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 19, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 19, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 19, z + 20), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 3, y + 19, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 4, y + 19, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 5, y + 19, z + 21), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		world.setBlockState(pos.add(x + 6, y + 19, z + 21), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 19, z + 22), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		spawn8(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	public boolean spawn8(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 3, y + 20, z + 17), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 20, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 20, z + 19), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 2, y + 20, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 20, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 20, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 20, z + 20), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 20, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 4, y + 20, z + 21), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 20, z + 21), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 7, y + 20, z + 21), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 20, z + 22), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		world.setBlockState(pos.add(x + 3, y + 21, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 21, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 21, z + 21), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 22, z + 19), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 3, y + 22, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 22, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 22, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 22, z + 21), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		spawn9(world, rand, offsetX, offsetY, offsetZ, pos);
		return true;
	}

	public boolean spawn9(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x + 4, y + 23, z + 19), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 4, y + 23, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 23, z + 20), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(x + 5, y + 24, z + 19), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		return true;
	}
}