package com.arpaesis.scmc.entity.living;

import java.util.Random;

import com.arpaesis.api.world.entity.ItemDrop;
import com.arpaesis.scmc.entity.IShieldEntity;
import com.arpaesis.scmc.enums.EnumColors;
import com.arpaesis.scmc.enums.EnumFactionTypes;
import com.arpaesis.scmc.enums.EnumTypeAttributes;
import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.handlers.ItemHandler;
import com.arpaesis.scmc.handlers.SoundHandler;
import com.google.common.base.Predicate;

import net.minecraft.entity.EntityLivingBase;
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

public class EntityProtossReaver extends EntityProtossMob implements IMob, IRangedAttackMob, IShieldEntity, Predicate<EntityLivingBase>
{

	public int ammo = 4;

	public EntityProtossReaver(World world)
	{
		super(world);
		setSize(5.0F, 5.0F);
		this.setColor(EnumColors.LIGHT_BLUE);
		this.setFactions(EnumFactionTypes.DAELAAM);
		setAttributes(EnumTypeAttributes.MASSIVE, EnumTypeAttributes.MECHANICAL, EnumTypeAttributes.GROUND, EnumTypeAttributes.ARMORED);
		this.initEntityAI();
	}

	@Override
	protected void initEntityAI()
	{
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackRanged(this, 0.25F, 85, 30));
		tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
		super.initEntityAI();
	}

	@Override
	public boolean apply(EntityLivingBase entity)
	{
		return checkTarget(entity, EnumFactionTypes.DAELAAM);
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting)
	{
		ItemDrop drop = new ItemDrop(10, new ItemStack(ItemHandler.PROTOSS_INGOT, 1 + this.rand.nextInt(2), MetaHandler.ProtossIngotType.KHALAI.getID()));
		drop.tryDrop(this);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(133.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.24000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(24);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entity, float distance)
	{
		if (!world.isRemote && this.ammo > 1 && this.getAttackTarget() != null)
		{
			EntityScarab scarab = new EntityScarab(world, this.getColor(), EnumFactionTypes.DAELAAM);
			scarab.setLocationAndAngles(posX, posY, posZ, 0, 0);
			world.spawnEntity(scarab);
			ammo--;
		}
	}

	@Override
	public boolean canBePushed()
	{
		return false;
	}

	@Override
	public SoundEvent getAmbientSound()
	{
		Random rand = new Random();

		switch (rand.nextInt(4))
		{
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
	public SoundEvent getDeathSound()
	{
		return SoundHandler.ENTITY_PREAVER_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source)
	{
		return SoundHandler.ENTITY_PREAVER_HURT;
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	@Override
	public void onLivingUpdate()
	{

		if (ticksExisted % 160 == 0 || ticksExisted % 160 == 1)
		{
			if (ammo < 4)
			{
				ammo++;
			}
		}
		super.onLivingUpdate();
	}

	@Override
	public void setSwingingArms(boolean swingingArms)
	{

	}

	@Override
	public float getMaxShields()
	{
		return 100.0F;
	}
}