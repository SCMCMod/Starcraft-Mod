package com.hypeirochus.scmc.blocks.metablocks;

import java.util.Random;

import com.hypeirochus.scmc.blocks.RegistryType;
import com.hypeirochus.scmc.blocks.StarcraftBlock;
import com.hypeirochus.scmc.blocks.items.IMetaBlockName;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.items.IMetaRenderHandler;

import net.minecraft.block.Block;
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
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This block has three variants. Refer to {@link CompressedMineralType}
 */
public class BlockMineral extends StarcraftBlock implements IMetaBlockName,IMetaRenderHandler {

	/** The type property */
	public static final PropertyEnum<CompressedMineralType> TYPE = PropertyEnum.create("type", CompressedMineralType.class);
	private boolean ignoreSimilarity;

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName
	 *            The block's unlocalized name
	 * @param registryName
	 *            The block's registry name - defaultly the unlocalized name
	 */
	public BlockMineral() {
		super("mineral.compressed", RegistryType.META, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		setHardness(10.0F); // Sets how hard the block is to break
		setResistance(10.0F); // Sets the blocks blast resistance to explosions
		setSoundType(SoundType.GLASS);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, CompressedMineralType.BLUE));
		setCreativeTab(StarcraftCreativeTabs.MISC);
		this.ignoreSimilarity = false;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos) {
		return state.getValue(TYPE).getMapColor();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos) {
		return 5864;
	}

	/**
	 * Adds the properties to the block
	 */
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { TYPE });
	}

	/**
	 * Makes sure the block drops the correct version of itself
	 */
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemHandler.MINERAL_SHARD;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 9;
	}

	/**
	 * Gets the right meta data from the {@link IBlockState}
	 */
	@Override
	public int getMetaFromState(IBlockState state) {
		CompressedMineralType type = state.getValue(TYPE);
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
		return CompressedMineralType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, CompressedMineralType.values()[meta]);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items) {
		for (int i = 0; i < CompressedMineralType.values().length; i++) {
			items.add(new ItemStack(this, 1, i));
		}
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}

	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
		Block block = iblockstate.getBlock();
		return !this.ignoreSimilarity && block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
	}

	public static enum CompressedMineralType implements IStringSerializable {
		BLUE("blue", 0, MapColor.BLUE), RICH("rich", 1, MapColor.ADOBE);

		private int ID;
		private String name;
		private MapColor color;

		private CompressedMineralType(String name, int ID, MapColor color) {
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
		return CompressedMineralType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "mineral.compressed." + CompressedMineralType.values()[meta].getName();
	}
}