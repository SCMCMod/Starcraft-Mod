package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.vehciles.weapons.VehiclePrimaryWeapon;

import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityWraith extends AbstractSpaceship
{
	
	VehiclePrimaryWeapon wraithPrimary = new VehiclePrimaryWeapon(this, "Burst Laser", 8, 100);

	public EntityWraith(World worldIn) {
		super(worldIn);
		
		this.setCooldown(1);
		this.setCooldownMax(1);
		
		this.setMaxSpeed(10);
	}
	
	@Override
	public SoundEvent getPrimaryFiringSound() {
		return SoundHandler.FX_WRAITH_FIRING;
	}
	
	@Override
	public VehiclePrimaryWeapon getPrimaryWeapon() {
		 return wraithPrimary;
	}
}