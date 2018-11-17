package com.arpaesis.scmc.worldgen.dimshakuras;

import com.arpaesis.api.client.render.Texture;
import com.arpaesis.api.client.render.world.CloudProvider;
import com.arpaesis.api.client.render.world.IStormProvider;
import com.arpaesis.scmc.Starcraft;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;

public class CloudProviderShakuras extends CloudProvider
{
	private static final Texture CLOUDS = new Texture(Starcraft.MOD_ID, "textures/world/varda-clouds.png");

	private IStormProvider stormProvider;

	@Override
	public float getMaxCloudSpeedDuringStorm()
	{
		return 32;
	}

	@Override
	public float getMaxNormalCloudSpeed()
	{
		return 12;
	}

	@Override
	public Texture getCloudTexture()
	{
		return CLOUDS;
	}

	@Override
	public boolean areCloudsApplicableTo(WorldProvider provider)
	{
		return provider instanceof WorldProviderShakuras;
	}

	@Override
	public double getCloudMovementX(World world, float cloudTicksPrev, float cloudTicks)
	{
		return -super.getCloudMovementX(world, cloudTicksPrev, cloudTicks);
	}
}
