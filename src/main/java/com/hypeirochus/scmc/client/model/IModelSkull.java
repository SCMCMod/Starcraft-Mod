package com.hypeirochus.scmc.client.model;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Allows a user to render just the skull of an entity instead of the whole
 * model.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public interface IModelSkull
{

	/**
	 * Renders the skull only. Can be used for special rendering.
	 * 
	 * @param scale The scale of the skull
	 */
	void renderSkull(float scale);

}