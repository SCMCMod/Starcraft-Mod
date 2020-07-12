package io.github.scmcmod.api;

import io.github.scmcmod.enums.EnumColors;
import net.minecraft.entity.EntityLiving;

/**
 * An interface used by the
 * {@link com.arpaesis.scmc.client.renderer.RenderUtilities}
 * 
 * @author CJMinecraft
 * @param <T> The entity class
 */
public interface IEntityTeamColorable<T extends EntityLiving>
{

	EnumColors getColor();

	T setColor(EnumColors team);

}
