package com.hypeirochus.scmc.items;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Allows the user to register the renders for a meta item without having to have nasty loops.
 * 
 * @author Ocelot5836
 */
public interface IMetaRenderHandler {

	/**
	 * Used to know how long to loop through the metadata in registry.
	 * 
	 * @return The number of items in the meta item
	 */
	int getItemCount();

	/**
	 * Returns the file name of each meta item for registry.
	 * 
	 * @param meta
	 *            The metadata of the item
	 * @return The file name used to find the item model
	 */
	String getName(int meta);

}