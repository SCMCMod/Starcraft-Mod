package ga.scmc.blocks.ore.oreshakuras;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class OreShakurasCoal extends Block {

	public OreShakurasCoal() {
		super(Material.ROCK, MapColor.LIGHT_BLUE);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setUnlocalizedName("shakurasOreCoal");
		setRegistryName("shakuras_ore_coal");
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Items.COAL;
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
