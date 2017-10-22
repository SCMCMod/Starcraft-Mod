package ga.scmc.entity.living;

import com.google.common.base.Predicate;

import ga.scmc.debugging.ColorProvider;
import ga.scmc.debugging.IColor;
import ga.scmc.entity.EntityProtossMob;
import ga.scmc.entity.EntityStarcraftMob;
import ga.scmc.entity.EntityStarcraftPassive;
import ga.scmc.entity.projectiles.EntityC14GaussRifleBullet;
import ga.scmc.enums.FactionTypes;
import ga.scmc.enums.TeamColors;
import ga.scmc.enums.TypeAttributes;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * Work in progress
 * @author Hypeirochus
 */
public class EntityDragoon extends EntityProtossMob implements IMob, IRangedAttackMob, Predicate<EntityLivingBase> {

	public float offsetHealth;
	public int timeSinceHurt;
	 
	public EntityDragoon(World world) {
		super(world);
		setSize(3.0F, 3.0F);
		experienceValue = 60;
		this.setTeamColor(TeamColors.LIGHT_BLUE);
		this.setFactions(FactionTypes.DAELAAM);
		setTypes(TypeAttributes.ARMORED, TypeAttributes.MECHANICAL, TypeAttributes.GROUND);
		tasks.addTask(1, new EntityAIAttackRanged(this, 1.0D, 17, 16.0F));
		tasks.addTask(2, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
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
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_) {
		EntityC14GaussRifleBullet bullet = new EntityC14GaussRifleBullet(this.world, this);
		double d0 = target.posY + (double) target.getEyeHeight() - 1.800000023841858D - target.getDistanceSq(target.getPosition());
		double d1 = target.posX - this.posX;
		double d2 = d0 - bullet.posY;
		double d3 = target.posZ - this.posZ;
		float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;
		bullet.setThrowableHeading(d1, d2 + (double) f, d3, 1.6F, .0F);
		this.playSound(SoundHandler.FX_C14GAUSSRIFLE_FIRING, 0.5F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.world.spawnEntity(bullet);
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(133.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}
	
	@Override
	protected void damageEntity(DamageSource damageSrc, float damageAmount) {
		timeSinceHurt = this.ticksExisted;
		super.damageEntity(damageSrc, damageAmount);
	}
	
	@Override
	public void onLivingUpdate() {
			if(ticksExisted % 20 == 0 && this.getHealth() < this.getMaxHealth()) {
				if(this.getHealth() < 66.5 - offsetHealth) {
					offsetHealth = 66.5F - getHealth();
				}
				if(this.getHealth() < this.getMaxHealth() - offsetHealth && ticksExisted - timeSinceHurt > 200) {
					this.heal(2.0F);
				}
			}
		super.onLivingUpdate();
	}
}
