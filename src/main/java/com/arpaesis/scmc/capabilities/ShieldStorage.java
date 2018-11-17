package com.arpaesis.scmc.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class ShieldStorage implements IStorage<IShield>

{

	@Override

	public NBTBase writeNBT(Capability<IShield> capability, IShield instance, EnumFacing side)

	{

		return new NBTTagFloat((float) instance.getShield());

	}

	@Override

	public void readNBT(Capability<IShield> capability, IShield instance, EnumFacing side, NBTBase nbt)

	{

		instance.set(((NBTPrimitive) nbt).getFloat());

	}

}