package io.github.scmcmod.entity.living;

import io.github.scmcmod.enums.EnumTypeAttributes;
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