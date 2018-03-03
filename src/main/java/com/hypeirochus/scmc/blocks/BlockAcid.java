package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.StarcraftDamageSources;
import com.hypeirochus.scmc.handlers.FluidHandler;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Acid fluid. Hurts entities that come into contact<br>
 * Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team
 * 
 * @author Hypeirochus
 */
public class BlockAcid extends BlockFluidClassic {

	public BlockAcid() {
		super(FluidHandler.ACID, Material.WATER);
		setUnlocalizedName("fluid.acid");
		setRegistryName("fluid.acid");
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return MapColor.GREEN;
	}

	/**
	 * Executes code when an entity collides with this block's bounds
	 * 
	 * @param world
	 *            the world
	 * @param pos
	 *            position of the block
	 * @param state
	 *            state of the block
	 * @param entity
	 *            that collides with the block
	 */
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		entity.attackEntityFrom(StarcraftDamageSources.acid, world.getDifficulty().getDifficultyId() + 1 + RANDOM.nextInt(2));
	}
}