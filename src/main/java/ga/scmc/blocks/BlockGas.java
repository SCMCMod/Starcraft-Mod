package ga.scmc.blocks;

import java.util.Random;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Allows for gas blocks to extend a class that will handle all the default
 * behaviors
 * 
 * @author Ocelot5836
 */
public abstract class BlockGas extends BlockGlass {

	public BlockGas(Material material) {
		super(material, false);
		setSoundType(SoundType.CLOTH);
		setTickRandomly(true);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.AIR;
	}

	@Override
	public void randomDisplayTick(IBlockState stateIn, World world, BlockPos pos, Random rand) {
		displayParticles(stateIn, world, pos, rand);
	}

	@SideOnly(Side.CLIENT)
	public abstract void displayParticles(IBlockState stateIn, World world, BlockPos pos, Random rand);

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		if (world.getBlockState(pos.up()) == Blocks.AIR.getDefaultState()) {
			if (pos.getY() <= 150) {
				world.setBlockState(pos.up(), getDefaultState());
				world.setBlockState(pos, Blocks.AIR.getDefaultState());
			} else {
				world.setBlockState(pos, Blocks.AIR.getDefaultState());
			}
			super.updateTick(world, pos, state, rand);
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World world, BlockPos pos) {
		return NULL_AABB;
	}
}
