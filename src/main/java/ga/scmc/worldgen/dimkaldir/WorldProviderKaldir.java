package ga.scmc.worldgen.dimkaldir;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;

public class WorldProviderKaldir extends WorldProvider {

	@Override
	protected void createBiomeProvider() {
		biomeProvider = new KaldirBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderKaldir(world);
	}

	/**
	 * A Message to display to the user when they transfer out of this
	 * dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {
		
		//Always true
		if(this instanceof WorldProviderKaldir) {
			return "Leaving Kaldir";
		}
		
		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.kaldir_dt;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this
	 * brings them back to the overworld.
	 * @param player The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player) {
		return ConfigurationHandler.INT_DIMENSION_KALDIR;
	}
	
	/**
	 * A message to display to the user when they transfer to this dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {
		
		//Always true
		if(this instanceof WorldProviderKaldir) {
			return "Entering Kaldir";
		}
		
		return null;
	}
}
