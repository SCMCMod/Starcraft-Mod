package com.hypeirochus.scmc.entity.living;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityZergPassive extends EntityStarcraftPassive {

	private static final DataParameter<Boolean>	BURROW	= EntityDataManager.createKey(EntityZergPassive.class, DataSerializers.BOOLEAN);
	
	public EntityZergPassive(World world) {
		super(world);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}

	@Override
	public boolean getCanSpawnHere() {
		return true;
	}
	
	@Override
	protected void entityInit() {

		this.getDataManager().register(BURROW, false);
		
		super.entityInit();
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);

		nbt.setBoolean("Burrow", this.getBurrowState());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.isBurrowed(nbt.getBoolean("Burrow"));
	}
	
	public boolean getBurrowState() {
		return this.getDataManager().get(BURROW);
	}

	public void isBurrowed(boolean isBurrowed) {
		this.getDataManager().set(BURROW, isBurrowed);
	}
}