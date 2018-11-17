package com.arpaesis.scmc.blocks.metablocks;

import com.arpaesis.scmc.blocks.RegistryType;
import com.arpaesis.scmc.blocks.SCBlock;
import com.arpaesis.scmc.blocks.items.IMetaBlockName;
import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;

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
 * This block has sixteen variants. Refer to {@link ParisteelMetalType}
 */
public class BlockParisteel extends SCBlock implements IMetaBlockName, IMetaRenderHandler
{

	/** The type property */
	public static final PropertyEnum<ParisteelMetalType> TYPE = PropertyEnum.create("type", ParisteelMetalType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 *        name
	 */
	public BlockParisteel()
	{
		super("terran.paristeel", RegistryType.META, Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(10.0F);
		setResistance(10.0F);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, ParisteelMetalType.WHITE));
		setCreativeTab(SCCreativeTabs.TERRAN);
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

	/**
	 * Gets the right meta data from the {@link IBlockState}
	 */
	@Override
	public int getMetaFromState(IBlockState state)
	{
		ParisteelMetalType type = state.getValue(TYPE);
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
		return ParisteelMetalType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(TYPE, ParisteelMetalType.values()[meta]);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < ParisteelMetalType.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	public static enum ParisteelMetalType implements IStringSerializable
	{
		PURPLE("purple", 0, MapColor.PURPLE), BROWN("brown", 1, MapColor.BROWN), PINK("pink", 2, MapColor.PINK), BLUE("blue", 3, MapColor.BLUE), CYAN("cyan", 4, MapColor.CYAN), GRAY("gray", 5, MapColor.GRAY), GREEN("green", 6, MapColor.GREEN), LIGHT_BLUE("lightblue", 7, MapColor.LIGHT_BLUE),
		LIME("lime", 8, MapColor.LIME), MAGENTA("magenta", 9, MapColor.MAGENTA), ORANGE("orange", 10, MapColor.ADOBE), RED("red", 11, MapColor.RED), SILVER("silver", 12, MapColor.SILVER), WHITE("white", 13, MapColor.SNOW), YELLOW("yellow", 14, MapColor.YELLOW), BLACK("black", 15, MapColor.BLACK);

		private int ID;
		private String name;
		private MapColor color;

		private ParisteelMetalType(String name, int ID, MapColor color)
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
		return ParisteelMetalType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "terran.paristeel." + ParisteelMetalType.values()[meta].getName();
	}
}