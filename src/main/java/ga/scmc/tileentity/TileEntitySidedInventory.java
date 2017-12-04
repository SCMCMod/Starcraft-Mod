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
    private int[][] slotsForFace;


    public TileEntitySidedInventory(int[] slotsDown, int[] slotsUp, int[] slotsNorth, int[] slotsSouth, int[] slotsWest, int[] slotsEast) {
        this.slotsForFace = new int[][]{slotsDown, slotsUp, slotsNorth, slotsSouth, slotsWest, slotsEast};
        this.handler = new ItemStackHandler(calculateSizeOfMainHandler()) {
            @Override
            public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
                if (!simulate)
                    insertStack(slot, stack);
                return super.insertItem(slot, stack, simulate);
            }

            @Override
            public ItemStack extractItem(int slot, int amount, boolean simulate) {
                if (!simulate)
                    extractStack(slot, amount);
                return super.extractItem(slot, amount, simulate);
            }
        };
        this.downHandler = new SidedItemStackHandler(slotsDown.length, EnumFacing.DOWN);
        this.upHandler = new SidedItemStackHandler(slotsUp.length, EnumFacing.UP);
        this.northHandler = new SidedItemStackHandler(slotsNorth.length, EnumFacing.NORTH);
        this.southHandler = new SidedItemStackHandler(slotsSouth.length, EnumFacing.SOUTH);
        this.westHandler = new SidedItemStackHandler(slotsWest.length, EnumFacing.WEST);
        this.eastHandler = new SidedItemStackHandler(slotsEast.length, EnumFacing.EAST);
    }

    private int calculateSizeOfMainHandler() {
        int lastSlot = 0;
        for (int[] slots : this.slotsForFace) {
            for (int slot : slots) {
                if (slot > lastSlot)
                    lastSlot = slot;
            }
        }
        return lastSlot + 1;
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

    private void insertStack(int slot, ItemStack stack) {
        for (int i = 0; i < this.slotsForFace.length; i++) {
            for (int j = 0; j < this.slotsForFace[i].length; j++) {
                if (this.slotsForFace[i][j] == slot) {
                    switch (i) {
                        case 0:
                            this.downHandler.insertItem(j, stack, false);
                            break;
                        case 1:
                            this.upHandler.insertItem(j, stack, false);
                            break;
                        case 2:
                            this.northHandler.insertItem(j, stack, false);
                            break;
                        case 3:
                            this.southHandler.insertItem(j, stack, false);
                            break;
                        case 4:
                            this.westHandler.insertItem(j, stack, false);
                            break;
                        case 5:
                            this.eastHandler.insertItem(j, stack, false);
                            break;
                    }
                    break;
                }
            }
        }
    }

    private void extractStack(int slot, int amount) {
        for (int i = 0; i < this.slotsForFace.length; i++) {
            for (int j = 0; j < this.slotsForFace[i].length; j++) {
                if (this.slotsForFace[i][j] == slot) {
                    switch (i) {
                        case 0:
                            this.downHandler.extractItem(j, amount, false);
                            break;
                        case 1:
                            this.upHandler.extractItem(j, amount, false);
                            break;
                        case 2:
                            this.northHandler.extractItem(j, amount, false);
                            break;
                        case 3:
                            this.southHandler.extractItem(j, amount, false);
                            break;
                        case 4:
                            this.westHandler.extractItem(j, amount, false);
                            break;
                        case 5:
                            this.eastHandler.extractItem(j, amount, false);
                            break;
                    }
                    break;
                }
            }
        }
    }

    private void updateHandlers() {
        for(int i = 0; i < this.slotsForFace.length; i++) {
            for(int j = 0; j < this.slotsForFace[i].length; j++) {
                switch (i) {
                    case 0:
                        this.downHandler.setStackInSlot(j, this.handler.getStackInSlot(this.slotsForFace[i][j]));
                        break;
                    case 1:
                        this.upHandler.setStackInSlot(j, this.handler.getStackInSlot(this.slotsForFace[i][j]));
                        break;
                    case 2:
                        this.northHandler.setStackInSlot(j, this.handler.getStackInSlot(this.slotsForFace[i][j]));
                        break;
                    case 3:
                        this.southHandler.setStackInSlot(j, this.handler.getStackInSlot(this.slotsForFace[i][j]));
                        break;
                    case 4:
                        this.westHandler.setStackInSlot(j, this.handler.getStackInSlot(this.slotsForFace[i][j]));
                        break;
                    case 5:
                        this.eastHandler.setStackInSlot(j, this.handler.getStackInSlot(this.slotsForFace[i][j]));
                        break;
                }
            }
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
                handler.insertItem(slotsForFace[side.getIndex()][slot];, stack, simulate);
            return super.insertItem(slot, stack, simulate);
        }

        @Override
        public ItemStack extractItem(int slot, int amount, boolean simulate) {
            if (!simulate)
                handler.extractItem(slotsForFace[side.getIndex()][slot];, amount, simulate);
            return super.extractItem(slot, amount, simulate);
        }
    }
}
