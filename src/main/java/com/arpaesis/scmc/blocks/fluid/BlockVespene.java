package com.arpaesis.scmc.blocks.fluid;

import java.util.Random;

import com.arpaesis.scmc.damagesource.SCDamageSourceManager;
import com.arpaesis.scmc.handlers.BlockHandler;
import com.arpaesis.scmc.handlers.FluidHandler;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Vespene Fluid<br>
 * Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team
 * 
 * @author Hypeirochus
 */
public class BlockVespene extends BlockFluidClassic
{

	public BlockVespene()
	{
		super(FluidHandler.VESPENE, Material.WATER);
		setUnlocalizedName("fluid.vespene");
		setRegistryName("fluid.vespene");
		BlockHandler.registerFullBlock(this);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		return MapColor.GREEN;
	}

	@Override
	public Vec3d getFogColor(World world, BlockPos pos, IBlockState state, Entity entity, Vec3d originalColor, float partialTicks)
	{
		int color = 0xff55B43D;
		return new Vec3d((color >> 16 & 0xFF) / 255.0F, (color >> 8 & 0xFF) / 255.0F, (color & 0xFF) / 255.0F);
	}

	@Override
	public int tickRate(World world)
	{
		return 120;
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
	{
		if (world.getBlockState(pos.up()) == Blocks.AIR.getDefaultState())
		{
			if (rand.nextInt(100) < 25)
			{
				world.setBlockState(pos.up(), BlockHandler.GAS_VESPENE.getDefaultState());
			}
		}
		super.updateTick(world, pos, state, rand);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity)
	{
		entity.attackEntityFrom(SCDamageSourceManager.poisonFluid, 4);
	}
}