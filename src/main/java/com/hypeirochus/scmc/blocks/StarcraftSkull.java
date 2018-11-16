package com.hypeirochus.scmc.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.hypeirochus.scmc.creativetabs.SCCreativeTabs;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;
import com.hypeirochus.scmc.tileentity.TileEntityStarcraftSkull;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class StarcraftSkull extends BlockContainer implements IMetaRenderHandler
{

	public static final PropertyDirection FACING = BlockDirectional.FACING;
	public static final PropertyBool NODROP = PropertyBool.create("nodrop");

	public static final AxisAlignedBB DEFAULT_AABB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);
	public static final AxisAlignedBB[] BOXES = new AxisAlignedBB[]
	{ new AxisAlignedBB(0.25D, 0.25D, 0.0D, 0.75D, 0.75D, 0.5D), new AxisAlignedBB(0.5D, 0.25D, 0.25D, 1.0D, 0.75D, 0.75D), new AxisAlignedBB(0.25D, 0.25D, 0.5D, 0.75D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.25D, 0.25D, 0.5D, 0.75D, 0.75D) };

	public StarcraftSkull()
	{
		super(Material.CIRCUITS, MapColor.SNOW);
		setUnlocalizedName("skull");
		setRegistryName("skull");
		setHardness(1.0F);
		setResistance(1.6f);
		setSoundType(SoundType.STONE);
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(NODROP, Boolean.valueOf(false)));
		setCreativeTab(SCCreativeTabs.MISC);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		EnumFacing facing = state.getValue(FACING);
		if (facing.getIndex() < 3)
			return DEFAULT_AABB;
		return BOXES[facing.getHorizontalIndex()];
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing()).withProperty(NODROP, Boolean.valueOf(false));
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityStarcraftSkull();
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		int i = 0;
		TileEntity tileentity = worldIn.getTileEntity(pos);

		if (tileentity instanceof TileEntityStarcraftSkull)
		{
			i = ((TileEntityStarcraftSkull) tileentity).getSkullType();
		}

		return new ItemStack(BlockHandler.STARCRAFT_SKULL, 1, i);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
	{
		if (player.capabilities.isCreativeMode)
		{
			state = state.withProperty(NODROP, Boolean.valueOf(true));
			worldIn.setBlockState(pos, state, 4);
		}
		this.dropBlockAsItem(worldIn, pos, state, 0);

		super.onBlockHarvested(worldIn, pos, state, player);
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess worldIn, BlockPos pos, IBlockState state, int fortune)
	{
		List<ItemStack> ret = new ArrayList<ItemStack>();
		{
			if (!((Boolean) state.getValue(NODROP)).booleanValue())
			{
				TileEntity tileentity = worldIn.getTileEntity(pos);

				if (tileentity instanceof TileEntityStarcraftSkull)
				{
					TileEntityStarcraftSkull tileentityskull = (TileEntityStarcraftSkull) tileentity;
					ItemStack itemstack = new ItemStack(BlockHandler.STARCRAFT_SKULL, 1, tileentityskull.getSkullType());
					ret.add(itemstack);
				}
			}
		}
		return ret;
	}

	@Nullable
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(BlockHandler.STARCRAFT_SKULL);
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta & 7)).withProperty(NODROP, Boolean.valueOf((meta & 8) > 0));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		i = i | ((EnumFacing) state.getValue(FACING)).getIndex();

		if (((Boolean) state.getValue(NODROP)).booleanValue())
		{
			i |= 8;
		}

		return i;
	}

	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot)
	{
		return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
	}

	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
	{
		return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ FACING, NODROP });
	}

	@Override
	public boolean addDestroyEffects(World world, BlockPos pos, ParticleManager manager)
	{
		manager.addBlockDestroyEffects(pos, Blocks.SOUL_SAND.getDefaultState());
		return true;
	}

	public static enum EnumSkullType implements IStringSerializable
	{
		CIVILIAN("civilian", 0), ZERGLING_SC2("zergling_sc2", 1), HYDRALISK("hydralisk", 2), BRUTALISK("brutalisk", 3);

		private int id;
		private String name;

		private EnumSkullType(String name, int id)
		{
			this.id = id;
			this.name = name;
		}

		public int getID()
		{
			return id;
		}

		@Override
		public String getName()
		{
			return name;
		}

		@Override
		public String toString()
		{
			return getName();
		}
	}

	@Override
	public int getItemCount()
	{
		return EnumSkullType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "skull";
	}
}