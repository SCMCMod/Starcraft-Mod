package com.arpaesis.scmc.blocks.metablocks;

import java.util.Random;

import com.arpaesis.scmc.blocks.RegistryType;
import com.arpaesis.scmc.blocks.SCBlock;
import com.arpaesis.scmc.blocks.itemblock.IMetaBlockName;
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
 * This block has four variants. Refer to {@link ProtossMetalType}
 */
public class BlockProtossMetalT1 extends SCBlock implements IMetaBlockName, IMetaRenderHandler
{

	/** The type property */
	public static final PropertyEnum<ProtossMetalType> TYPE = PropertyEnum.create("type", ProtossMetalType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 *        name
	 */
	public BlockProtossMetalT1()
	{
		super("protoss.metal.1", RegistryType.META, Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(15.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, ProtossMetalType.AIUR));
		setCreativeTab(SCCreativeTabs.PROTOSS);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return state.getValue(TYPE).getMapColor();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return null;
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
		ProtossMetalType type = state.getValue(TYPE);
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
		return ProtossMetalType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(TYPE, ProtossMetalType.values()[meta]);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items)
	{
		for (int i = 0; i < ProtossMetalType.values().length; i++)
		{
			items.add(new ItemStack(this, 1, i));
		}
	}

	public static enum ProtossMetalType implements IStringSerializable
	{
		AIUR("aiur", 0, MapColor.GOLD), DARK("dark", 1, MapColor.BLACK), GREEN("green", 2, MapColor.GREEN), BLUE("blue", 3, MapColor.BLUE), RED("red", 4, MapColor.RED);

		private int ID;
		private String name;
		private MapColor color;

		private ProtossMetalType(String name, int ID, MapColor color)
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
		return ProtossMetalType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "protoss.metal.1." + ProtossMetalType.values()[meta].getName();
	}
}