package com.hypeirochus.scmc.tileentity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

/**
 * @author Ocelot5836
 */
public class TileEntityEntitySpawner extends TileEntity implements ITickable
{

	private int range;
	private Entity entityToSpawn;
	private TextFormatting textColor;

	public TileEntityEntitySpawner()
	{
		this(0, null, TextFormatting.WHITE);
	}

	public TileEntityEntitySpawner(int range, Entity entityToSpawn, TextFormatting textColor)
	{
		this.range = range;
		this.entityToSpawn = entityToSpawn;
		this.textColor = textColor;
	}

	@Override
	public void update()
	{
		if (world != null && !world.isRemote)
		{
			EntityPlayer player = world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), range, false);
			if (player != null && entityToSpawn != null)
			{
				entityToSpawn.setPosition(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
				world.spawnEntity(entityToSpawn);
				world.setBlockToAir(pos);

				for (int i = 0; i < world.playerEntities.size(); i++)
				{
					world.playerEntities.get(i).sendMessage(new TextComponentString(textColor + entityToSpawn.getName() + " has spawned!"));
				}
			}
		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setInteger("range", this.range);
		if (this.entityToSpawn != null)
			nbt.setInteger("entityToSpawn", this.entityToSpawn.getEntityId());
		nbt.setInteger("textColor", this.textColor.getColorIndex());
		return nbt;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		this.range = nbt.getInteger("range");
		if (nbt.hasKey("entityToSpawn"))
			this.entityToSpawn = world.getEntityByID(nbt.getInteger("entityToSpawn"));
		this.textColor = TextFormatting.fromColorIndex(nbt.getInteger("textColor"));
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