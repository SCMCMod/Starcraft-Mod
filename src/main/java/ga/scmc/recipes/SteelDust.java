package ga.scmc.recipes;

import javax.annotation.Nullable;

import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.items.metaitems.ItemDust;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Deals exclusively with steel dust recipes.
 */
public class SteelDust implements IRecipe {

	/**
	 * Gets the output when crafting is completed - a single piece of Steel Dust
	 * 
	 * @param grid
	 *            the crafting grid
	 * @return A single piece of Steel Dust
	 * @see net.minecraft.item.crafting.IRecipe#getCraftingResult(InventoryCrafting)
	 */
	@Override
	@Nullable
	public ItemStack getCraftingResult(InventoryCrafting grid) {
		return new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.STEEL.getID());
	}

	/**
	 * <i>I typically null this method because I've never seen any reason to use it.
	 * It's supposed to be used as a "general form" for crafting output. Typically
	 * it isn't necessary, and usually I only use IRecipe for complex recipes, so I
	 * rarely get to use this regardless. Here I can use it as our output is always
	 * "general" in a sense</i><br>
	 * <br>
	 * Gives out a single piece of Steel Dust
	 */
	@Override
	@Nullable
	public ItemStack getRecipeOutput() {
		return new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.STEEL.getID());
	}

	/**
	 * @return the number of items in the recipe
	 * @see net.minecraft.item.crafting.IRecipe#getRecipeSize()
	 */
	@Override
	public int getRecipeSize() {
		return 3;
	}

	/**
	 * Keeps certain items in the grid afterwords
	 * 
	 * @param grid
	 *            the crafting grid right before using its items
	 * @return
	 * @see net.minecraft.item.crafting.IRecipe#getRemainingItems(InventoryCrafting)
	 */
	@Override
	public ItemStack[] getRemainingItems(InventoryCrafting grid) {
		ItemStack ironDust = null;
		ItemStack carbonDust = null;

		for (int i = 0; i < grid.getSizeInventory(); i++) {
			try {
				ItemStack currentStack = grid.getStackInSlot(i);

				if (currentStack.getMetadata() == 1) {
					ironDust = currentStack.copy();
				} else if (currentStack.getMetadata() == 2) {
					carbonDust = currentStack.copy();
				}
			} catch (NullPointerException e) {
			}
		}

		grid.clear(); // Makes sure we get rid of the used ingredients... by getting rid of everything
						// then adding back what we want :P
		ironDust.stackSize -= 2;
		carbonDust.stackSize--;

		return new ItemStack[] { ironDust, carbonDust };
	}

	/**
	 * Checks to see if the current recipe is a valid recipe for Steel Dust
	 * 
	 * @param grid
	 *            the crafting grid
	 * @param world
	 *            the world in which the crafting is being done
	 * @return {@code true} if the grid's current state satisfies for Steel dust
	 * @see net.minecraft.item.crafting.IRecipe#matches(InventoryCrafting, World)
	 */
	@Override
	public boolean matches(InventoryCrafting grid, World world) {
		ItemStack ironDust = null; // Tracks the Iron Dust stack
		ItemStack carbonDust = null; // Tracks the Carbon Dust stack

		for (int i = 0; i < grid.getSizeInventory(); i++) {
			try {
				ItemStack currentStack = grid.getStackInSlot(i);

				if (currentStack.getItem() instanceof ItemDust) {
					if (currentStack.getMetadata() == 1) {
						if (ironDust == null) {
							ironDust = currentStack; // Only sets the current stack as the Iron Dust if it definitely is Iron Dust
														// AND there's no Iron Dust yet
						} else {
							return false; // Already an Iron Dust? That means we have too many in the grid
						}
					} else if (currentStack.getMetadata() == 2) {
						if (carbonDust == null) {
							carbonDust = currentStack; // Only sets the current stack as the Carbon Dust if it definitely is Carbon
														// Dust AND there's no Carbon Dust yet
						} else {
							return false; // Already a Carbon Dust? That means we have too many in the grid
						}
					}
				} else if (currentStack != null) {
					return false; // If there's anything other than the Dusts, it's not valid
				}
			} catch (NullPointerException e) {
			}
		}

		if (ironDust == null || carbonDust == null) {
			return false; // Missing a necessity? Then it's not correct
		}

		return ironDust.stackSize >= 2; // We don't check the stack size of the Carbon Dust as we only need one
	}
}
