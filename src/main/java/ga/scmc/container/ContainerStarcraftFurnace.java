package ga.scmc.container;

import ga.scmc.container.slot.SlotStarcraftFurnaceFuel;
import ga.scmc.container.slot.SlotStarcraftFurnaceOutput;
import ga.scmc.tileentity.TileEntityBlockCharFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nullable;

/**
 * The container of the starcraft furnace
 *
 * @author CJMinecraft
 */
public class ContainerStarcraftFurnace extends Container {

    private IInventory playerInv;

    public ContainerStarcraftFurnace(EntityPlayer player, IItemHandler furnaceInv) {
        this.playerInv = player.inventory;

        this.addSlotToContainer(new SlotItemHandler(furnaceInv, 0, 56, 17));
        this.addSlotToContainer(new SlotStarcraftFurnaceFuel(furnaceInv, 1, 56, 53));
        this.addSlotToContainer(new SlotStarcraftFurnaceOutput(player, furnaceInv, 2, 116, 35));

        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < 9; ++j)
                this.addSlotToContainer(new Slot(this.playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));

        for (int k = 0; k < 9; ++k)
            this.addSlotToContainer(new Slot(this.playerInv, k, 8 + k * 18, 142));
    }

    /**
     * Take a stack from the specified inventory slot.
     */
    @Nullable
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack currentStack = null;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack stackInSlot = slot.getStack();
            currentStack = stackInSlot.copy();

            if (index == 2) {
                if (!this.mergeItemStack(stackInSlot, 3, 39, true))
                    return null;

                slot.onSlotChange(stackInSlot, currentStack);
            } else if (index != 1 && index != 0) {
                if (FurnaceRecipes.instance().getSmeltingResult(stackInSlot) != null)
                    if (!this.mergeItemStack(stackInSlot, 0, 1, false))
                        return null;
                    else if (TileEntityBlockCharFurnace.isItemFuel(stackInSlot))
                        if (!this.mergeItemStack(stackInSlot, 1, 2, false))
                            return null;
                        else if (index >= 3 && index < 30)
                            if (!this.mergeItemStack(stackInSlot, 30, 39, false))
                                return null;
                            else if (index >= 30 && index < 39 && !this.mergeItemStack(stackInSlot, 3, 30, false))
                                return null;
            } else if (!this.mergeItemStack(stackInSlot, 3, 39, false)) {
                return null;
            }

            if (stackInSlot.stackSize == 0)
                slot.putStack((ItemStack) null);
            else
                slot.onSlotChanged();

            if (stackInSlot.stackSize == currentStack.stackSize)
                return null;

            slot.onPickupFromSlot(playerIn, stackInSlot);
        }

        return currentStack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return true;
    }
}
