package io.github.scmcmod.blocks;

import io.github.scmcmod.tileentity.TileEntityEntitySpawner;
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
import net.rom.block.RegistryType;

public class BlockEntitySpawner extends BlockGeneric implements ITileEntityProvider
{

	private int range;

	public BlockEntitySpawner(int range)
	{
		super( Material.IRON, MapColor.IRON);
		this.range = range;
		this.setSoundType(SoundType.METAL);
		this.setBlockUnbreakable();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return ItemStack.EMPTY;
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
		return new TileEntityEntitySpawner();
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileEntityEntitySpawner();
	}
}