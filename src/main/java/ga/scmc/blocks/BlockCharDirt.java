package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Char Dirt block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * @author Hypeirochus
 */
public class BlockCharDirt extends Block {

	public BlockCharDirt() {
		super(Material.GROUND, MapColor.BLACK);
		setUnlocalizedName("charDirt");
		setRegistryName("char_dirt");
		setSoundType(SoundType.GROUND);
		setHardness(0.5F);
		setResistance(2.5f);
		setHarvestLevel("shovel", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
