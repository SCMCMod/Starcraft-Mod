package com.arpaesis.scmc.damagesource;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Contains the damage sources for the mod.
 */
public class SCDamageSourceManager
{

	public static DamageSource bullet = new SCDamageSource("bullet");
	public static DamageSource hydraNeedle = new SCDamageSource("hydraneedle").setProjectile();
	public static DamageSource mutaGlaive = new SCDamageSource("mutaglaive").setProjectile();
	public static DamageSource acid = new SCDamageSource("acid", "fluid").setDamageBypassesArmor().setFireDamage();
	public static DamageSource poisonFluid = new SCDamageSource("poison", "fluid").setMagicDamage();
	public static DamageSource poison_gas = new SCDamageSource("poison", "gas").setMagicDamage();

	/**
	 * Causes bullet damage to an entity.
	 * 
	 * @param source The source of the damage
	 * @return The damage source that hurt the entity
	 */
	public static DamageSource causeBulletDamage(Entity source)
	{
		return new EntityDamageSource(bullet.getDamageType(), source);
	}

	/**
	 * Causes hydralisk needle damage to an entity.
	 * 
	 * @param source The source of the damage
	 * @param indirectEntityIn The indirect entity that causes the damage
	 * @return The damage source that hurt the entity
	 */
	public static DamageSource causeHydraliskNeedleDamage(Entity source, @Nullable Entity indirectEntity)
	{
		return new EntityDamageSourceIndirect(hydraNeedle.getDamageType(), source, indirectEntity);
	}

	/**
	 * Causes Mutalisk Glaive Worm damage to an entity.
	 * 
	 * @param source The source of the damage
	 * @param indirectEntityIn The indirect entity that causes the damage
	 * @return The damage source that hurt the entity
	 */
	public static DamageSource causeMutaliskGlaiveWormDamage(Entity source, @Nullable Entity indirectEntity)
	{
		return new EntityDamageSourceIndirect(mutaGlaive.getDamageType(), source, indirectEntity);
	}
}