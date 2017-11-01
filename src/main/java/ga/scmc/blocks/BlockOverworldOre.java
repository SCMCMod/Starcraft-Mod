package ga.scmc.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockOverworldOre extends StarcraftBlock
{
	public BlockOverworldOre(String name, RegistryType type, Material material, MapColor color, int level) {
		super(name, type, material, color);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", level);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setSoundType(SoundType.STONE);
	}

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }
}