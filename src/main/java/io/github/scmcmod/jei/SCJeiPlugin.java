package io.github.scmcmod.jei;

import io.github.scmcmod.client.gui.GuiGasCollector;
import io.github.scmcmod.client.gui.GuiProtossFurnace;
import io.github.scmcmod.client.gui.GuiStarcraftFurnace;
import io.github.scmcmod.container.ContainerProtossFurnace;
import io.github.scmcmod.container.ContainerStarcraftFurnace;
import io.github.scmcmod.handlers.StarCraftBlocks;
import io.github.scmcmod.jei.gascollector.GasCollectorCategory;
import io.github.scmcmod.jei.gascollector.RecipeMaker;
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
 * <br>
 * </br>
 * This class allows for basic JEI support. It adds all the recipes, catalysts,
 * and recipe click areas for JEI.
 * 
 * @author Ocelot5836
 * @see IModPlugin
 */
@JEIPlugin
public class SCJeiPlugin implements IModPlugin
{

	@Override
	public void register(IModRegistry registry)
	{
		IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
		IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();

		registry.addRecipes(RecipeMaker.getGasCollectorRecipes(jeiHelpers), SCRecipeCategoryUid.GAS_COLLECTOR);
		registry.addRecipeCatalyst(new ItemStack(StarCraftBlocks.GAS_COLLECTOR, 1, 0), SCRecipeCategoryUid.GAS_COLLECTOR);
		registry.addRecipeCatalyst(new ItemStack(StarCraftBlocks.GAS_COLLECTOR, 1, 1), SCRecipeCategoryUid.GAS_COLLECTOR);
		registry.addRecipeCatalyst(new ItemStack(StarCraftBlocks.GAS_COLLECTOR, 1, 2), SCRecipeCategoryUid.GAS_COLLECTOR);

		registry.addRecipeCatalyst(new ItemStack(StarCraftBlocks.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(StarCraftBlocks.FURNACE_CHAR), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(StarCraftBlocks.FURNACE_SLAYN), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(StarCraftBlocks.FURNACE_ZERUS), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(StarCraftBlocks.FURNACE_PROTOSS), VanillaRecipeCategoryUid.SMELTING);

		registry.addRecipeClickArea(GuiProtossFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING);
		registry.addRecipeClickArea(GuiGasCollector.class, 61, 3, 54, 13, SCRecipeCategoryUid.GAS_COLLECTOR);
		registry.addRecipeClickArea(GuiStarcraftFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);

		recipeTransferRegistry.addRecipeTransferHandler(ContainerStarcraftFurnace.class, VanillaRecipeCategoryUid.SMELTING, 0, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerStarcraftFurnace.class, VanillaRecipeCategoryUid.FUEL, 1, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerProtossFurnace.class, VanillaRecipeCategoryUid.SMELTING, 0, 1, 10, 36);

		for (Item item : Item.REGISTRY)
		{
			if (item != null && item instanceof IJeiTooltip)
			{
				IJeiTooltip tooltip = (IJeiTooltip) item;
				for (int j = 0; j < 16; j++)
				{
					if (tooltip.getTooltip(j) != null)
					{
						registry.addIngredientInfo(new ItemStack(item, 1, j), ItemStack.class, tooltip.getTooltip(j));
					} else
					{
						continue;
					}
				}
			}
		}

		for (Block block : Block.REGISTRY)
		{
			if (block != null && block instanceof IJeiTooltip)
			{
				IJeiTooltip tooltip = (IJeiTooltip) block;
				for (int j = 0; j < 16; j++)
				{
					if (tooltip.getTooltip(j) != null)
					{
						registry.addIngredientInfo(new ItemStack(block, 1, j), ItemStack.class, tooltip.getTooltip(j));
					} else
					{
						continue;
					}
				}
			}
		}
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry)
	{
		IGuiHelper guiHelper = registry.getJeiHelpers().getGuiHelper();
		registry.addRecipeCategories(new GasCollectorCategory(guiHelper));
	}
}