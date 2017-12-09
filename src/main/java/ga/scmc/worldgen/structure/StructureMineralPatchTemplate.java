package ga.scmc.worldgen.structure;

import java.util.Random;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.MetaBlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureMineralPatchTemplate extends SCWorldGenerator {

	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.GRASS, BlockHandler.STONE_CHAR, Blocks.DIRT, BlockHandler.DIRT_CHAR, BlockHandler.ZERG_CREEP, BlockHandler.SAND_SHAKURAS, BlockHandler.DIRT_SHAKURAS, Blocks.SNOW, Blocks.ICE, Blocks.PACKED_ICE, Blocks.SAND, Blocks.SANDSTONE };
	}

	public boolean LocationIsValidSpawn(World world, BlockPos pos) {

		Block block = world.getBlockState(pos).getBlock();
		Material m = block.getBlockState().getBaseState().getMaterial();
		Block blockBelow = world.getBlockState(pos.down()).getBlock();

		for (Block i : GetValidSpawnBlocks()) {
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

	@Override
	public boolean generate(int meta, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		generate_r0(world, meta, pos);
		return true;
	}

	public boolean generate_r0(World world, int meta, BlockPos pos) {
		if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(24, 0, 0)) || !LocationIsValidSpawn(world, pos.add(46, 0, 12)) || !LocationIsValidSpawn(world, pos.add(0, 0, 12))) {
			return false;
		}
		world.setBlockState(pos.add(24, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(24, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(24, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(24, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(24, 2, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(24, 3, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(25, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(27, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(27, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(27, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(27, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(27, 3, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 0, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 0, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 2, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(28, 3, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 0, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 0, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 0, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 1, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 1, 13), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 3, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(29, 4, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(30, 0, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(30, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(30, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(30, 1, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(30, 2, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(31, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(31, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(31, 2, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(31, 3, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(33, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(34, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(34, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(34, 2, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(34, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(34, 3, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 0, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 0, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 2, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(35, 3, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 0, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 0, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 0, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 3, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 3, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(36, 4, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(37, 0, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(37, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(37, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(37, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(38, 1, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(38, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(38, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(38, 2, 12), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(38, 3, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(40, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(41, 0, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(41, 1, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(41, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(41, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 0, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 0, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 1, 7), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 1, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 2, 7), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 2, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(42, 3, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 0, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 0, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 0, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 1, 7), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 1, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 2, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 3, 8), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 3, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 3, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(43, 4, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(44, 0, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(44, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(44, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(44, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(45, 1, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(45, 1, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(45, 2, 9), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(45, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(45, 2, 11), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(45, 3, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		world.setBlockState(pos.add(46, 2, 10), MetaBlockHandler.COMP_MINERAL.getStateFromMeta(meta));
		return true;
	}
}
