package com.hypeirochus.scmc.blocks;

import java.util.Arrays;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class StarcraftBlockCustomDrop extends StarcraftBlock {

	private final ItemStack[] droppedItems;

	public StarcraftBlockCustomDrop(Material material, ItemStack... drops) {
		super(material);
		this.droppedItems = drops;
	}

	public StarcraftBlockCustomDrop(String name, RegistryType type, Material material, MapColor color, ItemStack... drops) {
		super(name, type, material, color);
		this.droppedItems = drops;
	}

	public StarcraftBlockCustomDrop(RegistryType type, Material material, MapColor color, ItemStack... drops) {
		super(type, material, color);
		this.droppedItems = drops;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		if (droppedItems != null) {
			drops.addAll(Arrays.asList(droppedItems));
		}
	}
}