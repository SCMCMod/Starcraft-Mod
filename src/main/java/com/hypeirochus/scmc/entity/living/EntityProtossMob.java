package com.hypeirochus.scmc.entity.living;

import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityProtossMob extends EntityStarcraftMob {

	public EntityProtossMob(World world) {
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