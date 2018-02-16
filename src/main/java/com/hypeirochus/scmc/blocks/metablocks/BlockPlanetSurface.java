package com.hypeirochus.scmc.blocks.metablocks;

import java.util.List;

import com.hypeirochus.scmc.blocks.itemblocks.IMetaBlockName;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;

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
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPlanetSurface extends Block implements IMetaBlockName {

	/** The type property */
	public static final PropertyEnum<PlanetSurfaceType> TYPE = PropertyEnum.create("type", PlanetSurfaceType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName
	 *            The block's unlocalized name
	 * @param registryName
	 *            The block's registry name - defaultly the unlocalized name
	 */
	public BlockPlanetSurface() {
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setUnlocalizedName("block.planet");
		setRegistryName("block.planet");
		setHardness(10.0F);
		setResistance(10.0F);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, PlanetSurfaceType.BLUE));
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
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

	/**
	 * Gets the right meta data from the {@link IBlockState}
	 */
	@Override
	public int getMetaFromState(IBlockState state) {
		PlanetSurfaceType type = state.getValue(TYPE);
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
		return PlanetSurfaceType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, PlanetSurfaceType.values()[meta]);
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}

	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i < PlanetSurfaceType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	public static enum PlanetSurfaceType implements IStringSerializable {
		BLUE("blue", 0, MapColor.BLUE),
		BROWN("brown", 1, MapColor.BROWN),
		CYAN("cyan", 2, MapColor.CYAN),
		GRAY("gray", 3, MapColor.GRAY),
		GREEN("green", 4, MapColor.GREEN),
		LIGHTBLUE("lightblue", 5, MapColor.LIGHT_BLUE),
		LIME("lime", 6, MapColor.LIME),
		MAGENTA("magenta", 7, MapColor.MAGENTA),
		ORANGE("orange", 8, MapColor.ADOBE),
		PINK("pink", 9, MapColor.PINK),
		PURPLE("purple", 10, MapColor.PURPLE),
		RED("red", 11, MapColor.RED),
		WHITE("white", 12, MapColor.SNOW),
		SILVER("silver", 13, MapColor.SILVER),
		BLACK("black", 14, MapColor.BLUE),
		YELLOW("yellow", 15, MapColor.YELLOW);

		private int			ID;
		private String		name;
		private MapColor	color;

		private PlanetSurfaceType(String name, int ID, MapColor color) {
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
}