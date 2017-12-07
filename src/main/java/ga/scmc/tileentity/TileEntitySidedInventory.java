package ga.scmc.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;

/**
 * A simple {@link net.minecraft.tileentity.TileEntity} which has a sided inventory using capabilities
 *
 * @author CJMinecraft
 */
public class TileEntitySidedInventory extends TileEntity {

    /**
     * The holder of all the item stacks
     */
    protected ItemStackHandler handler;
    /**
     * All of the handlers for each side
     */
    private SidedItemStackHandler northHandler, southHandler, eastHandler, westHandler, upHandler, downHandler;
    /**
     * The slots each side will represent
     */
    private int[][] slotsForFace;
    /**
     * States whether we are currently transferring stacks
     */
    private boolean transferringStacks;

    /**
     * Create a sided {@link TileEntity}, like the {@link net.minecraft.inventory.ISidedInventory interface}
     *
     * @param slotsDown  The slots which are represented on the down face
     * @param slotsUp    The slots which are represented on the up face
     * @param slotsNorth The slots which are represented on the north face
     * @param slotsSouth The slots which are represented on the south face
     * @param slotsWest  The slots which are represented on the west face
     * @param slotsEast  The slots which are represented on the east face
     */
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

    /**
     * Calculate the size of the main item handler
     *
     * @return the calculated size
     */
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

    /**
     * Get the correct handler for the given face
     *
     * @param side The side to get the handler of
     * @return the correct handler for the given face
     */
    private ItemStackHandler getHandlerForFace(@Nullable EnumFacing side) {
        if(side == null)
            return this.handler;
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
            default:
                return this.handler;
        }
    }

    /**
     * Insert an {@link ItemStack} (used by the main handler) into all of the faces handlers
     *
     * @param slot  The slot of the main handler that the {@link ItemStack} is in
     * @param stack The {@link ItemStack} to insert into all the of the faces handlers
     */
    private void insertStack(int slot, ItemStack stack) {
        this.transferringStacks = true;
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
        this.transferringStacks = false;
    }

    /**
     * Extract an {@link ItemStack} (used by the main handler) from all of the faces handlers
     *
     * @param slot   The slot of the main handler that the {@link ItemStack} is in
     * @param amount The amount of items to be extracted
     */
    private void extractStack(int slot, int amount) {
        this.transferringStacks = true;
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
        this.transferringStacks = false;
    }

    /**
     * Update all of the faces handlers (used when loading up the NBT)
     */
    private void updateHandlers() {
        for(int slot = 0; slot < this.handler.getSlots(); slot++) {
            for(int i = 0; i < this.slotsForFace.length; i++) {
                for(int j = 0; j < this.slotsForFace[i].length; j++) {
                    if (slot == this.slotsForFace[i][j]) {
                        switch(i) {
                            case 0:
                                this.downHandler.setStackInSlot(j, this.handler.getStackInSlot(slot));
                                break;
                            case 1:
                                this.upHandler.setStackInSlot(j, this.handler.getStackInSlot(slot));
                                break;
                            case 2:
                                this.northHandler.setStackInSlot(j, this.handler.getStackInSlot(slot));
                                break;
                            case 3:
                                this.southHandler.setStackInSlot(j, this.handler.getStackInSlot(slot));
                                break;
                            case 4:
                                this.westHandler.setStackInSlot(j, this.handler.getStackInSlot(slot));
                                break;
                            case 5:
                                this.eastHandler.setStackInSlot(j, this.handler.getStackInSlot(slot));
                                break;
                        }
                    }
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

    /**
     * The {@link ItemStackHandler} which is used for each face
     */
    private class SidedItemStackHandler extends ItemStackHandler {

        private EnumFacing side;

        public SidedItemStackHandler(int size, EnumFacing side) {
            super(size);
            this.side = side;
        }

        @Override
        public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
            // Insert into the main handler
            return transferringStacks ? super.insertItem(slot, stack, simulate) : handler.insertItem(slotsForFace[side.getIndex()][slot], stack, simulate);
        }

        @Override
        public ItemStack extractItem(int slot, int amount, boolean simulate) {
            // Extract from the main handler
            return transferringStacks ? super.extractItem(slot, amount, simulate) : handler.extractItem(slotsForFace[side.getIndex()][slot], amount, simulate);
        }
    }

    /**
     * Makes sure the client has all the data it needs
     */
    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound nbtTag = new NBTTagCompound();
        writeToNBT(nbtTag);
        return new SPacketUpdateTileEntity(pos, 1, nbtTag);
    }

    /**
     * Make sure to read the client data when it receives the update packet
     */
    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        readFromNBT(pkt.getNbtCompound());
    }

    /**
     * Returns the tag with all of the client data saved
     */
    @Override
    public NBTTagCompound getUpdateTag() {
        NBTTagCompound nbt = super.getUpdateTag();
        writeToNBT(nbt);
        return nbt;
    }

    /**
     * Handles when you get an update
     */
    @Override
    public void handleUpdateTag(NBTTagCompound nbt) {
        readFromNBT(nbt);
    }

    /**
     * Gets the tile entities nbt with all of the data stored in it
     */
    @Override
    public NBTTagCompound getTileData() {
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return nbt;
    }
}
