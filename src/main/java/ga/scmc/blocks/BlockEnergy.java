package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Energy block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author Hypeirochus
 */
public class BlockEnergy extends Block {

	public BlockEnergy() {
		super(Material.REDSTONE_LIGHT, MapColor.LIGHT_BLUE);
		setUnlocalizedName("block.energy");
		setRegistryName("block.energy");
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setLightLevel(1.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}