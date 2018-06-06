package com.hypeirochus.scmc.entity.vehicles;

import net.minecraft.world.World;

public class EntityWraith extends AbstractSpaceship
{

	public EntityWraith(World worldIn) {
		super(worldIn);
		
		this.setBaseVelocity(10);
		this.setBoostModifier(2);
		
		this.setCooldown(1);
		this.setCooldownMax(1);
	}
}