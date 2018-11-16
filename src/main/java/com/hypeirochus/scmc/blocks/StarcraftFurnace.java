package com.hypeirochus.scmc.blocks;

import java.util.Random;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.api.Utils;
import com.hypeirochus.scmc.creativetabs.SCCreativeTabs;
import com.hypeirochus.scmc.enums.EnumWorldType;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.tileentity.TileEntityStarcraftFurnace;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * A block which is used for all of the starcraft furnaces
 *
 * @author CJMinecraft
 */
public class StarcraftFurnace extends BlockContainer
{

	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public static final PropertyBool BURNING = PropertyBool.create("burning");

	private EnumWorldType type;

	public StarcraftFurnace(MapColor mapColor, EnumWorldType type)
	{
		super(Material.ROCK, mapColor);
		this.type = type;
		this.setUnlocalizedName(type.getName() + ".furnace");
		this.setRegistryName(type.getName() + ".furnace");
		this.setCreativeTab(SCCreativeTabs.MISC);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(17.5F);
		setHarvestLevel("pickaxe", 0);
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(BURNING, false));
		BlockHandler.registerFullBlock(this);
	}

	public EnumWorldType getType()
	{
		return type;
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	{
		this.setDefaultFacing(worldIn, pos, state);
	}

	private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
	{
		if (!worldIn.isRemote)
		{
			IBlockState north = worldIn.getBlockState(pos.north());
			IBlockState south = worldIn.getBlockState(pos.south());
			IBlockState west = worldIn.getBlockState(pos.west());
			IBlockState east = worldIn.getBlockState(pos.east());
			EnumFacing facing = state.getValue(FACING);

			if (facing == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock())
				facing = EnumFacing.SOUTH;
			else if (facing == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock())
				facing = EnumFacing.NORTH;
			else if (facing == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock())
				facing = EnumFacing.EAST;
			else if (facing == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock())
				facing = EnumFacing.WEST;

			worldIn.setBlockState(pos, state.withProperty(FACING, facing), 2);
		}
	}

	@SuppressWarnings("incomplete-switch")
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState state, World worldIn, BlockPos pos, Random rand)
	{
		if (state.getValue(BURNING))
		{
			EnumFacing enumfacing = state.getValue(FACING);
			double x = (double) pos.getX() + 0.5D;
			double y = (double) pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
			double z = (double) pos.getZ() + 0.5D;
			double randOffset = rand.nextDouble() * 0.6D - 0.3D;

			if (rand.nextDouble() < 0.1D)
				worldIn.playSound((double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);

			switch (enumfacing)
			{
			case WEST:
				worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x - 0.52D, y, z + randOffset, 0.0D, 0.0D, 0.0D, new int[0]);
				worldIn.spawnParticle(EnumParticleTypes.FLAME, x - 0.52D, y, z + randOffset, 0.0D, 0.0D, 0.0D, new int[0]);
				break;
			case EAST:
				worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + 0.52D, y, z + randOffset, 0.0D, 0.0D, 0.0D, new int[0]);
				worldIn.spawnParticle(EnumParticleTypes.FLAME, x + 0.52D, y, z + randOffset, 0.0D, 0.0D, 0.0D, new int[0]);
				break;
			case NORTH:
				worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + randOffset, y, z - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
				worldIn.spawnParticle(EnumParticleTypes.FLAME, x + randOffset, y, z - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
				break;
			case SOUTH:
				worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + randOffset, y, z + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
				worldIn.spawnParticle(EnumParticleTypes.FLAME, x + randOffset, y, z + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
				break;
			}
		}
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (world.isRemote)
			return true;
		else
		{
			player.openGui(Starcraft.instance, type.getGuiId(), world, pos.getX(), pos.getY(), pos.getZ());
			player.addStat(StatList.FURNACE_INTERACTION);
			return true;
		}
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		switch (this.type)
		{
		case CHAR:
			return new ItemStack(BlockHandler.FURNACE_CHAR);
		case SHAKURAS:
			return new ItemStack(BlockHandler.FURNACE_SHAKURAS);
		case SLAYN:
			return new ItemStack(BlockHandler.FURNACE_SLAYN);
		default:
			return super.getPickBlock(state, target, world, pos, player);
		}
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the
	 * block.
	 */
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityStarcraftFurnace();
	}

	/**
	 * Called by ItemBlocks just before a block is actually set in the world, to
	 * allow for adjustments to the IBlockstate
	 */
	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	/**
	 * Called by ItemBlocks after a block is set in the world, to allow post-place
	 * logic
	 */
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		world.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state)
	{
		TileEntity te = world.getTileEntity(pos);

		IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		for (int slot = 0; slot < handler.getSlots(); slot++)
		{
			if (handler.getStackInSlot(slot) != null)
				InventoryHelper.spawnItemStack(world, pos.getX(), pos.getY(), pos.getZ(), handler.getStackInSlot(slot));
		}
		world.updateComparatorOutputLevel(pos, this);
		world.removeTileEntity(pos);
	}

	@Override
	public boolean hasComparatorInputOverride(IBlockState state)
	{
		return true;
	}

	@Override
	public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos)
	{
		return Utils.calculateRedstone(worldIn.getTileEntity(pos).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null));
	}

	/**
	 * The type of render function called. 3 for standard block models, 2 for
	 * TESR's, 1 for liquids, -1 is no render
	 */
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
	{
		return EnumBlockRenderType.MODEL;
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		EnumFacing face = EnumFacing.getFront(meta / 2 + 2);

		if (face.getAxis() == EnumFacing.Axis.Y)
			face = EnumFacing.NORTH;

		return this.getDefaultState().withProperty(FACING, face).withProperty(BURNING, meta % 2 == 0);
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	@Override
	public int getMetaFromState(IBlockState state)
	{
		return (state.getValue(FACING).getHorizontalIndex()) * 2 + (state.getValue(BURNING) ? 0 : 1);
	}

	/**
	 * Returns the blockstate with the given rotation from the passed blockstate. If
	 * inapplicable, returns the passed blockstate.
	 */
	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot)
	{
		return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
	}

	/**
	 * Returns the blockstate with the given mirror of the passed blockstate. If
	 * inapplicable, returns the passed blockstate.
	 */
	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
	{
		return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ FACING, BURNING });
	}
}
