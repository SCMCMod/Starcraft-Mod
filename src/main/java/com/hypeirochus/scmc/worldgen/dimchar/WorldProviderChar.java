package com.hypeirochus.scmc.worldgen.dimchar;

import com.hypeirochus.api.client.render.world.IClimateProvider;
import com.hypeirochus.api.client.render.world.ICloudProvider;
import com.hypeirochus.api.client.render.world.IStormProvider;
import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.handlers.DimensionHandler;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderChar extends WorldProvider implements IClimateProvider {
	private StormProviderChar storm = new StormProviderChar();
	private CloudProviderChar clouds = new CloudProviderChar();
	private IRenderHandler skyRenderer;
	private IRenderHandler climateProvider;
	private Vec3d vec = new Vec3d(0.0D, 0.0D, 0.0D);

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getWeatherRenderer() {
		return null;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getCloudRenderer() {
		return climateProvider == null ? climateProvider = new CloudProviderChar() : climateProvider;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getSkyRenderer() {
		return skyRenderer == null ? skyRenderer = new RenderSkyChar() : skyRenderer;
	}

	@Override
	public BiomeProvider getBiomeProvider() {
		return biomeProvider = new CharBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorChar(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.char_dt;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this brings them back to the overworld.
	 * 
	 * @param player
	 *            The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(EntityPlayerMP player) {
		return getDimensionType().getId();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float var1, float var2) {
		return new Vec3d(0.9D - this.getWorldTime() / 18000D, MathHelper.clamp(1D - this.getWorldTime() / 18000D, 0.0D, 0.055D), 0.0D);
	}

	@Override
	public float getSunBrightness(float angle) {
		float celestialAngle = this.world.getCelestialAngle(angle);
		float brightness = 1.0F - (MathHelper.cos(celestialAngle * (float) Math.PI * 2.0F) * 2.0F + 0.2F);

		if (brightness < 0.0F) {
			brightness = 0.0F;
		}

		if (brightness > 1.0F) {
			brightness = 1.0F;
		}

		brightness = 1.0F - brightness;
		brightness = (float) (brightness * (1.0D - this.world.getRainStrength(angle) * 5.0F / 16.0D));
		brightness = (float) (brightness * (1.0D - this.world.getThunderStrength(angle) * 5.0F / 16.0D));
		return brightness * 0.45F;
	}

	@Override
	public Vec3d getCloudColor(float partialTicks) {
		return vec;
	}

	@Override
	public boolean canSnowAt(BlockPos pos, boolean checkLight) {
		return false;
	}

	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
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