package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityScout extends AbstractSpaceship
{

	public EntityScout(World worldIn) {
		super(worldIn);

		this.setBaseVelocity(6);
		this.setBoostModifier(2);
		
		this.setCooldown(4);
		this.setCooldownMax(4);
	}
	
	@Override
	public SoundEvent getPrimaryFiringSound() {
		return SoundHandler.FX_SCOUT_FIRING;
	}
    
}