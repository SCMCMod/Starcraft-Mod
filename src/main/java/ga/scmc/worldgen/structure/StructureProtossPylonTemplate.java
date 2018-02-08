// Schematic to java Structure by jajo_11 | inspired by "MITHION'S .SCHEMATIC TO
// JAVA CONVERTINGTOOL"

package ga.scmc.worldgen.structure;

import java.util.Random;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.MetaBlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureProtossPylonTemplate extends SCWorldGenerator {

	@Override
	public boolean generate(int metaPrimColor, int metaSecColor, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		generate_r0(metaPrimColor, metaSecColor, world, offsetY, pos, flag);
		return true;
	}

	public boolean generate_r0(int metaPrimColor, int metaSecColor, World world, int offsetY, BlockPos pos, boolean flag) {
		if (flag) {
			if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(7, 0, 0)) || !LocationIsValidSpawn(world, pos.add(7, 0, 8)) || !LocationIsValidSpawn(world, pos.add(0, 0, 8))) {
				return false;
			}
		}
		world.setBlockState(pos.add(4, 2 + offsetY, 2), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 2 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(6, 2 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 2 + offsetY, 6), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 3 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 3 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 3 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 4 + offsetY, 3), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 3), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 4 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 4 + offsetY, 5), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 4 + offsetY, 5), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 4 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 4 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 4 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 5 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 2), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 2), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 3), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 3), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 5), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 5), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(1, 5 + offsetY, 6), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(7, 5 + offsetY, 6), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(2, 5 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 5 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 5 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 5 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(6, 5 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 6 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 6 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(1, 6 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(7, 6 + offsetY, 4), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 6 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 6 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 6 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(5, 6 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 1), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 7 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 7 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 7 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 7 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 7 + offsetY, 7), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 0), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 8 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 8 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 8 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 8 + offsetY, 8), MetaBlockHandler.PROTOSS_METAL_T1.getStateFromMeta(metaPrimColor));
		world.setBlockState(pos.add(3, 9 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 9 + offsetY, 3), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 9 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 9 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(5, 9 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 9 + offsetY, 5), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(3, 10 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
		world.setBlockState(pos.add(4, 10 + offsetY, 4), MetaBlockHandler.PYLON_CRYSTAL.getStateFromMeta(metaSecColor));
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
		return new Block[] { Blocks.GRASS, Blocks.STONE, Blocks.DIRT, BlockHandler.SAND_SHAKURAS, BlockHandler.STONE_SHAKURAS, MetaBlockHandler.PROTOSS_METAL_T1 };
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
