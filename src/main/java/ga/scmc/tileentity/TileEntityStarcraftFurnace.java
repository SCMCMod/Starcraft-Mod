package ga.scmc.tileentity;

/**
 * A custom furnace which uses the {@link TileEntitySidedInventory} class
 */
public class TileEntityStarcraftFurnace extends TileEntitySidedInventory implements ITickable {

    private int furnaceBurnTime;
    private int currentItemBurnTime;
    private int cookTime;
    private int totalCookTime;

    public TileEntityStarcraftFurnace() {
        super(new int[]{2, 1}, new int[]{0}, new int[]{1}, new int[]{1}, new int[]{1}, new int[]{1});
    }

    public boolean isBurning() {
        return this.furnaceBurnTime > 0;
    }

    private boolean canSmelt() {
        if (this.handler.getStackInSlot(0) == null) {
            return false;
        } else {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.handler.getStackInSlot(0));
            if (itemstack == null)
                return false;
            if (this.handler.getStackInSlot(2) == null)
                return true;
            if (!this.handler.getStackInSlot(2).isItemEqual(itemstack))
                return false;
            int result = this.handler.getStackInSlot(2).stackSize + itemstack.stackSize;
            return result <= this.handler.getSlots() && result <= this.handler.getStackInSlot(2).getMaxStackSize(); // Forge BugFix: Make it respect stack sizes properly.
        }
    }

    public void smeltItem() {
        if (this.canSmelt()) {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.handler.getStackInSlot(0));

            if (this.handler.getStackInSlot(2) == null) {
                this.handler.setStackInSlot(2, itemstack.copy());
            } else if (this.handler.getStackInSlot(2).getItem() == itemstack.getItem()) {
                this.handler.getStackInSlot(2).stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            if (this.handler.getStackInSlot(0).getItem() == Item.getItemFromBlock(Blocks.SPONGE) && this.handler.getStackInSlot(0).getMetadata() == 1 && this.furnaceItemStacks[1] != null && this.furnaceItemStacks[1].getItem() == Items.BUCKET) {
                this.handler.setStackInSlot(1, new ItemStack(Items.WATER_BUCKET));
            }

            --this.handler.getStackInSlot(0).stackSize;

            if (this.handler.getStackInSlot(0).stackSize <= 0) {
                this.handler.setStackInSlot(0, null);
            }
        }
    }

    public int getCookTime(@Nullable ItemStack stack) {
        return 200;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.furnaceBurnTime = nbt.getInteger("BurnTime");
        this.cookTime = nbt.getInteger("CookTime");
        this.totalCookTime = nbt.getInteger("CookTimeTotal");
        this.currentItemBurnTime = TileEntityFurnace.getItemBurnTime(this.handler.getStackInSlot(1));
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        nbt.setInteger("BurnTime", this.furnaceBurnTime);
        nbt.setInteger("CookTime", this.cookTime);
        nbt.setInteger("CookTimeTotal", this.totalCookTime);
        return super.writeToNBT(nbt);
    }

    @Override
    public void update() {
        boolean originalIsBurning = this.isBurning();
        boolean burningState = false;

        if (this.isBurning())
        {
            --this.furnaceBurnTime;
        }

        if (!this.world.isRemote)
        {
            if (this.isBurning() || this.handler.getStackInSlot(1) != null && this.handler.getStackInSlot(0) != null)
            {
                if (!this.isBurning() && this.canSmelt())
                {
                    this.furnaceBurnTime = TileEntityFurnace.getItemBurnTime(this.handler.getStackInSlot(1));
                    this.currentItemBurnTime = this.furnaceBurnTime;

                    if (this.isBurning())
                    {
                        burningState = true;

                        if (this.handler.getStackInSlot(1) != null)
                        {
                            --this.handler.getStackInSlot(1).stackSize;

                            if (this.handler.getStackInSlot(1).stackSize == 0)
                            {
                                this.handler.setStackInSlot(1, this.handler.getStackInSlot(1).getItem().getContainerItem(this.handler.getStackInSlot(1)));
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt())
                {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime)
                    {
                        this.cookTime = 0;
                        this.totalCookTime = this.getCookTime(this.handler.getStackInSlot(0));
                        this.smeltItem();
                        burningState = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }
            else if (!this.isBurning() && this.cookTime > 0)
            {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
            }

            if (originalIsBurning != this.isBurning())
            {
                burningState = true;
                BlockFurnaceChar.setState(this.isBurning(), this.world, this.pos);
            }
        }

        if (burningState)
        {
            this.markDirty();
        }
    }
}
