package com.hypeirochus.scmc.recipes.gascollector;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Nullable;

import com.google.common.collect.Maps;
import com.hypeirochus.scmc.api.Utils;
import com.hypeirochus.scmc.enums.MetaHandler.TerrazineType;
import com.hypeirochus.scmc.enums.MetaHandler.VespeneType;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

/**
 * @author Ocelot5836
 */
public class GasCollectorRecipes {

	private static final GasCollectorRecipes INSTANCE = new GasCollectorRecipes();
	private final Map<IBlockState, ItemStack> protossList = Maps.<IBlockState, ItemStack>newHashMap();
	private final Map<IBlockState, ItemStack> terranList = Maps.<IBlockState, ItemStack>newHashMap();
	private final Map<IBlockState, ItemStack> zergList = Maps.<IBlockState, ItemStack>newHashMap();

	/**
	 * Returns an instance of FurnaceRecipes.
	 */
	public static GasCollectorRecipes instance() {
		return INSTANCE;
	}

	private GasCollectorRecipes() {
		this.addProtossRecipe(BlockHandler.GAS_VESPENE, new ItemStack(ItemHandler.VESPENE, 1, VespeneType.PROTOSS.getID()));
		this.addTerranRecipe(BlockHandler.GAS_VESPENE, new ItemStack(ItemHandler.VESPENE, 1, VespeneType.TERRAN.getID()));
		this.addZergRecipe(BlockHandler.GAS_VESPENE, new ItemStack(ItemHandler.VESPENE, 1, VespeneType.ZERG.getID()));
		this.addProtossRecipe(BlockHandler.GAS_TERRAZINE, new ItemStack(ItemHandler.TERRAZINE, 1, TerrazineType.PROTOSS.getID()));
		this.addTerranRecipe(BlockHandler.GAS_TERRAZINE, new ItemStack(ItemHandler.TERRAZINE, 1, TerrazineType.TERRAN.getID()));
		this.addZergRecipe(BlockHandler.GAS_TERRAZINE, new ItemStack(ItemHandler.TERRAZINE, 1, TerrazineType.ZERG.getID()));
	}

	public void addProtossRecipe(Block input, ItemStack stack) {
		addProtossRecipe(input.getDefaultState(), stack);
	}

	public void addProtossRecipe(IBlockState input, ItemStack stack) {
		if (getProtossResult(input) != null) {
			Utils.getLogger().info("Ignored protoss gas collector recipe recipe with conflicting input: " + input + " = " + stack);
			return;
		}
		this.protossList.put(input, stack);
	}

	public void addTerranRecipe(Block input, ItemStack stack) {
		addTerranRecipe(input.getDefaultState(), stack);
	}

	public void addTerranRecipe(IBlockState input, ItemStack stack) {
		if (getTerranResult(input) != null) {
			Utils.getLogger().info("Ignored terran gas collector recipe recipe with conflicting input: " + input + " = " + stack);
			return;
		}
		this.terranList.put(input, stack);
	}

	public void addZergRecipe(Block input, ItemStack stack) {
		addZergRecipe(input.getDefaultState(), stack);
	}

	public void addZergRecipe(IBlockState input, ItemStack stack) {
		if (getZergResult(input) != null) {
			Utils.getLogger().info("Ignored zerg gas collector recipe recipe with conflicting input: " + input + " = " + stack);
			return;
		}
		this.zergList.put(input, stack);
	}

	@Nullable
	public ItemStack getProtossResult(Block block) {
		return getProtossResult(block.getDefaultState());
	}

	@Nullable
	public ItemStack getProtossResult(IBlockState state) {
		for (Entry<IBlockState, ItemStack> entry : this.protossList.entrySet()) {
			if (entry.getKey().getBlock().getUnlocalizedName().equalsIgnoreCase(state.getBlock().getUnlocalizedName())) {
				return entry.getValue();
			}
		}
		return null;
	}

	@Nullable
	public ItemStack getTerranResult(Block block) {
		return getTerranResult(block.getDefaultState());
	}

	@Nullable
	public ItemStack getTerranResult(IBlockState state) {
		for (Entry<IBlockState, ItemStack> entry : this.terranList.entrySet()) {
			if (entry.getKey().getBlock().getUnlocalizedName().equalsIgnoreCase(state.getBlock().getUnlocalizedName())) {
				return entry.getValue();
			}
		}
		return null;
	}

	@Nullable
	public ItemStack getZergResult(Block block) {
		return getZergResult(block.getDefaultState());
	}

	@Nullable
	public ItemStack getZergResult(IBlockState state) {
		for (Entry<IBlockState, ItemStack> entry : this.zergList.entrySet()) {
			if (entry.getKey().getBlock().getUnlocalizedName().equalsIgnoreCase(state.getBlock().getUnlocalizedName())) {
				return entry.getValue();
			}
		}
		return null;
	}

	public Map<IBlockState, ItemStack> getProtossList() {
		return new HashMap<IBlockState, ItemStack>(this.protossList);
	}

	public Map<IBlockState, ItemStack> getTerranList() {
		return new HashMap<IBlockState, ItemStack>(this.terranList);
	}

	public Map<IBlockState, ItemStack> getZergList() {
		return new HashMap<IBlockState, ItemStack>(this.zergList);
	}
}