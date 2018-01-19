package ga.scmc.tileentity;

import com.mojang.authlib.GameProfile;

import ga.scmc.api.Utils;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.recipes.gascollector.GasCollectorRecipes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;

/**
 * @author Ocelot5836
 */
public class TileEntityGasCollector extends TileEntitySidedInventory implements ITickable {

	private int type;

	public TileEntityGasCollector() {
		this(-1);
	}

	public TileEntityGasCollector(int type) {
		super(new int[1], new int[1], new int[] { 9 }, new int[] { 9 }, new int[] { 9 }, new int[] { 9 });
		this.type = type;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("type", type);
		return super.writeToNBT(nbt);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		this.type = nbt.getInteger("type");
		super.readFromNBT(nbt);
	}

	@Override
	public void update() {
		if (world != null && !world.isRemote) {
			if (!world.isAirBlock(pos) && world.getBlockState(pos).getBlock() == MetaBlockHandler.GAS_COLLECTOR) { // The block is not air and it is a gas collector
				if (this != null)
					breakBlock(EnumFacing.DOWN);
			}

			if (Utils.checkSurroundingBlocks(world, Blocks.UNPOWERED_COMPARATOR.getDefaultState()) && Utils.checkSurroundingBlocks(world, Blocks.POWERED_COMPARATOR.getDefaultState())) {
				this.markDirty();
			}
		}
	}

	/**
	 * This is a modified version of the Block Breaker's break method.
	 * 
	 * @param facing
	 *            The direction to break the block
	 * 
	 * @author CJMinecraft
	 */
	public void breakBlock(EnumFacing facing) {
		BlockPos newPos = pos.offset(facing, 1);
		IBlockState state = world.getBlockState(newPos);
		Block block = state.getBlock();
		if (!block.isAir(state, world, newPos) && block.getBlockHardness(state, world, newPos) >= 0 && !(block instanceof BlockDynamicLiquid) && !(block instanceof BlockStaticLiquid)) {
			EntityPlayer player = new EntityPlayer(world, new GameProfile(null, "GasCollector")) {
				@Override
				public boolean isSpectator() {
					return true;
				}

				@Override
				public boolean isCreative() {
					return false;
				}
			};
			if (this.handler.getStackInSlot(9) != null) {
				if (this.handler.getStackInSlot(9).stackSize >= 4) {
					if (canBreak(block, getType())) {
						ItemStack stack = null;

						if (getType() == 0) {
							stack = GasCollectorRecipes.instance().getProtossResult(block).copy();
						}
						if (getType() == 1) {
							stack = GasCollectorRecipes.instance().getTerranResult(block).copy();
						}
						if (getType() == 2) {
							stack = GasCollectorRecipes.instance().getZergResult(block).copy();
						}

						if (stack != null) {
							block.breakBlock(world, newPos, state);
							Utils.addStackToInventory(handler, 9, stack, false);
							if (!Utils.isInventoryFull(this.handler, 9)) {
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

	public boolean canBreak(Block block, int type) {
		ItemStack stack = null;
		if (getType() == 0)
			stack = GasCollectorRecipes.instance().getProtossResult(block);
		if (getType() == 1)
			stack = GasCollectorRecipes.instance().getTerranResult(block);
		if (getType() == 2)
			stack = GasCollectorRecipes.instance().getZergResult(block);
		return stack != null;
	}

	public int getType() {
		return type;
	}
}