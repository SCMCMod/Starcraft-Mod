package ga.scmc.blocks.ore;

import java.util.Random;

import javax.annotation.Nullable;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockCharOre extends Block
{
    public BlockCharOre(String unlocalizedName, String registryName, int level)
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

    public BlockCharOre(MapColor color)
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
        return this == BlockHandler.ORE_COAL_CHAR ? Items.COAL : (this == BlockHandler.ORE_DIAMOND_CHAR ? Items.DIAMOND : (this == BlockHandler.ORE_LAPIS_CHAR ? Items.DYE : (this == BlockHandler.ORE_RICHMINERAL_CHAR || this == BlockHandler.ORE_MINERAL_CHAR ? ItemHandler.MINERAL_SHARD : Item.getItemFromBlock(this))));
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
    	if(this == BlockHandler.ORE_LAPIS_CHAR) {
    		return  4 + random.nextInt(5);
    	}else if(this == BlockHandler.ORE_RICHMINERAL_CHAR || this == BlockHandler.ORE_MINERAL_CHAR) {
    		return 4 + random.nextInt(4);
    	}else {
    		return 1;
    	}
    }

    /**
     * Get the quantity dropped based on the given fortune level
     */
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != getItemDropped((IBlockState)getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return quantityDropped(random) * (i + 1);
        }
        else
        {
            return quantityDropped(random);
        }
    }

    /**
     * Spawns this Block's drops into the World as EntityItems.
     */
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
    
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int i = 0;

            if (this == BlockHandler.ORE_COAL_CHAR)
            {
                i = MathHelper.getInt(rand, 0, 2);
            }
            else if (this == BlockHandler.ORE_DIAMOND_CHAR)
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            else if (this == BlockHandler.ORE_RICHMINERAL_CHAR || this == BlockHandler.ORE_MINERAL_CHAR)
            {
                i = MathHelper.getInt(rand, 0, 2);
            }
            else if (this == BlockHandler.ORE_LAPIS_CHAR)
            {
                i = MathHelper.getInt(rand, 2, 5);
            }

            return i;
        }
        return 0;
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
    	if(this == BlockHandler.ORE_LAPIS_CHAR) {
    		return EnumDyeColor.BLUE.getDyeDamage();
    	}else if(this == BlockHandler.ORE_MINERAL_CHAR) {
    		return 0;
    	}else if(this == BlockHandler.ORE_RICHMINERAL_CHAR) {
    		return 1;
    	}else {
    		return 0;
    	}
    }
}