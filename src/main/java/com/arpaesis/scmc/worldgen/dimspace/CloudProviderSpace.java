package com.arpaesis.scmc.worldgen.dimspace;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.rom.client.render.Texture;
import net.rom.client.render.world.CloudProvider;
import net.rom.client.render.world.IStormProvider;

public class CloudProviderSpace extends CloudProvider
{

	private IStormProvider stormProvider;

	@Override
	public Texture getCloudTexture()
	{
		return null;
	}

	@Override
	public boolean areCloudsApplicableTo(WorldProvider provider)
	{
		return provider instanceof WorldProviderSpace;
	}

	@Override
	public double getCloudMovementX(World world, float cloudTicksPrev, float cloudTicks)
	{
		return -super.getCloudMovementX(world, cloudTicksPrev, cloudTicks);
	}

	@Override
	public void render(float partialTicks, WorldClient world, Minecraft mc)
	{
	}
}
