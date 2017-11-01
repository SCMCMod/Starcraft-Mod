package ga.scmc.entity.living;

import com.google.common.base.Predicate;

import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityZeratul extends EntityProtossMob implements IMob, Predicate<EntityLivingBase> {

	public EntityZeratul(World world) {
		super(world);
		setSize(1.5F, 2.5F);
		experienceValue = 80;
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}
	
	@Override
	public boolean apply(EntityLivingBase entity) {
		if(entity.isInvisible() == false) {
			if(entity instanceof EntityZergMob || entity instanceof EntityZergPassive || entity instanceof EntityTerranMob || entity instanceof EntityTerranPassive) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	@Override
	protected boolean canDespawn() {
		return false;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(45.0D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		return super.attackEntityFrom(source, damageDealt);
	}

	/**
	 * Drop 0-2 items on death
	 * @param recentPlayerDmg {@code true} if a player recently dealt damage to
	 * this entity
	 * @param lootingLvl level of Looting enchant used to deliver killing blow
	 * of entity
	 */
	@Override
	protected void dropFewItems(boolean recentPlayerDmg, int lootingLvl) {
		int j = rand.nextInt(50);
			dropItem(WeaponHandler.MASTER_PSI_BLADE, 1);
			entityDropItem(new ItemStack(ItemHandler.ENERGY, 1, 1), 2 + rand.nextInt(3));
	}

	@Override
	public SoundEvent getAmbientSound() {
		if(rand.nextInt(2) == 0)
			return SoundHandler.ENTITY_DARKTEMPLAR_LIVE1;

		return SoundHandler.ENTITY_DARKTEMPLAR_LIVE2;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_DARKTEMPLAR_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_DARKTEMPLAR_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public void onUpdate() {
		for(int i = 0; i < 2; ++i) {
			world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, posX + (rand.nextDouble() - 0.5D) * width, posY + rand.nextDouble() * height,
					posZ + (rand.nextDouble() - 0.5D) * width, 0.0D, 0.0D, 0.0D, null);
		}
		super.onUpdate();
	}
}
