package com.hypeirochus.scmc.entity.living;

import com.hypeirochus.api.client.entityfx.EntityFXElectricArc;
import com.hypeirochus.scmc.entity.IShieldEntity;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.LootTableHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPurifierProbe extends EntityProtossPassive implements IShieldEntity {

	public EntityPurifierProbe(World world) {
		super(world);
		setSize(1.0F, 1.5F);
		this.setColor(EnumColors.ORANGE);
		this.setFactions(EnumFactionTypes.PURIFIER);
		setTypes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.MECHANICAL, EnumTypeAttributes.GROUND);
		this.initEntityAI();
	}
	
	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAvoidEntity<EntityZergMob>(this, EntityZergMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(2, new EntityAIAvoidEntity<EntityTerranMob>(this, EntityTerranMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		super.initEntityAI();
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(13.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000298023224D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundHandler.ENTITY_PROBE_LIVE1;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_PROBE_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source) {
		return SoundHandler.ENTITY_PROBE_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	protected ResourceLocation getLootTable() {
		return LootTableHandler.ENTITY_PROBE;
	}

	@Override
	public void onDeath(DamageSource cause) {
		this.spawnElectricArc(this.posX + this.rand.nextDouble(), this.posY + this.rand.nextDouble(), this.posZ + this.rand.nextDouble());
		this.world.createExplosion(this, this.posX, this.posY + 0.35, this.posZ, 1.2F, false);
		super.onDeath(cause);
	}

	@SideOnly(Side.CLIENT)
	private void spawnElectricArc(double posX, double posY, double posZ) {
		for (int x = 0; x < 5; x++) {
			AccessHandler.getMinecraft().effectRenderer.addEffect(new EntityFXElectricArc(this.world, this.posX, this.posY, this.posZ, posX + this.rand.nextInt(2), posY, posZ + this.rand.nextInt(2), 10, 2.5F, 0.5F, 0.05F, 0xFFF4710A));
		}
	}
	
	@Override
	public float getMaxShields() {
		return 13.0F;
	}
}
