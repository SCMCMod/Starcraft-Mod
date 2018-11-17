package com.arpaesis.scmc.blocks;

import java.util.Arrays;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

//TODO: MOVE TO CORE MOD, AND make this generically named.
public class SCBlockCustomDrop extends SCBlock
{

	private final ItemStack[] droppedItems;

	public SCBlockCustomDrop(Material material, ItemStack... drops)
	{
		super(material);
		this.droppedItems = drops;
	}

	public SCBlockCustomDrop(String name, RegistryType type, Material material, MapColor color, ItemStack... drops)
	{
		super(name, type, material, color);
		this.droppedItems = drops;
	}

	public SCBlockCustomDrop(RegistryType type, Material material, MapColor color, ItemStack... drops)
	{
		super(type, material, color);
		this.droppedItems = drops;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
		if (droppedItems != null)
		{
			drops.addAll(Arrays.asList(droppedItems));
		}
	}
}