package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Keratin Chunk block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author He of a Former Time
 */
public class BlockKeratinChunk extends Block {

	public BlockKeratinChunk() {
		super(Material.GROUND, MapColor.SNOW);
		setUnlocalizedName("zergKeratinChunk");
		setRegistryName("zerg_keratin_chunk");
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}