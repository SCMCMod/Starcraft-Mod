package com.arpaesis.scmc.capabilities.playerrace;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * The default implementation of {@link IPlayerRace}.
 * 
 * @author Ocelot5836
 */
public class PlayerRace implements IPlayerRace, INBTSerializable<NBTTagCompound>
{

	private Race race;

	/**
	 * Initializes the capability with an undefined race.
	 */
	public PlayerRace()
	{
		this(Race.UNDEFINED);
	}

	/**
	 * Sets the race in the capability.
	 * 
	 * @param race The race
	 */
	public PlayerRace(Race race)
	{
		this.race = race;
	}

	@Override
	public Race getRace()
	{
		return race;
	}

	@Override
	public void setRace(Race race)
	{
		this.race = race;
	}

	@Override
	public NBTTagCompound serializeNBT()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("race", this.race.ordinal());
		return nbt;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt)
	{
		if (nbt.hasKey("race"))
		{
			int id = nbt.getInteger("race");
			if (id < Race.values().length)
			{
				this.race = Race.values()[id];
			}
		}
	}
}