package io.github.scmcmod.entity.living;

import com.google.common.base.Predicate;

import io.github.scmcmod.api.world.entity.ItemDrop;
import io.github.scmcmod.entity.EntityHydraliskSpike;
import io.github.scmcmod.enums.EnumColors;
import io.github.scmcmod.enums.EnumFactionTypes;
import io.github.scmcmod.enums.EnumTypeAttributes;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.SoundHandler;
import net.minecraft.entity.EntityLivingBase;
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
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * @author Hypeirochus
 */
public class EntityHydraliskPrimalDehaka extends EntityZergMob implements IMob, IRangedAttackMob, Predicate<EntityLivingBase>
{

	public EntityHydraliskPrimalDehaka(World world)
	{
		super(world);
		setSize(3.0F, 3.0F);
		this.setColor(EnumColors.YELLOW);
		this.setFactions(EnumFactionTypes.PRIMALZERG);
		setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
		this.initEntityAI();
	}

	@Override
	protected void initEntityAI()
	{
		tasks.addTask(1, new EntityAIAttackRanged(this, 0.75D, 17, 16.0F));
		tasks.addTask(2, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, true, false, this));
		super.initEntityAI();
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the
	 * target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity)
	{
		return checkTarget(entity, EnumFactionTypes.PRIMALPACKDEHAKA);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0D);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_)
	{
		EntityHydraliskSpike spike = new EntityHydraliskSpike(this.world, this);
		double d0 = target.posX - this.posX;
		double d1 = target.getEntityBoundingBox().minY + (double) (target.height / 4.0F) - spike.posY;
		double d2 = target.posZ - this.posZ;
		double d3 = (double) MathHelper.sqrt(d0 * d0 + d2 * d2);
		spike.shoot(d0, d1 + d3 * 0.20000000298023224D, d2, 1.6F, (float) (14 - this.world.getDifficulty().getId() * 4));
		this.playSound(SoundHandler.FX_HYDRALISK_FIRE, 0.5F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.world.spawnEntity(spike);
	}

	/**
	 * Drop up to 2 items when killed
	 * 
	 * @param damagedByPlayer true if the most recent damage was dealt by a player
	 * @param lootingLevel level of Looting on kill weapon
	 */
	@Override
	protected void dropFewItems(boolean recentlyHit, int looting)
	{
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.ZERG_CARAPACE, 1 + this.rand.nextInt(2), MetaHandler.CarapaceType.T2.getID()));
		drop.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound()
	{
		switch (rand.nextInt(3))
		{
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
	public SoundEvent getDeathSound()
	{
		return SoundHandler.ENTITY_HYDRALISK_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source)
	{
		return SoundHandler.ENTITY_HYDRALISK_HURT;
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	@Override
	public void setSwingingArms(boolean swingingArms)
	{

	}
}
