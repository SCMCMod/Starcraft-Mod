package com.hypeirochus.api.world.entity.player.inventory;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

//TODO: MOVE TO CORE MOD
public class Inventories {
	public static final int MAX_STACK_SIZE = 64;

	/**
	 * Drops items at the specified position.
	 *
	 * @param inv
	 *            - IInventory parameter.
	 * @param world
	 *            - The world of the entity.
	 * @param pos
	 *            - The position at which the entity will drop.
	 */
	public static void dropItemsInAt(IInventory inv, World world, BlockPos pos) {
		if (inv != null) {
			for (byte i = 0; i < inv.getSizeInventory(); i++) {
				ItemStack stack = inv.getStackInSlot(i);

				if (stack != null) {
					EntityItem entity = new EntityItem(world, pos.getX() + world.rand.nextFloat(), pos.getY() + world.rand.nextFloat(), pos.getZ() + world.rand.nextFloat(), stack);
					float velocity = 0.05F;

					entity.motionX = (-0.5F + world.rand.nextFloat()) * velocity;
					entity.motionY = (4F + world.rand.nextFloat()) * velocity;
					entity.motionZ = (-0.5F + world.rand.nextFloat()) * velocity;

					world.spawnEntity(entity);
				}
			}
		}
	}

	/**
	 * Gets the proper remaining uses of an item.
	 *
	 * @param itemstack
	 *            - the ItemStack we are figuring out the remaining usage of.
	 * @return the remaining uses the item has.
	 */
	public static int getRemainingUses(ItemStack itemstack) {
		int uses = itemstack.getMaxDamage() - itemstack.getItemDamage();
		return uses;
	}

	/**
	 * Get the slot id of the specified item in the specified inventory.
	 *
	 * @param item
	 *            - The item we are getting the slot id of.
	 * @param inventory
	 *            - The inventory of which we are searching in.
	 * @return the slot id of where the item is located in.
	 */
	public static int getSlotForItemIn(Item item, InventoryPlayer inventory) {
		for (int id = 0; id < inventory.getSizeInventory(); ++id) {
			if (!inventory.getStackInSlot(id).isEmpty() && inventory.getStackInSlot(id).getItem() == item) {
				return id;
			}
		}

		return -1;
	}

	/**
	 * Creates an itemStack instance from a random selection of Item objects in an array, with a stack amount of 1.
	 *
	 * @param items
	 *            - List of Items to choose a random Item from.
	 * @return an ItemStack instance instantiated from a random Item chosen from the provided Item Array.
	 */
	public static ItemStack randomItemStackFromArray(Item[] items) {
		return randomItemStackFromArray(items, new Random());
	}

	/**
	 * Creates an itemStack instance from a random selection of Item objects in an array, with a stack amount of 1.
	 *
	 * @param items
	 *            - List of Items to choose a random Item from.
	 * @param rand
	 *            - Random instance to use
	 * @return an ItemStack instance instantiated from a random Item chosen from the provided Item Array.
	 */
	public static ItemStack randomItemStackFromArray(Item[] items, Random rand) {
		return newStack(items[rand.nextInt(items.length)]);
	}

	/**
	 * Takes in either a Block or Item and creates a stack of it with an amount of 1.
	 *
	 * @param obj
	 *            - Item or Block instance.
	 * @return A new ItemStack instance of the specified Object.
	 **/
	public static ItemStack newStack(Object obj) {
		return newStack(obj, 1);
	}

	/**
	 * Takes in either a Block or Item and creates a stack of it with the specified amount.
	 *
	 * @param obj
	 *            - Item or Block instance.
	 * @param amount
	 *            - Amount of Items in this ItemStack.
	 * @return A new ItemStack instance of the specified Object.
	 **/
	public static ItemStack newStack(Object obj, int amount) {
		return obj instanceof Block ? new ItemStack((Block) obj, amount) : obj instanceof Item ? new ItemStack((Item) obj, amount) : ItemStack.EMPTY;
	}

	/**
	 * Returns an Item from an ItemStack.
	 *
	 * @param stack
	 *            - Instance of ItemStack.
	 * @return the Item instance of the specified ItemStack.
	 **/
	public static Item getItem(ItemStack stack) {
		return stack.getItem();
	}

