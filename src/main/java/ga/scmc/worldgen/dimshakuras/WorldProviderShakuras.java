package ga.scmc.worldgen.dimshakuras;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderShakuras extends WorldProvider {

	@SideOnly(Side.CLIENT)
	private IRenderHandler skyProvider;

	@Override
	@SideOnly(Side.CLIENT)
	public IRenderHandler getSkyRenderer() {
		return skyProvider == null ? skyProvider = new SkyProviderShakuras() : skyProvider;
	}

	@Override
	public IRenderHandler getCloudRenderer() {
		return null;
	}
	
	@Override
	protected void createBiomeProvider() {
		biomeProvider = new ShakurasBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderShakuras(world);
	}

	/**
	 * A Message to display to the user when they transfer out of this
	 * dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {
		
		//Always true
		if(this instanceof WorldProviderShakuras) {
			return "Leaving Shakuras";
		}
		
		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.shakuras_dt;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this
	 * brings them back to the overworld.
	 * @param player The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player) {
		return ConfigurationHandler.INT_DIMENSION_SHAKURAS;
	}

	@Override
	public float getSunBrightnessFactor(float par1) {
        return 0;
    }
	
	@Override
	public float getSunBrightness(float angle) {
		return 0;
	}
	
	/**
	 * A message to display to the user when they transfer to this dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {
		
		//Always true
		if(this instanceof WorldProviderShakuras) {
			return "Entering Shakuras";
		}
		
		return null;
	}
	
	@Override
	public boolean isDaytime() {
        return false;
    }
}
