package ga.scmc.jei.gascollector;

import ga.scmc.api.Utils;
import ga.scmc.jei.StarcraftRecipeCategoryUid;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

public class GasCollectorRecipeHandler implements IRecipeHandler<GasCollectorRecipe> {

	@Override
	public Class<GasCollectorRecipe> getRecipeClass() {
		return GasCollectorRecipe.class;
	}

	@Override
	public String getRecipeCategoryUid() {
		return StarcraftRecipeCategoryUid.GAS_COLLECTOR;
	}

	@Override
	public String getRecipeCategoryUid(GasCollectorRecipe recipe) {
		return StarcraftRecipeCategoryUid.GAS_COLLECTOR;
	}

	@Override
	public IRecipeWrapper getRecipeWrapper(GasCollectorRecipe recipe) {
		return recipe;
	}

	@Override
	public boolean isRecipeValid(GasCollectorRecipe recipe) {
		if (recipe.getInputs().isEmpty()) {
			Utils.getLogger().error("Recipe has no inputs. {}");
		}
		if (recipe.getOutputs().isEmpty()) {
			Utils.getLogger().error("Recipe has no outputs. {}");
		}
		return true;
	}
}