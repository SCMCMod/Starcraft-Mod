package ga.scmc.entity.living;

import java.util.Random;

import com.arisux.mdx.lib.world.entity.ItemDrop;
import com.google.common.base.Predicate;

import ga.scmc.debugging.ColorProvider;
import ga.scmc.debugging.IColor;
import ga.scmc.entity.EntityProtossMob;
import ga.scmc.entity.EntityStarcraftMob;
import ga.scmc.entity.EntityStarcraftPassive;
import ga.scmc.enums.FactionTypes;
import ga.scmc.enums.TeamColors;
import ga.scmc.enums.TypeAttributes;
import ga.scmc.handlers.ItemEnumHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityProtossReaver extends EntityProtossMob implements IMob, IRangedAttackMob, Predicate<EntityLivingBase> {

	public float offsetHealth;
	public int timeSinceHurt;
	public int ammo = 4;
	
	public EntityProtossReaver(World world) {
		super(world);
		setSize(5.0F, 5.0F);
		experienceValue = 133;
		this.setTeamColor(TeamColors.LIGHTBLUE);
		this.setFactions(FactionTypes.DAELAAM);
		setTypes(TypeAttributes.MASSIVE, TypeAttributes.MECHANICAL, TypeAttributes.GROUND, TypeAttributes.ARMORED);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackRanged(this, 0.25F, 85, 30));
		tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	@Override
	public boolean apply(EntityLivingBase entity) {
		if(!entity.isInvisible()) {
			if(entity instanceof EntityStarcraftMob) {
				if(entity.isCreatureType(EnumCreatureType.MONSTER, false)) {
					if(!((EntityStarcraftMob) entity).isFaction(FactionTypes.DAELAAM)) {
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
					if(!((EntityStarcraftPassive) entity).isFaction(FactionTypes.DAELAAM)) {
						if(((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						}else {
							return false;
						}
					}else if(((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			}else if(entity instanceof EntityPlayer) {
				IColor color = ((EntityPlayer) entity).getCapability(ColorProvider.COLOR, null);
				if(color.getColor() == this.getTeamColor().getId()) {
					return false;
				}else {
					return true;
				}
			}else {
				if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					return false;
				}
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
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(10, new ItemStack(ItemHandler.PROTOSS_INGOT, 1 + this.rand.nextInt(2), ItemEnumHandler.ProtossIngotType.KHALAI.getID()));
		drop.tryDrop(this);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(250.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.24000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entity, float distance) {
		if(!world.isRemote && this.ammo > 1) {
			EntityScarab scarab = new EntityScarab(world, this.getTeamColor(), FactionTypes.DAELAAM);
			scarab.setLocationAndAngles(posX, posY, posZ, 0, 0);
			world.spawnEntity(scarab);
			ammo--;
		}else {
			System.out.println("NO AMMO!");
		}
	}

	@Override
	public boolean canBePushed() {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch(rand.nextInt(4)) {
			case 0:
				return SoundHandler.ENTITY_PREAVER_LIVE1;
			case 1:
				return SoundHandler.ENTITY_PREAVER_LIVE2;
			case 2:
				return SoundHandler.ENTITY_PREAVER_LIVE3;
			case 3:
				return SoundHandler.ENTITY_PREAVER_LIVE4;
			default:
				return SoundHandler.ENTITY_PREAVER_LIVE5;
				}
			
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_PREAVER_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_PREAVER_HURT;
	}
	
	@Override
	public int getTalkInterval() {
		return 160;
	}
	
	@Override
	protected void damageEntity(DamageSource damageSrc, float damageAmount) {
		timeSinceHurt = this.ticksExisted;
		super.damageEntity(damageSrc, damageAmount);
	}
	
	@Override
	public void onLivingUpdate() {
			if(ticksExisted % 20 == 0 && this.getHealth() < this.getMaxHealth()) {
				if(this.getHealth() < 143.0 - offsetHealth) {
					offsetHealth = 143.0F - getHealth();
				}
				if(this.getHealth() < this.getMaxHealth() - offsetHealth && ticksExisted - timeSinceHurt > 200) {
					this.heal(2.0F);
				}
			}else if(ticksExisted % 160 == 0 || ticksExisted % 160  == 1) {
				if(ammo < 4) {
					ammo++;
					System.out.println("regenerating ammo!");
				}
			}
		super.onLivingUpdate();
	}
}