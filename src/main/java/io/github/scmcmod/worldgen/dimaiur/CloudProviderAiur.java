package io.github.scmcmod.worldgen.dimaiur;

import io.github.scmcmod.SCConstants;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.rom.client.render.Texture;
import net.rom.client.render.world.CloudProvider;
import net.rom.client.render.world.IStormProvider;

@EventBusSubscriber
public class CloudProviderAiur extends CloudProvider
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
		return provider instanceof WorldProviderAiur;
	}

	@Override
	public double getCloudMovementX(World world, float cloudTicksPrev, float cloudTicks)
	{
		return -super.getCloudMovementX(world, cloudTicksPrev, cloudTicks);
	}

}
