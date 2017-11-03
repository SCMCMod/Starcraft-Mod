package ga.scmc.blocks;

import javax.annotation.Nullable;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Dark Protoss Energy Stabilizer block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockProtossShield extends Block {

	public static final AxisAlignedBB SHIELD_BLOCK_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);

	public BlockProtossShield() {
		super(Material.AIR, MapColor.LIGHT_BLUE);
		setUnlocalizedName("protoss.shield");
		setRegistryName("protoss.shield");
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return SHIELD_BLOCK_AABB;
	}

	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn) {}

	/**
	 * Used to determine ambient occlusion and culling when rebuilding chunks for
	 * render
	 */
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (entityIn instanceof EntityArrow || entityIn instanceof EntityFireball
				|| entityIn instanceof EntitySmallFireball || entityIn instanceof EntityLargeFireball
				|| entityIn instanceof EntitySnowball || entityIn instanceof EntityPotion || entityIn instanceof EntityThrowable) {
			
			entityIn.setDead();
		}
		super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
	}
	
	@Override
	public Boolean isEntityInsideMaterial(IBlockAccess world, BlockPos blockpos, IBlockState iblockstate, Entity entityIn,
			double yToTest, Material materialIn, boolean testingHead) {
		if (entityIn instanceof EntityArrow || entityIn instanceof EntityFireball
				|| entityIn instanceof EntitySmallFireball || entityIn instanceof EntityLargeFireball
				|| entityIn instanceof EntitySnowball || entityIn instanceof EntityPotion || entityIn instanceof EntityThrowable) {
			
			entityIn.setDead();
		}
		return super.isEntityInsideMaterial(world, blockpos, iblockstate, entityIn, yToTest, materialIn, testingHead);
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos,
			EnumFacing side) {
		IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
		Block block = iblockstate.getBlock();

		if (this == BlockHandler.PROTOSS_SHIELD) {
			if (blockState != iblockstate) {
				return true;
			}
			if (block == this) {
				return false;
			}
		}

		return block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
	}
}
