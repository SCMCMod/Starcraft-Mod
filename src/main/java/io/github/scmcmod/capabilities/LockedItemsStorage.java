package io.github.scmcmod.capabilities;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class LockedItemsStorage implements Capability.IStorage<ILockedItems>
{

	@Nullable
	@Override
	public NBTBase writeNBT(Capability<ILockedItems> capability, ILockedItems iLockedItems, EnumFacing enumFacing)
	{
		NBTTagList nbt = new NBTTagList();
		iLockedItems.getLockedItems().forEach(lockedItem -> nbt.appendTag(lockedItem.serializeNBT()));
		return nbt;
	}

	@Override
	public void readNBT(Capability<ILockedItems> capability, ILockedItems iLockedItems, EnumFacing enumFacing, NBTBase nbtBase)
	{
		NBTTagList nbt = (NBTTagList) nbtBase;
		nbt.forEach(tag ->
		{
			iLockedItems.lockItem(new ItemStack((NBTTagCompound) tag));
		});
	}
}
