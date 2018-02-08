package ga.scmc.worldgen.dimzerus;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderZerus extends WorldProvider {
    
	public Vec3d vec = new Vec3d(1.0D, 1.0D, 0.87D);
	
    @Override
	protected void createBiomeProvider() {
		biomeProvider = new ZerusBiomeProvider(world.getWorldInfo());
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
		return new ChunkProviderZerus(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());
	}

	/**
	 * A Message to display to the user when they transfer out of this
	 * dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {
		if(this instanceof WorldProviderZerus) {
			return "Leaving Zerus";
		}
		
		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionHandler.zerus_dt;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this
	 * brings them back to the overworld.
	 * @param player The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player) {
		return ConfigurationHandler.INT_DIMENSION_ZERUS;
	}
	
	/**
	 * A message to display to the user when they transfer to this dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {
		
		//Always true
		if(this instanceof WorldProviderZerus) {
			return "Entering Zerus";
		}
		
		return null;
	}
}
