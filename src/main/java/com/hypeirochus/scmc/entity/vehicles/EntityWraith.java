package com.hypeirochus.scmc.entity.vehicles;

import com.hypeirochus.scmc.entity.IEnergyEntity;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.vehicles.weapons.VehicleWeapon;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityWraith extends AbstractSpaceship implements IEnergyEntity
{	

	private static final DataParameter<Float> ENERGY = EntityDataManager.createKey(EntityWraith.class, DataSerializers.FLOAT);
	private static final DataParameter<Boolean> CLOAK_STATE = EntityDataManager.<Boolean>createKey(EntityWraith.class, DataSerializers.BOOLEAN);
	
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
		this.dataManager.register(CLOAK_STATE, Boolean.valueOf(false));
		super.entityInit();
	}
	
	public float getEnergy() {
		return this.getDataManager().get(ENERGY);
	}

	protected void setEnergy(float energy) {
		this.getDataManager().set(ENERGY, energy);
	}
	
	public void setCloakState(boolean state) {
		this.dataManager.set(CLOAK_STATE, state);
	}
	
	public boolean getCloakState() {
		return this.dataManager.get(CLOAK_STATE);
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);

		nbt.setFloat("Energy", this.getEnergy());
		nbt.setBoolean("Cloak", this.getCloakState());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.setEnergy(nbt.getFloat("Energy"));
		this.setCloakState(nbt.getBoolean("Cloak"));
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
			
				if(this.getCloakState() == false) {
					if(this.ticksExisted % 20 == 0) {
						this.setEnergy(this.getEnergy() + 0.5625F);
						if(this.getEnergy() > this.getMaxEnergy()) {
							this.setEnergy(this.getMaxEnergy());
						}
					}
				}else {
					if(this.ticksExisted % 20 == 0) {
						this.setEnergy(this.getEnergy() - 0.9F);
						if(this.getEnergy() < 0) {
							this.setEnergy(0);
						}
					}
				}
			}
			if(this.getEnergy() == 0 && this.getCloakState() == true) {
				this.setCloakState(false);
			}
		}
		super.onEntityUpdate();
	}
	
	@Override
	public void useAbility(int index) {
		if(index == 0) {
			setCloakState(!getCloakState());
			if(this.getCloakState() == true && this.getEnergy() > 25.0F) {
				this.setEnergy(this.getEnergy() - 25.0F);
			}else {
				this.setCloakState(false);
			}
		}
	}
}