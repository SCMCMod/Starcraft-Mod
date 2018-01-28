package ga.scmc.entity.living;

import net.minecraft.world.World;

public class EntityTerranMob extends EntityStarcraftMob {

	public EntityTerranMob(World world) {
		super(world);
	}
	
	@Override
	public boolean getCanSpawnHere() {
		return true;
	}

}