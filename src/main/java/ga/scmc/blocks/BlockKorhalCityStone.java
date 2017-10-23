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
		setUnlocalizedName("korhalCityStone");
		setRegistryName("korhal_city_stone");
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
