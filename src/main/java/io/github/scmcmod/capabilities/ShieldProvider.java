package io.github.scmcmod.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class ShieldProvider implements ICapabilitySerializable<NBTBase>
{
	@CapabilityInject(IShield.class)
	public static final Capability<IShield> SHIELD = null;

	private IShield instance = SHIELD.getDefaultInstance();

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing)
	{
		return capability == SHIELD;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing)
	{
		return capability == SHIELD ? SHIELD.<T>cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT()
	{
		return SHIELD.getStorage().writeNBT(SHIELD, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt)
	{
		SHIELD.getStorage().readNBT(SHIELD, this.instance, null, nbt);
	}
}