package com.hypeirochus.scmc.worldgen.dimzerus;

import com.hypeirochus.scmc.handlers.DimensionHandler;
import com.hypeirochus.scmc.lib.FactorySettings;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderZerus extends WorldProvider {

	public Vec3d vec = new Vec3d(1.0D, 1.0D, 0.87D);

	
	@Override
	public BiomeProvider getBiomeProvider() {
		return biomeProvider = new ZerusBiomeProvider(world.getWorldInfo());
	}
	
	@Override
	public double getVoidFogYFactor() {
		return 1.0D;
	}

	@SideOnly(Side.CLIENT)
	public boolean doesXZShowFog(int par1, int par2) {
		return true;
	}

	@Override
	public Vec3d getFogColor(float p_76562_1_, float p_76562_2_) {
		return vec;
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorZerus(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.zerus_dt;
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
		return FactorySettings.INT_DIMENSION_ZERUS;
	}
}
