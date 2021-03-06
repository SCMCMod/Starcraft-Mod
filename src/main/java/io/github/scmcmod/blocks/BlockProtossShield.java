package io.github.scmcmod.blocks;

import io.github.scmcmod.init.StarCraftBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.rom.block.BlockGeneric;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class BlockProtossShield extends BlockGeneric
{

	public BlockProtossShield()
	{
		super(Material.BARRIER, MapColor.LIGHT_BLUE);
	}

	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess world, BlockPos pos)
	{
		return NULL_AABB;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn)
	{
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		if (entityIn instanceof IProjectile || entityIn instanceof EntityFireball || entityIn instanceof EntitySmallFireball || entityIn instanceof EntityLargeFireball)
		{
			entityIn.setDead();
		}
		super.onEntityCollision(worldIn, pos, state, entityIn);
	}

	@Override
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	{
		IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
		Block block = iblockstate.getBlock();

		if (this == StarCraftBlocks.PROTOSS_SHIELD)
		{
			if (blockState != iblockstate)
			{
				return true;
			}
			if (block == this)
			{
				return false;
			}
		}

		return block == this ? false : iblockstate.shouldSideBeRendered(blockAccess, pos, side);
	}
}