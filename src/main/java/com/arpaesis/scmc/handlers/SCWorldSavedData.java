package com.arpaesis.scmc.handlers;

import com.arpaesis.scmc.SCConstants;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.world.storage.WorldSavedData;

public class SCWorldSavedData extends WorldSavedData
{
	private static final String DATA_NAME = SCConstants.MODID + "_StarcraftData";

	public SCWorldSavedData()
	{
		super(DATA_NAME);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{

	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		return null;
	}

	public static SCWorldSavedData get(World world)
	{
		MapStorage storage = world.getPerWorldStorage();
		SCWorldSavedData instance = (SCWorldSavedData) storage.getOrLoadData(SCWorldSavedData.class, DATA_NAME);

		if (instance == null)
		{
			instance = new SCWorldSavedData();
			storage.setData(DATA_NAME, instance);
		}
		return instance;
	}

}
