package ga.scmc.worldgen.structure;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureSingleBlockTemplate extends SCWorldGenerator {

	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.GRASS, Blocks.SNOW };
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
	public boolean generateTileEntity(TileEntity entity, Block block, World world, Random rand, BlockPos pos) {
		if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(1, 0, 0)) || !LocationIsValidSpawn(world, pos.add(1, 0, 1)) || !LocationIsValidSpawn(world, pos.add(0, 0, 1))) {
			return false;
		}
		world.setTileEntity(pos.add(0, 1, 0), entity);
		world.setBlockState(pos.add(0, 1, 0), block.getDefaultState());
		System.out.println("true");
		System.out.println(pos);
		return true;
	}
}
