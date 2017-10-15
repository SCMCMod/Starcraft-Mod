package ga.scmc.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

/**
 * Char Stone block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * 
 * @author He of a Former Time
 */
public class BlockCharStone extends Block {

	public BlockCharStone() {
		super(Material.ROCK, MapColor.BLACK);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setUnlocalizedName("charStone");
		setRegistryName("char_stone");
	}

	/**
	 * Gets the item dropped
	 * 
	 * @param state
	 *            the state of the block
	 * @param rand
	 *            an object of the Random class
	 * @param fortune
	 *            the magnitude of the fortune enchantment effect on this block
	 */
	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockHandler.COBBLESTONE_CHAR);
	}
}
