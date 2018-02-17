//package com.hypeirochus.scmc.jei;
//
//import com.hypeirochus.scmc.client.gui.GuiGasCollector;
//import com.hypeirochus.scmc.client.gui.GuiProtossFurnace;
//import com.hypeirochus.scmc.client.gui.GuiStarcraftFurnace;
//import com.hypeirochus.scmc.handlers.BlockHandler;
//import com.hypeirochus.scmc.handlers.MetaBlockHandler;
//import com.hypeirochus.scmc.jei.gascollector.GasCollectorCategory;
//import com.hypeirochus.scmc.jei.gascollector.GasCollectorRecipeHandler;
//import com.hypeirochus.scmc.jei.gascollector.RecipeMaker;
//
//import mezz.jei.api.BlankModPlugin;
//import mezz.jei.api.IGuiHelper;
//import mezz.jei.api.IJeiHelpers;
//import mezz.jei.api.IModPlugin;
//import mezz.jei.api.IModRegistry;
//import mezz.jei.api.JEIPlugin;
//import mezz.jei.api.ingredients.IIngredientRegistry;
//import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
//import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//
///**
// * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
// * 
// * <br>
// * </br>
// * 
// * This class allows for basic JEI support. It adds all the recipes, catalysts,
// * and recipe click areas for JEI.
// * 
// * @author Ocelot5836
// * 
// * @see IModPlugin
// */
//@JEIPlugin
//public class StarcraftJeiPlugin extends BlankModPlugin {
//
//	public static IJeiHelpers jeiHelpers;
//
//	@Override
//	public void register(IModRegistry registry) {
//		IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
//		jeiHelpers = registry.getJeiHelpers();
//		IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
//		IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();
//
//		registry.addRecipeCategories(new GasCollectorCategory(guiHelper));
//		registry.addRecipeHandlers(new GasCollectorRecipeHandler());
//		registry.addRecipes(RecipeMaker.getGasCollectorRecipes(jeiHelpers));
//		registry.addRecipeCategoryCraftingItem(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 0), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
//		registry.addRecipeCategoryCraftingItem(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 1), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
//		registry.addRecipeCategoryCraftingItem(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 2), StarcraftRecipeCategoryUid.GAS_COLLECTOR);
//
//		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.SMELTING);
//		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.SMELTING);
//		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.SMELTING);
//		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_PROTOSS), VanillaRecipeCategoryUid.SMELTING);
//		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.FUEL);
//		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.FUEL);
//		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.FUEL);
//
//		registry.addRecipeClickArea(GuiStarcraftFurnace.class, 185, 88, 30, 30, VanillaRecipeCategoryUid.FUEL);
//		registry.addRecipeClickArea(GuiStarcraftFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING);
//		registry.addRecipeClickArea(GuiProtossFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING);
//		registry.addRecipeClickArea(GuiGasCollector.class, 34, 34, 18, 18, StarcraftRecipeCategoryUid.GAS_COLLECTOR);
//
//		for (Item item : Item.REGISTRY) {
//			if (item != null && item instanceof IJeiTooltip) {
//				IJeiTooltip tooltip = (IJeiTooltip) item;
//				for (int j = 0; j < 16; j++) {
//					if (tooltip.getTooltip(j) != null) {
//						registry.addDescription(new ItemStack(item, 1, j), tooltip.getTooltip(j));
//					} else {
//						continue;
//					}
//				}
//			}
//		}
//	}
//}