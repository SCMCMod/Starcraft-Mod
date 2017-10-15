package ga.scmc.container;

import ga.scmc.container.slot.SlotWhitelist;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.tileentity.TileEntityGasCollector;
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

		Item[] item = new Item[] { ItemHandler.VESPENE, ItemHandler.TERRAZINE };
		Item[] fuel = new Item[] { ItemHandler.PROTOSS_INGOT, Item.getItemFromBlock(Blocks.PLANKS), ItemHandler.ORGANIC_TISSUE };

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				this.addSlotToContainer(new SlotWhitelist(player, handler, item, x + y * 3, 62 + (18 * x), 17 + (18 * y)));
			}
		}

		this.addSlotToContainer(new SlotWhitelist(player, handler, fuel[te.getType()], 9, 134, 35));

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
		ItemStack previous = null;
		Slot slot = (Slot) this.inventorySlots.get(fromSlot);

		if (slot != null && slot.getHasStack()) {
			ItemStack current = slot.getStack();
			previous = current.copy();

			if (fromSlot < this.handler.getSlots()) {
				if (!this.mergeItemStack(current, handler.getSlots(), handler.getSlots() + 36, true))
					return null;
			} else {
				if (current.getItem() == ItemHandler.PROTOSS_INGOT || current.getItem() == Item.getItemFromBlock(Blocks.PLANKS) || current.getItem() == ItemHandler.ORGANIC_TISSUE) {
					if (!this.mergeItemStack(current, 9, handler.getSlots(), false))
						return null;
				} else if (!this.mergeItemStack(current, 0, handler.getSlots(), false))
					return null;
			}

			if (current.stackSize == 0)
				slot.putStack(null);
			else
				slot.onSlotChanged();

			if (current.stackSize == previous.stackSize)
				return null;
			slot.onPickupFromSlot(playerIn, current);
		}
		return previous;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
}