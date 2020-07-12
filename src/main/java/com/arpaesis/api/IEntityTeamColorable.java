package com.arpaesis.api;

import com.arpaesis.scmc.enums.EnumColors;

import net.minecraft.entity.EntityLiving;

/**
 * An interface used by the
 * {@link com.arpaesis.scmc.client.renderer.SCRenderUtilities}
 * 
 * @author CJMinecraft
 * @param <T> The entity class
 */
public interface IEntityTeamColorable<T extends EntityLiving>
{

	EnumColors getColor();

	T setColor(EnumColors team);

}
