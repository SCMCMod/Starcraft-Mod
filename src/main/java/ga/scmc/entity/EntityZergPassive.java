package ga.scmc.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityZergPassive extends EntityStarcraftPassive {

	public EntityZergPassive(World world) {
		super(world);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}
}