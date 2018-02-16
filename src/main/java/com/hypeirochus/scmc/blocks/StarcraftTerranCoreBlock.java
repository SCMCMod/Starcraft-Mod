package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class StarcraftTerranCoreBlock extends StarcraftBlock {

	public StarcraftTerranCoreBlock(String name, RegistryType type, Material material, MapColor color) {
		super(name, type, material, color);
		setHardness(15.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
