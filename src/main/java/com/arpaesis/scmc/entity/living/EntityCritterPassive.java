package com.arpaesis.scmc.entity.living;

import com.arpaesis.scmc.enums.EnumTypeAttributes;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityCritterPassive extends EntityStarcraftPassive
{

	public EntityCritterPassive(World world)
	{
		super(world);
		setAttributes(EnumTypeAttributes.CRITTER);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity)
	{
		return null;
	}
}