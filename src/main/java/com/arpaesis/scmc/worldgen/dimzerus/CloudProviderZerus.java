package com.arpaesis.scmc.worldgen.dimzerus;

import com.arpaesis.api.client.render.Texture;
import com.arpaesis.api.client.render.world.CloudProvider;
import com.arpaesis.api.client.render.world.IStormProvider;
import com.arpaesis.scmc.Starcraft;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;

public class CloudProviderZerus extends CloudProvider
{
	private static final Texture CLOUDS = new Texture(Starcraft.MOD_ID, "textures/world/varda-clouds.png");

	private IStormProvider stormProvider;

	@Override
	public float getMaxCloudSpeedDuringStorm()
	{
		return 24;
	}

	@Override
	public float getMaxNormalCloudSpeed()
	{
		return 8;
	}

	@Override
	public Texture getCloudTexture()
	{
		return CLOUDS;
	}

	@Override
	public boolean areCloudsApplicableTo(WorldProvider provider)
	{
		return provider instanceof WorldProviderZerus;
	}

	@Override
	public double getCloudMovementX(World world, float cloudTicksPrev, float cloudTicks)
	{
		return -super.getCloudMovementX(world, cloudTicksPrev, cloudTicks);
	}

}
