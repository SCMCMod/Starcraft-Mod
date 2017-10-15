package ga.scmc.entity;

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
}