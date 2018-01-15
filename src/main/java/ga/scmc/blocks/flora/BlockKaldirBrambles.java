package ga.scmc.blocks.flora;

import java.util.List;
import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.tileentity.TileEntityKaldirBrambles;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class BlockKaldirBrambles extends BlockContainer implements ITileEntityProvider, IShearable {

	public static final PropertyEnum<Part> PART = PropertyEnum.create("part", Part.class);

	public BlockKaldirBrambles() {
		super(Material.VINE, MapColor.GREEN);
		setRegistryName("flora.kaldir.brambles");
		setUnlocalizedName("flora.kaldir.brambles");
		setSoundType(SoundType.PLANT);
		setCreativeTab(StarcraftCreativeTabs.FLORA);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		// TODO Auto-generated method stub
		return super.getStateFromMeta(meta);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		// TODO Auto-generated method stub
		return super.getMetaFromState(state);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return null;
	}

	@Override
	public boolean isReplaceable(IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
		ret.add(new ItemStack(this, 1, 0));
		return ret;
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
		if (RANDOM.nextInt(8) != 0)
			return ret;
		ItemStack seed = net.minecraftforge.common.ForgeHooks.getGrassSeed(RANDOM, fortune);
		if (seed != null)
			ret.add(seed);
		return ret;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	public enum Part implements IStringSerializable {
		BOTTOM, TOP;

		@Override
		public String getName() {
			return this.toString().toLowerCase();
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityKaldirBrambles();
	}
}