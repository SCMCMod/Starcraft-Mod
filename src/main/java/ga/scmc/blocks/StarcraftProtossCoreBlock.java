package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.lib.Library;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StarcraftProtossCoreBlock extends StarcraftBlock {

	public int startPos;
	public int domeHeight;
	public int domeTopLength;
	public int slope;

	public StarcraftProtossCoreBlock(String name, RegistryType type, Material material, MapColor color) {
		super(name, type, material, color);
		setHardness(15.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	public Block setDomeHeight(int height) {
		this.domeHeight = height;
		return this;
	}

	public Block setDomeTopLength(int length) {
		this.domeTopLength = length;
		return this;
	}

	public Block setDomeSlope(int slope) {
		this.slope = slope;
		return this;
	}

	public Block setDomeSize(int startPos, int height, int length, int slope) {
		this.startPos = startPos;
		this.domeHeight = height;
		this.domeTopLength = length;
		this.slope = slope;
		return this;
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);
		Library.truncatedPyramid(worldIn, pos.add(0, startPos, 0), BlockHandler.PROTOSS_SHIELD.getDefaultState(), domeHeight, domeTopLength, slope);
	}

	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		Library.truncatedPyramid(worldIn, pos.add(0, startPos, 0), Blocks.AIR.getDefaultState(), domeHeight, domeTopLength, slope);
		super.breakBlock(worldIn, pos, state);
	}
}
