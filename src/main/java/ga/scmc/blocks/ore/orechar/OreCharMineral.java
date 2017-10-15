package ga.scmc.blocks.ore.orechar;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class OreCharMineral extends Block {

	public OreCharMineral() {
		super(Material.ROCK, MapColor.BLACK);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setUnlocalizedName("charOreMineral");
		setRegistryName("char_ore_mineral");
	}

	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return ItemHandler.MINERAL_SHARD;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 4 + rand.nextInt(4);
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
            int i = MathHelper.getInt(rand, 0, 2);
            return i;
        }
        return 0;
	}
}
