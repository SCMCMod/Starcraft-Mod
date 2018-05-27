package com.hypeirochus.scmc.jei.gascollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.recipes.gascollector.GasCollectorRecipes;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class RecipeMaker {

	public static List<GasCollectorRecipe> getGasCollectorRecipes(IJeiHelpers helpers) {
		IStackHelper stackHelper = helpers.getStackHelper();
		GasCollectorRecipes recipeHandler = GasCollectorRecipes.instance();
		Map<IBlockState, ItemStack> protossMap = recipeHandler.getProtossList();
		Map<IBlockState, ItemStack> terranMap = recipeHandler.getTerranList();
		Map<IBlockState, ItemStack> zergMap = recipeHandler.getZergList();

		List<GasCollectorRecipe> recipes = new ArrayList<GasCollectorRecipe>();

		for (Map.Entry<IBlockState, ItemStack> itemStackItemStackEntry : protossMap.entrySet()) {
			IBlockState input = itemStackItemStackEntry.getKey();
			ItemStack output = itemStackItemStackEntry.getValue();

			GasCollectorRecipe recipe = new GasCollectorRecipe(input, new ItemStack(BlockHandler.GAS_COLLECTOR, 1, 0), output);
			recipes.add(recipe);
		}

		for (Map.Entry<IBlockState, ItemStack> itemStackItemStackEntry : terranMap.entrySet()) {
			IBlockState input = itemStackItemStackEntry.getKey();
			ItemStack output = itemStackItemStackEntry.getValue();

			GasCollectorRecipe recipe = new GasCollectorRecipe(input, new ItemStack(BlockHandler.GAS_COLLECTOR, 1, 1), output);
			recipes.add(recipe);
		}

		for (Map.Entry<IBlockState, ItemStack> itemStackItemStackEntry : zergMap.entrySet()) {
			IBlockState input = itemStackItemStackEntry.getKey();
			ItemStack output = itemStackItemStackEntry.getValue();

			GasCollectorRecipe recipe = new GasCollectorRecipe(input, new ItemStack(BlockHandler.GAS_COLLECTOR, 1, 2), output);
			recipes.add(recipe);
		}

		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Constructed Gas Collector Recipes: " + recipes);
		}

		return recipes;
	}
}