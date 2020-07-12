package com.arpaesis.scmc.tileentity;

import javax.annotation.Nullable;

import com.arpaesis.scmc.blocks.itemblock.ItemBlockBrambles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

/**
 * @author Ocelot5836
 */
public class TileEntityBrambles extends TileEntity implements ITickable
{

	private int age;
	private int variant;

	public TileEntityBrambles()
	{
		this(0);
	}

	public TileEntityBrambles(int variant)
	{
		this.age = 0;
		this.variant = variant;
		markDirty();
	}

	@Override
	public void update()
	{
		age++;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setInteger("age", this.age);
		nbt.setInteger("variant", this.variant);
		return nbt;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		this.age = nbt.getInteger("age");
		this.variant = nbt.getInteger("variant");
	}

	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt)
	{
		NBTTagCompound nbt = pkt.getNbtCompound();
		readFromNBT(nbt);
	}

	@Nullable
	public SPacketUpdateTileEntity getUpdatePacket()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		writeToNBT(nbt);
		return new SPacketUpdateTileEntity(this.pos, 1, nbt);
	}

	public NBTTagCompound getUpdateTag()
	{
		NBTTagCompound nbt = super.getUpdateTag();
		writeToNBT(nbt);
		return nbt;
	}

	public int getAge()
	{
		return age;
	}

	public int getVariant()
	{
		return variant;
	}

	public ItemBlockBrambles.Type getVariantEnum()
	{
		return ItemBlockBrambles.Type.values()[variant & ItemBlockBrambles.Type.values().length - 1];
	}
}