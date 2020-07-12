package io.github.scmcmod.handlers;

import io.github.scmcmod.capabilities.playerrace.IPlayerRace;
import io.github.scmcmod.capabilities.playerrace.PlayerRace;
import io.github.scmcmod.capabilities.playerrace.IPlayerRace.Race;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * The new way to handle and store capabilities.
 * 
 * @author Ocelot5836
 */
public class CapabilityHandler
{

	@CapabilityInject(IPlayerRace.class)
	public static Capability<IPlayerRace> CAPABILITY_PLAYER_RACE;

	public static void init(FMLInitializationEvent event)
	{
		CapabilityManager.INSTANCE.register(IPlayerRace.class, new CapabilityPlayerRace(), PlayerRace::new);
	}

	public static class CapabilityPlayerRace implements IStorage<IPlayerRace>
	{
		@Override
		public NBTBase writeNBT(Capability<IPlayerRace> capability, IPlayerRace instance, EnumFacing side)
		{
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger("race", instance.getRace().ordinal());
			return nbt;
		}

		@Override
		public void readNBT(Capability<IPlayerRace> capability, IPlayerRace instance, EnumFacing side, NBTBase nbtBase)
		{
			if (nbtBase instanceof NBTTagCompound)
			{
				NBTTagCompound nbt = (NBTTagCompound) nbtBase;
				if (nbt.hasKey("race"))
				{
					int id = nbt.getInteger("race");
					if (id < Race.values().length)
					{
						instance.setRace(Race.values()[id]);
					}
				}
			}
		}
	}
}