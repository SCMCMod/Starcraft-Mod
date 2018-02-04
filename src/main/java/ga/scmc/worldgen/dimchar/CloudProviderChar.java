package ga.scmc.worldgen.dimchar;

import com.arisux.mdx.lib.client.render.Texture;
import com.arisux.mdx.lib.client.render.world.CloudProvider;
import com.arisux.mdx.lib.client.render.world.IStormProvider;

import ga.scmc.lib.Library;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class CloudProviderChar extends CloudProvider
{
    private static final Texture CLOUDS = new Texture(Library.MODID, "textures/world/varda-clouds.png");

    private IStormProvider       stormProvider;

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
    public void render(float partialTicks, WorldClient world, Minecraft mc) {
    	super.render(partialTicks, world, mc);
    }
}
