package com.arpaesis.scmc.worldgen.dimshakuras;

import com.arpaesis.scmc.config.SCConfig;
import com.arpaesis.scmc.handlers.DimensionHandler;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderShakuras extends WorldProvider
{

	private IRenderHandler skyRenderer;
	private IRenderHandler cliimateProvider;

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getWeatherRenderer()
	{
		return null;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getCloudRenderer()
	{
		return cliimateProvider == null ? cliimateProvider = new CloudProviderShakuras() : cliimateProvider;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getSkyRenderer()
	{
		return skyRenderer == null ? skyRenderer = new RenderSkyShakuras() : skyRenderer;
	}

	@Override
	public void onWorldUpdateEntities()
	{
		super.onWorldUpdateEntities();
	}

	@Override
	public void updateWeather()
	{
		super.updateWeather();
	}

	@Override
	public BiomeProvider getBiomeProvider()
	{
		return biomeProvider = new ShakurasBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator()
	{
		return new ChunkGeneratorShakuras(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());
	}

	@Override
	public DimensionType getDimensionType()
	{
		return DimensionHandler.shakuras_dt;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this
	 * brings them back to the overworld.
	 * 
	 * @param player The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player)
	{
		return SCConfig.INT_DIMENSION_SHAKURAS;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float var1, float var2)
	{
		return new Vec3d(0.D, 0.0D, 0.1D);
	}

	@Override
	public Vec3d getCloudColor(float partialTicks)
	{
		return new Vec3d(0.0D, 0.0D, 0.1D);
	}

	@Override
	public float getSunBrightness(float angle)
	{
		float celestialAngle = this.world.getCelestialAngle(angle);
		float brightness = 1.0F - (MathHelper.cos(celestialAngle * (float) Math.PI * 2.0F) * 2.0F + 0.2F);

		if (brightness < 0.0F)
		{
			brightness = 0.0F;
		}

		if (brightness > 1.0F)
		{
			brightness = 1.0F;
		}

		brightness = 1.0F - brightness;
		brightness = (float) (brightness * (1.0D - this.world.getRainStrength(angle) * 5.0F / 16.0D));
		brightness = (float) (brightness * (1.0D - this.world.getThunderStrength(angle) * 5.0F / 16.0D));
		return brightness * 0.45F;
	}

	@Override
	public boolean isDaytime()
	{
		return false;
	}
}
