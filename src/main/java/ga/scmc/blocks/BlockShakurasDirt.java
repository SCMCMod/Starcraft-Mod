package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Char Dirt block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * 
 * @author He of a Former Time
 */
public class BlockShakurasDirt extends Block {

	public BlockShakurasDirt() {
		super(Material.GROUND, MapColor.LIGHT_BLUE);
		setUnlocalizedName("shakurasDirt");
		setRegistryName("shakuras_dirt");
		setSoundType(SoundType.GROUND);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
