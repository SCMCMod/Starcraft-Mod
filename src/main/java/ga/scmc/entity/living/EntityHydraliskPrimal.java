package ga.scmc.entity.living;

import com.arisux.mdx.lib.world.entity.ItemDrop;
import com.google.common.base.Predicate;

import ga.scmc.capabilities.ColorProvider;
import ga.scmc.capabilities.IColor;
import ga.scmc.entity.EntityHydraliskSpike;
import ga.scmc.enums.EnumFactionTypes;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.enums.EnumTeamColors;
import ga.scmc.enums.EnumTypeAttributes;
import ga.scmc.handlers.ItemHandler;
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
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * @author Hypeirochus
 */
public class EntityHydraliskPrimal extends EntityZergMob implements IMob, IRangedAttackMob, Predicate<EntityLivingBase> {

	public EntityHydraliskPrimal(World world) {
		super(world);
		setSize(3.0F, 3.0F);
		experienceValue = 60;
		this.baseHealth = 60;
		this.setTeamColor(EnumTeamColors.CYAN);
		this.setFactions(EnumFactionTypes.PRIMALZERG);
		setTypes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
		tasks.addTask(1, new EntityAIAttackRanged(this, 0.75D, 17, 16.0F));
		tasks.addTask(2, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, true, false, this));
	}

	@Override
	public boolean apply(EntityLivingBase entity) {
		if(!entity.isInvisible()) {
			if(entity instanceof EntityStarcraftMob) {
				if(entity.isCreatureType(EnumCreatureType.MONSTER, false)) {
					if(!((EntityStarcraftMob) entity).isFaction(EnumFactionTypes.PRIMALZERG)) {
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
					if(!((EntityStarcraftPassive) entity).isFaction(EnumFactionTypes.PRIMALZERG)) {
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
			} else {
				return true;
			}
		}else if(entity.isInvisible() && this.isType(EnumTypeAttributes.DETECTOR)){
			return true;
		}else {
			return false;
		}
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0D);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_) {
		EntityHydraliskSpike spike = new EntityHydraliskSpike(this.world, this);
		double d0 = target.posY + (double) target.getEyeHeight() - 1.800000023841858D - target.getDistanceSq(target.getPosition());
		double d1 = target.posX - this.posX;
		double d2 = d0 - spike.posY;
		double d3 = target.posZ - this.posZ;
		float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;
		spike.setThrowableHeading(d1, d2 + (double) f, d3, 1.6F, .0F);
		this.playSound(SoundHandler.FX_HYDRALISK_FIRE, 0.5F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.world.spawnEntity(spike);
	}

	/**
	 * Drop up to 2 items when killed
	 * @param damagedByPlayer true if the most recent damage was dealt by a
	 * player
	 * @param lootingLevel level of Looting on kill weapon
	 */
	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.ZERG_CARAPACE, 1 + this.rand.nextInt(2), EnumMetaItem.CarapaceType.T2.getID()));
		drop.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound() {
		switch(rand.nextInt(3)) {
			case 0:
				return SoundHandler.ENTITY_HYDRALISK_LIVE1;
			case 1:
				return SoundHandler.ENTITY_HYDRALISK_LIVE2;
			case 2:
				return SoundHandler.ENTITY_HYDRALISK_LIVE3;
			default:
				return SoundHandler.ENTITY_HYDRALISK_LIVE4;
		}
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_HYDRALISK_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_HYDRALISK_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
}
