package io.github.scmcmod.items.override;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;


public class LogOverride implements IItemPropertyGetter
{

	@Override
	public float apply(ItemStack stack, World world, EntityLivingBase entity)
	{
		if (stack.hasTagCompound())
		{
			NBTTagCompound nbt = stack.getTagCompound();
			if (nbt.hasKey("skin"))
			{
				return nbt.getInteger("skin");
			}
		}
		return 0;
	}
}