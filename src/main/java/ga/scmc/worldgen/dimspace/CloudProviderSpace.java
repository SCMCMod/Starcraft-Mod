package ga.scmc.worldgen.dimspace;

import hypeirochus.api.client.render.Texture;
import hypeirochus.api.client.render.world.CloudProvider;
import hypeirochus.api.client.render.world.IStormProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;

public class CloudProviderSpace extends CloudProvider {

	private IStormProvider stormProvider;

	@Override
	public Texture getCloudTexture() {
		return null;
	}

	@Override
	public boolean areCloudsApplicableTo(WorldProvider provider) {
		return provider instanceof WorldProviderSpace;
	}

	@Override
	public double getCloudMovementX(World world, float cloudTicksPrev, float cloudTicks) {
		return -super.getCloudMovementX(world, cloudTicksPrev, cloudTicks);
	}

	@Override
	public void render(float partialTicks, WorldClient world, Minecraft mc) {
	}
}
