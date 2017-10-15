package ga.scmc.tileentity;

import com.mojang.authlib.GameProfile;

import ga.scmc.blocks.BlockGas;
import ga.scmc.blocks.BlockTerrazineGas;
import ga.scmc.blocks.BlockVespeneGas;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.lib.BaseUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

/**
 * @author Ocelot5836
 */
public class TileEntityGasCollector extends TileEntity implements ITickable, ICapabilityProvider {

	private ItemStackHandler items;
	private int type;

	public TileEntityGasCollector() {
		if (this.items == null)
			this.items = new ItemStackHandler(10);

		this.type = -1;
	}

	public TileEntityGasCollector(int type) {
		if (this.items == null)
			this.items = new ItemStackHandler(10);

		this.type = type;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setTag("ItemStackHandler", items.serializeNBT());
		nbt.setInteger("type", type);
		return super.writeToNBT(nbt);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		this.items.deserializeNBT(nbt.getCompoundTag("ItemStackHandler"));
		this.type = nbt.getInteger("type");
		super.readFromNBT(nbt);
	}

	@Override
	public void update() {
		if (world != null && !world.isRemote) {
			if (!world.isAirBlock(pos) && world.getBlockState(pos).getBlock() == MetaBlockHandler.GAS_COLLECTOR) { // The block is not air and it is a block breaker
				if (this != null)
					breakBlock(EnumFacing.DOWN);
			}

			if (BaseUtils.checkSurroundingBlocks(world, Blocks.UNPOWERED_COMPARATOR.getDefaultState()) && BaseUtils.checkSurroundingBlocks(world, Blocks.POWERED_COMPARATOR.getDefaultState())) {
				this.markDirty();
			}
		}
	}

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
			if (this.items.getStackInSlot(9) != null) {
				if (this.items.getStackInSlot(9).stackSize >= 4) {
					block.harvestBlock(world, player, newPos, state, this, null);

					if (block instanceof BlockVespeneGas)
						BaseUtils.addStackToInventory(this.items, 9, new ItemStack(ItemHandler.VESPENE, 1, type + 1), false);
					if (block instanceof BlockTerrazineGas)
						BaseUtils.addStackToInventory(this.items, 9, new ItemStack(ItemHandler.TERRAZINE, 1, type + 1), false);

					if (!BaseUtils.isInventoryFull(this.items, 9)) {
						world.playEvent(2001, newPos, Block.getStateId(state));
						if (getType() == 0)
							world.playSound(null, pos, SoundHandler.BLOCK_GAS_COLLECTOR_PROTOSS, SoundCategory.BLOCKS, 1, 1);
						if (getType() == 1)
							world.playSound(null, pos, SoundHandler.BLOCK_GAS_COLLECTOR_TERRAN, SoundCategory.BLOCKS, 1, 1);
						if (getType() == 2)
							world.playSound(null, pos, SoundHandler.BLOCK_GAS_COLLECTOR_ZERG, SoundCategory.BLOCKS, 1, 1);
						world.setBlockToAir(newPos);
						this.items.extractItem(9, 4, false);
					}
				}
			}
		}
	}

	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		int metadata = getBlockMetadata();
		return new SPacketUpdateTileEntity(this.pos, metadata, nbt);
	}

	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.getNbtCompound());
	}

	@Override
	public NBTTagCompound getUpdateTag() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return nbt;
	}

	@Override
	public void handleUpdateTag(NBTTagCompound tag) {
		this.readFromNBT(tag);
	}

	@Override
	public NBTTagCompound getTileData() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return nbt;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return (T) this.items;
		return super.getCapability(capability, facing);
	}

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return true;
		return super.hasCapability(capability, facing);
	}

	public int getType() {
		return type;
	}
}