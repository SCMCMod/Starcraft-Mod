package com.hypeirochus.scmc.blocks.flora;

import java.util.List;

import com.hypeirochus.scmc.blocks.items.IMetaBlockName;
import com.hypeirochus.scmc.blocks.items.ItemBlockBrambles;
import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.particle.CustomTextureDestroyEffect;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.tileentity.TileEntityBrambles;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.IShearable;

public class BlockBrambles extends BlockContainer implements IShearable, IMetaBlockName, IPlantable {

	public static final PropertyEnum<Part> PART = PropertyEnum.create("part", Part.class);

	public static final AxisAlignedBB TOP = new AxisAlignedBB(0, -1, 0, 1, 1, 1);
	public static final AxisAlignedBB BOTTOM = new AxisAlignedBB(0, 0, 0, 1, 2, 1);

	public BlockBrambles() {
		super(Material.VINE, MapColor.GREEN);
		setRegistryName("flora.brambles");
		setUnlocalizedName("flora.brambles");
		setSoundType(SoundType.PLANT);
		setDefaultState(this.blockState.getBaseState().withProperty(PART, Part.BOTTOM));
		setCreativeTab(StarcraftCreativeTabs.FLORA);
	}

	@Override
	public boolean isReplaceable(IBlockAccess world, BlockPos pos) {
		return false;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(PART, Part.values()[meta % 2]);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(PART).ordinal();
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		if (world.getTileEntity(pos) instanceof TileEntityBrambles) {
			world.setBlockState(pos.up(), this.getDefaultState().withProperty(PART, Part.TOP));
			world.setTileEntity(pos.up(), new TileEntityBrambles(((TileEntityBrambles) world.getTileEntity(pos)).getVariant()));
		}
	}

	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos) {
		return super.canPlaceBlockAt(world, pos) && world.getBlockState(pos.up()).getBlock().isReplaceable(world, pos.up()) && world.getBlockState(pos.down()).getBlock().canSustainPlant(this.getDefaultState(), world, pos, EnumFacing.DOWN, this);
	}

	@Override
	public boolean addDestroyEffects(World world, BlockPos pos, ParticleManager manager) {
		IBlockState state = world.getBlockState(pos);
		if (state.getBlock() == this) {
			if (world.isRemote) {
				state = state.getActualState(world, pos);
				int i = 4;

				ResourceLocation location = TextureMap.LOCATION_BLOCKS_TEXTURE;
				int u = 0;
				int v = 0;

				if (world.getTileEntity(pos) instanceof TileEntityBrambles) {
					TileEntityBrambles te = (TileEntityBrambles) world.getTileEntity(pos);
					switch (te.getVariantEnum()) {
					case KALDIR:
						location = Resources.KALDIR_BRAMBLES_TEXTURE;
						u = 112;
						v = 112;
						break;
					case SHAKURAS:
						location = Resources.SHAKURAS_PALM_TEXTURE;
						break;
					case ZERUS:
						location = Resources.ZERUS_PALM_TEXTURE;
						break;
					}
				}

				for (int j = 0; j < 4; ++j) {
					for (int k = 0; k < 4; ++k) {
						for (int l = 0; l < 4; ++l) {
							double d0 = ((double) j + 0.5D) / 4.0D;
							double d1 = ((double) k + 0.5D) / 4.0D;
							double d2 = ((double) l + 0.5D) / 4.0D;
							manager.addEffect((new CustomTextureDestroyEffect(world, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, d0 - 0.5D, d1 - 0.5D, d2 - 0.5D, state, location, u, v, 16, 16)).setBlockPos(pos));
						}
					}
				}
			}
			return true;
		}
		return super.addDestroyEffects(world, pos, manager);
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		if (state.getValue(PART) == Part.BOTTOM) {
			world.destroyBlock(pos.up(), false);
		} else {
			world.destroyBlock(pos.down(), false);
		}
	}

	@Override
	public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos fromPos) {
		if (state.getValue(PART) == Part.BOTTOM && !world.getBlockState(pos.down()).getBlock().canSustainPlant(this.getDefaultState(), world, pos.down(), EnumFacing.DOWN, this)) {
			this.breakBlock(world, fromPos, state);
		}
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		if (world.getTileEntity(pos) instanceof TileEntityBrambles) {
			TileEntityBrambles te = (TileEntityBrambles) world.getTileEntity(pos);
			return ItemBlockBrambles.getDefaultStack(te.getVariant());
		}
		return ItemBlockBrambles.getDefaultStack(0);
	}

	@Override
	public void getSubBlocks(CreativeTabs item, NonNullList<ItemStack> items) {
		for (int i = 0; i < ItemBlockBrambles.Type.values().length; i++) {
			items.add(ItemBlockBrambles.getDefaultStack(i));
		}
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
		int variant = 0;
		if (world.getTileEntity(pos) instanceof TileEntityBrambles) {
			variant = ((TileEntityBrambles) world.getTileEntity(pos)).getVariant();
		}
		ret.add(new ItemStack(this, 1, variant));
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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		if (state.getValue(PART) == Part.TOP) {
			return TOP;
		} else {
			return BOTTOM;
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess world, BlockPos pos) {
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
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { PART });
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityBrambles(meta / 2);
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		if (stack.hasTagCompound()) {
			NBTTagCompound nbt = stack.getTagCompound();
			NBTTagCompound blockTag = (NBTTagCompound) nbt.getTag("BlockEntityTag");
			if (blockTag.hasKey("variant")) {
				return ItemBlockBrambles.Type.values()[blockTag.getInteger("variant")].getName();
			}
		}
		return ItemBlockBrambles.Type.KALDIR.getName();
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Plains;
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return this.getDefaultState();
	}
}