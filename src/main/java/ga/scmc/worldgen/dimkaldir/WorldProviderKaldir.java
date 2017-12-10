package ga.scmc.worldgen.dimkaldir;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderKaldir extends WorldProvider {

    @SideOnly(Side.CLIENT)
    private IRenderHandler skyProvider;
    
	@Override
	protected void createBiomeProvider() {
		biomeProvider = new KaldirBiomeProvider(world.getWorldInfo());
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public IRenderHandler getSkyRenderer()
    {
        return skyProvider == null ? skyProvider = new SkyProviderKaldir() : skyProvider;
    }

    @Override
    public IRenderHandler getCloudRenderer()
    {
        return skyProvider == null ? skyProvider = new SkyProviderKaldir() : skyProvider;
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
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float var1, float var2) {
		return new Vec3d(.65D, 0.95D, 0.95D);
	}

	@Override
	public Vec3d getCloudColor(float partialTicks) {
		return new Vec3d(.65D, 0.95D, 0.95D);
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
