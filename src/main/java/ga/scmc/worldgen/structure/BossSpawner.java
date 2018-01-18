package ga.scmc.worldgen.structure;

import java.util.Random;

import ga.scmc.entity.living.EntityNafash;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.tileentity.TileEntityEntitySpawner;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class BossSpawner extends SCWorldGenerator {
	
	@Override
	public boolean generate(int range, Entity entityToSpawn, TextFormatting color, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		generate_r0(range, entityToSpawn, color, world, offsetX, offsetY, offsetZ, pos, flag);
		return true;
	}

	public boolean generate_r0(int range, Entity entityToSpawn, TextFormatting color, World world, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		if(flag) {
			if(!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(16, 0, 0)) || !LocationIsValidSpawn(world, pos.add(16, 0, 16)) || !LocationIsValidSpawn(world, pos.add(0, 0, 16))) {
				return false;
			}
		}
		int x = offsetX;
		int y = offsetY;
		int z = offsetZ;
		world.setBlockState(pos.add(x+4, y+15, z+3), Blocks.LAVA.getDefaultState(), 2);
		world.setBlockState(pos.add(x+4, y+0, z+3), BlockHandler.ENTITY_SPAWNER.getDefaultState(), 2);
		world.setTileEntity(pos.add(x+4, y+0, z+3), new TileEntityEntitySpawner(range, entityToSpawn, color));
		System.out.println("Nafash spawned at" + pos);
		return true;
	}
	
	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.GRASS, BlockHandler.STONE_CHAR, Blocks.DIRT, BlockHandler.DIRT_CHAR, BlockHandler.STONE_CHAR, BlockHandler.SAND_SHAKURAS, BlockHandler.STONE_SHAKURAS, Blocks.SAND, Blocks.RED_SANDSTONE, Blocks.SNOW, Blocks.ICE, Blocks.PACKED_ICE };
	}

	public boolean LocationIsValidSpawn(World world, BlockPos pos) {

		Block block = world.getBlockState(pos).getBlock();
		Material m = block.getBlockState().getBaseState().getMaterial();
		Block blockBelow = world.getBlockState(pos.down()).getBlock();

		for(Block i : GetValidSpawnBlocks()) {
			if(block == i) {
				return true;
			} else if(block == Blocks.SNOW_LAYER && blockBelow == i) {
				return true;
			} else if(m == Material.PLANTS && blockBelow == i) {
				return true;
			}
		}
		return false;
	}
}