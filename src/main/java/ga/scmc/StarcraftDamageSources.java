package ga.scmc;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class StarcraftDamageSources extends DamageSource {

	public static DamageSource bullet = (new DamageSource("bullet")).setProjectile();
	public static DamageSource hydraNeedle = (new DamageSource("hydraneedle")).setProjectile();
	/** @author Ocelot5836 */
	public static DamageSource acid = (new DamageSource("acid")).setDamageBypassesArmor().setFireDamage();
	/** @author Ocelot5836 */
	public static DamageSource poisonFluid = (new DamageSource("vespene")).setFireDamage();
	/** @author Ocelot5836 */
	public static DamageSource poison_gas = (new DamageSource("vespene"));

	public StarcraftDamageSources(String damageTypeIn) {
		super(damageTypeIn);
	}

	/**
	 * Causes bullet damage to an entity.
	 * 
	 * @param source
	 *            The source of the damage
	 * @return The damage source that hurt the entity
	 */
	public static DamageSource causeBulletDamage(Entity source) {
		return (new EntityDamageSource(bullet.getDamageType(), source)).setProjectile();
	}

	/**
	 * Causes hydralisk needle damage to an entity.
	 * 
	 * @param source
	 *            The source of the damage
	 * @param indirectEntityIn
	 *            The indirect entity that causes the damage
	 * @return The damage source that hurt the entity
	 */
	public static DamageSource causeHydraliskNeedleDamage(Entity source, @Nullable Entity indirectEntityIn) {
		return (new EntityDamageSource(hydraNeedle.getDamageType(), source));
	}
}