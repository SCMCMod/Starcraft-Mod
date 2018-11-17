package com.arpaesis.scmc.tileentity;

import javax.annotation.Nullable;

import net.minecraft.block.BlockSkull;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityStarcraftSkull extends TileEntity
{

	private int skullType;
	private int skullRotation;

	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		writeUpdateTag(nbt);
		return super.writeToNBT(nbt);
	}

	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		readUpdateTag(nbt);
	}

	public void setType(int type)
	{
		this.skullType = type;
		updateTileEntity();
	}

	public int getSkullType()
	{
		return this.skullType;
	}

	@SideOnly(Side.CLIENT)
	public int getSkullRotation()
	{
		return this.skullRotation;
	}

	public void setSkullRotation(int rotation)
	{
		this.skullRotation = rotation;
		updateTileEntity();
	}

	public void mirror(Mirror mirror)
	{
		if (this.world != null && this.world.getBlockState(this.getPos()).getValue(BlockSkull.FACING) == EnumFacing.UP)
		{
			this.skullRotation = mirror.mirrorRotation(this.skullRotation, 16);
		}
	}

	public void rotate(Rotation rotation)
	{
		if (this.world != null && this.world.getBlockState(this.getPos()).getValue(BlockSkull.FACING) == EnumFacing.UP)
		{
			this.skullRotation = rotation.rotate(this.skullRotation, 16);
		}
	}

	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt)
	{
		NBTTagCompound nbt = pkt.getNbtCompound();
		readUpdateTag(nbt);
	}

	@Nullable
	public SPacketUpdateTileEntity getUpdatePacket()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		writeUpdateTag(nbt);
		return new SPacketUpdateTileEntity(this.pos, getBlockMetadata(), nbt);
	}

	public NBTTagCompound getUpdateTag()
	{
		NBTTagCompound nbt = super.getUpdateTag();
		writeUpdateTag(nbt);
		return nbt;
	}

	public void writeUpdateTag(NBTTagCompound nbt)
	{
		nbt.setByte("SkullType", (byte) (this.skullType & 255));
		nbt.setByte("Rot", (byte) (this.skullRotation & 255));
	}

	public void readUpdateTag(NBTTagCompound nbt)
	{
		this.skullType = nbt.getByte("SkullType");
		this.skullRotation = nbt.getByte("Rot");
	}

	private void updateTileEntity()
	{
		markDirty();
		IBlockState state = world.getBlockState(pos);
		world.notifyBlockUpdate(pos, state, state, 3);
	}
}