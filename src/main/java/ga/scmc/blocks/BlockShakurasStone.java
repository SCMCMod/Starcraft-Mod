package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockShakurasStone extends Block {

	public BlockShakurasStone() {
		super(Material.ROCK, MapColor.LIGHT_BLUE);
		setUnlocalizedName("shakurasStone");
		setRegistryName("shakuras_stone");
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(10.0F);
		setLightOpacity(0);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockHandler.COBBLESTONE_SHAKURAS);
	}
}