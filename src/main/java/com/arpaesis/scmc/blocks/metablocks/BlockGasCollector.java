package com.arpaesis.scmc.blocks.metablocks;

import com.arpaesis.scmc.Starcraft;
import com.arpaesis.scmc.api.Utils;
import com.arpaesis.scmc.blocks.RegistryType;
import com.arpaesis.scmc.blocks.SCBlock;
import com.arpaesis.scmc.blocks.items.IMetaBlockName;
import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.handlers.GuiHandler;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;
import com.arpaesis.scmc.handlers.SoundHandler.SoundTypes;
import com.arpaesis.scmc.tileentity.TileEntityGasCollector;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

/**
 * This block has 3 variants. Refer to {@link GasCollectorType}
 * 
 * @author Ocelot5836
 */
public class BlockGasCollector extends SCBlock implements IMetaBlockName, ITileEntityProvider, IMetaRenderHandler
{

	/** The type property */
	public static final PropertyEnum<GasCollectorType> TYPE = PropertyEnum.create("type", GasCollectorType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 *        name
	 */
	public BlockGasCollector()
	{
		super("gas.collector", RegistryType.META, Material.IRON);
		setHardness(5.0f);
		setResistance(15.0f);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, GasCollectorType.PROTOSS));
		setHarvestLevel("pickaxe", 3, blockState.getBaseState().withProperty(TYPE, GasCollectorType.PROTOSS));
		setHarvestLevel("pickaxe", 2, blockState.getBaseState().withProperty(TYPE, GasCollectorType.TERRAN));
		setHarvestLevel("pickaxe", 0, blockState.getBaseState().withProperty(TYPE, GasCollectorType.ZERG));
		setCreativeTab(SCCreativeTabs.MISC);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return state.getValue(TYPE).getMapColor();
	}

	@Override
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, Entity entity)
	{
		if (world.getBlockState(pos) == this.getDefaultState().withProperty(TYPE, GasCollectorType.ZERG))
		{
			return SoundTypes.FLESH;
		} else
		{
			return SoundType.METAL;
		}
	}

	/**
	 * Adds the properties to the block
	 */
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]
		{ TYPE });
	}

	/**
	 * Makes sure the block drops the correct version of itself
	 */
	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}

	/**
	 * Gets the right meta data from the {@link IBlockState}
	 */
	@Override
	public int getMetaFromState(IBlockState state)
	{
		GasCollectorType type = state.getValue(TYPE);
		return type.getID();
	}

	/**
	 * Makes sure when you pick block it will work correctly
	 */
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state));
	}

	/**
	 * Inherited from the {@link IMetaBlockName}
	 */
	@Override
	public String getSpecialName(ItemStack stack)
	{
		return GasCollectorType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(TYPE, GasCollectorType.values()[meta]);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < GasCollectorType.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityGasCollector(meta);
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state)
	{
		TileEntityGasCollector te = (TileEntityGasCollector) world.getTileEntity(pos);
		IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		for (int slot = 0; slot < handler.getSlots(); slot++)
		{
			ItemStack stack = handler.getStackInSlot(slot);
			if (stack != null)
				InventoryHelper.spawnItemStack(world, pos.getX(), pos.getY(), pos.getZ(), stack);
		}
		super.breakBlock(world, pos, state);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (!world.isRemote)
			player.openGui(Starcraft.instance, GuiHandler.GAS_COLLECTOR_ID, world, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}

	@Override
	public boolean hasComparatorInputOverride(IBlockState state)
	{
		return true;
	}

	@Override
	public int getComparatorInputOverride(IBlockState blockState, World world, BlockPos pos)
	{
		TileEntityGasCollector te = (TileEntityGasCollector) world.getTileEntity(pos);
		ItemStackHandler handler = (ItemStackHandler) te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		return Utils.calculateRedstone(handler);
	}

	public static enum GasCollectorType implements IStringSerializable
	{
		PROTOSS("protoss", 0, MapColor.YELLOW), TERRAN("terran", 1, MapColor.IRON), ZERG("zerg", 2, MapColor.BROWN);

		private int ID;
		private String name;
		private MapColor color;

		private GasCollectorType(String name, int ID, MapColor color)
		{
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID()
		{
			return ID;
		}

		@Override
		public String getName()
		{
			return name;
		}

		public MapColor getMapColor()
		{
			return color;
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
		return GasCollectorType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "gas.collector." + GasCollectorType.values()[meta].getName();
	}
}