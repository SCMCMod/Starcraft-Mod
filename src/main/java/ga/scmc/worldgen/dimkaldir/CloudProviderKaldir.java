package ga.scmc.worldgen.dimkaldir;

import ga.scmc.lib.Library;
import hypeirochus.api.client.render.Texture;
import hypeirochus.api.client.render.world.CloudProvider;
import hypeirochus.api.client.render.world.IStormProvider;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class CloudProviderKaldir extends CloudProvider
{
    private static final Texture CLOUDS = new Texture(Library.MODID, "textures/world/varda-clouds.png");
    
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
        return provider instanceof WorldProviderKaldir;
    }
    
    @Override
    public double getCloudMovementX(World world, float cloudTicksPrev, float cloudTicks)
    {
        return -super.getCloudMovementX(world, cloudTicksPrev, cloudTicks);
    }
    
    
}
