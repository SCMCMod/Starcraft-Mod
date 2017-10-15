package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;

/**
 * Char Gravel block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author Hypeirochus
 */
public class BlockCharGravel extends BlockGravel {

	public BlockCharGravel() {
		super();
		setUnlocalizedName("charGravel");
		setRegistryName("char_gravel");
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setSoundType(SoundType.GROUND);
		setHardness(0.6F);
		setResistance(3.0F);
		setHarvestLevel("shovel", 0);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.BLACK;
	}
	
	@Override
	public int getDustColor(IBlockState p_189876_1_) {
		return 000000;
	}
}
