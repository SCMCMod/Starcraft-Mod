package ga.scmc.entity.living;

import java.util.Random;

import com.arisux.mdx.lib.client.entityfx.EntityFXElectricArc;
import com.arisux.mdx.lib.game.Game;
import com.arisux.mdx.lib.world.entity.ItemDrop;
import com.google.common.base.Predicate;

import ga.scmc.entity.EntityStarcraftMob;
import ga.scmc.entity.EntityStarcraftPassive;
import ga.scmc.entity.EntityTerranMob;
import ga.scmc.enums.FactionTypes;
import ga.scmc.enums.TeamColors;
import ga.scmc.enums.TypeAttributes;
import ga.scmc.handlers.ItemEnumHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
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
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Hypeirochus
 */
public class EntityPredator extends EntityTerranMob implements IMob, Predicate<EntityLivingBase> {

	public EntityPredator(World world) {
		super(world);
		setSize(1.5F, 1.5F);
		experienceValue = 93;
		this.setTeamColor(TeamColors.BLUE);
		this.setFactions(FactionTypes.RAIDERS);
		setTypes(TypeAttributes.ARMORED, TypeAttributes.MECHANICAL, TypeAttributes.GROUND);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, true, this));
	}

	@Override
	public boolean apply(EntityLivingBase entity) {
		if (!entity.isInvisible()) {
			if (entity instanceof EntityStarcraftMob) {
				if (entity.isCreatureType(EnumCreatureType.MONSTER, false)) {
					if (!((EntityStarcraftMob) entity).isFaction(FactionTypes.RAIDERS)) {
						if (((EntityStarcraftMob) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						} else {
							return false;
						}
					} else if (((EntityStarcraftMob) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			} else if (entity instanceof EntityStarcraftPassive) {
				if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					if (!((EntityStarcraftPassive) entity).isFaction(FactionTypes.RAIDERS)) {
						if (((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						} else {
							return false;
						}
					} else if (((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			} else {
				if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					return false;
				}
				return true;
			}
		} else if (entity.isInvisible() && this.isType(TypeAttributes.DETECTOR)) {
			return true;
		} else {
			return false;
		}
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(93.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3804D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0D);
	}

	@Override
	protected boolean processInteract(EntityPlayer player, EnumHand hand, ItemStack stack) {
		ItemStack heldItem = player.getHeldItem(hand);
		if (heldItem != null && heldItem.getItem() == Items.DYE) {
			int meta = heldItem.getMetadata();
			setTeamColor(TeamColors.values()[meta]);
			heldItem.stackSize -= 1;
			return true;
		} else {
			return super.processInteract(player, hand, stack);
		}
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(10, new ItemStack(ItemHandler.INGOT, 1 + this.rand.nextInt(2), ItemEnumHandler.IngotType.STEEL.getID()));
		drop.tryDrop(this);
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch (rand.nextInt(1)) {
		case 0:
			return SoundHandler.ENTITY_PREDATOR_LIVE1;
		default: {
			return SoundHandler.ENTITY_PREDATOR_LIVE2;
		}
		}
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_PREDATOR_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_PREDATOR_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public void onDeath(DamageSource cause) {
		this.world.createExplosion(this, this.posX, this.posY + 0.20, this.posZ, 1.2F, false);
		super.onDeath(cause);
	}

	@SideOnly(Side.CLIENT)
	private void spawnElectricArc(double posX, double posY, double posZ) {
		for (int x = 0; x < 10; x++) {
			Game.minecraft().effectRenderer.addEffect(new EntityFXElectricArc(this.world, this.posX, this.posY, this.posZ, posX + this.rand.nextInt(2), posY, posZ + this.rand.nextInt(2), 10, 2.5F, 0.5F, 0.05F, 0xFF00FFFF));
		}
	}

	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		this.spawnElectricArc(entityIn.posX, entityIn.posY, entityIn.posZ);
		return super.attackEntityAsMob(entityIn);
	}
}