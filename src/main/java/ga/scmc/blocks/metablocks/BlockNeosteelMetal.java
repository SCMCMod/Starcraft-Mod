package ga.scmc.blocks.metablocks;

import java.util.List;

import ga.scmc.blocks.itemblocks.IMetaBlockName;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaBlock.NeosteelMetalType;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

/**
 * This block has sixteen variants. Refer to {@link NeosteelMetalType}
 */
public class BlockNeosteelMetal extends Block implements IMetaBlockName {

	/** The type property */
	public static final PropertyEnum<NeosteelMetalType> TYPE = PropertyEnum.create("type", NeosteelMetalType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName
	 *            The block's unlocalized name
	 * @param registryName
	 *            The block's registry name - defaultly the unlocalized name
	 */
	public BlockNeosteelMetal() {
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setUnlocalizedName("neosteel");
		setRegistryName("neosteel");
		setHardness(10.0F);
		setResistance(10.0F);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, NeosteelMetalType.BASE));
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return state.getValue(TYPE).getMapColor();
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
		NeosteelMetalType type = state.getValue(TYPE);
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
		return NeosteelMetalType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, NeosteelMetalType.values()[meta]);
	}

	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i < NeosteelMetalType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

}