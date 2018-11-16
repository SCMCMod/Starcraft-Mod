package com.hypeirochus.scmc.registry;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * A basic registry template.
 * 
 * @author Ocelot5836
 * @param <K> The key for registered objects
 * @param <V> The value of the registered objects
 */
public interface ISCRegistry<E, T>
{

	/**
	 * Initializes the objects.
	 */
	void init();

	/**
	 * Registers an object.
	 * 
	 * @param key The object used to identify the value
	 * @param value The object to register
	 */
	void register(E key, T value);

	/**
	 * @param key The object identifier
	 * @return An object that is registered
	 */
	T get(E key);

}