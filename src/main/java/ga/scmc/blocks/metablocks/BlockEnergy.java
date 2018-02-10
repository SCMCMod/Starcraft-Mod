package ga.scmc.blocks.metablocks;

import java.util.List;
import java.util.Random;

import ga.scmc.blocks.itemblocks.IMetaBlockName;
import ga.scmc.blocks.metablocks.BlockCompressedMinerals.CompressedMineralType;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem.EnergyType;
import ga.scmc.handlers.ItemHandler;
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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * This block has three variants. Refer to {@link CompressedMineralType}
 */
public class BlockEnergy extends Block implements IMetaBlockName {

	/** The type property */
	public static final PropertyEnum<EnergyType> TYPE = PropertyEnum.create("type", EnergyType.class);

	/**
	 * Default constructor
	 * 
	 * @param unlocalizedName
	 *            The block's unlocalized name
	 * @param registryName
	 *            The block's registry name - defaultly the unlocalized name
	 */
	public BlockEnergy() {
		super(Material.REDSTONE_LIGHT, MapColor.LIGHT_BLUE);
		setRegistryName("block.energy");
		setUnlocalizedName("block.energy");
		setSoundType(SoundType.STONE);
		setHardness(0.5f);
		setResistance(1.0f);
		setLightLevel(1.0f);
		setSoundType(SoundType.GLASS);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	@Override
	public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
		EnergyType type = state.getValue(TYPE);
		switch (type) {
		case CORRUPTED:
			return 12;
		case PURE:
			return 15;
		case VOID:
			return 7;
		default:
			return super.getLightValue(state);
		}
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		EnergyType type = state.getValue(TYPE);
		switch (type) {
		case CORRUPTED:
			return MapColor.PURPLE;
		case PURE:
			return MapColor.LIGHT_BLUE;
		case VOID:
			return MapColor.RED;
		default:
			return super.getMapColor(state);
		}
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
		return ItemHandler.ENERGY;
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
		return state.getValue(TYPE).getID();
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
		return EnergyType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, EnergyType.values()[meta]);
	}

	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i < EnergyType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}
}