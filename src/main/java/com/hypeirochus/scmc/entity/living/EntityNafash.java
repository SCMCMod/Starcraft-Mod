package com.hypeirochus.scmc.entity.living;

import java.util.Random;

import com.google.common.base.Predicate;
import com.hypeirochus.api.world.entity.ItemDrop;
import com.hypeirochus.scmc.entity.EntityHydraliskSpike;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.entity.Entity;
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
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

/**
 * Work in progress
 * 
 * @author Hypeirochus
 */
public class EntityNafash extends EntityZergMob implements IMob, IRangedAttackMob, Predicate<EntityLivingBase> {

	private static final DataParameter<Float> ENERGY = EntityDataManager.createKey(EntityNafash.class, DataSerializers.FLOAT);
	private final BossInfoServer bossInfo = (BossInfoServer) (new BossInfoServer(this.getDisplayName(), BossInfo.Color.PURPLE, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);
	public int tracker = 0;

	public EntityNafash(World world) {
		super(world);
		setSize(3.0F, 3.0F);
		experienceValue = 300;
		this.setColor(EnumColors.PURPLE);
		this.setFactions(EnumFactionTypes.SWARM);
		setAttributes(EnumTypeAttributes.PSIONIC, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND, EnumTypeAttributes.HEROIC);
		tasks.addTask(1, new EntityAIAttackRanged(this, 1.0D, 17, 16.0F));
		tasks.addTask(2, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	@Override
	public void addTrackingPlayer(EntityPlayerMP player) {
		super.addTrackingPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	/**
	 * Removes the given player from the list of players tracking this entity. See {@link Entity#addTrackingPlayer} for more information on tracking.
	 */
	@Override
	public void removeTrackingPlayer(EntityPlayerMP player) {
		super.removeTrackingPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public boolean isNonBoss() {
		return false;
	}

	@Override
	protected void updateAITasks() {
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}

	/**
	 * The method where this entity handles checks to make sure it can attack the target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity) {
		return checkTarget(entity, EnumFactionTypes.SWARM);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.17000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0D);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_) {
		EntityHydraliskSpike spike = new EntityHydraliskSpike(this.world, this);
		double d0 = target.posY + (double) target.getEyeHeight() - 2.800000023841858D - target.getDistanceSq(target.getPosition());
		double d1 = target.posX - this.posX;
		double d2 = d0 - spike.posY;
		double d3 = target.posZ - this.posZ;
		float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;
		spike.setPositionAndRotationDirect(d1, d2 + (double) f, d3, 1.6F, .0F, 0, false);
		this.playSound(SoundHandler.FX_HYDRALISK_FIRE, 0.5F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.world.spawnEntity(spike);
	}

	/**
	 * Drop up to 2 items when killed
	 * 
	 * @param damagedByPlayer
	 *            true if the most recent damage was dealt by a player
	 * @param lootingLevel
	 *            level of Looting on kill weapon
	 */
	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(100, new ItemStack(ItemHandler.ZERG_CARAPACE, 3 + this.rand.nextInt(3), MetaHandler.CarapaceType.T2.getID()));
		drop.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch (rand.nextInt(1)) {
		case 0:
			return SoundHandler.ENTITY_QUEEN_LIVE1;
		default:
			return SoundHandler.ENTITY_QUEEN_LIVE2;
		}
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_QUEEN_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source) {
		return SoundHandler.ENTITY_QUEEN_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public void onDeath(DamageSource cause) {
		if (world.isRemote) {
			PlayerList list = AccessHandler.getMinecraft().getIntegratedServer().getPlayerList();
			for (int i = 0; i < list.getCurrentPlayerCount(); i++) {
				EntityPlayer thePlayer = list.getPlayers().get(i);
				thePlayer.sendMessage(new TextComponentString("Nafash has been slain!").setStyle(new Style().setColor(TextFormatting.DARK_RED)));
			}
		}
		super.onDeath(cause);
	}

	@Override
	public void onLivingUpdate() {
		if (this.world.isRemote) {
			if (this.world.getClosestPlayerToEntity(this, 32.0D) != null) {
				EntityPlayer player = this.world.getClosestPlayerToEntity(this, 32.0D);
				if (this.tracker == 0 && this.getHealth() == this.getMaxHealth()) {
					tracker++;
					String message = "<Nafash> Who are you to challenge the true queen of the swarm?!";
					player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.DARK_PURPLE)));
				}
				if (this.tracker == 1 && this.getHealth() <= this.getMaxHealth() * .75) {
					tracker++;
					String message = "<Nafash> Agh! I will snap your bones between my claws!";
					player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.DARK_PURPLE)));
				}
				if (this.tracker == 2 && this.getHealth() <= this.getMaxHealth() * .50) {
					tracker++;
					String message = "<Nafash> I underestimated you. It will not happen again!";
					player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.DARK_PURPLE)));
				}
				if (this.tracker == 3 && this.getHealth() <= this.getMaxHealth() * .25) {
					tracker++;
					String message = "<Nafash> No, this can not be... the swarm will triumph!";
					player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.DARK_PURPLE)));
				}
			}
		}
		super.onLivingUpdate();
	}

	@Override
	public void setSwingingArms(boolean swingingArms) {
		// TODO Auto-generated method stub

	}
}