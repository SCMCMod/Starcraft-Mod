package ga.scmc.entity;

import ga.scmc.handlers.ConfigurationHandler;
import net.minecraft.world.World;

public class EntityZergMob extends EntityStarcraftMob {

	public EntityZergMob(World world) {
		super(world);
	}
	
	@Override
	public boolean getCanSpawnHere() {
		if(this.world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_CHAR) {
			return true;
		}
		return false;
	}
}
