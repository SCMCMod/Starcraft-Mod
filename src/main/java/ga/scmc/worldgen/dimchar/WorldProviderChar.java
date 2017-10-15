package ga.scmc.worldgen.dimchar;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;

public class WorldProviderChar extends WorldProvider {

	@Override
	protected void createBiomeProvider() {
		biomeProvider = new CharBiomeProvider(world.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderChar(world);
	}

	/**
	 * A Message to display to the user when they transfer out of this
	 * dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {
		
		//Always true
		if(this instanceof WorldProviderChar) {
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
	 * @param player The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(EntityPlayerMP player) {
		return ConfigurationHandler.INT_DIMENSION_CHAR;
	}

	@Override
	public float getSunBrightnessFactor(float par1)
    {
        return 0.5F;
    }
	
	/**
	 * A message to display to the user when they transfer to this dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {
		
		//Always true
		if(this instanceof WorldProviderChar) {
			return "Entering Char";
		}
		
		return null;
	}
	
	@Override
	public Vec3d getSkyColor(Entity cameraEntity, float partialTicks) {
		return new Vec3d(0, 0, 0);
	}
}