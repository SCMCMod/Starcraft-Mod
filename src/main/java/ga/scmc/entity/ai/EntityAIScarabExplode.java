package ga.scmc.entity.ai;

import ga.scmc.entity.living.EntityScarab;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIScarabExplode extends EntityAIBase {

	/**
	 * The scarab's attack target. This is used for the changing of the
	 * creeper's state
	 */
	private EntityLivingBase scarabAttackTarget;

	/** The scarab that is swelling */
	private EntityScarab swellingScarab;

	public EntityAIScarabExplode(EntityScarab entityScarab) {
		swellingScarab = entityScarab;
		setMutexBits(1);
	}

	/**
	 * Resets the task
	 */
	@Override
	public void resetTask() {
		scarabAttackTarget = null;
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	@Override
	public boolean shouldExecute() {
		EntityLivingBase entitylivingbase = swellingScarab.getAttackTarget();
		return entitylivingbase != null && swellingScarab.getDistanceSqToEntity(entitylivingbase) < 9;
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	@Override
	public void startExecuting() {
		swellingScarab.getNavigator().clearPathEntity();
		scarabAttackTarget = swellingScarab.getAttackTarget();
	}

	/**
	 * Updates the task
	 */
	@Override
	public void updateTask() {
		if(scarabAttackTarget == null) {
			swellingScarab.setScarabState(-1);
		} else if(swellingScarab.getDistanceSqToEntity(scarabAttackTarget) > 49) {
			swellingScarab.setScarabState(-1);
		} else if(!swellingScarab.getEntitySenses().canSee(scarabAttackTarget)) {
			swellingScarab.setScarabState(-1);
		} else {
			swellingScarab.setScarabState(1);
		}
	}
}