package com.hypeirochus.scmc.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.ISubtypeRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class allows for basic JEI support. It adds all the recipes, catalysts, and recipe click areas for JEI.
 * 
 * @author Ocelot5836
 * 
 * @see IModPlugin
 */
@JEIPlugin
public class StarcraftJeiPlugin implements IModPlugin {

	public static IJeiHelpers jeiHelpers;

	@Override
	public void register(IModRegistry registry) {
		IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		jeiHelpers = registry.getJeiHelpers();
		IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
		IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();

		// registry.addRecipeCategories(GasCollectorCategory.class, new GasCollectorCategory(guiHelper), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		// registry.addRecipeHandlers(GasCollectorRecipeHandler.class, new GasCollectorRecipeHandler(), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		// registry.addRecipes(RecipeMaker.getGasCollectorRecipes(jeiHelpers), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		// registry.addRecipeCatalyst(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 0), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		// registry.addRecipeCatalyst(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 1), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		// registry.addRecipeCatalyst(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 2), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		//
		// registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.SMELTING);
		// registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.SMELTING);
		// registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.SMELTING);
		// registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_PROTOSS), VanillaRecipeCategoryUid.SMELTING);
		// registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.FUEL);
		// registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.FUEL);
		// registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.FUEL);
		//
		// registry.addRecipeClickArea(GuiStarcraftFurnace.class, 185, 88, 30, 30, VanillaRecipeCategoryUid.FUEL);
		// registry.addRecipeClickArea(GuiStarcraftFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING);
		// registry.addRecipeClickArea(GuiProtossFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING);
		// registry.addRecipeClickArea(GuiGasCollector.class, 34, 34, 18, 18, StarcraftRecipeCategoryUid.GAS_COLLECTOR);

		for (Item item : Item.REGISTRY) {
			if (item != null && item instanceof IJeiTooltip) {
				IJeiTooltip tooltip = (IJeiTooltip) item;
				for (int j = 0; j < 16; j++) {
					if (tooltip.getTooltip(j) != null) {
						registry.addIngredientInfo(new ItemStack(item, 1, j), ItemStack.class, tooltip.getTooltip(j));
					} else {
						continue;
					}
				}
			}
		}
	}

	@Override
	public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {

	}
}