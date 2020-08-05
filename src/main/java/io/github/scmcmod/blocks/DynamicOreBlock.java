package io.github.scmcmod.blocks;

import io.github.scmcmod.api.OreHelper;
import io.github.scmcmod.api.OreType;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class DynamicOreBlock extends Block {

	private final OreType oreType;

	public DynamicOreBlock(OreType type) {
		super(Material.ROCK);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);
		this.oreType = type;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos) {
		return OreHelper.getDimensionOreBase(DimensionType.getById(world.getWorldType().getId())).getMapColor(world, pos);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		switch (this.oreType) {
			case COAL:
				return Items.COAL;
			case DIAMOND:
				return Items.DIAMOND;
			case LAPIS:
				return Items.DYE;
			case EMERALD:
				return Items.EMERALD;
			default:
				return Item.getItemFromBlock(this);
		}
	}

	@Override
	public int quantityDropped(Random random) {
		return this.oreType == OreType.LAPIS ? 4 + random.nextInt(5) : 1;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getBlockState().getValidStates().iterator().next(), random, fortune)) {
			int i = random.nextInt(fortune + 2) - 1;

			if (i < 0) {
				i = 0;
			}

			return this.quantityDropped(random) * (i + 1);
		} else {
			return this.quantityDropped(random);
		}
	}

	protected int getExperience(Random rand) {
		switch (this.oreType) {
			case COAL:
				return MathHelper.getInt(rand, 0, 2);
			case DIAMOND:
				return MathHelper.getInt(rand, 3, 7);
			case LAPIS:
				return MathHelper.getInt(rand, 2, 5);
			case EMERALD:
				return MathHelper.getInt(rand, 3, 7);
			default:
				return 0;
		}
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World)world).rand : new Random();
		return this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this) ? getExperience(rand) : 0;
	}

	@Override
	public int damageDropped(IBlockState state) {
		return this.oreType == OreType.LAPIS ? EnumDyeColor.BLUE.getDyeDamage() : 0;
	}

	@Override
	public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
		return layer == BlockRenderLayer.CUTOUT || layer == BlockRenderLayer.SOLID;
	}
}
