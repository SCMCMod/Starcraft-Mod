package ga.scmc.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;


public class ColorProvider implements ICapabilitySerializable<NBTBase>

{

	@CapabilityInject(IColor.class)
	public static final Capability<IColor> COLOR = null;

	private IColor instance = COLOR.getDefaultInstance();

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == COLOR;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == COLOR ? COLOR.<T>cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return COLOR.getStorage().writeNBT(COLOR, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		COLOR.getStorage().readNBT(COLOR, this.instance, null, nbt);
	}
}