package com.hypeirochus.scmc.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockOverworldOre extends StarcraftBlock {
	public BlockOverworldOre(String name, RegistryType type, Material material, MapColor color, int level) {
		super(name, type, material, color);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", level);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setSoundType(SoundType.STONE);
	}

	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this == BlockHandler.ORE_PHOSPHORUS_OW ? ItemHandler.PHOSPHORUS : (this == BlockHandler.ORE_RICHMINERAL_OW || this == BlockHandler.ORE_MINERAL_OW ? ItemHandler.MINERAL_SHARD : Item.getItemFromBlock(this));
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random random) {
		if (this == BlockHandler.ORE_RICHMINERAL_OW || this == BlockHandler.ORE_MINERAL_OW) {
			return 4 + random.nextInt(4);
		} else {
			return 1;
		}
	}

	/**
	 * Get the quantity dropped based on the given fortune level
	 */
	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0 && Item.getItemFromBlock(this) != getItemDropped((IBlockState) getBlockState().getValidStates().iterator().next(), random, fortune)) {
			int i = random.nextInt(fortune + 2) - 1;

			if (i < 0) {
				i = 0;
			}

			return quantityDropped(random) * (i + 1);
		} else {
			return quantityDropped(random);
		}
	}

	/**
	 * Spawns this Block's drops into the World as EntityItems.
	 */
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
		super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
	}

	@Override
	public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand : new Random();
		if (getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
			int i = 0;
			if (this == BlockHandler.ORE_RICHMINERAL_OW || this == BlockHandler.ORE_MINERAL_OW) {
				i = MathHelper.getInt(rand, 0, 2);
			}
			return i;
		}
		return 0;
	}

	/**
	 * Gets the metadata of the item this Block can drop. This method is called when
	 * the block gets destroyed. It returns the metadata of the dropped item based
	 * on the old metadata of the block.
	 */
	public int damageDropped(IBlockState state) {
		return this == BlockHandler.ORE_RICHMINERAL_OW ? 1 : 0;
	}
}