package io.github.scmcmod.entity.ai.pathfinding;

import io.github.scmcmod.init.StarCraftBlocks;
import net.minecraft.entity.EntityLiving;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PathNavigateCreep extends PathNavigateGround
{

	public PathNavigateCreep(EntityLiving entitylivingIn, World worldIn)
	{
		super(entitylivingIn, worldIn);
	}

	@Override
	public Path getPathToPos(BlockPos pos)
	{
		if (this.world.getBlockState(pos.add(0, -1, 0)).getBlock() == StarCraftBlocks.ZERG_CREEP)
		{
			return super.getPathToPos(pos);
		}
		return null;
	}
}
