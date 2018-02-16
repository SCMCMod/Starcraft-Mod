package com.hypeirochus.scmc.tileentity;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityZerusLightcap extends TileEntity {

	private static Random	random	= new Random();

	private boolean			variant;
	private int				rotation;

	public TileEntityZerusLightcap() {
		variant = random.nextBoolean();
		rotation = random.nextInt(360) + 1;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setBoolean("variant", this.variant);
		nbt.setInteger("rotation", this.rotation);
		return nbt;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.variant = nbt.getBoolean("variant");
		this.rotation = nbt.getInteger("rotation");
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

	public boolean isVariant() {
		return variant;
	}

	public int getRotation() {
		return rotation;
	}
}