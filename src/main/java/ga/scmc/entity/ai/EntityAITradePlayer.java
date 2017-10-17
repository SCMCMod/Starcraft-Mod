package ga.scmc.entity.ai;

import ga.scmc.entity.EntityTerranPassive;
import ga.scmc.entity.living.EntityCivilian;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class EntityAITradePlayer extends EntityAIBase {
	
	private final EntityCivilian person;

	public EntityAITradePlayer(EntityCivilian person) {
		this.person = person;
		this.setMutexBits(5);
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public boolean shouldExecute() {
		if (!this.person.isEntityAlive()) {
			return false;
		} else if (this.person.isInWater()) {
			return false;
		} else if (!this.person.onGround) {
			return false;
		} else if (this.person.velocityChanged) {
			return false;
		} else {
			EntityPlayer entityplayer = this.person.getCustomer();
			return entityplayer == null ? false : (this.person.getDistanceSqToEntity(entityplayer) > 16.0D ? false : entityplayer.openContainer instanceof Container);
		}
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting() {
		this.person.getNavigator().clearPathEntity();
	}

	/**
	 * Resets the task
	 */
	public void resetTask() {
		this.person.setCustomer((EntityPlayer) null);
	}
}