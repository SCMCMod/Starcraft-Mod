package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Char Cobblestone block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * @author Hypeirochus
 */
public class BlockKorhalCityStone extends Block {

	public BlockKorhalCityStone() {
		super(Material.ROCK, MapColor.BLACK);
		setUnlocalizedName("korhal.stone.city");
		setRegistryName("korhal.stone.city");
		setSoundType(SoundType.STONE);
		setHardness(1.5f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
