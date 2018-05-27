package com.hypeirochus.scmc.worldgen.structure;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Contains the necessities required to generate a basic structure.
 * 
 * @author Ocelot5836
 */
public interface IGenericStructure {

	/**
	 * Sets the flags for the structure when generating.
	 * 
	 * @param flags
	 *            The object flags
	 */
	void setFlags(Object[] flags);

	/**
	 * Generates the structure.
	 * 
	 * @param world
	 *            The world to generate the structure in
	 * @param pos
	 *            The position to generate the structure
	 * @return Whether or not the structure could generate
	 */
	boolean generate(World world, BlockPos pos);

	/**
	 * Clears the structure if possible.
	 * 
	 * @param world
	 *            The world to clear the structure from
	 * @param pos
	 *            The position to clear the structure from
	 */
	default void clear(World world, BlockPos pos) {
	}
}