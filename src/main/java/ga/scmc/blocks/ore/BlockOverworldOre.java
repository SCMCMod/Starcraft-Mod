package ga.scmc.blocks.ore;

import java.util.Random;

import javax.annotation.Nullable;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockOverworldOre extends Block
{
    public BlockOverworldOre(String unlocalizedName, String registryName, int level)
    {
        this(Material.ROCK.getMaterialMapColor());
        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);
        setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", level);
        setCreativeTab(StarcraftCreativeTabs.MISC);
        setSoundType(SoundType.STONE);
    }

    public BlockOverworldOre(MapColor color)
    {
        super(Material.ROCK, color);
        setCreativeTab(StarcraftCreativeTabs.MISC);
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