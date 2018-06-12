package com.hypeirochus.scmc.entity.living;

import com.google.common.base.Predicate;
import com.hypeirochus.api.world.entity.ItemDrop;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;

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

public class EntityInfestedCivilian extends EntityZergMob implements IMob, Predicate<EntityLivingBase> {

	public EntityInfestedCivilian(World world) {
		super(world);
		setSize(1, 2.0F);
		this.setColor(EnumColors.PURPLE);
		this.setFactions(EnumFactionTypes.SWARM);
		setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
		this.initEntityAI();
	}
	
	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
		super.initEntityAI();
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the
	 * target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity) {
		return checkTarget(entity, EnumFactionTypes.SWARM);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();

		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.ZERG_CARAPACE, 1 + this.rand.nextInt(2), MetaHandler.CarapaceType.T1.getID()));
		drop.tryDrop(this);
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundHandler.ENTITY_INFESTEDCIVILIAN_LIVE1;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundHandler.ENTITY_INFESTEDCIVILIAN_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_INFESTEDCIVILIAN_DEATH;
	}

	@Override
	protected void findBiomass() {
		
	}
}
