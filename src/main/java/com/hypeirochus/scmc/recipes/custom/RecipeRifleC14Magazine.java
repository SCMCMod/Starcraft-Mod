package com.hypeirochus.scmc.recipes.custom;

import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.items.ItemMagazine;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class RecipeRifleC14Magazine extends net.minecraftforge.registries.IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {

	@Override
	public boolean matches(InventoryCrafting inv, World world) {
		if (inv.getWidth() == 3 && inv.getHeight() == 3) {
			for (int y = 0; y < inv.getHeight(); y++) {
				for (int x = 0; x < inv.getWidth(); x++) {
					ItemStack stack = inv.getStackInRowAndColumn(x, y);

					Item item = stack.getItem();

					if (x == 0 && y == 0 || x == 2 && y == 2 || x == 0 && y == 2 || x == 2 && y == 0) {
						if (stack.isEmpty())
							continue;
						return false;
					}

					if (x == 1 && y == 1) {
						if (item != Items.GUNPOWDER) {
							return false;
						}
					} else if (item != ItemHandler.INGOT && stack.getMetadata() != MetaHandler.IngotType.STEEL.getID()) {
						return false;
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		return ItemMagazine.getDefaultStack(MetaHandler.BulletMagazineType.C14.getID());
	}

	public ItemStack getRecipeOutput() {
		return ItemStack.EMPTY;
	}

	public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {
		return NonNullList.<ItemStack>withSize(inv.getSizeInventory(), ItemStack.EMPTY);
	}

	public boolean isDynamic() {
		return true;
	}

	@Override
	public boolean canFit(int width, int height) {
		return width >= 2 && height >= 2;
	}

	@Override
	public String getGroup() {
		return "terran.magazine";
	}
}