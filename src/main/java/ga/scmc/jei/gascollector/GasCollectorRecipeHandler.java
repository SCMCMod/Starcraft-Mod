package ga.scmc.jei.gascollector;

import ga.scmc.jei.StarcraftRecipeCategoryUid;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import mezz.jei.util.ErrorUtil;
import mezz.jei.util.Log;
import scala.reflect.internal.Trees.Star;

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
			String recipeInfo = ErrorUtil.getInfoFromBrokenRecipe(recipe, this);
			Log.error("Recipe has no inputs. {}", recipeInfo);
		}
		if (recipe.getOutputs().isEmpty()) {
			String recipeInfo = ErrorUtil.getInfoFromBrokenRecipe(recipe, this);
			Log.error("Recipe has no outputs. {}", recipeInfo);
		}
		return true;
	}
}