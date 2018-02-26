package com.hypeirochus.scmc.blocks.metablocks;

import java.util.Random;

import com.hypeirochus.scmc.blocks.RegistryType;
import com.hypeirochus.scmc.blocks.StarcraftBlock;
import com.hypeirochus.scmc.blocks.items.IMetaBlockName;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.MaterialHandler;
import com.hypeirochus.scmc.handlers.SoundHandler.SoundTypes;
import com.hypeirochus.scmc.items.IMetaRenderHandler;

import net.minecraft.block.material.MapColor;
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
 * This block has three variants. Refer to {@link ZergFleshType}
 */
public class BlockZergFlesh extends StarcraftBlock implements IMetaBlockName, IMetaRenderHandler {

	/** The type property */
	public static final PropertyEnum<ZergFleshType> TYPE = PropertyEnum.create("type", ZergFleshType.class);
	Random rand;

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName
	 *            The block's unlocalized name
	 * @param registryName
	 *            The block's registry name - defaultly the unlocalized name
	 */
	public BlockZergFlesh() {
		super("zerg.flesh", RegistryType.META, MaterialHandler.FLESH);
		setSoundType(SoundTypes.FLESH);
		setResistance(5.0F);
		setHardness(5.0F);
		setHarvestLevel("axe", 2);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, ZergFleshType.PURPLE)); // Default state
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos) {
		return state.getValue(TYPE).getMapColor();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemHandler.ORGANIC_TISSUE;
	}

	/**
	 * Adds the properties to the block
	 */
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { TYPE });
	}

	/**
	 * Gets the right meta data from the {@link IBlockState}
	 */
	@Override
	public int getMetaFromState(IBlockState state) {
		ZergFleshType type = state.getValue(TYPE);
		return type.getID();
	}

	/**
	 * Makes sure when you pick block it will work correctly
	 */
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state));
	}

	/**
	 * Inherited from the {@link IMetaBlockName}
	 */
	@Override
	public String getSpecialName(ItemStack stack) {
		return ZergFleshType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, ZergFleshType.values()[meta]);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items) {
		for (int i = 0; i < ZergFleshType.values().length; i++) {
			items.add(new ItemStack(this, 1, i));
		}
	}

	// @Override
	// public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
	// if (!worldIn.isRemote && this.RANDOM.nextInt(100) < 10) {
	// EntityBroodling broodling = new EntityBroodling(worldIn, EnumColors.getColorStarcraft(this.getMetaFromState(state)));
	// broodling.setPositionAndRotation(pos.getX(), pos.getY(), pos.getZ(), 0, 0);
	// worldIn.spawnEntity(broodling);
	// } else if (this.RANDOM.nextInt(100) > 99) {
	// BlockPos pos2 = pos;
	// worldIn.setBlockState(pos2, BlockHandler.FLUID_BLOOD.getDefaultState());
	// }
	// super.breakBlock(worldIn, pos, state);
	// }

	public static enum ZergFleshType implements IStringSerializable {
		PURPLE("purple", 0, MapColor.PURPLE), BROWN("brown", 1, MapColor.BROWN), PINK("pink", 2, MapColor.PINK), BLUE("blue", 3, MapColor.BLUE), CYAN("cyan", 4, MapColor.CYAN), GRAY("gray", 5, MapColor.GRAY), GREEN("green", 6, MapColor.GREEN), LIGHT_BLUE("lightblue", 7, MapColor.LIGHT_BLUE), LIME("lime", 8, MapColor.LIME), MAGENTA("magenta", 9, MapColor.MAGENTA), ORANGE("orange", 10, MapColor.ADOBE), RED("red", 11, MapColor.RED), SILVER("silver", 12, MapColor.SILVER), WHITE("white", 13, MapColor.SNOW), YELLOW("yellow", 14, MapColor.YELLOW);

		private int ID;
		private String name;
		private MapColor color;

		private ZergFleshType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	@Override
	public int getItemCount() {
		return ZergFleshType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "zerg.flesh." + ZergFleshType.values()[meta].getName();
	}
}