	/**
	 * Gets a Block from an ItemStack.
	 *
	 * @param stack
	 *            - Instance of ItemStack.
	 * @return the Block instance of the specified ItemStack.
	 **/
	public static Block getBlock(ItemStack stack) {
		return Block.getBlockFromItem(stack.getItem());
	}

	/**
	 * Consumes a single item of the specified type from the specified player's inventory. Only comsumes an item if the player is in survival mode.
	 *
	 * @param player
	 *            - The player to consume an item from.
	 * @param item
	 *            - The item to consume.
	 */
	public static boolean consumeItem(EntityPlayer player, Item item) {
		return consumeItem(player, item, false);
	}

	/**
	 * Consumes a single item of the specified type from the specified player's inventory. Only comsumes an item if the player is in survival mode, unless forced.
	 *
	 * @param player
	 *            - The player to consume an item from.
	 * @param item
	 *            - The item to consume.
	 * @param force
	 *            - Forces an item to be consumed, regardless of gamemode.
	 */
	public static boolean consumeItem(EntityPlayer player, Item item, boolean force) {
		if (!player.capabilities.isCreativeMode || force) {
			int i = getSlotFor(player.inventory, item);

			if (i < 0) {
				return false;
			} else {
				player.inventory.getStackInSlot(i).shrink(1);
				if (player.inventory.getStackInSlot(i).getCount() <= 0) {
					player.inventory.setInventorySlotContents(i, ItemStack.EMPTY);
				}

				return true;
			}
		}

		return true;
	}

