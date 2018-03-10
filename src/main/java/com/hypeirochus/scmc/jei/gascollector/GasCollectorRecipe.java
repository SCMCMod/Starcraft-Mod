package com.hypeirochus.scmc.jei.gascollector;

import java.util.Collections;
import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class GasCollectorRecipe implements IRecipeWrapper {

	private final ItemStack input;
	private final ItemStack output;

	public GasCollectorRecipe(IBlockState input, ItemStack output) {
		this.input = new ItemStack(input.getBlock(), 1, input.getBlock().getMetaFromState(input));
		this.output = output;
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInput(ItemStack.class, input);
		ingredients.setOutput(ItemStack.class, output);
	}

	public List<ItemStack> getInputs() {
		return Collections.singletonList(input);
	}

	public List<ItemStack> getOutputs() {
		return Collections.singletonList(output);
	}

	@Override
	public String toString() {
		return "Input: " + input + ", Output: " + output;
	}
}
