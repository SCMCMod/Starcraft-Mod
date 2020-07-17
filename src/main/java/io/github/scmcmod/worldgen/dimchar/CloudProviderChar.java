package io.github.scmcmod.worldgen.dimchar;

import io.github.scmcmod.SCConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.rom.client.render.Texture;
import net.rom.client.render.world.CloudProvider;
import net.rom.client.render.world.IStormProvider;

public class CloudProviderChar extends CloudProvider
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
