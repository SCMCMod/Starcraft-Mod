package ga.scmc.entity.living;

import com.google.common.base.Predicate;

import ga.scmc.entity.EntityC14GaussRifleBullet;
import ga.scmc.enums.EnumColors;
import ga.scmc.enums.EnumFactionTypes;
import ga.scmc.enums.EnumTypeAttributes;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import hypeirochus.api.world.entity.ItemDrop;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
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
	 * The method where this entity handles checks to make sure it can attack the
	 * target.
	 */
	@Override
	public boolean apply(EntityLivingBase entity) {
		return checkTarget(entity, EnumFactionTypes.RAIDERS);
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
}
