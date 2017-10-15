package ga.scmc.blocks.ore.oreshakuras;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OreShakurasTitanium extends Block {

	public OreShakurasTitanium() {
		super(Material.ROCK, MapColor.LIGHT_BLUE);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setUnlocalizedName("shakurasOreTitanium");
		setRegistryName("shakuras_ore_titanium");
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Item.getItemFromBlock(this);
	}
}