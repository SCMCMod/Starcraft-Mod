package io.github.scmcmod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import io.github.scmcmod.init.StarCraftBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
public class BlockShakurasFarmland extends BlockFarmland
{

	public BlockShakurasFarmland()
	{
		this.setSoundType(SoundType.GROUND);
		this.setHardness(0.6f);
		this.setResistance(1);
		this.setCreativeTab(null);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		int i = ((Integer) state.getValue(MOISTURE)).intValue();

		if (!this.hasWater(worldIn, pos) && !worldIn.isRainingAt(pos.up()))
		{
			if (i > 0)
			{
				worldIn.setBlockState(pos, state.withProperty(MOISTURE, Integer.valueOf(i - 1)), 2);
			} else if (!this.hasCrops(worldIn, pos))
			{
				worldIn.setBlockState(pos, StarCraftBlocks.DIRT_SHAKURAS.getDefaultState());
			}
		} else if (i < 7)
		{
			worldIn.setBlockState(pos, state.withProperty(MOISTURE, Integer.valueOf(7)), 2);
		}
	}

	private boolean hasCrops(World world, BlockPos pos)
	{
		Block block = world.getBlockState(pos.up()).getBlock();
		return block instanceof net.minecraftforge.common.IPlantable && canSustainPlant(world.getBlockState(pos), world, pos, net.minecraft.util.EnumFacing.UP, (net.minecraftforge.common.IPlantable) block);
	}

	private boolean hasWater(World world, BlockPos pos)
	{
		for (BlockPos.MutableBlockPos blockpos$mutableblockpos : BlockPos.getAllInBoxMutable(pos.add(-4, 0, -4), pos.add(4, 1, 4)))
		{
			if (world.getBlockState(blockpos$mutableblockpos).getMaterial() == Material.WATER)
			{
				return true;
			}
		}

		return false;
	}

	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
	{
		if (!worldIn.isRemote && worldIn.rand.nextFloat() < fallDistance - 0.5F && entityIn instanceof EntityLivingBase && (entityIn instanceof EntityPlayer || worldIn.getGameRules().getBoolean("mobGriefing")) && entityIn.width * entityIn.width * entityIn.height > 0.512F)
		{
			worldIn.setBlockState(pos, StarCraftBlocks.DIRT_SHAKURAS.getDefaultState());
		}
	}

	@Override
	public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos fromPos)
	{
		if (world.getBlockState(pos.up()).getMaterial().isSolid())
		{
			world.setBlockState(pos, StarCraftBlocks.DIRT_SHAKURAS.getDefaultState());
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	{
		switch (side)
		{
		case UP:
			return true;
		case NORTH:
		case SOUTH:
		case WEST:
		case EAST:
			IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
			Block block = iblockstate.getBlock();
			return !iblockstate.isOpaqueCube() && !(block instanceof BlockFarmland) && block != Blocks.GRASS_PATH;
		default:
			return false;
		}
	}

	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable)
	{
		return true;
	}

	@Nullable
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return StarCraftBlocks.DIRT_SHAKURAS.getItemDropped(StarCraftBlocks.DIRT_SHAKURAS.getDefaultState(), rand, fortune);
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(StarCraftBlocks.DIRT_SHAKURAS);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		return MapColor.BLACK;
	}
}