package ga.scmc.entity.living;

import com.arisux.mdx.lib.world.entity.ItemDrop;

import ga.scmc.entity.EntityProtossPassive;
import ga.scmc.entity.EntityTerranMob;
import ga.scmc.entity.EntityZergMob;
import ga.scmc.handlers.ItemEnumHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityProbe extends EntityProtossPassive {

	public float offsetHealth;
	public int timeSinceHurt;

	public EntityProbe(World world) {
		super(world);
		setSize(1.0F, 1.5F);
		this.setTeam(teamColors.LIGHTBLUE);
		this.setFactions(factionTypes.DAELAAM);
		setTypes(typeAttributes.LIGHT, typeAttributes.MECHANICAL, typeAttributes.GROUND);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAvoidEntity<EntityZergMob>(this, EntityZergMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(2, new EntityAIAvoidEntity<EntityTerranMob>(this, EntityTerranMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(27.0D);
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
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_PROBE_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
	
	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(10, new ItemStack(ItemHandler.PROTOSS_INGOT, 1 + this.rand.nextInt(2), ItemEnumHandler.ProtossIngotType.KHALAI.getID()));
		drop.tryDrop(this);
	}
	
	@Override
	public void onDeath(DamageSource cause) {
		this.world.createExplosion(this, this.posX, this.posY + 0.35, this.posZ, 1.2F, false);
		super.onDeath(cause);
	}
	
	@Override
	protected void damageEntity(DamageSource damageSrc, float damageAmount) {
		timeSinceHurt = this.ticksExisted;
		super.damageEntity(damageSrc, damageAmount);
	}
	
	@Override
	public void onUpdate() {
			if(ticksExisted % 20 == 0 && this.getHealth() < this.getMaxHealth()) {
				if(this.getHealth() < 13.5 - offsetHealth) {
					offsetHealth = 13.5F - getHealth();
				}
				if(this.getHealth() < this.getMaxHealth() - offsetHealth && ticksExisted - timeSinceHurt > 200) {
					this.heal(2.0F);
				}
			}
		super.onUpdate();
	}
}
