package com.arpaesis.scmc.capabilities;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class LockedItemsProvider implements ICapabilitySerializable<NBTBase>
{

	@CapabilityInject(ILockedItems.class)
	public static final Capability<ILockedItems> LOCKED_ITEMS = null;

	private ILockedItems instance = LOCKED_ITEMS.getDefaultInstance();

	@Override
	public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing enumFacing)
	{
		return capability == LOCKED_ITEMS;
	}

	@Nullable
	@Override
	public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing enumFacing)
	{
		return capability == LOCKED_ITEMS ? LOCKED_ITEMS.<T>cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT()
	{
		return LOCKED_ITEMS.getStorage().writeNBT(LOCKED_ITEMS, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt)
	{
		LOCKED_ITEMS.getStorage().readNBT(LOCKED_ITEMS, this.instance, null, nbt);
	}
}
