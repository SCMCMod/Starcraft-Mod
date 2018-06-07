package com.ruthless_bug13.rapi.api.util;

import net.minecraft.world.World;

/**
 * @author Ruthless_Bug13
 * 
 * Lightweight solar utility for solar panels.
 */
public class SolarUtil 
{
	/**
	 * @param world - World to calculate radians in.
	 * @return - Returns the solar radians of @param world.
	 */
	public static float GetSolarRadians(World world)
	{
		float celestialAngleRadians = world.getCelestialAngleRadians(1.0f);
        if (celestialAngleRadians > Math.PI) 
            return celestialAngleRadians = (2 * 3.141592f - celestialAngleRadians);
        return 0;
	}
	
	/**
	 * @param world - The world to calculate radians.
	 * @param EnergyPerTick - The energy per tick the machine produces.
	 * @return - Returns the solar energy calculated by @GetSolarRadians multiplied by @param EnergyPerTick.
	 */
	public static double GenerateSolarEnergy(World world, double EnergyPerTick) 
	{
		float generation = GetSolarRadians(world);
		generation = Math.max(0, generation);
		generation = Math.min(1, generation);
        return generation;
	}
}