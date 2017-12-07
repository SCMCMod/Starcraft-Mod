package ga.scmc.entity.living;

import ga.scmc.handlers.ConfigurationHandler;
import net.minecraft.world.World;

public class EntityProtossMob extends EntityStarcraftMob {

	public EntityProtossMob(World world) {
		super(world);
	}
	
	@Override
	public boolean getCanSpawnHere() {
		if (this.world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_SHAKURAS
				|| this.world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KALDIR) {
			return true;
		}
		return false;
	}
}