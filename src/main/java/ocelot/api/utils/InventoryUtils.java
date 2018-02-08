package ocelot.api.utils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * <em><b>Copyright (c) 2017 Ocelot5836.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Has some useful methods for getting, removing, and dealing with itemStacks.
 * 
 * @author Ocelot5836
 */
public class InventoryUtils {

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param item
	 *            The item to be searched for
	 * @return The amount of items found
	 */
	public static int getItemAmount(EntityPlayer player, Item item) {
		int amount = 0;
		for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
			ItemStack tempStack = player.inventory.getStackInSlot(i);
			if (tempStack != null && tempStack.getItem() == item) {
				amount += tempStack.stackSize;
			}
		}
		return amount;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param item
	 *            The item to be searched for
	 * @param meta
	 *            The metadata to be searched for
	 * @return The amount of items found
	 */
	public static int getItemAmount(EntityPlayer player, Item item, int meta) {
		int amount = 0;
		for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
			ItemStack tempStack = player.inventory.getStackInSlot(i);
			if (tempStack != null && tempStack.getItem() == item && tempStack.getMetadata() == meta) {
				amount += tempStack.stackSize;
			}
		}
		return amount;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param stack
	 *            The item stack to be searched for. Can be used for meta searching
	 *            as well as item searching
	 * @return The amount of items found
	 */
	public static int getStackAmount(EntityPlayer player, ItemStack stack) {
		int amount = 0;
		for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
			ItemStack tempStack = player.inventory.getStackInSlot(i);
			if (tempStack != null && tempStack == stack) {
				amount += tempStack.stackSize;
			}
		}
		return amount;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param item
	 *            The item being searched for
	 * @return The slot at which the item was found
	 */
	public static int getItemSlot(EntityPlayer player, Item item) {
		for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
			ItemStack tempStack = player.inventory.getStackInSlot(i);
			if (tempStack != null && tempStack.getItem() == item) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param item
	 *            The item being searched for
	 * @param meta
	 *            The metadata to search for
	 * @return The slot at which the item was found
	 */
	public static int getItemSlot(EntityPlayer player, Item item, int meta) {
		for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
			ItemStack stack = player.inventory.getStackInSlot(i);
			if (stack != null && stack.getItem() == item && stack.getMetadata() == meta) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param stack
	 *            The stack being searched for
	 * @return The slot at which the item was found
	 */
	public static int getItemSlot(EntityPlayer player, ItemStack stack) {
		for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
			ItemStack tempStack = player.inventory.getStackInSlot(i);
			if (tempStack != null && tempStack == stack) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param item
	 *            The item to search for
	 * @param amount
	 *            The amount to search for
	 * @return If the amount of items is in the player's inventory
	 */
	public static boolean hasItemAndAmount(EntityPlayer player, Item item, int amount) {
		int count = 0;
		for (ItemStack tempStack : player.inventory.mainInventory) {
			if (tempStack != null && tempStack.getItem() == item) {
				count += tempStack.stackSize;
			}
		}
		return amount <= count;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param item
	 *            The item to search for
	 * @param amount
	 *            The amount to search for
	 * @param meta
	 *            The meta data of the item to search for
	 * @return If the amount of items is in the player's inventory
	 */
	public static boolean hasItemAndAmount(EntityPlayer player, Item item, int amount, int meta) {
		int count = 0;
		for (ItemStack tempStack : player.inventory.mainInventory) {
			if (tempStack != null && tempStack.getItem() == item && tempStack.getMetadata() == meta) {
				count += tempStack.stackSize;
			}
		}
		return amount <= count;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param stack
	 *            The stack to search for
	 * @param amount
	 *            The amount to search for
	 * @return If the amount of items is in the player's inventory
	 */
	public static boolean hasStackAndAmount(EntityPlayer player, ItemStack stack, int amount) {
		int count = 0;
		for (ItemStack tempStack : player.inventory.mainInventory) {
			if (tempStack != null && tempStack == stack) {
				count += tempStack.stackSize;
			}
		}
		return amount <= count;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param item
	 *            The item to remove
	 * @param amount
	 *            The amount to remove
	 * @return If the player has and removed the items specified
	 */
	public static boolean removeItemWithAmount(EntityPlayer player, Item item, int amount) {
		if (hasItemAndAmount(player, item, amount)) {
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				ItemStack tempStack = player.inventory.getStackInSlot(i);
				if (tempStack != null && tempStack.getItem() == item) {
					if (amount - tempStack.stackSize < 0) {
						tempStack.stackSize -= amount;
						return true;
					} else {
						amount -= tempStack.stackSize;
						player.inventory.mainInventory[i] = null;
						if (amount == 0)
							return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param item
	 *            The item to remove
	 * @param amount
	 *            The amount to remove
	 * @param meta
	 *            The meta data of the item to remove
	 * @return If the player has and removed the items specified
	 */
	public static boolean removeItemWithAmount(EntityPlayer player, Item item, int amount, int meta) {
		if (hasItemAndAmount(player, item, amount, meta)) {
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				ItemStack tempStack = player.inventory.getStackInSlot(i);
				if (tempStack != null && tempStack.getItem() == item && tempStack.getMetadata() == meta) {
					if (amount - tempStack.stackSize < 0) {
						tempStack.stackSize -= amount;
						return true;
					} else {
						amount -= tempStack.stackSize;
						player.inventory.mainInventory[i] = null;
						if (amount == 0)
							return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param stack
	 *            The item to remove
	 * @param amount
	 *            The amount to remove
	 * @return If the player has and removed the items specified
	 */
	public static boolean removeStackWithAmount(EntityPlayer player, ItemStack stack, int amount) {
		if (hasStackAndAmount(player, stack, amount)) {
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				ItemStack tempStack = player.inventory.getStackInSlot(i);
				if (tempStack != null && tempStack == stack) {
					if (amount - tempStack.stackSize < 0) {
						tempStack.stackSize -= amount;
						return true;
					} else {
						amount -= tempStack.stackSize;
						player.inventory.mainInventory[i] = null;
						if (amount == 0)
							return true;
					}
				}
			}
		}
		return false;
	}
}