	/**
	 * Returns the slot number of a given item in the player's inventory.
	 *
	 * @param inventory
	 *            - The inventory to loop through.
	 * @param item
	 *            - The item to search for.
	 * @return The index of the slot.
	 */
	public static int getSlotFor(InventoryPlayer inventory, Item item) {
		for (int i = 0; i < inventory.mainInventory.size(); ++i) {
			if (inventory.mainInventory.get(i).getItem() == item) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Returns the slot number of a given item in the player's inventory.
	 *
	 * @param inventory
	 *            - The inventory to loop through.
	 * @param item
	 *            - The item to search for.
	 * @param meta
	 *            - The metadata to search for.
	 * @return The index of the slot.
	 */
	public static int getSlotFor(InventoryPlayer inventory, Item item, int meta) {
		for (int i = 0; i < inventory.mainInventory.size(); ++i) {
			ItemStack stack = inventory.getStackInSlot(i);
			if (inventory.mainInventory.get(i).getItem() == item && stack.getMetadata() == meta) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Returns the ItemStack residing in the specified player's helm slot.
	 *
	 * @param player
	 *            - The player to return an ItemStack from
	 * @return An ItemStack residing in the helm slot.
	 */
	public static ItemStack getHelmSlotItemStack(EntityPlayer player) {
		return player.inventory.armorInventory.get(3);
	}

	/**
	 * Returns the ItemStack residing in the specified player's chestplate slot.
	 *
	 * @param player
	 *            - The player to return an ItemStack from
	 * @return An ItemStack residing in the chestplate slot.
	 */
	public static ItemStack getChestSlotItemStack(EntityPlayer player) {
		return player.inventory.armorInventory.get(2);
	}

	/**
	 * Returns the ItemStack residing in the specified player's leggings slot.
	 *
	 * @param player
	 *            - The player to return an ItemStack from
	 * @return An ItemStack residing in the leggings slot.
	 */
	public static ItemStack getLegsSlotItemStack(EntityPlayer player) {
		return player.inventory.armorInventory.get(1);
	}

	/**
	 * Returns the ItemStack residing in the specified player's boots slot.
	 *
	 * @param player
	 *            - The player to return an ItemStack from
	 * @return An ItemStack residing in the boots slot.
	 */
	public static ItemStack getBootSlotItemStack(EntityPlayer player) {
		return player.inventory.armorInventory.get(0);
	}

	/**
	 * Returns whether or not a player has a certain item.
	 *
	 * @param item
	 *            - The item to search for.
	 * @param player
	 *            - The player to search.
	 * @return True if the player has the item, false otherwise.
	 */
	public static boolean playerHas(Item item, EntityPlayer player) {
		return getAmountOfItemPlayerHas(item, player) > 0;
	}

	/**
	 * Gets the amount of an item the player has.
	 *
	 * @param item
	 *            - The item to search for.
	 * @param player
	 *            - The player to search.
	 * @return The amount the player has of the item.
	 */
	public static int getAmountOfItemPlayerHas(Item item, EntityPlayer player) {
		int amount = 0;

		for (ItemStack stack : player.inventory.mainInventory) {
			if (stack != null && stack.getItem() == item) {
				amount += stack.getCount();
			}
		}

		return amount;
	}

	/**
	 * Gets the amount of an item the player has.
	 *
	 * @param item
	 *            - The item to search for.
	 * @param player
	 *            - The player to search.
	 * @return The amount the player has of the item.
	 */
	public static int getAmountOfItemPlayerHas(Item item, EntityPlayer player, int meta) {
		int amount = 0;

		for (ItemStack stack : player.inventory.mainInventory) {
			if (stack != null && stack.getItem() == item && stack.getMetadata() == meta) {
				amount += stack.getCount();
			}
		}

		return amount;
	}

	/**
	 * Checks if a player has an item with a given amount.
	 *
	 * @param player
	 *            - The player to search.
	 * @param item
	 *            - The item to search for.
	 * @param amount
	 *            - The amount to search for.
	 * @return If the amount of items is in the player's inventory
	 */
	public static boolean hasItemAndAmount(EntityPlayer player, Item item, int amount) {
		int count = 0;
		for (ItemStack stack : player.inventory.mainInventory) {
			if (stack != null && stack.getItem() == item) {
				count += stack.getCount();
			}
		}
		return amount <= count;
	}

	/**
	 * Checks if a player has an item with the given amount. Searches for items with the specified metadata.
	 *
	 * @param player
	 *            - The player to search.
	 * @param item
	 *            - The item to search for.
	 * @param amount
	 *            - The amount to search for.
	 * @param meta
	 *            - The meta data of the item to search for.
	 * @return If the amount of items is in the player's inventory.
	 */
	public static boolean hasItemAndAmount(EntityPlayer player, Item item, int amount, int meta) {
		int count = 0;
		for (ItemStack stack : player.inventory.mainInventory) {
			if (stack != null && stack.getItem() == item && stack.getMetadata() == meta) {
				count += stack.getCount();
			}
		}
		return amount <= count;
	}

	/**
	 * Decrements a given item anywhere in a player's inventory by 1.
	 *
	 * @param player
	 *            - The player to search.
	 * @param item
	 *            - The item to remove.
	 * @return If the player has and removed the items specified.
	 */
	public static boolean removeItemWithAmount(EntityPlayer player, Item item) {
		if (hasItemAndAmount(player, item, 1)) {
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				ItemStack stack = player.inventory.getStackInSlot(i);
				if (stack != null && stack.getItem() == item) {
					stack.shrink(1);
				}
			}
		}
		return false;
	}

	/**
	 * Removes a specified amount of an item.
	 *
	 * @param player
	 *            - The player to search.
	 * @param item
	 *            - The item to remove.
	 * @param amount
	 *            - The amount to remove.
	 * @return If the player has and removed the items specified.
	 */
	public static boolean removeItemWithAmount(EntityPlayer player, Item item, int amount) {
		if (hasItemAndAmount(player, item, amount)) {
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				ItemStack stack = player.inventory.getStackInSlot(i);
				if (stack != null && stack.getItem() == item) {
					if (amount - stack.getCount() < 0) {
						stack.shrink(amount);
						return true;
					}

					else {
						amount = stack.getCount();
						player.inventory.setInventorySlotContents(i, ItemStack.EMPTY);
						if (amount == 0)
							return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Removes a specified amount of an item. Can be used with metadata.
	 *
	 * @param player
	 *            - The player to search.
	 * @param item
	 *            - The item to remove.
	 * @param amount
	 *            - The amount to remove.
	 * @param meta
	 *            - The meta data of the item to remove.
	 * @return If the player has and removed the items specified.
	 */
	public static boolean removeItemWithAmount(EntityPlayer player, Item item, int amount, int meta) {
		if (hasItemAndAmount(player, item, amount, meta)) {
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				ItemStack stack = player.inventory.getStackInSlot(i);
				if (stack != null && stack.getItem() == item && stack.getMetadata() == meta) {
					if (amount - stack.getCount() < 0) {
						stack.shrink(amount);
						return true;
					}

					else {
						amount = stack.getCount();
						player.inventory.setInventorySlotContents(i, ItemStack.EMPTY);
						if (amount == 0)
							return true;
					}
				}
			}
		}
		return false;
	}
}