package ga.scmc.tileentity;

import ga.scmc.handlers.TeleporterHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

/**
 * @author Hypeirochus
 */
public class TileEntityPlanetTeleporter extends TileEntity implements ITickable {

	private int range = 50;
	private int dim = 0;

	public TileEntityPlanetTeleporter(int dim, int range) {
		this.range = range;
		this.dim = dim;
	}

	public TileEntityPlanetTeleporter() {
		this(0, 0);
	}

	@Override
	public void update() {
		if (world != null && !world.isRemote) {
			EntityPlayerMP player = (EntityPlayerMP) world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), range, false);
			if (player != null) {
				player.getServer().getPlayerList().transferPlayerToDimension(player, dim, new TeleporterHandler(player.mcServer.worldServerForDimension(dim), player.posX, player.posY, player.posZ, false));
			}
		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("range", this.range);
		nbt.setInteger("dim", this.dim);
		return nbt;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.range = nbt.getInteger("range");
		this.dim = nbt.getInteger("dim");
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
}