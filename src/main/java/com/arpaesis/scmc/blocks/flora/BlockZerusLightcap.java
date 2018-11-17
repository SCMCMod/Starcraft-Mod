package com.arpaesis.scmc.blocks.flora;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.handlers.BlockHandler;
import com.arpaesis.scmc.tileentity.TileEntityZerusLightcap;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockZerusLightcap extends BlockContainer
{

	public BlockZerusLightcap()
	{
		super(Material.VINE, MapColor.GREEN);
		this.setTranslationKey("flora.zerus.lightcap");
		this.setRegistryName("flora.zerus.lightcap");
		this.setSoundType(SoundType.PLANT);
		this.setCreativeTab(SCCreativeTabs.FLORA);
		BlockHandler.registerFullBlock(this);
	}

	@Override
	public boolean isReplaceable(IBlockAccess world, BlockPos pos)
	{
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess world, BlockPos pos)
	{
		return NULL_AABB;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		return new TileEntityZerusLightcap();
	}
}