package ga.scmc.container.slot;

import javax.annotation.Nullable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Creates a slot that will be able to have every single item in the game placed
 * into it except for the ones specified.
 * 
 * @author Ocelot5836
 */
public class SlotBlacklist extends SlotItemHandler {
	/** The player that is using the GUI where this slot resides. */
	private final EntityPlayer player;
	/** The item to be able to be placed in the slot */
	private Item[] items;
	private int removeCount;

	public SlotBlacklist(EntityPlayer player, IItemHandler handler, Item item, int slotIndex, int xPosition, int yPosition) {
		super(handler, slotIndex, xPosition, yPosition);
		this.player = player;
		this.items = new Item[] { item };
	}

	public SlotBlacklist(EntityPlayer player, IItemHandler handler, Item[] items, int slotIndex, int xPosition, int yPosition) {
		super(handler, slotIndex, xPosition, yPosition);
		this.player = player;
		this.items = items;
	}

	/**
	 * Check if the stack is a valid item for this slot. Always true beside for the
	 * armor slots.
	 */
	public boolean isItemValid(@Nullable ItemStack stack) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == stack.getItem()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Decrease the size of the stack in slot (first int arg) by the amount of the
	 * second int arg. Returns the new stack.
	 */
	public ItemStack decrStackSize(int amount) {
		if (this.getHasStack()) {
			this.removeCount += Math.min(amount, this.getStack().stackSize);
		}

		return super.decrStackSize(amount);
	}

	public void onPickupFromSlot(EntityPlayer playerIn, ItemStack stack) {
		this.onCrafting(stack);
		super.onPickupFromSlot(playerIn, stack);
	}

	/**
	 * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not
	 * ore and wood. Typically increases an internal count then calls
	 * onCrafting(item).
	 */
	protected void onCrafting(ItemStack stack, int amount) {
		this.removeCount += amount;
		this.onCrafting(stack);
	}

	/**
	 * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not
	 * ore and wood.
	 */
	protected void onCrafting(ItemStack stack) {
		stack.onCrafting(this.player.world, this.player, this.removeCount);
		this.removeCount = 0;
	}
}