package com.arpaesis.scmc.items;

import com.arpaesis.scmc.damagesource.SCDamageSourceManager;
import com.ocelot.api.utils.WorldUtils;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public abstract class ItemGun extends SCItem
{

	private float damage;
	private float range;

	public ItemGun(float damage, float range)
	{
		this.damage = damage;
		this.range = range;
	}

	public ItemGun(String name, float damage, float range)
	{
		super(name);
		this.damage = damage;
		this.range = range;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		ItemStack heldItem = player.getHeldItem(hand);
		RayTraceResult ray = WorldUtils.getRay(this.getGunRange(heldItem));
		Entity entity = ray.entityHit;
		BlockPos hitBlock = ray.getBlockPos();

		if (!player.isCreative())
		{
			if (this.hasAmmo(world, player, heldItem))
			{
				this.onFire(world, player, heldItem);
				if (!world.isRemote)
				{
					this.takeAmmo(world, player, heldItem);
				}

				if (entity != null)
				{
					EntityLivingBase hitEntity = (EntityLivingBase) player.getEntityWorld().getEntityByID(entity.getEntityId());
					this.damageEntity(world, player, hitEntity, heldItem);
					this.hitEntity(world, player, hitEntity, heldItem);
				} else if (hitBlock != null)
				{
					this.hitBlock(world, player, ray.getBlockPos(), ray.sideHit, heldItem);
				}
			}
		} else
		{
			this.onFire(world, player, heldItem);

			if (entity != null)
			{
				EntityLivingBase hitEntity = (EntityLivingBase) player.getEntityWorld().getEntityByID(entity.getEntityId());
				this.damageEntity(world, player, hitEntity, heldItem);
				this.hitEntity(world, player, hitEntity, heldItem);
			} else if (hitBlock != null)
			{
				this.hitBlock(world, player, ray.getBlockPos(), ray.sideHit, heldItem);
			}
		}
		return super.onItemRightClick(world, player, hand);
	}

	private void damageEntity(World world, EntityLivingBase entity, Entity hitEntity, ItemStack heldItem)
	{
		if (!world.isRemote)
		{
			if (hitEntity != null)
			{
				hitEntity.attackEntityFrom(SCDamageSourceManager.causeBulletDamage(entity), this.getGunDamage(heldItem));
				hitEntity.hurtResistantTime = 0;
			}
		}
	}

	/**
	 * Called each time the gun shoots a bullet.
	 * 
	 * @param world The world instance
	 * @param entity The entity that shot the bullet
	 * @param heldItem The item in the entity's hand
	 */
	public void onFire(World world, EntityLivingBase entity, ItemStack heldItem)
	{
	}

	/**
	 * Called when an entity is hit with a bullet.
	 * 
	 * @param world The world instance
	 * @param entity The entity that shot the bullet
	 * @param hitEntity The entity that was hit with the bullet
	 * @param heldItem The item in the entity's hand
	 */
	public void hitEntity(World world, EntityLivingBase entity, Entity hitEntity, ItemStack heldItem)
	{
	}

	/**
	 * Called when a block is hit with a bullet.
	 * 
	 * @param world The world instance
	 * @param entity The entity that shot the bullet
	 * @param pos The position of the hit block
	 * @param facing The side the block was hit on
	 * @param heldItem The item in the entity's hand
	 */
	public void hitBlock(World world, EntityLivingBase entity, BlockPos pos, EnumFacing facing, ItemStack heldItem)
	{
	}

	/**
	 * @param stack The current held item
	 * @return The damage of the gun
	 */
	public float getGunDamage(ItemStack stack)
	{
		return damage;
	}

	/**
	 * @param stack The current held item
	 * @return The range of the gun
	 */
	public float getGunRange(ItemStack stack)
	{
		return range;
	}

	/**
	 * Checks if the player attempting to fire the gun has the required ammo.
	 * 
	 * @param world The world instance
	 * @param player The player that is trying to fire the gun
	 * @param stack The item in the player's hand
	 * @return Whether or not the player has the required ammo to shoot the gun
	 */
	public abstract boolean hasAmmo(World world, EntityPlayer player, ItemStack stack);

	/**
	 * Takes the ammo out of the player's inventory when the gun is fired and the
	 * player is not in creative mode.
	 * 
	 * @param world The world instance
	 * @param player The player that is trying to fire the gun
	 * @param stack The item in the player's hand
	 */
	public abstract void takeAmmo(World world, EntityPlayer player, ItemStack stack);

}