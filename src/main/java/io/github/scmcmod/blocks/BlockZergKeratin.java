package io.github.scmcmod.blocks;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.rom.block.BlockGeneric;
import net.rom.block.RegistryType;

/**
 * Keratin Chunk block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockZergKeratin extends BlockGeneric
{

	public BlockZergKeratin()
	{
		super(Material.GROUND, MapColor.SNOW);
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(SCCreativeTabs.ZERG);
	}
}