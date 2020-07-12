package io.github.scmcmod.tileentity;

import io.github.scmcmod.api.Utils;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.SoundHandler;
import io.github.scmcmod.init.StarCraftBlocks;
import io.github.scmcmod.recipes.gascollector.GasCollectorRecipes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;

/**
 * @author Ocelot5836
 */
public class TileEntityGasCollector extends TileEntitySidedInventory implements ITickable
{

	private int type;

	public TileEntityGasCollector()
	{
		this(-1);
	}

	public TileEntityGasCollector(int type)
	{
		super(new int[1], new int[1], new int[] { 9 }, new int[] { 9 }, new int[] { 9 }, new int[] { 9 });
		this.type = type;
	}

	@Override
	protected boolean isStackValid(int slot, ItemStack stack)
	{
		if (slot == 9)
		{
			switch (this.type)
			{
			case 0:
				return stack.getItem() == ItemHandler.PROTOSS_INGOT;
			case 1:
				return stack.getItem() == Item.getItemFromBlock(Blocks.PLANKS);
			case 2:
				return stack.getItem() == ItemHandler.ORGANIC_TISSUE;
			}
		}
		return false;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		nbt.setInteger("type", type);
		return super.writeToNBT(nbt);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		this.type = nbt.getInteger("type");
		super.readFromNBT(nbt);
	}

	@Override
	public void update()
	{
		if (!world.isRemote)
		{
			if (!world.isAirBlock(pos) && world.getBlockState(pos).getBlock() == StarCraftBlocks.GAS_COLLECTOR)
			{
				if (this != null)
				{
					this.breakBlock(EnumFacing.DOWN);
				}
			}

			if (Utils.checkSurroundingBlocks(world, Blocks.UNPOWERED_COMPARATOR.getDefaultState()) && Utils.checkSurroundingBlocks(world, Blocks.POWERED_COMPARATOR.getDefaultState()))
			{
				this.markDirty();
			}
		}
	}

	/**
	 * This is a modified version of the Block Breaker's break method.
	 * 
	 * @param facing The direction to break the block
	 * @author CJMinecraft
	 */
	public void breakBlock(EnumFacing facing)
	{
		BlockPos newPos = pos.offset(facing, 1);
		IBlockState state = world.getBlockState(newPos);
		Block block = state.getBlock();
		if (!block.isAir(state, world, newPos) && block.getBlockHardness(state, world, newPos) >= 0 && !(block instanceof BlockDynamicLiquid) && !(block instanceof BlockStaticLiquid))
		{
			if (this.handler.getStackInSlot(9) != null)
			{
				if (this.handler.getStackInSlot(9).getCount() >= 4)
				{
					if (canBreak(block, getType()))
					{
						ItemStack stack = null;

						if (getType() == 0)
						{
							stack = GasCollectorRecipes.instance().getProtossResult(block).copy();
						}
						if (getType() == 1)
						{
							stack = GasCollectorRecipes.instance().getTerranResult(block).copy();
						}
						if (getType() == 2)
						{
							stack = GasCollectorRecipes.instance().getZergResult(block).copy();
						}

						if (stack != null && !stack.isEmpty())
						{
							if (!Utils.isInventoryFull(this.handler, 9))
							{
								block.breakBlock(world, newPos, state);
								Utils.addStackToInventory(handler, 9, stack, false);
								world.playEvent(2001, newPos, Block.getStateId(state));
								if (getType() == 0)
									world.playSound(null, pos, SoundHandler.BLOCK_GAS_COLLECTOR_PROTOSS, SoundCategory.BLOCKS, 1, 1);
								if (getType() == 1)
									world.playSound(null, pos, SoundHandler.BLOCK_GAS_COLLECTOR_TERRAN, SoundCategory.BLOCKS, 1, 1);
								if (getType() == 2)
									world.playSound(null, pos, SoundHandler.BLOCK_GAS_COLLECTOR_ZERG, SoundCategory.BLOCKS, 1, 1);
								world.setBlockToAir(newPos);
								this.handler.extractItem(9, 4, false);
							}
						}
					}
				}
			}
		}
	}

	public boolean canBreak(Block block, int type)
	{
		ItemStack stack = null;
		if (getType() == 0)
			stack = GasCollectorRecipes.instance().getProtossResult(block);
		if (getType() == 1)
			stack = GasCollectorRecipes.instance().getTerranResult(block);
		if (getType() == 2)
			stack = GasCollectorRecipes.instance().getZergResult(block);
		return stack != null;
	}

	public int getType()
	{
		return type;
	}
}
