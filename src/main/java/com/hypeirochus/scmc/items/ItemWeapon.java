package com.hypeirochus.scmc.items;

import com.ocelot.api.utils.WorldUtils;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public abstract class ItemWeapon extends StarcraftItem {

	private float damage;
	private float range;

	public ItemWeapon(float damage, float range) {
		this("", damage, range);
	}

	public ItemWeapon(String name, float damage, float range) {
		super(name);
		this.damage = damage;
		this.range = range;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack heldItem = player.getHeldItem(hand);
		if (!world.isRemote) {
			if (this.hasAmmo(world, player, heldItem)) {
				this.shoot(player);
				// this.takeAmmo(world, player, heldItem);
			}
		}
		return super.onItemRightClick(world, player, hand);
	}

	public void shoot(EntityPlayer shooter) {
		EntityLivingBase hitEntity = getHitEntity(shooter);
		shooter.sendStatusMessage(new TextComponentString(hitEntity == null ? "null" : hitEntity.toString()), true);
		if (hitEntity != null) {
			hitEntity.attackEntityFrom(DamageSource.MAGIC, 2);
		}
	}

	public EntityLivingBase getHitEntity(EntityPlayer player) {
		return WorldUtils.getEntity(range);
	}

	public int getAmmoMetadata() {
		return 0;
	}

	public abstract boolean hasAmmo(World world, EntityPlayer player, ItemStack stack);

	public abstract void takeAmmo(World world, EntityPlayer player, ItemStack stack);

	public abstract Item getAmmo(World world, EntityPlayer player);

}