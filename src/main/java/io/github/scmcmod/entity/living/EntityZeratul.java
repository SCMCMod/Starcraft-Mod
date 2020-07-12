package io.github.scmcmod.entity.living;

import com.google.common.base.Predicate;

import io.github.scmcmod.enums.EnumColors;
import io.github.scmcmod.enums.EnumFactionTypes;
import io.github.scmcmod.enums.EnumTypeAttributes;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.SoundHandler;
import io.github.scmcmod.handlers.WeaponHandler;
import net.minecraft.entity.Entity;
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
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityZeratul extends EntityProtossMob implements IMob, Predicate<EntityLivingBase>
{

	private final BossInfoServer bossInfo = (BossInfoServer) (new BossInfoServer(this.getDisplayName(), BossInfo.Color.BLUE, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);
	private static final DataParameter<Boolean> SHEATH = EntityDataManager.createKey(EntityZeratul.class, DataSerializers.BOOLEAN);

	public EntityZeratul(World world)
	{
		super(world);
		setSize(1.5F, 2.5F);
		this.setColor(EnumColors.LIGHT_BLUE);
		this.setFactions(EnumFactionTypes.DAELAAM);
		setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND, EnumTypeAttributes.PSIONIC, EnumTypeAttributes.HEROIC);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	@Override
	public void addTrackingPlayer(EntityPlayerMP player)
	{
		super.addTrackingPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();

		this.getDataManager().register(SHEATH, false);
	}

	public boolean canSheathBlades()
	{
		return this.getDataManager().get(SHEATH);
	}

	protected void setSheathed(boolean bool)
	{
		this.getDataManager().set(SHEATH, bool);
	}

	/**
	 * Removes the given player from the list of players tracking this entity. See
	 * {@link Entity#addTrackingPlayer} for more information on tracking.
	 */
	@Override
	public void removeTrackingPlayer(EntityPlayerMP player)
	{
		super.removeTrackingPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public boolean isNonBoss()
	{
		return false;
	}

	@Override
	protected void updateAITasks()
	{
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the
	 * target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity)
	{
		return checkTarget(entity, EnumFactionTypes.DAELAAM);
	}

	@Override
	protected boolean canDespawn()
	{
		return false;
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(45.0D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	/**
	 * Drop 0-2 items on death
	 * 
	 * @param recentPlayerDmg {@code true} if a player recently dealt damage to this
	 *        entity
	 * @param lootingLvl level of Looting enchant used to deliver killing blow of
	 *        entity
	 */
	@Override
	protected void dropFewItems(boolean recentPlayerDmg, int lootingLvl)
	{
		dropItem(WeaponHandler.MASTER_PSI_BLADE, 1);
		entityDropItem(new ItemStack(ItemHandler.ENERGY, 4 + rand.nextInt(2), 0), 0);
	}

	@Override
	public SoundEvent getAmbientSound()
	{
		if (rand.nextInt(1) == 0)
			return SoundHandler.ENTITY_DARKTEMPLAR_LIVE1;

		return SoundHandler.ENTITY_DARKTEMPLAR_LIVE2;
	}

	@Override
	public SoundEvent getDeathSound()
	{
		return SoundHandler.ENTITY_DARKTEMPLAR_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source)
	{
		return SoundHandler.ENTITY_DARKTEMPLAR_HURT;
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	@Override
	public void setAttackTarget(EntityLivingBase entitylivingbaseIn)
	{
		if (entitylivingbaseIn != null && (int) this.getDistance(entitylivingbaseIn) < 16)
		{
			this.setSheathed(true);
		}
		super.setAttackTarget(entitylivingbaseIn);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount)
	{

		this.setSheathed(true);
		return super.attackEntityFrom(source, amount);
	}

	@Override
	public void onUpdate()
	{
		if (!world.isRemote)
		{
			if (this.getAttackTarget() != null)
			{
				this.setSheathed(true);
			} else if (this.getAttackTarget() == null)
			{
				this.setSheathed(false);
			}
		}
		super.onUpdate();
	}
}
