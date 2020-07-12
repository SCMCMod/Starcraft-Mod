package io.github.scmcmod.container;

import io.github.scmcmod.container.slot.SlotProtossUpgrade;
import io.github.scmcmod.container.slot.SlotStarcraftFurnaceOutput;
import io.github.scmcmod.handlers.ItemHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * The container of the starcraft furnace
 *
 * @author CJMinecraft
 */
public class ContainerProtossFurnace extends Container
{

	private IInventory playerInv;

	public ContainerProtossFurnace(EntityPlayer player, IItemHandler furnaceInv)
	{
		this.playerInv = player.inventory;

		this.addSlotToContainer(new SlotItemHandler(furnaceInv, 0, 56, 35));
		this.addSlotToContainer(new SlotStarcraftFurnaceOutput(player, furnaceInv, 1, 116, 35));

		for (int x = 0; x < 2; x++)
		{
			for (int y = 0; y < 4; y++)
			{
				this.addSlotToContainer(new SlotProtossUpgrade(furnaceInv, x * 4 + y + 2, 8 + x * 144, 8 + y * 18));
			}
		}

		for (int i = 0; i < 3; ++i)
			for (int j = 0; j < 9; ++j)
				this.addSlotToContainer(new Slot(this.playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));

		for (int k = 0; k < 9; ++k)
			this.addSlotToContainer(new Slot(this.playerInv, k, 8 + k * 18, 142));
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int index)
	{
		ItemStack currentStack = ItemStack.EMPTY;
		Slot slot = this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack())
		{
			ItemStack stackInSlot = slot.getStack();
			currentStack = stackInSlot.copy();

			if (index != 1 && index != 0)
			{
				if (!FurnaceRecipes.instance().getSmeltingResult(stackInSlot).isEmpty())
				{
					if (!this.mergeItemStack(stackInSlot, 0, 1, false))
					{
						return ItemStack.EMPTY;
					}
				} else if (index >= 2 && index < 10)
				{
					if (!this.mergeItemStack(stackInSlot, 37, 46, false))
					{
						if (!this.mergeItemStack(stackInSlot, 10, 46, false))
						{
							return ItemStack.EMPTY;
						}
					}
				} else if (stackInSlot.getItem() == ItemHandler.PROTOSS_UPGRADE && index >= 10 && index <= 45)
				{
					if (!this.mergeItemStack(stackInSlot, 2, 10, false))
					{
						if (index >= 37 && index < 46)
						{
							if (!this.mergeItemStack(stackInSlot, 10, 37, false))
							{
								return ItemStack.EMPTY;
							}
						} else if (index >= 10 && index < 36)
						{
							if (!this.mergeItemStack(stackInSlot, 37, 46, false))
							{
								return ItemStack.EMPTY;
							}
						}
					}
				} else if (index >= 37 && index < 46)
				{
					if (!this.mergeItemStack(stackInSlot, 10, 37, false))
					{
						return ItemStack.EMPTY;
					}
				} else if (index >= 10 && index < 36)
				{
					if (!this.mergeItemStack(stackInSlot, 37, 46, false))
					{
						return ItemStack.EMPTY;
					}
				}
			} else if (!this.mergeItemStack(stackInSlot, 3, 39, false))
			{
				return ItemStack.EMPTY;
			}

			if (stackInSlot.getCount() == 0)
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();

			if (stackInSlot.getCount() == currentStack.getCount())
				return ItemStack.EMPTY;

			slot.onTake(player, stackInSlot);
		}

		return currentStack;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}
}
