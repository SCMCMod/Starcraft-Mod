package com.arpaesis.scmc.lib;

import java.util.ArrayList;

import com.arpaesis.scmc.handlers.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Loader;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * A set of utilities that simplify code in other areas<br>
 */
//TODO: MOVE TO CORE MOD
public class Library
{

	private static boolean isJeiInstalled;

	/**
	 * Makes a cube out of {@code blockState} anchored at the bottom-middle. NOTE:
	 * this ignores the anchor. Also, make sure the side length is an odd natural
	 * number, else you'll break something
	 * 
	 * @param world the world
	 * @param blockState the blockState to make a cube of (use
	 *        {@link Block#getDefaultState()} if unsure)
	 * @param pos the {@link BlockPos} of the anchor
	 * @param sideLength the length of the sides of the cube
	 */
	public static void blockCube(World world, IBlockState blockState, BlockPos pos, int sideLength)
	{
		for (int x = -sideLength / 2; x < sideLength / 2 + 1; x++)
		{
			for (int y = 0; y < sideLength + 1; y++)
			{
				for (int z = -sideLength / 2; z < sideLength / 2 + 1; z++)
				{
					if (x == 0 && y == 0 && z == 0)
					{
						continue;
					} else
					{
						world.setBlockState(pos.add(x, y, z), blockState);
					}
				}
			}
		}
	}

	/**
	 * Checks a cubic volume for any instances of {@code blockState}. The anchor is
	 * in the absolute center of the cube. Make sure the side length is an odd
	 * number, else you'll break something
	 * 
	 * @param world the world
	 * @param blockState the {@link IBlockState} to check for
	 * @param pos the anchor {@link BlockPos}
	 * @param sideLength the length of the cube's sides
	 * @return {@link ArrayList} of all the BlockPos instances that contain
	 *         {@code blockState}
	 */
	public static ArrayList<BlockPos> checkCube(World world, IBlockState blockState, BlockPos pos, int sideLength)
	{
		ArrayList<BlockPos> posList = new ArrayList<BlockPos>();

		for (int x = -sideLength / 2; x < sideLength / 2 + 1; x++)
		{
			for (int y = -sideLength / 2; y < sideLength / 2 + 1; y++)
			{
				for (int z = -sideLength / 2; z < sideLength / 2 + 1; z++)
				{
					BlockPos currPos = pos.add(x, y, z);

					if (world.getBlockState(currPos).equals(blockState))
					{
						posList.add(currPos);
					}
				}
			}
		}

		return posList;
	}

	/**
	 * Replaces {@code current} with {@code next} in the same world. Can transfer
	 * pitch and yaw rotation angles from {@code current} to {@code next}. If
	 * pitch/yaw not transferred, they are both set to {@code 0}
	 * 
	 * @param current the entity to replace
	 * @param next the replacement
	 * @param keepRot whether or not to transfer the pitch and yaw rotation angles
	 *        of {@code current} to {@code next}
	 */
	public static void replaceEntity(boolean keepRot, Entity current, Entity... next)
	{
		if (!current.world.isRemote)
		{
			if (keepRot)
			{
				for (Entity e : next)
				{
					e.setLocationAndAngles(current.posX, current.posY, current.posZ, current.rotationYaw, current.rotationPitch);
				}
			} else
			{
				for (Entity e : next)
				{
					e.setLocationAndAngles(current.posX, current.posY, current.posZ, 0, 0);
				}
			}

			for (Entity e : next)
			{
				current.world.spawnEntity(e);
			}

			current.setDead();
		}
	}

	/**
	 * Replaces {@code current} with {@code next} in the same world. Sets the
	 * pitch/yaw of all objects on {@code next} to {@code pitch} and {@code yaw},
	 * respectively.<br>
	 * This is done by setting {@code current}'s pitch/yaw, then calling
	 * {@link #replaceEntity(boolean, Entity, Entity)} with parameters {@code true},
	 * {@code current}, and {@code next} as a means of transferring
	 * {@code current}'s new pitch/yaw angles to {@code next}
	 * 
	 * @param pitch the pitch to use
	 * @param yaw the yaw to use
	 * @param current the {@link Entity} to replace
	 * @param next the {@link Entity} objects to replace {@code current}
	 */
	public static void replaceEntity(float pitch, float yaw, Entity current, Entity... next)
	{
		if (!current.world.isRemote)
		{
			current.setLocationAndAngles(current.posX, current.posY, current.posZ, yaw, pitch);
			replaceEntity(true, current, next);
		}
	}

	public static void square(World world, BlockPos center, int radius, IBlockState state)
	{
		BlockPos pos = center.add(-radius, 0, -radius);
		EnumFacing facing = EnumFacing.EAST;
		for (int i = 0; i < 4; i++)
		{
			for (int k = radius * 2 - 1; k >= 0; k--)
			{
				if (world.getBlockState(pos).getBlock() == Blocks.AIR || world.getBlockState(pos).getBlock() == BlockHandler.PROTOSS_SHIELD)
					world.setBlockState(pos, state);
				pos = pos.offset(facing);
			}
			facing = facing.rotateY();
		}
	}

	/**
	 * Creates the glorious shields. SliceThePi's proprietary blend of all-natural
	 * spaghetti code
	 * 
	 * @param world the world
	 * @param pos the bottom-middle of the shield
	 * @param domeHeight difference in height between {@code pos} and the peak of
	 *        the dome
	 */
	public static void truncatedPyramid(World world, BlockPos pos, IBlockState state, int domeHeight, int domeTopLength, int slope)
	{
		int radius = domeTopLength / 2;
		for (int i = domeHeight - 1; i >= 0; i -= slope)
		{
			for (int k = 0; k >= -slope + 1 && i + k >= 0; k--)
				square(world, new BlockPos(pos.getX(), pos.getY() + i + k, pos.getZ()), (domeHeight - i - 1) / slope + radius, state);
		}
		for (int x = -radius; x <= radius; x++)
			for (int z = -radius; z <= radius; z++)
				if (world.getBlockState(pos.add(x, domeHeight - 1, z)).getBlock() == Blocks.SNOW_LAYER || world.getBlockState(pos.add(x, domeHeight - 1, z)).getBlock() == BlockHandler.ASH_CHAR || world.getBlockState(pos.add(x, domeHeight - 1, z)).getBlock() == Blocks.AIR
						|| world.getBlockState(pos.add(x, domeHeight - 1, z)).getBlock() == BlockHandler.PROTOSS_SHIELD)
					world.setBlockState(pos.add(x, domeHeight - 1, z), state);
	}

	/**
	 * @return Whether or not the JEI mod is installed
	 */
	public static boolean isJeiInstalled()
	{
		return isJeiInstalled;
	}

	/**
	 * Checks if external mods are installed.
	 */
	public static void checkMods()
	{
		isJeiInstalled = Loader.isModLoaded("jei");
	}
}