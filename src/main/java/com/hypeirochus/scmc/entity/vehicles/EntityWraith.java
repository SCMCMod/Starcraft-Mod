package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.entity.IEnergyEntity;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.vehciles.weapons.VehicleWeapon;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityWraith extends AbstractSpaceship implements IEnergyEntity
{	

	private static final DataParameter<Float> ENERGY = EntityDataManager.createKey(EntityWraith.class, DataSerializers.FLOAT);
	
	VehicleWeapon wraithPrimary = new VehicleWeapon(this, "Burst Laser", 8, 200);
	VehicleWeapon wraithSecondary = new VehicleWeapon(this, "Missiles", 8, 200);

	public EntityWraith(World worldIn) {
		super(worldIn);

		this.setCooldownMax(34);
		this.setMaxSpeed(9);
	}
	
	@Override
	protected void entityInit() {
		//TODO: Figure out why this entity does not start with 50.0F energy, but always at 0.
		this.getDataManager().register(ENERGY, this.getStartingEnergy());
		
		super.entityInit();
	}
	
	public float getEnergy() {
		return this.getDataManager().get(ENERGY);
	}

	protected void setEnergy(float energy) {
		this.getDataManager().set(ENERGY, energy);
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);

		nbt.setFloat("Energy", this.getEnergy());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.setEnergy(nbt.getFloat("Energy"));
	}
	
	@Override
	public float getStartingEnergy() {
		return 50.0F;
	}

	@Override
	public float getMaxEnergy() {
		return 200.0F;
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
					
				}
				
				if(this.getEnergy() > this.getMaxEnergy()) {
					this.setEnergy(this.getMaxEnergy());
				}
			}
		}
		super.onEntityUpdate();
	}
}