package com.hypeirochus.scmc.worldgen.dimspace;

import com.hypeirochus.api.client.render.Texture;
import com.hypeirochus.api.client.render.world.StormProvider;
import com.hypeirochus.scmc.worldgen.dimchar.WorldProviderChar;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;

public class StormProviderSpace extends StormProvider
{

	public boolean isStormActive(World world)
	{
		return false;
	}

	@Override
	public boolean isStormVisibleInBiome(Biome biome)
	{
		return false;
	}

	@Override
	public boolean doesLightingApply()
	{
		return false;
	}

	@Override
	public float getStormDirection()
	{
		return 0;
	}

	@Override
	public int getStormSize()
	{
		return 0;
	}

	@Override
	public boolean isStormApplicableTo(WorldProvider provider)
	{
		return provider instanceof WorldProviderChar;
	}

	@Override
	public float getStormDownfallSpeed()
	{
		return 0;
	}

	@Override
	public float getStormWindSpeed()
	{
		return 0;
	}

	@Override
	public Texture getStormTexture(World world, Biome biome)
	{
		return null;
	}
}
