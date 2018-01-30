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
public class TileEntityZerusGlowPod extends TileEntity implements ITickable {

	private float pulsingProgress;
	private float pulsingSpeed;

	public TileEntityZerusGlowPod() {
		pulsingProgress = 1;
		pulsingSpeed = 0.005f;
	}

	@Override
	public void update() {
		pulsingProgress += pulsingSpeed;

		if (pulsingProgress >= 1.1f || pulsingProgress < 1) {
			pulsingSpeed *= -1;
		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setFloat("pulsingProgress", this.pulsingProgress);
		nbt.setBoolean("direction", this.pulsingSpeed < 0);
		return nbt;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.pulsingProgress = nbt.getFloat("pulsingProgress");
		this.pulsingSpeed = nbt.getBoolean("direction") ? -0.005f : 0.005f;
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

	public float getPulsingProgress() {
		return pulsingProgress;
	}
}