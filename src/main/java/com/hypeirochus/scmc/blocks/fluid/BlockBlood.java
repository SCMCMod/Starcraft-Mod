package com.hypeirochus.scmc.blocks.fluid;

import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.FluidHandler;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Blood fluid.<br>
 * Copyright 2018 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockBlood extends BlockFluidClassic {

	public BlockBlood() {
		super(FluidHandler.BLOOD, Material.WATER);
		setUnlocalizedName("fluid.blood");
		setRegistryName("fluid.blood");
		BlockHandler.registerFullBlock(this);
	}
	
	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return MapColor.RED;
	}
	
	@Override
	public Vec3d getFogColor(World world, BlockPos pos, IBlockState state, Entity entity, Vec3d originalColor, float partialTicks) {
        int color = 0xff6F2525;
        return new Vec3d((color >> 16 & 0xFF) / 255.0F, (color >> 8 & 0xFF) / 255.0F, (color & 0xFF) / 255.0F);
	}

	/**
	 * Checks if other fluids can override this fluid?
	 * 
	 * @param world
	 *            allows to get block states based on their position
	 * @param pos
	 *            the position of the block
	 */
	@Override
	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
		if (world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}

		return super.canDisplace(world, pos);
	}

	/**
	 * Allows other fluids to displace this fluid if possible
	 * 
	 * @param world
	 *            the world
	 * @param the
	 *            position of the block
	 */
	@Override
	public boolean displaceIfPossible(World world, BlockPos pos) {
		if (world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}

		return super.displaceIfPossible(world, pos);
	}
}