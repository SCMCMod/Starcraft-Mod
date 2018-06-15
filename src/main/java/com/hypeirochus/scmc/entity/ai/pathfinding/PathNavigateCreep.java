package com.hypeirochus.scmc.entity.ai.pathfinding;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.entity.EntityLiving;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PathNavigateCreep  extends PathNavigateGround {

	public PathNavigateCreep(EntityLiving entitylivingIn, World worldIn) {
		super(entitylivingIn, worldIn);
	}
	
	@Override
	public Path getPathToPos(BlockPos pos) {
		if(this.world.getBlockState(pos.add(0, -1, 0)).getBlock() == BlockHandler.ZERG_CREEP) {
			return super.getPathToPos(pos);
		}
        return null;
	}
}
