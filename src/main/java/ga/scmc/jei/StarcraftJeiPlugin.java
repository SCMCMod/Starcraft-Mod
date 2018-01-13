package ga.scmc.jei;

import ga.scmc.handlers.BlockHandler;
import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.ISubtypeRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import net.minecraft.item.Item;
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

	@Override
	public void register(IModRegistry registry) {
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.SMELTING);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.SMELTING);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.SMELTING);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SHAKURAS), VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_CHAR), VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockHandler.FURNACE_SLAYN), VanillaRecipeCategoryUid.FUEL);

		for (Item item : Item.REGISTRY) {
			if (item != null && item instanceof IJeiTooltip) {
				IJeiTooltip tooltip = (IJeiTooltip) item;
				for (int j = 0; j < 16; j++) {
					if (tooltip.getTooltip(j) != null) {
						registry.addDescription(new ItemStack(item, 1, j), tooltip.getTooltip(j));
					}
				}
			}
		}
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