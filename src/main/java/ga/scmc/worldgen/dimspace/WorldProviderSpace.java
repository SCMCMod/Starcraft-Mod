package ga.scmc.worldgen.dimspace;

import ga.scmc.handlers.DimensionHandler;
import hypeirochus.api.client.render.world.IClimateProvider;
import hypeirochus.api.client.render.world.ICloudProvider;
import hypeirochus.api.client.render.world.IStormProvider;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderSpace extends WorldProvider implements IClimateProvider {

	private CloudProviderSpace	clouds	= new CloudProviderSpace();
	private StormProviderSpace	storms	= new StormProviderSpace();
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
		return climateProvider == null ? climateProvider = new CloudProviderSpace() : climateProvider;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IRenderHandler getSkyRenderer() {
		return skyRenderer == null ? skyRenderer = new RenderSkySpace() : skyRenderer;
	}

	@Override
	protected void createBiomeProvider() {
		biomeProvider = new SpaceBiomeProvider(world.getWorldInfo());
		this.hasNoSky = true;
	}

	/**
	 * Returns array with sunrise/sunset colors
	 */
	@SideOnly(Side.CLIENT)
	public float[] calcSunriseSunsetColors(float celestialAngle, float partialTicks) {
		return null;
	}

	/**
	 * Return Vec3D with biome specific fog color
	 */
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float p_76562_1_, float p_76562_2_) {
		return new Vec3d(0.0D, 0.0D, 0.0D);
	}

	@SideOnly(Side.CLIENT)
	public boolean isSkyColored() {
		return false;
	}

	/**
	 * True if the player can respawn in this dimension (true = overworld, false =
	 * nether).
	 */
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderSpace(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());
	}

	/**
	 * A Message to display to the user when they transfer out of this dimension.
	 * 
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {

		// Always true
		if (this instanceof WorldProviderSpace) {
			return "Leaving Space";
		}

		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.space_dt;
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
		return 0;
	}

	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks) {
		return 0.0F;
	}

	@Override
	public Vec3d getSkyColor(Entity cameraEntity, float partialTicks) {
		return new Vec3d(0.0D, 0.0D, 0.0D);
	}

	/**
	 * A message to display to the user when they transfer to this dimension.
	 * 
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {

		if (this instanceof WorldProviderSpace) {
			return "Entering Space";
		}

		return null;
	}

	@Override
	public ICloudProvider getCloudProvider() {
		return clouds;
	}

	@Override
	public IStormProvider getStormProvider() {
		return storms;
	}
}
