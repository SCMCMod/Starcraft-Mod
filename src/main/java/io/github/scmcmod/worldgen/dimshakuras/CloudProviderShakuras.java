package io.github.scmcmod.worldgen.dimshakuras;

import io.github.scmcmod.SCConstants;
import net.rom.client.render.Texture;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.rom.client.render.world.CloudProvider;
import net.rom.client.render.world.IStormProvider;

public class CloudProviderShakuras extends CloudProvider
{
	private static final Texture CLOUDS = new Texture(SCConstants.MODID, "textures/world/varda-clouds.png");

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
