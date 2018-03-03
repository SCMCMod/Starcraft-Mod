package com.hypeirochus.scmc.blocks;

import java.util.Random;

import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.FluidHandler;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Terrazine Fluid<br>
 * Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team
 * 
 * @author Hypeirochus
 */
public class BlockTerrazine extends BlockFluidClassic {

	public BlockTerrazine() {
		super(FluidHandler.TERRAZINE, Material.WATER);
		setUnlocalizedName("fluid.terrazine");
		setRegistryName("fluid.terrazine");
		BlockHandler.registerFullBlock(this);
	}
	
	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return MapColor.PURPLE;
	}
	
	@Override
	public int tickRate(World world) {
		return 120;
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 750));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 750));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 750));
		}
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		if (world.getBlockState(pos.up()) == Blocks.AIR.getDefaultState()) {
			if (rand.nextInt(100) < 25) {
				world.setBlockState(pos.up(), BlockHandler.GAS_TERRAZINE.getDefaultState());
			}
		}
		super.updateTick(world, pos, state, rand);
	}
}