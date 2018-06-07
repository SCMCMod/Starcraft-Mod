package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityScout extends AbstractSpaceship
{

	public EntityScout(World worldIn) {
		super(worldIn);
		
		this.setCooldownMax(34);
		
		this.setMaxSpeed(7);
	}
	
	@Override
	public SoundEvent getPrimaryFiringSound() {
		return SoundHandler.FX_SCOUT_FIRING;
	}
    
}