package com.hypeirochus.scmc.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StarcraftSlab extends StarcraftBlock {

	public static final PropertyEnum<StarcraftSlab.Part> PART = PropertyEnum.<Part>create("part", Part.class);

	public static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
	public static final AxisAlignedBB AABB_TOP_HALF = new AxisAlignedBB(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);

	private final IBlockState blockType;

	public StarcraftSlab(IBlockState blockType) {
		this(null, blockType);
	}

	public StarcraftSlab(String name, IBlockState blockType) {
		super(name, RegistryType.FULL, blockType.getMaterial(), blockType.getMaterial().getMaterialMapColor());
		this.blockType = blockType;
		this.setSoundType(blockType.getBlock().blockSoundType);
		this.setHardness(blockType.getBlock().blockHardness);
		this.setResistance(blockType.getBlock().blockResistance / 3.0F);
		this.setSoundType(blockType.getBlock().blockSoundType);
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos) {
		return this.blockType.getMapColor(world, pos);
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return this.isDouble(state) ? FULL_BLOCK_AABB : (state.getValue(PART) == Part.TOP ? AABB_TOP_HALF : AABB_BOTTOM_HALF);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return this.isDouble(state);
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		if (net.minecraftforge.common.ForgeModContainer.disableStairSlabCulling)
			return super.doesSideBlockRendering(state, world, pos, face);

		if (state.isOpaqueCube())
			return true;

		Part side = state.getValue(PART);
		return (side == Part.TOP && face == EnumFacing.UP) || (side == Part.BOTTOM && face == EnumFacing.DOWN);
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		IBlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(PART, Part.BOTTOM);
		return this.isDouble(iblockstate) ? iblockstate : (facing != EnumFacing.DOWN && (facing == EnumFacing.UP || (double) hitY <= 0.5D) ? iblockstate : iblockstate.withProperty(PART, Part.TOP));
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return this.isDouble(state) ? 2 : 1;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return this.isDouble(state);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(PART).getId();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(PART, Part.values()[meta % 3]);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { PART });
	}

	@SideOnly(Side.CLIENT)
	private boolean isHalfSlab(IBlockState state) {
		Block block = state.getBlock();
		return block instanceof BlockSlab;
	}

	public enum Part implements IStringSerializable {
		TOP, BOTTOM, FULL;

		@Override
		public String getName() {
			return this.name().toLowerCase();
		}

		public int getId() {
			return this.ordinal();
		}
	}

	private boolean isDouble(IBlockState state) {
		return state.getValue(PART) == Part.FULL;
	}

	public IBlockState getBlockType() {
		return blockType;
	}

	public StarcraftSlab setBlockTab(CreativeTabs tab) {
		this.setCreativeTab(tab);
		return this;
	}
}