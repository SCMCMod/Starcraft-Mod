package com.hypeirochus.scmc.container;

import com.hypeirochus.scmc.container.slot.SlotGasCollectorOutput;
import com.hypeirochus.scmc.container.slot.SlotWhitelist;
import com.hypeirochus.scmc.events.StarcraftEventHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.tileentity.TileEntityGasCollector;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

/**
 * @author Ocelot5836
 */
public class ContainerGasCollector extends Container {

	private TileEntityGasCollector te;
	private IItemHandler handler;

	public ContainerGasCollector(EntityPlayer player, TileEntityGasCollector te) {
		IInventory playerInv = player.inventory;
		this.te = te;
		this.handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

		Item[] fuel = new Item[] { ItemHandler.PROTOSS_INGOT, Item.getItemFromBlock(Blocks.PLANKS), ItemHandler.ORGANIC_TISSUE };

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				this.addSlotToContainer(new SlotGasCollectorOutput(handler, x + y * 3, 62 + (18 * x), 17 + (18 * y)));
			}
		}

		this.addSlotToContainer(new SlotWhitelist(player, handler, fuel[te.getType()], 9, 134, 35) {
			@Override
			public TextureAtlasSprite getBackgroundSprite() {
				return te.getType() == 0 ? StarcraftEventHandler.gasCollectorIngot : te.getType() == 1 ? StarcraftEventHandler.gasCollectorBlock : StarcraftEventHandler.gasCollectorFlesh;
			}
		});

		int xPos = 8;
		int yPos = 84;

		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, xPos + x * 18, yPos + y * 18));
			}
		}

		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playerInv, x, xPos + x * 18, yPos + 58));
		}
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
		ItemStack previous = ItemStack.EMPTY;
		Slot slot = (Slot) this.inventorySlots.get(fromSlot);

		if (slot != null && slot.getHasStack()) {
			ItemStack current = slot.getStack();
			previous = current.copy();

			if (fromSlot < this.handler.getSlots()) {
				if (!this.mergeItemStack(current, handler.getSlots(), handler.getSlots() + 36, true))
					return ItemStack.EMPTY;
			} else {
				if (current.getItem() == ItemHandler.PROTOSS_INGOT || current.getItem() == Item.getItemFromBlock(Blocks.PLANKS) || current.getItem() == ItemHandler.ORGANIC_TISSUE) {
					if (!this.mergeItemStack(current, 9, handler.getSlots(), false))
						return ItemStack.EMPTY;
				} else if (!this.mergeItemStack(current, 0, handler.getSlots(), false))
					return ItemStack.EMPTY;
			}

			if (current.getCount() == 0)
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();

			if (current.getCount() == previous.getCount())
				return ItemStack.EMPTY;

			slot.onTake(playerIn, current);
		}
		return previous;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
}