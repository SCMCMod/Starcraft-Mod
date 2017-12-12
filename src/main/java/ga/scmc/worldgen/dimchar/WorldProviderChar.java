package ga.scmc.worldgen.dimchar;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import ga.scmc.worldgen.StormProvider;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderChar extends WorldProvider {

	public StormProvider stormProvider = new StormProvider();

	@SideOnly(Side.CLIENT)
	private IRenderHandler skyProvider;

	public StormProvider getStormProvider() {
		return this.stormProvider;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IRenderHandler getSkyRenderer() {
		return skyProvider == null ? skyProvider = new SkyProviderChar() : skyProvider;
	}

	@Override
	public IRenderHandler getCloudRenderer() {
		return skyProvider == null ? skyProvider = new SkyProviderChar() : skyProvider;
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
	protected void createBiomeProvider() {
		biomeProvider = new CharBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderChar(world);
	}

	/**
	 * A Message to display to the user when they transfer out of this dimension.
	 * 
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {

		// Always true
		if (this instanceof WorldProviderChar) {
			return "Leaving Char";
		}

		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.char_dt;
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
	public int getRespawnDimension(EntityPlayerMP player) {
		return ConfigurationHandler.INT_DIMENSION_CHAR;
	}

	/**
	 * A message to display to the user when they transfer to this dimension.
	 * 
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {

		// Always true
		if (this instanceof WorldProviderChar) {
			return "Entering Char";
		}

		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float var1, float var2) {
			return new Vec3d(1.0D, 0.3D, 0.0D);
	}

	@Override
	public Vec3d getCloudColor(float partialTicks) {
		return new Vec3d(1.0D, 0.3D, 0.0D);
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
	public boolean canSnowAt(BlockPos pos, boolean checkLight) {
		return false;
	}

	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
	}
}