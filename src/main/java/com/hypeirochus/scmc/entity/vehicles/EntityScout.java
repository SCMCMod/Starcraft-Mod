package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.vehicles.weapons.VehicleWeapon;

import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityScout extends AbstractSpaceship
{

	VehicleWeapon scoutPrimary = new VehicleWeapon(this, "Photon Blaster", 8, 200);
	
	public EntityScout(World worldIn) {
		super(worldIn);
		
		this.setCooldownMax(34);
		
		this.setMaxSpeed(7);
	}
	
	@Override
	public SoundEvent getPrimaryFiringSound() {
		return SoundHandler.FX_SCOUT_FIRING;
	}
	
	@Override
	public VehicleWeapon getPrimaryWeapon() {
		return this.scoutPrimary;
	}
    
}