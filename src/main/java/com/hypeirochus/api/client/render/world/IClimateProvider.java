package com.hypeirochus.api.client.render.world;

public interface IClimateProvider {
	public ICloudProvider getCloudProvider();

	public IStormProvider getStormProvider();
}