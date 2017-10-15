package ga.scmc.blocks.ore.orechar;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OreCharIron extends Block {

	public OreCharIron() {
		super(Material.ROCK, MapColor.BLACK);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setUnlocalizedName("charOreIron");
		setRegistryName("char_ore_iron");
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Item.getItemFromBlock(this);
	}
}