package ga.scmc.worldgen.dimchar;

import com.arisux.mdx.lib.client.render.Texture;
import com.arisux.mdx.lib.client.render.world.StormProvider;

import ga.scmc.lib.Library;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;

public class StormProviderChar extends StormProvider
{
    public static final Texture STORM_TEXTURE = new Texture(Library.MODID, "textures/world/hellfire.png");

    public boolean isStormActive(World world)
    {
        return world.getWorldTime() >= 3000 && world.getWorldTime() <= 4000;
    }

    @Override
    public boolean isStormVisibleInBiome(Biome biome)
    {
        return true;
    }

    @Override
    public float getStormDownfallSpeed()
    {
        return 14.0F;
    }

    @Override
    public float getStormWindSpeed()
    {
        return 4.0F;
    }

    @Override
    public boolean doesLightingApply()
    {
        return false;
    }

    @Override
    public float getStormDirection()
    {
        return 90F;
    }

    @Override
    public Texture getStormTexture(World world, Biome biome)
    {
        return STORM_TEXTURE;
    }

    @Override
    public int getStormSize()
    {
        return 32;
    }

    @Override
    public boolean isStormApplicableTo(WorldProvider provider)
    {
        return provider instanceof WorldProviderChar;
    }
}
