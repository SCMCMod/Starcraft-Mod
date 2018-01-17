package ga.scmc.tileentity;

import javax.annotation.Nullable;
import ga.scmc.blocks.BlockStarcraftFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * A custom furnace which uses the {@link TileEntitySidedInventory} class
 *
 * @author CJMinecraft
 */
public class TileEntityStarcraftFurnace extends TileEntitySidedInventory implements ITickable {

    /**
     * The amount of ticks the furnace should be burning for
     */
    private int furnaceBurnTime;
    /**
     * The current amount of time taken to cook the current item
     */
    private int cookTime;
    /**
     * The amount of time it takes to cook the current item
     */
    private int totalCookTime;
    /**
     * The burn time of the current item
     */
    private int currentItemBurnTime;

    /**
     * Create a new custom furnace
     */
    public TileEntityStarcraftFurnace() {
        super(new int[]{2, 1}, new int[]{0}, new int[]{1}, new int[]{1}, new int[]{1}, new int[]{1});
        this.totalCookTime = getCurrentCookTime(null);
    }

    public int getBurnTime() {
        return this.furnaceBurnTime;
    }

    public int getCurrentCookTime() {
        return this.cookTime;
    }

    public int getTotalCookTime() {
        return this.totalCookTime;
    }

    public int getCurrentItemBurnTime() {
        return this.currentItemBurnTime;
    }

    /**
     * @return is the furnace burning?
     */
    private boolean isBurning() {
        return this.furnaceBurnTime > 0;
    }

    @Override
    protected boolean isStackValid(int slot, ItemStack stack) {
        if(slot == 1)
            return TileEntityFurnace.isItemFuel(stack);
        if(slot == 0)
            return FurnaceRecipes.instance().getSmeltingResult(stack) != null;
        return super.isStackValid(slot, stack);
    }

    /**
     * @return can we smelt the current item?
     */
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
            return result <= 64 && result <= this.handler.getStackInSlot(2).getMaxStackSize(); // Forge BugFix: Make it respect stack sizes properly.
        }
    }

    /**
     * Actually smelt the current item
     */
    private void smeltItem() {
        if (canSmelt()) {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.handler.getStackInSlot(0));

            if (this.handler.getStackInSlot(2) == null) {
                this.handler.setStackInSlot(2, itemstack.copy());
            } else if (this.handler.getStackInSlot(2).getItem() == itemstack.getItem()) {
                this.handler.getStackInSlot(2).stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            if (this.handler.getStackInSlot(0).getItem() == Item.getItemFromBlock(Blocks.SPONGE) && this.handler.getStackInSlot(0).getMetadata() == 1 && this.handler.getStackInSlot(1) != null && this.handler.getStackInSlot(1).getItem() == Items.BUCKET) {
                this.handler.setStackInSlot(1, new ItemStack(Items.WATER_BUCKET));
            }

            --this.handler.getStackInSlot(0).stackSize;

            if (this.handler.getStackInSlot(0).stackSize <= 0) {
                this.handler.setStackInSlot(0, null);
            }
        }
    }

    /**
     * Get the default cook time (typically what you will change in a custom furnace)
     *
     * @param stack The {@link ItemStack} which will be cooked
     * @return The amount of time it takes to cook the given item
     */
    public int getCurrentCookTime(@Nullable ItemStack stack) {
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
        boolean originalIsBurning = isBurning();
        boolean dirty = false;

        if (isBurning())
            --this.furnaceBurnTime;

        if (!this.world.isRemote) {
            if (isBurning() || this.handler.getStackInSlot(1) != null && this.handler.getStackInSlot(0) != null) {
                if (!isBurning() && canSmelt()) {
                    this.furnaceBurnTime = TileEntityFurnace.getItemBurnTime(this.handler.getStackInSlot(1));
                    this.currentItemBurnTime = this.furnaceBurnTime;

                    if (isBurning()) {
                        dirty = true;

                        if (this.handler.getStackInSlot(1) != null) {
                            --this.handler.getStackInSlot(1).stackSize;

                            if (this.handler.getStackInSlot(1).stackSize == 0) {
                                this.handler.setStackInSlot(1, this.handler.getStackInSlot(1).getItem().getContainerItem(this.handler.getStackInSlot(1)));
                            }
                        }
                    }
                }

                if (isBurning() && canSmelt()) {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime) {
                        this.cookTime = 0;
                        this.totalCookTime = getCurrentCookTime(this.handler.getStackInSlot(0));
                        smeltItem();
                        dirty = true;
                    }
                } else {
                    this.cookTime = 0;
                }
            } else if (!isBurning() && this.cookTime > 0) {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
            }

            if (originalIsBurning != isBurning()) {
                dirty = true;
                this.world.setBlockState(this.pos, this.world.getBlockState(this.pos).withProperty(BlockStarcraftFurnace.BURNING, isBurning()), 3);
            }
        }

        if (dirty) {
            markDirty();
        }
    }

    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState) {
        return oldState.getBlock() != newState.getBlock();
    }
}
