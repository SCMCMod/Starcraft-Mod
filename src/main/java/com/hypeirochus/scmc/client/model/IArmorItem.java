package com.hypeirochus.scmc.client.model;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Specifies the render for each piece of armor used for special rendering.
 * 
 * @author Ocelot5836
 */
public interface IArmorItem {

	/**
	 * Renders the helmet by itself for special renderers.
	 * 
	 * @param type
	 *            The transformation that is being used
	 * @param entity
	 *            The entity that is rendering the armor part
	 * @param scale
	 *            The scale of the armor model
	 */
	void renderHelmet(TransformType type, Entity entity, float scale);

	/**
	 * Renders the chestplate by itself for special renderers.
	 * 
	 * @param type
	 *            The transformation that is being used
	 * @param entity
	 *            The entity that is rendering the armor part
	 * @param scale
	 *            The scale of the armor model
	 */
	void renderChestplate(TransformType type, Entity entity, float scale);

	/**
	 * Renders the leggings by itself for special renderers.
	 * 
	 * @param type
	 *            The transformation that is being used
	 * @param entity
	 *            The entity that is rendering the armor part
	 * @param scale
	 *            The scale of the armor model
	 */
	void renderLeggings(TransformType type, Entity entity, float scale);

	/**
	 * Renders the boots by itself for special renderers.
	 * 
	 * @param type
	 *            The transformation that is being used
	 * @param entity
	 *            The entity that is rendering the armor part
	 * @param scale
	 *            The scale of the armor model
	 */
	void renderBoots(TransformType type, Entity entity, float scale);

}