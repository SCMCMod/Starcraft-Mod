package com.hypeirochus.scmc.container.slot;

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
 * Creates a slot that will be able to have every single item in the game placed into it except for the ones specified.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
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

	@Override
	public boolean isItemValid(ItemStack stack) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == stack.getItem()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public ItemStack decrStackSize(int amount) {
		if (this.getHasStack()) {
			this.removeCount += Math.min(amount, this.getStack().getCount());
		}

		return super.decrStackSize(amount);
	}

	@Override
	public ItemStack onTake(EntityPlayer player, ItemStack stack) {
		this.onCrafting(stack);
		return super.onTake(player, stack);
	}

	@Override
	protected void onCrafting(ItemStack stack, int amount) {
		this.removeCount += amount;
		this.onCrafting(stack);
	}

	@Override
	protected void onCrafting(ItemStack stack) {
		stack.onCrafting(this.player.world, this.player, this.removeCount);
		this.removeCount = 0;
	}
}