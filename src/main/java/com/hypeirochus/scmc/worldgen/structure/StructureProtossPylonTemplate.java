// Schematic to java Structure by jajo_11 | inspired by "MITHION'S .SCHEMATIC TO
// JAVA CONVERTINGTOOL"

package com.hypeirochus.scmc.worldgen.structure;

import java.util.Random;

import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureProtossPylonTemplate extends SCWorldGenerator {

	private int metaPrimColor;
	private int metaSecColor;
	
	public StructureProtossPylonTemplate() {
		
	}
	
	public StructureProtossPylonTemplate(int metaPrimColor, int metaSecColor) {
		this.metaPrimColor = metaPrimColor;
		this.metaSecColor = metaSecColor;
	}
	
	@Override
	public boolean generate(int metaPrimColor, int metaSecColor, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		if(metaPrimColor < 0)
			metaPrimColor = this.metaPrimColor;
		if(metaSecColor < 0)
			metaSecColor = this.metaSecColor;
		generate_r0(metaPrimColor, metaSecColor, world, offsetY, pos, flag);
		return true;
	}

	public boolean generate_r0(int metaPrimColor, int metaSecColor, World world, int offsetY, BlockPos pos, boolean flag) {
		if (flag) {
			if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(7, 0, 0)) || !LocationIsValidSpawn(world, pos.add(7, 0, 8)) || !LocationIsValidSpawn(world, pos.add(0, 0, 8))) {
				return false;
			}
		}
		world.setBlockState(pos.add(4, 2 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 5 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 2), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 3), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 5), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 6), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 6 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 6 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(1, 6 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 6 + offsetY, 4), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 6 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 6 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 1), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 7 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 7 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 7 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 7), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 0), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 8 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 8 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 8), BlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 9 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 9 + offsetY, 3), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 9 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 9 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 9 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 9 + offsetY, 5), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 10 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 10 + offsetY, 4), BlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		if (metaSecColor == 0) {
			setBlockStateAndUpdate(world, pos.add(4, 6 + offsetY, 4), BlockHandler.CORE_PYLON_KHALAI.getDefaultState(), 2);
		} else if (metaSecColor == 2) {
			setBlockStateAndUpdate(world, pos.add(4, 6 + offsetY, 4), BlockHandler.CORE_PYLON_VOID.getDefaultState(), 2);
		} else if (metaSecColor == 1) {
			setBlockStateAndUpdate(world, pos.add(4, 6 + offsetY, 4), BlockHandler.CORE_PYLON_DARK.getDefaultState(), 2);
		}
		return true;

	}

	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.GRASS, Blocks.STONE, Blocks.DIRT, BlockHandler.SAND_SHAKURAS, BlockHandler.STONE_SHAKURAS, BlockHandler.PROTOSS_METAL_T1 };
	}

	public boolean LocationIsValidSpawn(World world, BlockPos pos) {
		Block block = world.getBlockState(pos).getBlock();
		Material m = block.getBlockState().getBaseState().getMaterial();
		Block blockAbove = world.getBlockState(pos.up()).getBlock();
		Block blockBelow = world.getBlockState(pos.down()).getBlock();

		for (Block i : GetValidSpawnBlocks()) {
			if (blockAbove != Blocks.AIR) {
				return false;
			}
			if (block == i) {
				return true;
			} else if (block == Blocks.SNOW_LAYER && blockBelow == i) {
				return true;
			} else if (m == Material.PLANTS && blockBelow == i) {
				return true;
			}
		}

		return false;
	}
}
