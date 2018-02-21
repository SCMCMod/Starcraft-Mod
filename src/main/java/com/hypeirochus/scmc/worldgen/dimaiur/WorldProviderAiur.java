package com.hypeirochus.scmc.worldgen.dimaiur;

import com.hypeirochus.api.client.render.world.IClimateProvider;
import com.hypeirochus.api.client.render.world.ICloudProvider;
import com.hypeirochus.api.client.render.world.IStormProvider;
import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.handlers.DimensionHandler;
import com.hypeirochus.scmc.lib.FactorySettings;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderAiur extends WorldProvider implements IClimateProvider {

	private StormProviderAiur	storm	= new StormProviderAiur();
	private CloudProviderAiur	clouds	= new CloudProviderAiur();
	private IRenderHandler		skyRenderer;
	private IRenderHandler		climateProvider;

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getWeatherRenderer() {
		return null;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getCloudRenderer() {
		return climateProvider == null ? climateProvider = new CloudProviderAiur() : climateProvider;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getSkyRenderer() {
		return skyRenderer == null ? skyRenderer = new RenderSkyAiur() : skyRenderer;
	}

	@Override
	public void onWorldUpdateEntities() {
		super.onWorldUpdateEntities();
	}

	@Override
	public void updateWeather() {
		super.updateWeather();
	}
	
	@Override
	public BiomeProvider getBiomeProvider() {
		return biomeProvider = new AiurBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorAiur(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.aiur_dt;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this
	 * brings them back to the overworld.
	 * 
	 * @param player
	 *            The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player) {
		return FactorySettings.INT_DIMENSION_AIUR;
	}
	
	@Override
	public ICloudProvider getCloudProvider() {
		return clouds;
	}

	@Override
	public IStormProvider getStormProvider() {
		return storm;
	}
}
