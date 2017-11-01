package ga.scmc.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OreShakurasRedstone extends Block {
	
	public final boolean isOn;

	public OreShakurasRedstone(boolean isOn) {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		
		if (isOn) {
			setUnlocalizedName("shakuras.redstone.lit");
			setRegistryName("shakuras.redstone.lit");
			setLightLevel(.625f);
			this.setTickRandomly(true);
		} else {
			setUnlocalizedName("shakuras.redstone");
			setRegistryName("shakuras.redstone");
			setCreativeTab(StarcraftCreativeTabs.MISC);
		}
		this.isOn = isOn;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Items.REDSTONE;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 4 + rand.nextInt(1);
	}
	
	@Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this))
        {
            return 1 + RANDOM.nextInt(5);
        }
        return 0;
    }
	
	/**
     * How many world ticks before ticking
     */
	@Override
    public int tickRate(World worldIn) {
        return 30;
    }

	@Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        this.activate(worldIn, pos);
        super.onBlockClicked(worldIn, pos, playerIn);
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block)
     */
	@Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        this.activate(worldIn, pos);
        super.onEntityWalk(worldIn, pos, entityIn);
    }

	@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        this.activate(worldIn, pos);
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
    }

    private void activate(World worldIn, BlockPos pos) {
        this.spawnParticles(worldIn, pos);

        if (this == BlockHandler.ORE_REDSTONE_SHAKURAS) {
            worldIn.setBlockState(pos, BlockHandler.ORE_REDSTONE_LIT_SHAKURAS.getDefaultState());
        }
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (this == BlockHandler.ORE_REDSTONE_LIT_SHAKURAS) {
            worldIn.setBlockState(pos, BlockHandler.ORE_REDSTONE_SHAKURAS.getDefaultState());
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (this.isOn) {
            this.spawnParticles(worldIn, pos);
        }
    }

    private void spawnParticles(World worldIn, BlockPos pos) {
        Random random = worldIn.rand;
//        double d0 = 0.0625D;

        for (int i = 0; i < 6; ++i) {
            double d1 = (double)((float)pos.getX() + random.nextFloat());
            double d2 = (double)((float)pos.getY() + random.nextFloat());
            double d3 = (double)((float)pos.getZ() + random.nextFloat());

            if (i == 0 && !worldIn.getBlockState(pos.up()).isOpaqueCube()) {
                d2 = (double)pos.getY() + 0.0625D + 1.0D;
            }

            if (i == 1 && !worldIn.getBlockState(pos.down()).isOpaqueCube()) {
                d2 = (double)pos.getY() - 0.0625D;
            }

            if (i == 2 && !worldIn.getBlockState(pos.south()).isOpaqueCube()) {
                d3 = (double)pos.getZ() + 0.0625D + 1.0D;
            }

            if (i == 3 && !worldIn.getBlockState(pos.north()).isOpaqueCube()) {
                d3 = (double)pos.getZ() - 0.0625D;
            }

            if (i == 4 && !worldIn.getBlockState(pos.east()).isOpaqueCube()) {
                d1 = (double)pos.getX() + 0.0625D + 1.0D;
            }

            if (i == 5 && !worldIn.getBlockState(pos.west()).isOpaqueCube()) {
                d1 = (double)pos.getX() - 0.0625D;
            }

            if (d1 < (double)pos.getX() || d1 > (double)(pos.getX() + 1) || d2 < 0.0D || d2 > (double)(pos.getY() + 1) || d3 < (double)pos.getZ() || d3 > (double)(pos.getZ() + 1)) {
                worldIn.spawnParticle(EnumParticleTypes.REDSTONE, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }
    }
}
