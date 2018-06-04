package com.hypeirochus.scmc.jei;

import com.hypeirochus.scmc.client.gui.GuiGasCollector;
import com.hypeirochus.scmc.client.gui.GuiProtossFurnace;
import com.hypeirochus.scmc.client.gui.GuiStarcraftFurnace;
import com.hypeirochus.scmc.container.ContainerProtossFurnace;
import com.hypeirochus.scmc.container.ContainerStarcraftFurnace;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.jei.gascollector.GasCollectorCategory;
import com.hypeirochus.scmc.jei.gascollector.RecipeMaker;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.block.Block;
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

	@Override
	public void register(IModRegistry registry) {
		IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
		IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();

		registry.addRecipes(RecipeMaker.getGasCollectorRecipes(jeiHelpers), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		registry.addRecipeCatalyst(new ItemStack(BlockHandler.GAS_COLLECTOR, 1, 0), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		registry.addRecipeCatalyst(new ItemStack(BlockHandler.GAS_COLLECTOR, 1, 1), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		registry.addRecipeCatalyst(new ItemStack(BlockHandler.GAS_COLLECTOR, 1, 2), StarcraftRecipeCategoryUid.GAS_COLLECTOR);

		registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_ZERUS), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(BlockHandler.FURNACE_PROTOSS), VanillaRecipeCategoryUid.SMELTING);

		registry.addRecipeClickArea(GuiProtossFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING);
		registry.addRecipeClickArea(GuiGasCollector.class, 34, 34, 18, 18, StarcraftRecipeCategoryUid.GAS_COLLECTOR);
		registry.addRecipeClickArea(GuiStarcraftFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);

		recipeTransferRegistry.addRecipeTransferHandler(ContainerStarcraftFurnace.class, VanillaRecipeCategoryUid.SMELTING, 0, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerStarcraftFurnace.class, VanillaRecipeCategoryUid.FUEL, 1, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerProtossFurnace.class, VanillaRecipeCategoryUid.SMELTING, 0, 1, 10, 36);

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

		for (Block block : Block.REGISTRY) {
			if (block != null && block instanceof IJeiTooltip) {
				IJeiTooltip tooltip = (IJeiTooltip) block;
				for (int j = 0; j < 16; j++) {
					if (tooltip.getTooltip(j) != null) {
						registry.addIngredientInfo(new ItemStack(block, 1, j), ItemStack.class, tooltip.getTooltip(j));
					} else {
						continue;
					}
				}
			}
		}
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		IGuiHelper guiHelper = registry.getJeiHelpers().getGuiHelper();
		registry.addRecipeCategories(new GasCollectorCategory(guiHelper));
	}
}