package com.hypeirochus.scmc.entity.living;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.client.gui.GuiLarvaProgress;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.handlers.GuiHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.lib.Library;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityLarvaCocoon extends EntityZergPassive {

	/**
	 * This is the entity that this guy will hatch into. It's saved in a byte id because we only need about 15
	 */
	private int transformId;

	public EntityLarvaCocoon(World world) {
		this(world, 0);
	}

	public EntityLarvaCocoon(World world, int id) {
		super(world);
		this.setSize(1.0F, 1.0F);
		this.transformId = id;
		this.setColor(EnumColors.PURPLE);
		this.setFactions(EnumFactionTypes.SWARM);
		this.setTypes(EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(133.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(20.0D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundHandler.ENTITY_ZERGCOCOON_LIVE1;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_ZERGCOCOON_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source) {
		return SoundHandler.ENTITY_ZERGCOCOON_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public boolean isPushedByWater() {
		return false;
	}

	@Override
	protected void updateAITasks() {
		if (ticksExisted > getTransformTime()) {
			if (getEntityById(world, transformId) instanceof EntityStarcraftMob) {
				Library.replaceEntity(true, this, ((EntityStarcraftMob) getEntityById(world, transformId)).setColor(teamColor));
			} else if (getEntityById(world, transformId) instanceof EntityStarcraftPassive) {
				Library.replaceEntity(true, this, ((EntityStarcraftPassive) getEntityById(world, transformId)).setColor(teamColor));
			} else {
				Library.replaceEntity(true, this, getEntityById(world, transformId));
			}
			// TODO add a hatching sound right here
		}
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		boolean flag = stack != null && stack.getItem() == Items.SPAWN_EGG;

		if (!flag && this.isEntityAlive() && !this.isChild() && !player.isSneaking()) {
			if (this.world.isRemote) {
				GuiLarvaProgress.INSTANCE.openGUI(player, Starcraft.instance, GuiHandler.LARVA_PROGRESS_ID, world, (int) player.posX, (int) player.posY, (int) player.posZ, this);
			}
			return true;
		} else {
			return super.processInteract(player, hand);
		}
	}

	@Override
	protected void setRotation(float par1, float par2) {
		rotationYaw = 0;
		rotationPitch = 0;
	}

	public int getTransformId() {
		return transformId;
	}

	public int getTransformTime() {
		return secondsToTicks(85);
	}

	//TODO: Finish this, zerg cocoons morph into Ocelots. Lol.
	public static EntityLivingBase getEntityById(World world, int id) {
		switch (id) {
		default:
			return new EntityOcelot(world);
		case 0:
			return new EntityOcelot(world);
		case 2:
			return new EntityZergling(world);
		case 3:
			return new EntityZerglingSwarmling(world);
		case 4:
			return new EntityZerglingRaptor(world);
		case 9:
			return new EntityHydralisk(world);
		}
	}
}