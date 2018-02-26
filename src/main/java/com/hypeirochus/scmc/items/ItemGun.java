package com.hypeirochus.scmc.items;

import com.ocelot.api.utils.WorldUtils;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public abstract class ItemGun extends StarcraftItem {

	private float damage;
	private float range;

	public ItemGun(float damage, float range) {
		this("", damage, range);
	}

	public ItemGun(String name, float damage, float range) {
		super(name);
		this.damage = damage;
		this.range = range;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack heldItem = player.getHeldItem(hand);
		RayTraceResult ray = WorldUtils.getRay(this.getGunRange(heldItem));
		Entity entity = ray.entityHit;
		BlockPos hitBlock = ray.getBlockPos();

		if (!player.isCreative()) {
			if (this.hasAmmo(world, player, heldItem)) {
				this.onFire(world, player, heldItem);
				if (!world.isRemote) {
					this.takeAmmo(world, player, heldItem);
				}

				if (entity != null) {
					EntityLivingBase hitEntity = (EntityLivingBase) player.getEntityWorld().getEntityByID(entity.getEntityId());
					this.damageEntity(world, player, hitEntity, heldItem);
					this.hitEntity(world, player, hitEntity, heldItem);
				} else if (hitBlock != null) {
					this.hitBlock(world, player, ray.getBlockPos(), ray.sideHit, heldItem);
				}
			}
		} else {
			this.onFire(world, player, heldItem);

			if (entity != null) {
				EntityLivingBase hitEntity = (EntityLivingBase) player.getEntityWorld().getEntityByID(entity.getEntityId());
				this.damageEntity(world, player, hitEntity, heldItem);
				this.hitEntity(world, player, hitEntity, heldItem);
			} else if (hitBlock != null) {
				this.hitBlock(world, player, ray.getBlockPos(), ray.sideHit, heldItem);
			}
		}
		return super.onItemRightClick(world, player, hand);
	}

	public void onItemRightClick(World world, EntityLivingBase livingEntity, EntityEquipmentSlot slot) {
		ItemStack heldItem = livingEntity.getItemStackFromSlot(slot);
		RayTraceResult ray = WorldUtils.getRay(this.getGunRange(heldItem));
		Entity entity = ray.entityHit;
		BlockPos hitBlock = ray.getBlockPos();

		if (!(livingEntity instanceof EntityPlayer) || (livingEntity instanceof EntityPlayer && this.hasAmmo(world, (EntityPlayer) livingEntity, heldItem))) {
			this.onFire(world, livingEntity, heldItem);
			if (!world.isRemote && livingEntity instanceof EntityPlayer) {
				this.takeAmmo(world, (EntityPlayer) livingEntity, heldItem);
			}

			if (entity != null) {
				EntityLivingBase hitEntity = (EntityLivingBase) entity.getEntityWorld().getEntityByID(entity.getEntityId());
				this.damageEntity(world, livingEntity, hitEntity, heldItem);
				this.hitEntity(world, livingEntity, hitEntity, heldItem);
			} else if (hitBlock != null) {
				this.hitBlock(world, livingEntity, ray.getBlockPos(), ray.sideHit, heldItem);
			}
		}
	}

	private void damageEntity(World world, EntityLivingBase entity, Entity hitEntity, ItemStack heldItem) {
		if (!world.isRemote) {
			if (hitEntity != null) {
				hitEntity.attackEntityFrom(DamageSource.causeMobDamage(entity), this.getGunDamage(heldItem));
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

	public float getGunDamage(ItemStack stack) {
		return damage;
	}

	public float getGunRange(ItemStack stack) {
		return range;
	}

	public abstract boolean hasAmmo(World world, EntityPlayer player, ItemStack stack);

	public abstract void takeAmmo(World world, EntityPlayer player, ItemStack stack);

}