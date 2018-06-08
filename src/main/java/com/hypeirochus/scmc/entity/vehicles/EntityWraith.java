package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.entity.IEnergyEntity;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.vehciles.weapons.VehicleWeapon;

import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityWraith extends AbstractSpaceship implements IEnergyEntity
{	

	public static final DataParameter<Float> ENERGY = EntityDataManager.createKey(EntityWraith.class, DataSerializers.FLOAT);
	
	VehicleWeapon wraithPrimary = new VehicleWeapon(this, "Burst Laser", 8, 200);
	VehicleWeapon wraithSecondary = new VehicleWeapon(this, "Missiles", 8, 200);

	public EntityWraith(World worldIn) {
		super(worldIn);

		this.setCooldownMax(34);
		this.setMaxSpeed(9);
	}
	
	@Override
	protected void entityInit() {
		this.dataManager.register(ENERGY, this.getStartingEnergy());
		super.entityInit();
	}
	
	public float getEnergy() {
		return this.getDataManager().get(ENERGY);
	}

	protected void setEnergy(float energy) {
		this.getDataManager().set(ENERGY, energy);
	}
	
	@Override
	public float getStartingEnergy() {
		return 50;
	}

	@Override
	public float getMaxEnergy() {
		return 200;
	}
	
	@Override
	public SoundEvent getPrimaryFiringSound() {
		return SoundHandler.FX_WRAITH_FIRING;
	}
	
	@Override
	public SoundEvent getSecondaryFiringSound() {
		return SoundHandler.FX_WRAITH_MISSILE_LAUNCH;
	}
	
	@Override
	public VehicleWeapon getPrimaryWeapon() {
		 return wraithPrimary;
	}
	
	@Override
	public VehicleWeapon getSecondaryWeapon() {
		 return wraithSecondary;
	}
	
	@Override
	public void onEntityUpdate() {
		if(!this.world.isRemote) {
			if(this.getEnergy() < this.getMaxEnergy()) {
			
				if(this.ticksExisted % 20 == 0) {
					this.setEnergy(this.getEnergy() + 0.5625F);
					System.out.println(this.getEnergy());
				}
				
				if(this.getEnergy() > this.getMaxEnergy()) {
					this.setEnergy(this.getMaxEnergy());
				}
			}
		}
		super.onEntityUpdate();
	}
}