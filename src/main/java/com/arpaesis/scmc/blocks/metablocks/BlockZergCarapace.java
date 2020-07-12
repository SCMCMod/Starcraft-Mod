package com.arpaesis.scmc.blocks.metablocks;

import com.arpaesis.scmc.blocks.RegistryType;
import com.arpaesis.scmc.blocks.SCBlock;
import com.arpaesis.scmc.blocks.itemblock.IMetaBlockName;
import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;
import com.arpaesis.scmc.handlers.SoundHandler.SoundTypes;

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
 * This block has three variants. Refer to {@link ZergStructureCarapaceType}
 */
public class BlockZergCarapace extends SCBlock implements IMetaBlockName, IMetaRenderHandler
{

	/**
	 * The type property
	 */
	public static final PropertyEnum<ZergStructureCarapaceType> TYPE = PropertyEnum.create("type", ZergStructureCarapaceType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 *        name
	 */
	public BlockZergCarapace()
	{
		super("zerg.carapace", RegistryType.META, Material.ROCK);
		setSoundType(SoundTypes.FLESH);
		setHardness(15.0F);
		setResistance(15.0F);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, ZergStructureCarapaceType.T1)); // Default state
		setCreativeTab(SCCreativeTabs.ZERG);
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
		ZergStructureCarapaceType type = state.getValue(TYPE);
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
		return ZergStructureCarapaceType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(TYPE, ZergStructureCarapaceType.values()[meta]);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < ZergStructureCarapaceType.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	public static enum ZergStructureCarapaceType implements IStringSerializable
	{
		T1("1", 0, MapColor.BROWN), T2("2", 1, MapColor.BROWN), T3("3", 2, MapColor.BROWN);

		private int ID;
		private String name;
		private MapColor color;

		private ZergStructureCarapaceType(String name, int ID, MapColor color)
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
		return ZergStructureCarapaceType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "zerg.carapace." + ZergStructureCarapaceType.values()[meta].getName();
	}
}