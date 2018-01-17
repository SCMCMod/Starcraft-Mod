package ga.scmc.tileentity;

import com.mojang.authlib.GameProfile;

import ga.scmc.api.Utils;
import ga.scmc.blocks.BlockGas;
import ga.scmc.blocks.BlockTerrazineGas;
import ga.scmc.blocks.BlockVespeneGas;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.SoundHandler;
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
import net.minecraftforge.common.capabilities.ICapabilityProvider;

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
		BlockPos newPos = pos.offset(facing, 1); // Gets the block pos in front of the block breaker
		IBlockState state = world.getBlockState(newPos); // Gets the block state
		Block block = state.getBlock(); // Gets the block
		// If the block is not air, is not unbreakable or a liquid it will try and break it
		if (!block.isAir(state, world, newPos) && block.getBlockHardness(state, world, newPos) >= 0 && !(block instanceof BlockDynamicLiquid) && !(block instanceof BlockStaticLiquid) && block instanceof BlockGas) {
			// Creates a fake player which will break the block
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
					block.harvestBlock(world, player, newPos, state, this, null);

					if (block instanceof BlockVespeneGas)
						Utils.addStackToInventory(this.handler, 9, new ItemStack(ItemHandler.VESPENE, 1, type + 1), false);
					if (block instanceof BlockTerrazineGas)
						Utils.addStackToInventory(this.handler, 9, new ItemStack(ItemHandler.TERRAZINE, 1, type + 1), false);

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

	public int getType() {
		return type;
	}
}