package ga.scmc.entity.living;

import ga.scmc.handlers.ConfigurationHandler;
import net.minecraft.world.World;

public class EntityProtossMob extends EntityStarcraftMob {

	public EntityProtossMob(World world) {
		super(world);
	}
	
	@Override
	public boolean getCanSpawnHere() {
		return true;
	}
}