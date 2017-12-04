package ga.scmc.entity.living;

import ga.scmc.enums.EnumTypeAttributes;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityCritterPassive extends EntityStarcraftPassive {

	public EntityCritterPassive(World world) {
		super(world);
		setTypes(EnumTypeAttributes.CRITTER);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}
}