package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.vehciles.weapons.VehicleWeapon;

import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityWraith extends AbstractSpaceship
{
	
	VehicleWeapon wraithPrimary = new VehicleWeapon(this, "Burst Laser", 8, 200);

	public EntityWraith(World worldIn) {
		super(worldIn);

		this.setCooldownMax(34);
		this.setMaxSpeed(9);
	}
	
	@Override
	public SoundEvent getPrimaryFiringSound() {
		return SoundHandler.FX_WRAITH_FIRING;
	}
	
	@Override
	public VehicleWeapon getPrimaryWeapon() {
		 return wraithPrimary;
	}
}