package com.hypeirochus.scmc.worldgen.dimkorhal;

import com.hypeirochus.scmc.handlers.DimensionHandler;
import com.hypeirochus.scmc.lib.FactorySettings;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderKorhal extends WorldProvider {

	@Override
	public BiomeProvider getBiomeProvider() {
		return biomeProvider = new KorhalBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorKorhal(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.korhal_dt;
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
		return FactorySettings.INT_DIMENSION_KORHAL;
	}
}
