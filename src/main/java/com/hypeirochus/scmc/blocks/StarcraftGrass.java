package com.hypeirochus.scmc.blocks;

import java.util.Random;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StarcraftGrass extends StarcraftBlock implements IBlockColor, IItemColor, IGrowable
{

	public static final PropertyBool SNOWY = PropertyBool.create("snowy");

	private IBlockState dirt;

	public StarcraftGrass(String name, MapColor color, IBlockState dirt)
	{
		super(name, RegistryType.FULL, Material.GRASS, color);
		this.dirt = dirt;
		setHardness(0.6F);
		setResistance(1.0F);
		setHarvestLevel("shovel", -1);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setSoundType(SoundType.PLANT);
		setTickRandomly(true);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (!worldIn.isRemote)
		{
			if (!worldIn.isAreaLoaded(pos, 3))
				return;
			if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2)
			{
				worldIn.setBlockState(pos, dirt);
			} else
			{
				if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
				{
					for (int i = 0; i < 4; ++i)
					{
						BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

						if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos))
						{
							return;
						}

						IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
						IBlockState iblockstate1 = worldIn.getBlockState(blockpos);

						if (iblockstate1.getBlock() == dirt.getBlock() && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate.getLightOpacity(worldIn, pos.up()) <= 2)
						{
							worldIn.setBlockState(blockpos, this.getDefaultState());
						}
					}
				}
			}
		}
	}

	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable)
	{
		return true;
	}

	@Override
	public boolean canGrow(World world, BlockPos pos, IBlockState state, boolean isClient)
	{
		return true;
	}

	@Override
	public boolean canUseBonemeal(World world, Random rand, BlockPos pos, IBlockState state)
	{
		return true;
	}

	@Override
	public void grow(World world, Random rand, BlockPos pos, IBlockState state)
	{
		BlockPos blockpos = pos.up();

		for (int i = 0; i < 128; i++)
		{
			BlockPos placePos = blockpos;
			int j = 0;

			while (true)
			{
				if (j >= i / 16)
				{
					if (world.isAirBlock(placePos))
					{
						if (rand.nextInt(8) == 0)
						{
							world.getBiome(placePos).plantFlower(world, rand, placePos);
						} else
						{
							IBlockState iblockstate1 = Blocks.TALLGRASS.getDefaultState().withProperty(BlockTallGrass.TYPE, BlockTallGrass.EnumType.GRASS);

							if (Blocks.TALLGRASS.canBlockStay(world, placePos, iblockstate1))
							{
								world.setBlockState(placePos, iblockstate1, 3);
							}
						}
					}

					break;
				}

				placePos = placePos.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);

				if (world.getBlockState(placePos.down()).getBlock() != this || world.getBlockState(placePos).isNormalCube())
				{
					break;
				}

				j++;
			}
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT_MIPPED;
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		Block block = world.getBlockState(pos.up()).getBlock();
		return state.withProperty(SNOWY, Boolean.valueOf(block == Blocks.SNOW || block == Blocks.SNOW_LAYER));
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return dirt.getBlock().getItemDropped(dirt, rand, fortune);
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return 0;
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, SNOWY);
	}

	@Override
	public int colorMultiplier(IBlockState state, IBlockAccess world, BlockPos pos, int tintIndex)
	{
		return world != null && pos != null ? BiomeColorHelper.getGrassColorAtPos(world, pos) : ColorizerGrass.getGrassColor(0.5, 1.0);
	}

	@Override
	public int colorMultiplier(ItemStack stack, int tintIndex)
	{
		IBlockState iblockstate = ((ItemBlock) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
		return Minecraft.getMinecraft().getBlockColors().colorMultiplier(iblockstate, (IBlockAccess) null, (BlockPos) null, tintIndex);
	}
}