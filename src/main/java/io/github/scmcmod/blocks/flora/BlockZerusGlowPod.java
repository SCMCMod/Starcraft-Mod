package io.github.scmcmod.blocks.flora;

import java.util.List;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.handlers.SoundHandler.SoundTypes;
import io.github.scmcmod.tileentity.TileEntityZerusGlowPod;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * @author Ocelot5836
 */
public class BlockZerusGlowPod extends BlockContainer
{

	public BlockZerusGlowPod()
	{
		super(Material.GOURD, MapColor.BROWN);
		this.setSoundType(SoundTypes.FLESH);
		this.setHardness(0.5f);
		this.setLightLevel(13);
		this.setCreativeTab(SCCreativeTabs.FLORA);
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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return new AxisAlignedBB(0.0625 * 3, 0, 0.0625 * 3, 0.0625 * 13, 0.0625 * 8, 0.0625 * 13);
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean isActualState)
	{
		// TODO: Placing this block crashes the game, due to this line.
		// state.addCollisionBoxToList(worldIn, pos, entityBox, collidingBoxes,
		// entityIn, isActualState);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		return new TileEntityZerusGlowPod();
	}
}