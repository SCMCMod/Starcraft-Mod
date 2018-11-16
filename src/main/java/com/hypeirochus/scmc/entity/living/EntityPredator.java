package com.hypeirochus.scmc.entity.living;

import java.util.ArrayList;
import java.util.Random;

import com.google.common.base.Predicate;
import com.hypeirochus.api.client.entityfx.EntityFXElectricArc;
import com.hypeirochus.api.world.entity.ItemDrop;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Hypeirochus
 */
public class EntityPredator extends EntityTerranMob implements IMob, Predicate<EntityLivingBase>
{

	public EntityPredator(World world)
	{
		super(world);
		setSize(1.5F, 1.5F);
		this.setColor(EnumColors.BLUE);
		this.setFactions(EnumFactionTypes.RAIDERS);
		setAttributes(EnumTypeAttributes.ARMORED, EnumTypeAttributes.MECHANICAL, EnumTypeAttributes.GROUND);
		this.initEntityAI();
	}

	@Override
	protected void initEntityAI()
	{
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, true, this));
		super.initEntityAI();
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the
	 * target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity)
	{
		return checkTarget(entity, EnumFactionTypes.RAIDERS);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(93.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3804D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0D);
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting)
	{
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.INGOT, 1 + this.rand.nextInt(2), MetaHandler.IngotType.STEEL.getID()));
		drop.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound()
	{
		Random rand = new Random();

		switch (rand.nextInt(1))
		{
		case 0:
			return SoundHandler.ENTITY_PREDATOR_LIVE1;
		default:
		{
			return SoundHandler.ENTITY_PREDATOR_LIVE2;
		}
		}
	}

	@Override
	public SoundEvent getDeathSound()
	{
		return SoundHandler.ENTITY_PREDATOR_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source)
	{
		return SoundHandler.ENTITY_PREDATOR_HURT;
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	@Override
	public void onDeath(DamageSource cause)
	{
		this.world.createExplosion(this, this.posX, this.posY + 0.20, this.posZ, 1.2F, false);
		super.onDeath(cause);
	}

	@SideOnly(Side.CLIENT)
	private void spawnElectricArc(double posX, double posY, double posZ)
	{
		for (int x = 0; x < 5; x++)
		{
			AccessHandler.getMinecraft().effectRenderer.addEffect(new EntityFXElectricArc(this.world, this.posX, this.posY, this.posZ, posX + this.rand.nextInt(2), posY, posZ + this.rand.nextInt(2), 10, 2.5F, 0.5F, 0.05F, 0xFF00FFFF));
		}
	}

	@Override
	public boolean attackEntityAsMob(Entity entityIn)
	{
		this.spawnElectricArc(entityIn.posX, entityIn.posY, entityIn.posZ);
		ArrayList<EntityLiving> entityList = (ArrayList<EntityLiving>) world.getEntitiesWithinAABB(EntityLiving.class, this.getEntityBoundingBox().expand(2, 2, 2));
		for (EntityLiving entity : entityList)
		{
			if (entity != this && entity != null && entity != entityIn)
			{
				if (entity instanceof EntityStarcraftMob)
				{
					if (((EntityStarcraftMob) entity).color == this.color)
					{
						break;
					} else
					{
						this.spawnElectricArc(entity.posX, entity.posY, entity.posZ);
						entity.attackEntityFrom(DamageSource.causeIndirectDamage(this, null), 3.5F);
					}
				} else if (entity instanceof EntityStarcraftPassive)
				{
					if (((EntityStarcraftPassive) entity).color == this.color)
					{
						break;
					} else
					{
						this.spawnElectricArc(entity.posX, entity.posY, entity.posZ);
						entity.attackEntityFrom(DamageSource.causeIndirectDamage(this, null), 3.5F);
					}
				} else
				{
					this.spawnElectricArc(entity.posX, entity.posY, entity.posZ);
					entity.attackEntityFrom(DamageSource.causeIndirectDamage(this, null), 3.5F);
				}
			}
		}
		return super.attackEntityAsMob(entityIn);
	}
}