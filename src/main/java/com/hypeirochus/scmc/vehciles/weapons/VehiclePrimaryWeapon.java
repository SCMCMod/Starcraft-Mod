package com.hypeirochus.scmc.vehciles.weapons;

import com.hypeirochus.scmc.damagesource.StarcraftDamageSources;
import com.ocelot.api.utils.WorldUtils;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class VehiclePrimaryWeapon implements IWeaponSystem {

	Entity vehicle;
	private String name;
	private float speed;
	private float damage;
	private int range;
	
	public VehiclePrimaryWeapon(Entity vehicle, String name, float speed, float damage, int range) {
		this.vehicle = vehicle;
		this.name = name;
		this.speed = speed;
		this.damage = damage;
		this.range = range;
	}

	private void damageEntity(World world, Entity entity, EntityLivingBase hitEntity) {
		if (world.isRemote) {
			if (hitEntity != null) {
				System.out.println(entity);
				System.out.println(hitEntity);
				System.out.println(this.damage);
				hitEntity.attackEntityFrom(StarcraftDamageSources.causeBulletDamage(entity), this.getWeaponDamage());
				hitEntity.hurtResistantTime = 0;
			}
		}
	}
	
	public void hitEntity(World world, Entity entity, EntityLivingBase hitEntity) {
	}

	public void hitBlock(World world, Entity vehicle, BlockPos pos, EnumFacing facing) {
	}

	public float getWeaponDamage() {
		return damage;
	}
	
	public float getWeaponRange() {
		return range;
	}
	
	public boolean hasAmmo(World world) {
		return true;
	}

	public void takeAmmo(World world) {
	}

	@Override
	public void fire() {

		RayTraceResult ray = WorldUtils.getRay(this.getWeaponRange());
		Entity entity = ray.entityHit;
		
		BlockPos hitBlock = ray.getBlockPos();

		if (!this.vehicle.world.isRemote) {
			this.takeAmmo(this.vehicle.world);
		}
		
		if (entity != null) {
			EntityLivingBase hitEntity = (EntityLivingBase) this.vehicle.getEntityWorld().getEntityByID(entity.getEntityId());
			
			this.damageEntity(this.vehicle.world, this.vehicle, hitEntity);
			
			this.hitEntity(this.vehicle.world, this.vehicle, hitEntity);
		} 
		else if (hitBlock != null) {
			this.hitBlock(this.vehicle.world, this.vehicle, ray.getBlockPos(), ray.sideHit);
		}
			
	}
}
