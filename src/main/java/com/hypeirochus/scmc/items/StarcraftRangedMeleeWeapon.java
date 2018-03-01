package com.hypeirochus.scmc.items;

import com.ocelot.api.utils.WorldUtils;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public abstract class StarcraftRangedMeleeWeapon extends StarcraftSword {

	private float damage;
	private float range;

	public StarcraftRangedMeleeWeapon(String name, ToolMaterial material, float damage, float range) {
		super(name, material);
		this.damage = damage;
		this.range = range;
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		EntityPlayer player = (EntityPlayer)entityLiving;
		ItemStack heldItem = stack;
		RayTraceResult ray = WorldUtils.getRay(this.getMeleeRange(heldItem));
		Entity entity = ray.entityHit;
		BlockPos hitBlock = ray.getBlockPos();

		this.onFire(player.getEntityWorld(), player, heldItem);

		if (entity != null) {
			EntityLivingBase hitEntity = (EntityLivingBase) player.getEntityWorld().getEntityByID(entity.getEntityId());
			this.damageEntity(player.getEntityWorld(), player, hitEntity, heldItem);
			this.hitEntity(player.getEntityWorld(), player, hitEntity, heldItem);
		} else if (hitBlock != null) {
			this.hitBlock(player.getEntityWorld(), player, ray.getBlockPos(), ray.sideHit, heldItem);
		}
		return super.onEntitySwing(entityLiving, stack);
	}

	private void damageEntity(World world, EntityLivingBase entity, Entity hitEntity, ItemStack heldItem) {
		if (!world.isRemote) {
			if (hitEntity != null) {
				hitEntity.attackEntityFrom(DamageSource.causeMobDamage(entity), this.getWeaponDamage(heldItem));
				hitEntity.hurtResistantTime = 0;
			}
		}
	}

	public void onFire(World world, EntityLivingBase entity, ItemStack heldItem) {

	}

	public void hitEntity(World world, EntityLivingBase entity, Entity hitEntity, ItemStack heldItem) {

	}

	public void hitBlock(World world, EntityLivingBase entity, BlockPos pos, EnumFacing facing, ItemStack heldItem) {

	}

	public float getWeaponDamage(ItemStack stack) {
		return damage;
	}

	public float getMeleeRange(ItemStack stack) {
		return range;
	}
}