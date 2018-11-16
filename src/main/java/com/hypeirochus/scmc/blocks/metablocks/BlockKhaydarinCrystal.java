package com.hypeirochus.scmc.blocks.metablocks;

import com.hypeirochus.scmc.blocks.RegistryType;
import com.hypeirochus.scmc.blocks.StarcraftBlock;
import com.hypeirochus.scmc.blocks.items.IMetaBlockName;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * This block has three variants. Refer to {@link PylonCrystalType}
 */
public class BlockKhaydarinCrystal extends StarcraftBlock implements IMetaBlockName, IMetaRenderHandler
{

	/** The type property */
	public static final PropertyEnum<PylonCrystalType> TYPE = PropertyEnum.create("type", PylonCrystalType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 *        name
	 */
	public BlockKhaydarinCrystal()
	{
		super("protoss.pyloncrystal", RegistryType.META, Material.ROCK);
		setSoundType(SoundType.GLASS);
		setHardness(10.0F);
		setResistance(10.0F);
		setLightLevel(4.0F);
		setTickRandomly(true);
		setHarvestLevel("pickaxe", 2);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, PylonCrystalType.PURE));
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return state.getValue(TYPE).getMapColor();
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

	// @Override
	// public Item getItemDropped(IBlockState state, Random rand, int fortune) {
	// return rand.nextFloat() <= 0.1 ? ItemHandler.KHAYDARIN_CRYSTAL : null;
	// }

	/**
	 * Gets the right meta data from the {@link IBlockState}
	 */
	@Override
	public int getMetaFromState(IBlockState state)
	{
		PylonCrystalType type = state.getValue(TYPE);
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
		return PylonCrystalType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(TYPE, PylonCrystalType.values()[meta % PylonCrystalType.values().length]);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < PylonCrystalType.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	public static enum PylonCrystalType implements IStringSerializable
	{
		PURE("pure", 0, MapColor.LIGHT_BLUE), DARK("dark", 1, MapColor.BLACK), VOID("void", 2, MapColor.LIME);

		private int ID;
		private String name;
		private MapColor color;

		private PylonCrystalType(String name, int ID, MapColor color)
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
		return PylonCrystalType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "protoss.pyloncrystal." + PylonCrystalType.values()[meta].getName();
	}
}