package ga.scmc.api;

import ga.scmc.enums.EnumColors;
import net.minecraft.entity.EntityLiving;

/**
 * An interface used by the {@link ga.scmc.client.renderer.ColoredLayerRender}
 * 
 * @author CJMinecraft
 * @param <T>
 *            The entity class
 */
public interface IEntityTeamColorable<T extends EntityLiving> {

	EnumColors getColor();

	T setColor(EnumColors team);

}
