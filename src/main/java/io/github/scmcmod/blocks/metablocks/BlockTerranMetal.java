package io.github.scmcmod.blocks.metablocks;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.handlers.IMetaRenderHandler;
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
import net.rom.block.BlockGeneric;
import net.rom.block.inerf.IMetaBlockName;

/**
 * This block has three variants. Refer to {@link CompressedMetalType}
 */
public class BlockTerranMetal extends BlockGeneric implements IMetaBlockName, IMetaRenderHandler
{

	/** The type property */
	public static final PropertyEnum<CompressedMetalType> TYPE = PropertyEnum.create("type", CompressedMetalType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 *        name
	 */
	public BlockTerranMetal()
	{
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.0F); // Sets how hard the block is to break
		setResistance(10.0F); // Sets the blocks blast resistance to explosions
		setDefaultState(blockState.getBaseState().withProperty(TYPE, CompressedMetalType.COPPER)); // Default state
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
		CompressedMetalType type = state.getValue(TYPE);
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
		return CompressedMetalType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(TYPE, CompressedMetalType.values()[meta]);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < CompressedMetalType.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	public static enum CompressedMetalType implements IStringSerializable
	{
		COPPER("copper", 0, MapColor.ADOBE), STEEL("steel", 1, MapColor.BLACK), TITANIUM("titanium", 2, MapColor.IRON), NEOSTEEL("neosteel", 3, MapColor.BLACK);

		private int ID;
		private String name;
		private MapColor color;

		private CompressedMetalType(String name, int ID, MapColor color)
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

		@Override
		public String toString()
		{
			return getName();
		}

		public MapColor getMapColor()
		{
			return color;
		}
	}

	@Override
	public int getItemCount()
	{
		return CompressedMetalType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "terran.metal." + CompressedMetalType.values()[meta].getName();
	}
}