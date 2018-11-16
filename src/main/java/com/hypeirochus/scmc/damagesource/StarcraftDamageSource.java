package com.hypeirochus.scmc.damagesource;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Allows the easy usage of damage sources.
 * 
 * @author Ocelot5836
 */
public class StarcraftDamageSource extends DamageSource
{

	private String deathType;

	public StarcraftDamageSource(String damageType)
	{
		this(damageType, "attack");
	}

	public StarcraftDamageSource(String damageType, String deathType)
	{
		super(damageType);
		this.deathType = deathType;
	}

	@Override
	public ITextComponent getDeathMessage(EntityLivingBase attacker)
	{
		EntityLivingBase entitylivingbase = attacker.getAttackingEntity();
		String defaultMessage = "death." + this.deathType + "." + this.damageType;
		String playerMessage = defaultMessage + ".player";
		return entitylivingbase != null && I18n.hasKey(playerMessage) ? new TextComponentTranslation(playerMessage, new Object[]
		{ attacker.getDisplayName(), entitylivingbase.getDisplayName() }) : new TextComponentTranslation(defaultMessage, new Object[]
		{ attacker.getDisplayName() });
	}
}