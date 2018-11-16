package com.hypeirochus.scmc.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OreStarcraftRedstone extends StarcraftBlock
{

	public static final PropertyBool ACTIVE = PropertyBool.create("active");

	public OreStarcraftRedstone(String name)
	{
		this(name, Material.ROCK.getMaterialMapColor());
	}

	public OreStarcraftRedstone(String name, MapColor color)
	{
		super(name, RegistryType.FULL, Material.ROCK, color);
		setHardness(1);
		setResistance(5);
		setHarvestLevel("pickaxe", 2);
		setTickRandomly(true);
		setSoundType(SoundType.STONE);
		setDefaultState(this.blockState.getBaseState().withProperty(ACTIVE, Boolean.valueOf(false)));
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3)
	{
		return Items.REDSTONE;
	}

	@Override
	public int quantityDropped(Random rand)
	{
		return 4 + rand.nextInt(1);
	}

	@Override
	public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
	{
		if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this))
		{
			return 1 + RANDOM.nextInt(5);
		}
		return 0;
	}

	@Override
	public int tickRate(World world)
	{
		return 30;
	}

	@Override
	public void onBlockClicked(World world, BlockPos pos, EntityPlayer player)
	{
		this.activate(world, pos);
		super.onBlockClicked(world, pos, player);
	}

	@Override
	public void onEntityWalk(World world, BlockPos pos, Entity entity)
	{
		this.activate(world, pos);
		super.onEntityWalk(world, pos, entity);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		this.activate(world, pos);
		return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
	{
		if (this.isLit(world, pos))
		{
			this.setLit(world, pos, false);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand)
	{
		if (this.isLit(world, pos))
		{
			this.spawnParticles(world, pos);
		}
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(ACTIVE, this.getBool(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return state.getValue(ACTIVE) ? 1 : 0;
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ ACTIVE });
	}

	private boolean getBool(int value)
	{
		return value == 1;
	}

	private void activate(World world, BlockPos pos)
	{
		this.spawnParticles(world, pos);
		this.setLit(world, pos, true);
	}

	private void setLit(World world, BlockPos pos, boolean lit)
	{
		world.setBlockState(pos, this.getDefaultState().withProperty(ACTIVE, lit));
	}

	@Override
	public int getLightValue(IBlockState state)
	{
		return state.getValue(ACTIVE) ? (int) (15 * 0.625f) : 0;
	}

	private boolean isLit(World world, BlockPos pos)
	{
		return world.getBlockState(pos).getValue(ACTIVE);
	}

	private void spawnParticles(World worldIn, BlockPos pos)
	{
		Random random = worldIn.rand;
		// double d0 = 0.0625D;

		for (int i = 0; i < 6; ++i)
		{
			double d1 = (double) ((float) pos.getX() + random.nextFloat());
			double d2 = (double) ((float) pos.getY() + random.nextFloat());
			double d3 = (double) ((float) pos.getZ() + random.nextFloat());

			if (i == 0 && !worldIn.getBlockState(pos.up()).isOpaqueCube())
			{
				d2 = (double) pos.getY() + 0.0625D + 1.0D;
			}

			if (i == 1 && !worldIn.getBlockState(pos.down()).isOpaqueCube())
			{
				d2 = (double) pos.getY() - 0.0625D;
			}

			if (i == 2 && !worldIn.getBlockState(pos.south()).isOpaqueCube())
			{
				d3 = (double) pos.getZ() + 0.0625D + 1.0D;
			}

			if (i == 3 && !worldIn.getBlockState(pos.north()).isOpaqueCube())
			{
				d3 = (double) pos.getZ() - 0.0625D;
			}

			if (i == 4 && !worldIn.getBlockState(pos.east()).isOpaqueCube())
			{
				d1 = (double) pos.getX() + 0.0625D + 1.0D;
			}

			if (i == 5 && !worldIn.getBlockState(pos.west()).isOpaqueCube())
			{
				d1 = (double) pos.getX() - 0.0625D;
			}

			if (d1 < (double) pos.getX() || d1 > (double) (pos.getX() + 1) || d2 < 0.0D || d2 > (double) (pos.getY() + 1) || d3 < (double) pos.getZ() || d3 > (double) (pos.getZ() + 1))
			{
				worldIn.spawnParticle(EnumParticleTypes.REDSTONE, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
			}
		}
	}
}
