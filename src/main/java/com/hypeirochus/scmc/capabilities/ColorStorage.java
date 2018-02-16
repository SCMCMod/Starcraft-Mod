package com.hypeirochus.scmc.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class ColorStorage implements IStorage<IColor>

{

	@Override

	public NBTBase writeNBT(Capability<IColor> capability, IColor instance, EnumFacing side)

	{

		return new NBTTagInt(instance.getColor());

	}

	@Override

	public void readNBT(Capability<IColor> capability, IColor instance, EnumFacing side, NBTBase nbt)

	{

		instance.set(((NBTPrimitive) nbt).getInt());

	}

}