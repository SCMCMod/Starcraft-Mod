package com.arpaesis.scmc.jei.gascollector;

import com.arpaesis.scmc.SCConstants;
import com.arpaesis.scmc.jei.SCRecipeCategoryUid;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class GasCollectorCategory implements IRecipeCategory<GasCollectorRecipe>
{

	public static final int inputSlot = 0;
	public static final int machineSlot = 1;
	public static final int outputSlot = 2;

	private final IDrawable background;
	private final String localizedName;

	public GasCollectorCategory(IGuiHelper guiHelper)
	{
		ResourceLocation location = new ResourceLocation(SCConstants.MODID + "textures/gui/container/gas_collector_base.png");
		background = guiHelper.createDrawable(location, 0, 0, 63, 50);
		localizedName = I18n.format("gui." + SCConstants.MODID + ".category.gascollector");
	}

	@Override
	public IDrawable getBackground()
	{
		return background;
	}

	@Override
	public String getTitle()
	{
		return localizedName;
	}

	@Override
	public String getUid()
	{
		return SCRecipeCategoryUid.GAS_COLLECTOR;
	}

	@Override
	public String getModName()
	{
		return "Starcraft";
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, GasCollectorRecipe recipeWrapper, IIngredients ingredients)
	{
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

		guiItemStacks.init(inputSlot, true, 0, 25);
		guiItemStacks.init(machineSlot, true, 0, 7);
		guiItemStacks.init(outputSlot, false, 45, 25);

		guiItemStacks.set(ingredients);
	}
}
