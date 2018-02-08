package ga.scmc.entity.living;

import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityTerranMob extends EntityStarcraftMob {

	public EntityTerranMob(World world) {
		super(world);
	}

	@Override
	public boolean getCanSpawnHere() {
		if (this.world.getDifficulty() != EnumDifficulty.PEACEFUL) {
			return true;
		} else {
			return false;
		}
	}

}