package com.hypeirochus.scmc.entity.living;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityTerranPassive extends EntityStarcraftPassive
{

	public EntityTerranPassive(World world)
	{
		super(world);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable)
	{
		return null;
	}

	@Override
	public boolean getCanSpawnHere()
	{
		return true;
	}
}