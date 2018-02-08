package ga.scmc.entity.living;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityProtossPassive extends EntityStarcraftPassive {

	public EntityProtossPassive(World world) {
		super(world);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}

	@Override
	public boolean getCanSpawnHere() {
		return true;
	}
}