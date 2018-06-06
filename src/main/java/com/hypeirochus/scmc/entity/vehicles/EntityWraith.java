package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.util.SoundEvent;
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
	
	@Override
	public SoundEvent getPrimaryFiringSound() {
		return SoundHandler.FX_WRAITH_FIRING;
	}
}