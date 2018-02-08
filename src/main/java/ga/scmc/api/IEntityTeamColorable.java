package ga.scmc.api;

import ga.scmc.enums.EnumTeamColors;
import net.minecraft.entity.EntityLiving;

/**
 * An interface used by the
 * {@link ga.scmc.client.renderer.entity.layers.ColoredLayerRender}
 * 
 * @author CJMinecraft
 * @param <T>
 *            The entity class
 */
public interface IEntityTeamColorable<T extends EntityLiving> {

	EnumTeamColors getTeamColor();

	T setTeamColor(EnumTeamColors team);

}
