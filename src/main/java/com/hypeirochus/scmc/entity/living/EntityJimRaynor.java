package com.hypeirochus.scmc.entity.living;

import com.google.common.base.Predicate;
import com.hypeirochus.api.world.entity.ItemDrop;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.items.ItemGun;

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
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

/**
 * Work in progress
 * 
 * @author Hypeirochus
 */
public class EntityJimRaynor extends EntityTerranMob implements IMob, IRangedAttackMob, Predicate<EntityLivingBase> {

	public EntityJimRaynor(World world) {
		super(world);
		setSize(0.8F, 2.2F);
		experienceValue = 30;
		this.setColor(EnumColors.BLUE);
		this.setFactions(EnumFactionTypes.RAIDERS);
		setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
		tasks.addTask(1, new EntityAIAttackRanged(this, 0.75D, 17, 16.0F));
		tasks.addTask(2, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, true, false, this));
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(1, new ItemStack(ItemHandler.C14_GAUSS_RIFLE, 0));
		ItemDrop drop2 = new ItemDrop(10, new ItemStack(ItemHandler.STIMPACK, 0));
		ItemDrop drop3 = new ItemDrop(30, new ItemStack(ItemHandler.BULLET_MAGAZINE, 1 + this.rand.nextInt(1), 0));
		drop.tryDrop(this);
		drop2.tryDrop(this);
		drop3.tryDrop(this);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.32000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0D);
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity) {
		return checkTarget(entity, EnumFactionTypes.RAIDERS);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_) {
		ItemHandler.C14_GAUSS_RIFLE.onItemRightClick(world, this, EntityEquipmentSlot.MAINHAND);
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundHandler.ENTITY_MARINE_LIVE1;
	}

	@Override
	public SoundEvent getDeathSound() {
		switch (rand.nextInt(1)) {
		case 0:
			return SoundHandler.ENTITY_MARINE_HURT;
		default:
			return SoundHandler.ENTITY_MARINE_DEATH;
		}

	}

	@Override
	public void setSwingingArms(boolean swingingArms) {

	}
}
