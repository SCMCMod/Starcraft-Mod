package com.hypeirochus.scmc.blocks;

import java.util.Random;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Allows for gas blocks to extend a class that will handle all the default behaviors.
 * 
 * @author Ocelot5836
 */
public abstract class BlockGas extends BlockGlass {

	public BlockGas(Material material, String name) {
		super(material, false);
		setRegistryName(name);
		setUnlocalizedName(name);
		setSoundType(SoundType.CLOTH);
		setTickRandomly(true);
		setCreativeTab(null);
		BlockHandler.registerFullBlock(this);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return MapColor.AIR;
	}

	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
		displayParticles(state, world, pos, rand);
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Used to render particles around the gas if need be.
	 * 
	 * @param state
	 *            The current state
	 * @param world
	 *            The world to display in
	 * @param pos
	 *            The position of the block
	 * @param rand
	 *            A random instance
	 */
	public void displayParticles(IBlockState state, World world, BlockPos pos, Random rand) {
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		if (world.getBlockState(pos.up()) == Blocks.AIR.getDefaultState()) {
			if (pos.getY() <= 150) {
				world.setBlockState(pos.up(), getDefaultState());
				world.setBlockState(pos, Blocks.AIR.getDefaultState());
			} else {
				world.setBlockState(pos, Blocks.AIR.getDefaultState());
			}
			super.updateTick(world, pos, state, rand);
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return NULL_AABB;
	}
}
