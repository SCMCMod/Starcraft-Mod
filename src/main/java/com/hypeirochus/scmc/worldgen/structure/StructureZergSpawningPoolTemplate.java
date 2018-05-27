package com.hypeirochus.scmc.worldgen.structure;

import java.util.Random;

import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.lib.IObjectParsable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.template.Template;

public class StructureZergSpawningPoolTemplate extends SCWorldGenerator implements INBTStructure, IObjectParsable {

	public static final String STRUCTURE_NAME = "zerg.spawning_pool";

	private boolean checkSpawnPosition;

	public StructureZergSpawningPoolTemplate() {
		this.checkSpawnPosition = false;
	}
	
	@Override
	public boolean generate(World world, BlockPos pos) {
		if (this.checkSpawnPosition) {
			if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(17, 0, 0)) || !LocationIsValidSpawn(world, pos.add(17, 0, 15)) || !LocationIsValidSpawn(world, pos.add(0, 0, 15))) {
				return false;
			}
		}

		Template template = this.getTemplate(world, STRUCTURE_NAME);
		if (template != null) {
			placeStructure(template, world, pos, this.getDefaultPlacementSettings());
			return true;
		}
		return false;
	}

	@Override
	public void setFlags(Object[] flags) {
		if (flags.length > 0) {
			checkSpawnPosition = this.parseBoolean(flags[0]);
		}
	}

	@Override
	public void onParseFail(byte parseType, Exception e) {
		if(parseType == BOOLEAN) {
			checkSpawnPosition = false;
		}
	}
	
	@Override
	public boolean generate(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		generate_r0(world, rand, offsetX, offsetY, offsetZ, pos, flag);
		return true;
	}

	public boolean generate_r0(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		if (flag) {
			if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(18, 0, 0)) || !LocationIsValidSpawn(world, pos.add(18, 0, 20)) || !LocationIsValidSpawn(world, pos.add(0, 0, 20))) {
				return false;
			}
		}
		world.setBlockState(pos.add(8, 0 + offsetY, 1), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 2), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(1, 0 + offsetY, 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 3), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(2, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(15, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(16, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(18, 0 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(2, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(16, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(17, 0 + offsetY, 16), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(0, 0 + offsetY, 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(1, 0 + offsetY, 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 17), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 0 + offsetY, 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 0 + offsetY, 18), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 0 + offsetY, 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 0 + offsetY, 19), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		// Second Level
		world.setBlockState(pos.add(8, 1 + offsetY, 4), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 1 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 8), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 8), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 8), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 1 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 1 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 1 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 1 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 1 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 1 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 1 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 1 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 12), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 12), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 12), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 1 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 1 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 1 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 1 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		// Third Level
		world.setBlockState(pos.add(7, 2 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 5), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 6), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 7), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 2 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 8), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 8), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 8), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 8), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 2 + offsetY, 8), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 2 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 9), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 2 + offsetY, 9), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 2 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 10), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 2 + offsetY, 10), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 2 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 11), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 2 + offsetY, 11), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 2 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 12), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 12), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 12), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 12), BlockHandler.ACID.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 12), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 2 + offsetY, 12), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 13), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 2 + offsetY, 13), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 14), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 2 + offsetY, 14), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(8, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(9, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(10, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(11, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 2 + offsetY, 15), BlockHandler.ZERG_FLESH.getDefaultState(), 2);

		// Fourth Level
		world.setBlockState(pos.add(5, 3 + offsetY, 6), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 3 + offsetY, 6), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(7, 3 + offsetY, 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(8, 3 + offsetY, 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(9, 3 + offsetY, 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(10, 3 + offsetY, 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(11, 3 + offsetY, 6), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 7), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 3 + offsetY, 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(12, 3 + offsetY, 7), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 7), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(14, 3 + offsetY, 8), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(14, 3 + offsetY, 9), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 10), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(14, 3 + offsetY, 10), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(4, 3 + offsetY, 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(14, 3 + offsetY, 11), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(4, 3 + offsetY, 12), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 12), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(4, 3 + offsetY, 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(12, 3 + offsetY, 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 13), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 3 + offsetY, 13), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(4, 3 + offsetY, 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 14), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 3 + offsetY, 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(7, 3 + offsetY, 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(8, 3 + offsetY, 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(9, 3 + offsetY, 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(10, 3 + offsetY, 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(11, 3 + offsetY, 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(12, 3 + offsetY, 14), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 14), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 3 + offsetY, 14), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(5, 3 + offsetY, 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(6, 3 + offsetY, 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(12, 3 + offsetY, 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);
		world.setBlockState(pos.add(13, 3 + offsetY, 15), BlockHandler.ZERG_FLESH.getStateFromMeta(1), 2);

		// Fifth Level
		world.setBlockState(pos.add(5, 4 + offsetY, 6), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 4 + offsetY, 7), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(14, 4 + offsetY, 10), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(3, 4 + offsetY, 12), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(5, 4 + offsetY, 14), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 4 + offsetY, 14), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);

		// Sixth Level
		world.setBlockState(pos.add(6, 5 + offsetY, 7), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(13, 5 + offsetY, 10), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(6, 5 + offsetY, 13), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
		world.setBlockState(pos.add(12, 5 + offsetY, 13), BlockHandler.KERATIN_CHUNK.getDefaultState(), 2);
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
}