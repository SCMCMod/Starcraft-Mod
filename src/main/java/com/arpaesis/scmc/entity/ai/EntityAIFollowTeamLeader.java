package com.arpaesis.scmc.entity.ai;

import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;

//TODO: This code may not be used. Consider deleting it.
public class EntityAIFollowTeamLeader extends EntityAIBase
{
	private final EntityLiving entity;
	private EntityPlayer player;

	public EntityAIFollowTeamLeader(EntityLiving entityIn)
	{
		this.entity = entityIn;
		this.setMutexBits(3);
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public boolean shouldExecute()
	{
		if (!this.entity.world.isDaytime())
		{
			return false;
		} else
		{
			List<EntityPlayer> list = this.entity.world.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, this.entity.getEntityBoundingBox().expand(6.0D, 2.0D, 6.0D));

			if (list.isEmpty())
			{
				return false;
			} else
			{
				for (EntityPlayer entityirongolem : list)
				{
					this.player = entityirongolem;
					break;
				}

				return this.player != null;
			}
		}
	}

	/**
	 * Returns whether an in-progress EntityAIBase should continue executing
	 */
	public boolean continueExecuting()
	{
		return true;
	}

	/**
	 * Resets the task
	 */
	public void resetTask()
	{
		this.player = null;
		this.entity.getNavigator().clearPath();
	}

	/**
	 * Updates the task
	 */
	public void updateTask()
	{
		this.entity.getLookHelper().setLookPositionWithEntity(this.player, 30.0F, 30.0F);
		this.entity.getNavigator().tryMoveToEntityLiving(this.player, 1.0D);

		if (this.entity.getDistanceSq(this.player) < 16.0D)
		{
			this.entity.getNavigator().clearPath();
		}
	}
}