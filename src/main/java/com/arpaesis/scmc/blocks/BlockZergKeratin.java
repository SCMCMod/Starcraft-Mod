package com.arpaesis.scmc.blocks;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.rom.block.RegistryType;

/**
 * Keratin Chunk block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockZergKeratin extends SCBlock
{

	public BlockZergKeratin()
	{
		super("zerg.keratin", RegistryType.FULL, Material.GROUND, MapColor.SNOW);
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(SCCreativeTabs.ZERG);
	}
}