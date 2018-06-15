package com.ruthless_bug13.rapi.api.energy.base;

import com.hypeirochus.scmc.blocks.RegistryType;
import com.hypeirochus.scmc.blocks.StarcraftBlock;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

//TODO: MOVE TO CORE MOD, also, clean this up!
public class EnergyBlock extends StarcraftBlock
{
	//public static final PropertyDirection FACING = BlockHorizontal.FACING;
	private boolean isModel = false;
	
	public EnergyBlock(String name, Material mat) { super(name, RegistryType.FULL, mat); }//setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)); }
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) 
	{
		//this.setDefaultFacing(worldIn, pos, state);
	}

	/*private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state) 
	{
		if (!worldIn.isRemote) 
		{
			IBlockState north = worldIn.getBlockState(pos.north());
			IBlockState south = worldIn.getBlockState(pos.south());
			IBlockState west = worldIn.getBlockState(pos.west());
			IBlockState east = worldIn.getBlockState(pos.east());
			EnumFacing facing = state.getValue(FACING);

			if (facing == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock())
				facing = EnumFacing.SOUTH;
			else if (facing == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock())
				facing = EnumFacing.NORTH;
			else if (facing == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock())
				facing = EnumFacing.EAST;
			else if (facing == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock())
				facing = EnumFacing.WEST;

			worldIn.setBlockState(pos, state.withProperty(FACING, facing), 2);
		}
	}
	
	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 
	{
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}
	
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) 
	{
		world.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		EnumFacing face = EnumFacing.getFront(meta / 2 + 2);

		if (face.getAxis() == EnumFacing.Axis.Y)
			face = EnumFacing.NORTH;

		return this.getDefaultState().withProperty(FACING, face);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return (state.getValue(FACING).getHorizontalIndex());
	}

	
	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) 
	{
		return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
	}
	
	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) 
	{
		return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
	}*/
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return !isModel;
	}

	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return !isModel;
	}
	
	public void SetModel() 
	{
		this.isModel = true;
	}
	
	public EnergyBlock SetCreativeTab(CreativeTabs tab) 
	{
		this.setCreativeTab(tab);
		return this;
	}
}