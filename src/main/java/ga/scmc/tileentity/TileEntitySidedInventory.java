package ga.scmc.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

/**
 * @author CJMinecraft
 * A simple {@link net.minecraft.tileentity.TileEntity} which has a sided inventory using capabilities
 */
public class TileEntitySidedInventory extends TileEntity {

    protected ItemStackHandler handler;
    private SidedItemStackHandler northHandler, southHandler, eastHandler, westHandler, upHandler, downHandler;

    public TileEntitySidedInventory(int slotsDown, int slotsUp, int slotsNorth, int slotsSouth, int slotsWest, int slotsEast) {
        this.handler = new ItemStackHandler(slotsDown + slotsUp + slotsNorth + slotsSouth + slotsWest + slotsEast) {
            @Override
            public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
                if (!simulate)
                    insertStack(slot, stack, simulate);
                return super.insertItem(slot, stack, simulate);
            }

            @Override
            public ItemStack extractItem(int slot, int amount, boolean simulate) {
                if (!simulate)
                    extractStack(slot, amount, simulate);
                return super.extractItem(slot, amount, simulate);
            }
        };
        this.downHandler = new SidedItemStackHandler(slotsDown, EnumFacing.DOWN);
        this.upHandler = new SidedItemStackHandler(slotsUp, EnumFacing.UP);
        this.northHandler = new SidedItemStackHandler(slotsNorth, EnumFacing.NORTH);
        this.southHandler = new SidedItemStackHandler(slotsSouth, EnumFacing.SOUTH);
        this.westHandler = new SidedItemStackHandler(slotsWest, EnumFacing.WEST);
        this.eastHandler = new SidedItemStackHandler(slotsEast, EnumFacing.EAST);
    }

    private ItemStackHandler getHandlerForFace(EnumFacing side) {
        switch (side) {
            case DOWN:
                return this.downHandler;
            case UP:
                return this.upHandler;
            case NORTH:
                return this.northHandler;
            case SOUTH:
                return this.southHandler;
            case WEST:
                return this.westHandler;
            case EAST:
                return this.eastHandler;
        }
        return this.handler;
    }

    private int getMainSlotForFace(EnumFacing side, int slot) {
        switch (side) {
            case DOWN:
                return slot;
            case UP:
                return slot + this.downHandler.getSlots();
            case NORTH:
                return slot + this.downHandler.getSlots() + this.upHandler.getSlots();
            case SOUTH:
                return slot + this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots();
            case WEST:
                return slot + this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots() + this.southHandler.getSlots();
            case EAST:
                return slot + this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots() + this.southHandler.getSlots() + this.westHandler.getSlots();
        }
        return 0;
    }

    private int getSlotForFace(EnumFacing side, int slot) {
        switch (side) {
            case DOWN:
                return slot;
            case UP:
                return slot - this.downHandler.getSlots() + 1;
            case NORTH:
                return slot - this.downHandler.getSlots() - this.upHandler.getSlots() + 1;
            case SOUTH:
                return slot - this.downHandler.getSlots() - this.upHandler.getSlots() - this.northHandler.getSlots() + 1;
            case WEST:
                return slot - this.downHandler.getSlots() - this.upHandler.getSlots() - this.northHandler.getSlots() - this.southHandler.getSlots() + 1;
            case EAST:
                return slot - this.downHandler.getSlots() - this.upHandler.getSlots() - this.northHandler.getSlots() - this.southHandler.getSlots() - this.westHandler.getSlots() + 1;
        }
        return 0;
    }

    private EnumFacing getFaceForSlot(int slot) {
        if (slot < this.downHandler.getSlots())
            return EnumFacing.DOWN;
        if (slot < this.downHandler.getSlots() + this.upHandler.getSlots())
            return EnumFacing.UP;
        if (slot < this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots())
            return EnumFacing.NORTH;
        if (slot < this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots() + this.southHandler.getSlots())
            return EnumFacing.SOUTH;
        if (slot < this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots() + this.southHandler.getSlots() + this.westHandler.getSlots())
            return EnumFacing.WEST;
        return EnumFacing.EAST;
    }

    private ItemStack insertStack(int slot, ItemStack stack, boolean simulate) {
        switch (getFaceForSlot(slot)) {
            case DOWN:
                return this.downHandler.insertItem(getSlotForFace(EnumFacing.DOWN, slot), stack, simulate);
            case UP:
                return this.upHandler.insertItem(getSlotForFace(EnumFacing.UP, slot), stack, simulate);
            case NORTH:
                return this.northHandler.insertItem(getSlotForFace(EnumFacing.NORTH, slot), stack, simulate);
            case SOUTH:
                return this.southHandler.insertItem(getSlotForFace(EnumFacing.SOUTH, slot), stack, simulate);
            case WEST:
                return this.westHandler.insertItem(getSlotForFace(EnumFacing.WEST, slot), stack, simulate);
            case EAST:
                return this.eastHandler.insertItem(getSlotForFace(EnumFacing.EAST, slot), stack, simulate);
        }
        return stack;
    }

    private ItemStack extractStack(int slot, int amount, boolean simulate) {
        switch (getFaceForSlot(slot)) {
            case DOWN:
                return this.downHandler.extractItem(getSlotForFace(EnumFacing.DOWN, slot), amount, simulate);
            case UP:
                return this.upHandler.extractItem(getSlotForFace(EnumFacing.UP, slot), amount, simulate);
            case NORTH:
                return this.northHandler.extractItem(getSlotForFace(EnumFacing.NORTH, slot), amount, simulate);
            case SOUTH:
                return this.southHandler.extractItem(getSlotForFace(EnumFacing.SOUTH, slot), amount, simulate);
            case WEST:
                return this.westHandler.extractItem(getSlotForFace(EnumFacing.WEST, slot), amount, simulate);
            case EAST:
                return this.eastHandler.extractItem(getSlotForFace(EnumFacing.EAST, slot), amount, simulate);
        }
        return null;
    }

    private void updateHandlers() {
        for (int slot = 0; slot < this.handler.getSlots(); slot++) {
            if (slot < this.downHandler.getSlots())
                this.downHandler.setStackInSlot(getSlotForFace(EnumFacing.DOWN, slot), this.handler.getStackInSlot(slot));
            else if (slot < this.downHandler.getSlots() + this.upHandler.getSlots())
                this.upHandler.setStackInSlot(getSlotForFace(EnumFacing.UP, slot), this.handler.getStackInSlot(slot));
            else if (slot < this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots())
                this.northHandler.setStackInSlot(getSlotForFace(EnumFacing.NORTH, slot), this.handler.getStackInSlot(slot));
            else if (slot < this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots() + this.southHandler.getSlots())
                this.southHandler.setStackInSlot(getSlotForFace(EnumFacing.SOUTH, slot), this.handler.getStackInSlot(slot));
            else if (slot < this.downHandler.getSlots() + this.upHandler.getSlots() + this.northHandler.getSlots() + this.southHandler.getSlots() + this.westHandler.getSlots())
                this.westHandler.setStackInSlot(getSlotForFace(EnumFacing.WEST, slot), this.handler.getStackInSlot(slot));
            else
                this.eastHandler.setStackInSlot(getSlotForFace(EnumFacing.EAST, slot), this.handler.getStackInSlot(slot));
        }
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && getHandlerForFace(facing).getSlots() != 0)
            return true;
        return super.hasCapability(capability, facing);
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return (T) getHandlerForFace(facing);
        return super.getCapability(capability, facing);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.handler.deserializeNBT(nbt.getCompoundTag("Inventory"));
        updateHandlers();
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        nbt.setTag("Inventory", this.handler.serializeNBT());
        return super.writeToNBT(nbt);
    }

    private class SidedItemStackHandler extends ItemStackHandler {

        private EnumFacing side;

        public SidedItemStackHandler(int size, EnumFacing side) {
            super(size);
            this.side = side;
        }

        @Override
        public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
            if (!simulate)
                handler.insertItem(getMainSlotForFace(this.side, slot), stack, simulate);
            return super.insertItem(slot, stack, simulate);
        }

        @Override
        public ItemStack extractItem(int slot, int amount, boolean simulate) {
            if (!simulate)
                handler.extractItem(getMainSlotForFace(this.side, slot), amount, simulate);
            return super.extractItem(slot, amount, simulate);
        }
    }
}
