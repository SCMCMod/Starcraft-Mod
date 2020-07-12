package com.arpaesis.scmc.blocks;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.rom.block.RegistryType;

/**
 * Protoss Energy Stabilizer block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockProtossEnergyStabilizer extends SCBlock
{

	public BlockProtossEnergyStabilizer()
	{
		super("protoss.stabilizer", RegistryType.FULL, Material.IRON, MapColor.YELLOW);
		setSoundType(SoundType.METAL);
		setHardness(15.0F);
		setLightLevel(1.0F);
		setResistance(15.0F);
		setTickRandomly(true);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(SCCreativeTabs.PROTOSS);
	}
}
