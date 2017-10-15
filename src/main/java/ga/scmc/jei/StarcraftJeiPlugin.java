package ga.scmc.jei;

import ga.scmc.handlers.BlockHandler;
import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.ISubtypeRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import net.minecraft.item.ItemStack;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class allows for basic JEI support.
 * 
 * @author Ocelot5836
 * 
 * @see IModPlugin
 */
@JEIPlugin
public class StarcraftJeiPlugin implements IModPlugin {

	public StarcraftJeiPlugin() {
	}

	@Override
	public void register(IModRegistry registry) {
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.SMELTING);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.SMELTING);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.SMELTING);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.FUEL);
	}

	@Override
	public void registerItemSubtypes(ISubtypeRegistry registry) {
	}

	@Override
	public void registerIngredients(IModIngredientRegistration registry) {
	}

	@Override
	public void onRuntimeAvailable(IJeiRuntime runtime) {
	}
}