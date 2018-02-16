package com.hypeirochus.scmc.tileentity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import com.hypeirochus.scmc.blocks.BlockStarcraftFurnace;
import com.hypeirochus.scmc.enums.EnumMetaItem.ProtossUpgradeType;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * A custom furnace which uses the {@link TileEntitySidedInventory} class
 *
 * @author CJMinecraft
 */
public class TileEntityProtossFurnace extends TileEntitySidedInventory implements ITickable, IProtossMachine {

	private List<BlockPos>	positions	= null;

	private int				burnTime;
	private boolean			burning;
	private int				cookTime;
	private int				totalCookTime;

	/**
	 * Create a new custom furnace
	 */
	public TileEntityProtossFurnace() {
		super(new int[] { 1 }, new int[] { 0 }, new int[] { 0 }, new int[] { 0 }, new int[] { 0 }, new int[] { 0 });
		this.totalCookTime = getCurrentCookTime(null);
	}

	@Override
	protected int calculateSizeOfMainHandler() {
		return 20;
	}

	public int getCurrentCookTime() {
		return this.cookTime;
	}

	public int getTotalCookTime() {
		return this.totalCookTime;
	}

	/**
	 * @return is the furnace burning?
	 */
	private boolean isBurning() {
		return this.burning;
	}

	/**
	 * @return can we smelt the current item?
	 */
	private boolean canSmelt() {
		if (this.handler.getStackInSlot(0) == null) {
			return false;
		} else {
			if (hasPylons()) {
				ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.handler.getStackInSlot(0));
				if (itemstack == null)
					return false;
				if (this.handler.getStackInSlot(1) == null)
					return true;
				if (!this.handler.getStackInSlot(1).isItemEqual(itemstack))
					return false;
				int result = this.handler.getStackInSlot(1).stackSize + itemstack.stackSize;
				return result <= 64 && result <= this.handler.getStackInSlot(1).getMaxStackSize();
			}
			return false;
		}
	}

	@Override
	public boolean hasPylons() {
		positions = new ArrayList<BlockPos>();
		for (int i = 0; i < TileEntityProtossPowerCore.CORE_POSITIONS.size(); i++) {
			BlockPos pos = TileEntityProtossPowerCore.CORE_POSITIONS.get(i);
			if (pos.getDistance(getPos().getX(), getPos().getY(), getPos().getZ()) < 100.0D) {
				positions.add(pos);
			}
		}

		return positions.size() >= getSpeedBonus() / 2 && positions.size() - getSpeedBonus() / 2 >= getEfficiencyBonus() / 2 && positions.size() > 0;
	}

	private void smeltItem() {
		if (canSmelt()) {
			ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.handler.getStackInSlot(0)).copy();
			itemstack.stackSize *= getEfficiencyBonus() + 1;

			if (this.handler.getStackInSlot(1) == null) {
				this.handler.setStackInSlot(1, itemstack);
			} else if (this.handler.getStackInSlot(1).getItem() == itemstack.getItem()) {
				this.handler.getStackInSlot(1).stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
				this.handler.getStackInSlot(1).stackSize = MathHelper.clamp(this.handler.getStackInSlot(1).stackSize, 0, this.handler.getStackInSlot(1).getMaxStackSize());
			}
			--this.handler.getStackInSlot(0).stackSize;

			if (this.handler.getStackInSlot(0).stackSize <= 0) {
				this.handler.setStackInSlot(0, null);
			}
		}
	}

	/**
	 * Get the default cook time (typically what you will change in a custom
	 * furnace)
	 *
	 * @param stack
	 *            The {@link ItemStack} which will be cooked
	 * @return The amount of time it takes to cook the given item
	 */
	public int getCurrentCookTime(@Nullable ItemStack stack) {
		int amount = 200;
		for (int i = 0; i < getSpeedBonus(); i++) {
			amount /= 2;
		}
		for (int i = 0; i < getEfficiencyBonus(); i++) {
			amount *= 1.5;
		}
		if (amount < 1)
			amount = 1;
		return amount;
	}

	@Override
	public int getSpeedBonus() {
		int amount = 0;
		for (int i = 0; i < 8; i++) {
			ItemStack stack = this.handler.getStackInSlot(2 + i);
			if (stack != null) {
				if (stack.getMetadata() == ProtossUpgradeType.SPEED.getID()) {
					amount++;
				}
			}
		}
		return amount;
	}

	@Override
	public int getEfficiencyBonus() {
		int amount = 0;
		for (int i = 0; i < 8; i++) {
			ItemStack stack = this.handler.getStackInSlot(2 + i);
			if (stack != null) {
				if (stack.getMetadata() == ProtossUpgradeType.EFFICIENCY.getID()) {
					amount++;
				}
			}
		}
		return amount;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.cookTime = nbt.getInteger("CookTime");
		this.totalCookTime = nbt.getInteger("CookTimeTotal");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("CookTime", this.cookTime);
		nbt.setInteger("CookTimeTotal", this.totalCookTime);
		return super.writeToNBT(nbt);
	}

	@Override
	public void update() {
		boolean originalIsBurning = isBurning();
		boolean dirty = false;
		if (!this.world.isRemote) {
			if (!isBurning() && canSmelt()) {
				this.burning = true;
				dirty = true;
			}

			if (isBurning() && this.handler.getStackInSlot(0) != null) {
				if (canSmelt()) {
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
			} else if (this.cookTime > 0) {
				this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
			}

			if (isBurning() && !canSmelt()) {
				this.burning = false;
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
