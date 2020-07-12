package com.arpaesis.scmc.worldgen.dimslayn;

import com.arpaesis.scmc.SCConstants;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.rom.client.render.Texture;
import net.rom.client.render.world.CloudProvider;
import net.rom.client.render.world.IStormProvider;

public class CloudProviderSlayn extends CloudProvider
{
	private static final Texture CLOUDS = new Texture(SCConstants.MODID, "textures/world/varda-clouds.png");

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
		return provider instanceof WorldProviderSlayn;
	}

	@Override
	public double getCloudMovementX(World world, float cloudTicksPrev, float cloudTicks)
	{
		return -super.getCloudMovementX(world, cloudTicksPrev, cloudTicks);
	}

}
