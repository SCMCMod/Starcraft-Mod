package com.hypeirochus.scmc.jei.gascollector;

import java.util.List;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.jei.StarcraftRecipeCategoryUid;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class GasCollectorCategory implements IRecipeCategory<GasCollectorRecipe> {

	public static final int inputSlot = 0;
	public static final int outputSlot = 1;

	private final IDrawable background;
	private final String localizedName;
	private int cycleId = 0;

	public GasCollectorCategory(IGuiHelper guiHelper) {
		ResourceLocation location = new ResourceLocation(Starcraft.RL_BASE + "textures/gui/container/gas_collector_base.png");
		background = guiHelper.createDrawable(location, 0, 0, 63, 50);
		localizedName = I18n.format("gui." + Starcraft.MOD_ID + ".category.gascollector");
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public String getTitle() {
		return localizedName;
	}

	@Override
	public String getUid() {
		return StarcraftRecipeCategoryUid.GAS_COLLECTOR;
	}
	
	@Override
	public String getModName() {
		return "Starcraft";
	}

	@Override
	public void drawExtras(Minecraft minecraft) {
		cycleId++;
		cycleId %= 450;
		RenderHelper.enableGUIStandardItemLighting();
		minecraft.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(BlockHandler.GAS_COLLECTOR, 1, cycleId / 150), 1, 8);
		RenderHelper.disableStandardItemLighting();
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, GasCollectorRecipe recipeWrapper, IIngredients ingredients) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

		guiItemStacks.init(inputSlot, true, 0, 25);
		guiItemStacks.init(outputSlot, false, 45, 25);

		guiItemStacks.set(ingredients);
	}
}
