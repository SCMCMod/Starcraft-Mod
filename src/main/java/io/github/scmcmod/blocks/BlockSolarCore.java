package io.github.scmcmod.blocks;

import io.github.scmcmod.tileentity.TileEntitySolarCore;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.rom.block.BlockGeneric;

public class BlockSolarCore extends BlockGeneric implements ITileEntityProvider
{

	private int range;

	public BlockSolarCore(int range)
	{
		super( Material.IRON, MapColor.IRON);
		this.range = range;
		setSoundType(SoundType.METAL);
		setBlockUnbreakable();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return null;
	}

	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
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
		return new TileEntitySolarCore();
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileEntitySolarCore();
	}
}