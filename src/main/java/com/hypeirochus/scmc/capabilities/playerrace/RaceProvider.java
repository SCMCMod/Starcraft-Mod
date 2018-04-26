package com.hypeirochus.scmc.capabilities.playerrace;

import com.hypeirochus.scmc.handlers.CapabilityHandler;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class RaceProvider implements ICapabilitySerializable<NBTBase> {

	private IPlayerRace instance = CapabilityHandler.CAPABILITY_PLAYER_RACE.getDefaultInstance();

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == CapabilityHandler.CAPABILITY_PLAYER_RACE;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == CapabilityHandler.CAPABILITY_PLAYER_RACE ? CapabilityHandler.CAPABILITY_PLAYER_RACE.<T>cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return CapabilityHandler.CAPABILITY_PLAYER_RACE.getStorage().writeNBT(CapabilityHandler.CAPABILITY_PLAYER_RACE, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		CapabilityHandler.CAPABILITY_PLAYER_RACE.getStorage().readNBT(CapabilityHandler.CAPABILITY_PLAYER_RACE, this.instance, null, nbt);
	}
}