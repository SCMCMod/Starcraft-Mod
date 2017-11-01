package ga.scmc.entity.living;

import ga.scmc.handlers.ConfigurationHandler;
import net.minecraft.world.World;

public class EntityTerranMob extends EntityStarcraftMob {

	public EntityTerranMob(World world) {
		super(world);
	}
	
	@Override
	public boolean getCanSpawnHere() {
		if(this.world.provider.getDimension() == ConfigurationHandler.INT_DIMENSION_KORHAL) {
			return true;
		}
		return false;
	}

}