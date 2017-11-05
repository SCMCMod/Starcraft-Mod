package ga.scmc.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Has some useful methods for getting, removing, and dealing with itemStacks.
 * 
 * @author Ocelot5836
 */
public class InventoryUtil {

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
			ItemStack stack = player.inventory.getStackInSlot(i);
			if (stack != null && stack.getItem() == item) {
				amount += stack.stackSize;
			}
		}
		return amount;
	}

	/**
	 * 
	 * @param player
	 *            The player to check
	 * @param stack
	 *            The item stack to be searched for. Can be used for meta searching as well as item searching
	 * @return The amount of items found
	 */
	public static int getItemAmount(EntityPlayer player, ItemStack stack) {
		int amount = 0;
		for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
			ItemStack tempStack = player.inventory.getStackInSlot(i);
			if (tempStack != null && tempStack.getItem() == stack.getItem() && tempStack.getMetadata() == stack.getMetadata()) {
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
			ItemStack stack = player.inventory.getStackInSlot(i);
			if (stack != null && stack.getItem() == item) {
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
		for (ItemStack stack : player.inventory.mainInventory) {
			if (stack != null && stack.getItem() == item) {
				count += stack.stackSize;
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
		for (ItemStack stack : player.inventory.mainInventory) {
			if (stack != null && stack.getItem() == item && stack.getMetadata() == meta) {
				count += stack.stackSize;
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
				ItemStack stack = player.inventory.getStackInSlot(i);
				if (stack != null && stack.getItem() == item) {
					if (amount - stack.stackSize < 0) {
						stack.stackSize -= amount;
						return true;
					} else {
						amount = stack.stackSize;
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
	 * @param The
	 *            meta data of the item to remove
	 * @return If the player has and removed the items specified
	 */
	public static boolean removeItemWithAmount(EntityPlayer player, Item item, int amount, int meta) {
		if (hasItemAndAmount(player, item, amount, meta)) {
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				ItemStack stack = player.inventory.getStackInSlot(i);
				if (stack != null && stack.getItem() == item && stack.getMetadata() == meta) {
					if (amount - stack.stackSize < 0) {
						stack.stackSize -= amount;
						return true;
					} else {
						amount = stack.stackSize;
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