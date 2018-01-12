package ga.scmc.tileentity;

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

/**
 * @author Ocelot5836
 */
public class TileEntityKaldirBrambles extends TileEntity implements ITickable {

	private int age;

	public TileEntityKaldirBrambles() {
		age = 0;
	}

	@Override
	public void update() {
		age++;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("age", this.age);
		return nbt;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.age = nbt.getInteger("age");
	}

	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		NBTTagCompound nbt = pkt.getNbtCompound();
		readFromNBT(nbt);
	}

	@Nullable
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound nbt = new NBTTagCompound();
		writeToNBT(nbt);
		return new SPacketUpdateTileEntity(this.pos, 1, nbt);
	}

	public NBTTagCompound getUpdateTag() {
		NBTTagCompound nbt = super.getUpdateTag();
		writeToNBT(nbt);
		return nbt;
	}

	public int getAge() {
		return age;
	}
}