package ga.scmc.blocks.metablocks;

import java.util.List;
import java.util.Random;

import ga.scmc.blocks.itemblocks.IMetaBlockName;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.entity.living.EntityBroodling;
import ga.scmc.enums.EnumMetaBlock.ZergFleshType;
import ga.scmc.enums.EnumTeamColors;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler.SoundTypes;
import net.minecraft.block.Block;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

/**
 * This block has three variants. Refer to {@link ZergFleshType}
 */
public class BlockZergStructureFlesh extends Block implements IMetaBlockName {

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
	public BlockZergStructureFlesh() {
		super(Material.CLAY);
		setSoundType(SoundTypes.ZERG_FLESH);
		setUnlocalizedName("zergFlesh");
		setRegistryName("zerg_flesh");
		setResistance(5.0F);
		setHardness(5.0F);
		setHarvestLevel("axe", 2);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, ZergFleshType.PURPLE)); // Default state
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
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
	 * Makes sure the block drops the correct version of itself
	 */
	/*
	 * will be re-added when we have colored flesh
	 * 
	 * @Override public int damageDropped(IBlockState state) { return getMetaFromState(state); }
	 */

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

	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i < ZergFleshType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote && this.RANDOM.nextInt(100) < 10) {
			EntityBroodling broodling = new EntityBroodling(worldIn, EnumTeamColors.getColorStarcraft(this.getMetaFromState(state)));
			broodling.setPositionAndRotation(pos.getX(), pos.getY(), pos.getZ(), 0, 0);
			worldIn.spawnEntity(broodling);
		} else if (this.RANDOM.nextInt(100) > 99) {
			BlockPos pos2 = pos;
			worldIn.setBlockState(pos2, BlockHandler.FLUID_BLOOD.getDefaultState());
		}
		super.breakBlock(worldIn, pos, state);
	}
}