package io.github.scmcmod.tileentity;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

/**
 * @author Hypeirochus
 */
public class TileEntitySolarCore extends TileEntity implements ITickable
{

	private int range = 50;

	public TileEntitySolarCore(int range)
	{
		this.range = range;
	}

	public TileEntitySolarCore()
	{
		this(0);
	}

	@Override
	public void update()
	{
		if (world != null && !world.isRemote)
		{
			EntityPlayerMP player = (EntityPlayerMP) world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), range, false);
			if (player != null)
			{
				player.setFire(2);
			}

		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setInteger("range", this.range);
		return nbt;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		this.range = nbt.getInteger("range");
	}

	@Override
	public SPacketUpdateTileEntity getUpdatePacket()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		int metadata = getBlockMetadata();
		return new SPacketUpdateTileEntity(this.pos, metadata, nbt);
	}

	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt)
	{
		this.readFromNBT(pkt.getNbtCompound());
	}

	@Override
	public NBTTagCompound getUpdateTag()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return nbt;
	}

	@Override
	public void handleUpdateTag(NBTTagCompound tag)
	{
		this.readFromNBT(tag);
	}

	@Override
	public NBTTagCompound getTileData()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return nbt;
	}
}