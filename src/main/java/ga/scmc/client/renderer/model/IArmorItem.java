package ga.scmc.client.renderer.model;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;

/**
 * Specifies the rendering for each transform type for each piece of armor.
 * 
 * @author Ocelot5836
 */
public interface IArmorItem {

	/**
	 * Renders the helmet.
	 */
	void renderHelmet(TransformType type, Entity entity, float scale);

	/**
	 * Renders the chestplate.
	 */
	void renderChestplate(TransformType type, Entity entity, float scale);

	/**
	 * Renders the leggings.
	 */
	void renderLeggings(TransformType type, Entity entity, float scale);

	/**
	 * Renders the boots.
	 */
	void renderBoots(TransformType type, Entity entity, float scale);
	
}