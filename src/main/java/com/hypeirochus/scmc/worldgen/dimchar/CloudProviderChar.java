package com.hypeirochus.scmc.worldgen.dimchar;

import com.hypeirochus.api.client.render.Texture;
import com.hypeirochus.api.client.render.world.CloudProvider;
import com.hypeirochus.api.client.render.world.IStormProvider;
import com.hypeirochus.scmc.Starcraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;

public class CloudProviderChar extends CloudProvider
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
		return provider instanceof WorldProviderChar;
	}

	@Override
	public double getCloudMovementX(World world, float cloudTicksPrev, float cloudTicks)
	{
		return -super.getCloudMovementX(world, cloudTicksPrev, cloudTicks);
	}

	@Override
	public void render(float partialTicks, WorldClient world, Minecraft mc)
	{
		super.render(partialTicks, world, mc);
	}
}
