package com.arpaesis.api.client.render.world;

//TODO: MOVE TO CORE MOD
public interface IClimateProvider
{
	public ICloudProvider getCloudProvider();

	public IStormProvider getStormProvider();
}