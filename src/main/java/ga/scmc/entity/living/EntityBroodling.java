package ga.scmc.entity.living;

import com.google.common.base.Predicate;

import ga.scmc.entity.EntityStarcraftMob;
import ga.scmc.entity.EntityStarcraftPassive;
import ga.scmc.entity.EntityZergMob;
import ga.scmc.enums.FactionTypes;
import ga.scmc.enums.TeamColors;
import ga.scmc.enums.TypeAttributes;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityBroodling extends EntityZergMob implements IMob, Predicate<EntityLivingBase>{

	public EntityBroodling(World world) {
		super(world);
		setSize(1.0F, 0.5F);
		experienceValue = 20;
		this.setTeam(TeamColors.PURPLE);
		this.setFactions(FactionTypes.SWARM);
		setTypes(TypeAttributes.LIGHT, TypeAttributes.BIOLOGICAL, TypeAttributes.GROUND);
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
		if(!entity.isInvisible()) {
			if(entity instanceof EntityStarcraftMob) {
				if(entity.isCreatureType(EnumCreatureType.MONSTER, false)) {
					if(!((EntityStarcraftMob) entity).isFaction(FactionTypes.SWARM)) {
						if(((EntityStarcraftMob) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						}else {
							return false;
						}
					}else if(((EntityStarcraftMob) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			}else if(entity instanceof EntityStarcraftPassive) {
				if(entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					if(!((EntityStarcraftPassive) entity).isFaction(FactionTypes.SWARM)) {
						if(((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						}else {
							return false;
						}
					}else if(((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			}else {
				return true;
			}
		}else if(entity.isInvisible() && this.isType(TypeAttributes.DETECTOR)){
			return true;
		}else {
			return false;
		}
		return false;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundHandler.ENTITY_BROODLING_LIVE1;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_BROODLING_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_BROODLING_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
	
	@Override
	public void onLivingUpdate() {
		if(this.ticksExisted > 160) {
			this.kill();
		}
		super.onLivingUpdate();
	}
	
	@Override
	protected void findBiomass() {
		;
	}
}
