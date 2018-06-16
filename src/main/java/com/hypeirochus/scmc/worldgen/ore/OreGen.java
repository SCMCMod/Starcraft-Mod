package com.hypeirochus.scmc.worldgen.ore;

import java.util.Arrays;

import com.google.common.base.Predicate;

import net.minecraft.block.BlockStructure;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.gen.feature.WorldGenMinable;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This is a
 * 
 * @author Ocelot5836
 */
public class OreGen {

	private WorldGenMinable minable;

	public OreGen(IBlockState ore, int count, IBlockState... replaceBlocks) {
		this.minable = new WorldGenMinable(ore, count, new Predicate<IBlockState>() {
			@Override
			public boolean apply(IBlockState input) {
				int index = Arrays.binarySearch(replaceBlocks, input);
				return index >= 0 && index < replaceBlocks.length ? replaceBlocks[index] == input : false;
			}
		});
	}

	public WorldGenMinable getMinable() {
		return minable;
	}
}