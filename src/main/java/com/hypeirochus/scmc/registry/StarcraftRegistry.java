package com.hypeirochus.scmc.registry;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * A basic implementation of {@link IStarcraftRegistry}.
 * 
 * @author Ocelot5836
 *
 * @param <K>
 *            The key for registered objects
 * @param <V>
 *            The value of the registered objects
 */
public abstract class StarcraftRegistry<K, V> implements IStarcraftRegistry<K, V> {

	protected Map<K, V> registered;

	public StarcraftRegistry() {
		this.registered = Maps.<K, V>newHashMap();
	}

	@Override
	public void register(K key, V value) {
		this.registered.put(key, value);
	}

	@Override
	public V get(K name) {
		return this.registered.get(name);
	}
}