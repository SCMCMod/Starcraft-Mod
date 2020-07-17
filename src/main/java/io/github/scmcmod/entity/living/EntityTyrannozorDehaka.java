package io.github.scmcmod.entity.living;

import com.google.common.base.Predicate;


import io.github.scmcmod.enums.EnumColors;
import io.github.scmcmod.enums.EnumFactionTypes;
import io.github.scmcmod.enums.EnumTypeAttributes;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.SoundHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Hypeirochus
 */
public class EntityTyrannozorDehaka extends EntityZergMob implements IMob, Predicate<EntityLivingBase>
{

	public EntityTyrannozorDehaka(World world)
	{
		super(world);
		setSize(4.0F, 6.0F);
		this.setColor(EnumColors.YELLOW);
		this.setFactions(EnumFactionTypes.PRIMALPACKDEHAKA);
		setAttributes(EnumTypeAttributes.MASSIVE, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND, EnumTypeAttributes.ARMORED, EnumTypeAttributes.HEROIC);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1.0D));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
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

		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(750.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2700000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(100.0D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(4.0D);
	}

	@Override
	public boolean canBePushed()
	{
		return false;
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
		ItemDrop drop = new ItemDrop(100, new ItemStack(ItemHandler.ZERG_CARAPACE, 3 + this.rand.nextInt(3), MetaHandler.CarapaceType.T3.getID()));
		drop.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound()
	{
		return SoundHandler.ENTITY_BRUTALISK_LIVE1;
	}

	@Override
	public SoundEvent getDeathSound()
	{
		return SoundHandler.ENTITY_BRUTALISK_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source)
	{
		return SoundHandler.ENTITY_BRUTALISK_HURT;
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn)
	{
		playSound(SoundHandler.ENTITY_BRUTALISK_STEP, 1.0F, 1.0F);
	}
}
