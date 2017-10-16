package ga.scmc.entity.living;

import com.google.common.base.Predicate;

import ga.scmc.entity.EntityProtossMob;
import ga.scmc.entity.EntityStarcraftMob;
import ga.scmc.entity.EntityStarcraftPassive;
import ga.scmc.entity.ai.EntityAIScarabExplode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.IMob;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityScarab extends EntityProtossMob implements IMob, Predicate<EntityLivingBase>{

	private static final DataParameter<Boolean> IGNITED = EntityDataManager.<Boolean>createKey(EntityCreeper.class, DataSerializers.BOOLEAN);
	private static final DataParameter<Boolean> POWERED = EntityDataManager.<Boolean>createKey(EntityCreeper.class, DataSerializers.BOOLEAN);
	private static final DataParameter<Integer> STATE = EntityDataManager.<Integer>createKey(EntityCreeper.class, DataSerializers.VARINT);
	private byte explosionRadius = 6;
	private short fuseTime = 10;
	// TODO: Cleanup this code in 1.6
	/**
	 * Time when this scarab was last in an active state (Messed up code here,
	 * probably causes scarab animation to go weird)
	 */
	private int lastActiveTime;

	/**
	 * The amount of time since the scarab was close enough to the player to
	 * ignite
	 */
	private int timeSinceIgnited;

	public EntityScarab(World worldIn) {
		super(worldIn);
		setSize(.1F, .1F);
		this.setTeam(TeamColors.LIGHTBLUE);
		this.setFactions(FactionTypes.DAELAAM);
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIScarabExplode(this));
		tasks.addTask(3, new EntityAIAttackMelee(this, 1, false));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}
	
	@Override
	public boolean apply(EntityLivingBase entity) {
		if(!entity.isInvisible()) {
			if(entity instanceof EntityStarcraftMob) {
				if(entity.isCreatureType(EnumCreatureType.MONSTER, false)) {
					if(!((EntityStarcraftMob) entity).isFaction(FactionTypes.DAELAAM)) {
						if(((EntityStarcraftMob) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						}else {
							return false;
						}
					}else if(((EntityStarcraftMob) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			}else if(entity instanceof EntityStarcraftPassive) {
				if(entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					if(!((EntityStarcraftPassive) entity).isFaction(FactionTypes.DAELAAM)) {
						if(((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
							return true;
						}else {
							return false;
						}
					}else if(((EntityStarcraftPassive) entity).getTeamColor() != this.getTeamColor()) {
						return true;
					}
				}
			}else {
				if(entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					return false;
				}
				return true;
			}
		}else if(entity.isInvisible() && this.isType(TypeAttributes.DETECTOR)){
			return true;
		}else {
			return false;
		}
		return false;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1024.0D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		return true;
	}

	@Override
	public boolean canBeCollidedWith() {
		return false;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		dataManager.register(STATE, Integer.valueOf(-1));
		dataManager.register(POWERED, Boolean.valueOf(false));
		dataManager.register(IGNITED, Boolean.valueOf(false));
	}

	/**
	 * Creates an explosion as determined by this scarab's power and explosion
	 * radius.
	 */
	private void explode() {
		if(!world.isRemote) {
			boolean flag = world.getGameRules().getBoolean("mobGriefing");
			float f = getPowered() ? 2 : 1;
			dead = true;
			world.createExplosion(this, posX, posY, posZ, explosionRadius * f, flag);
			setDead();
		}
	}

	@Override
	public void fall(float distance, float damageMultiplier) {
		super.fall(distance, damageMultiplier);
		timeSinceIgnited = (int) (timeSinceIgnited + distance * 1.5F);

		if(timeSinceIgnited > fuseTime - 5) {
			timeSinceIgnited = fuseTime - 5;
		}
	}

	@Override
	public float getExplosionResistance(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn) {
		return 10000;
	}

	/**
	 * The maximum height from where the entity is allowed to jump (used in
	 * pathfinder)
	 */
	@Override
	public int getMaxFallHeight() {
		return 500;
	}

	/**
	 * Returns true if the scarab is powered by a lightning bolt.
	 */
	public boolean getPowered() {
		return dataManager.get(POWERED).booleanValue();
	}

	/**
	 * Params: (Float)Render tick. Returns the intensity of the scarab's flash
	 * when it is ignited.
	 */
	@SideOnly(Side.CLIENT)
	public float getscarabFlashIntensity(float par1) {
		return (lastActiveTime + (timeSinceIgnited - lastActiveTime) * par1) / (fuseTime - 2);
	}

	/**
	 * Returns the current state of scarab, -1 is idle, 1 is 'in fuse'
	 */
	public int getScarabState() {
		return dataManager.get(STATE).intValue();
	}

	public boolean hasIgnited() {
		return dataManager.get(IGNITED).booleanValue();
	}

	public void ignite() {
		dataManager.set(IGNITED, Boolean.valueOf(true));
	}
	
	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate() {
		if(isEntityAlive()) {
			lastActiveTime = timeSinceIgnited;

			if(hasIgnited()) {
				setScarabState(1);
			}

			int i = getScarabState();

			if(i > 0 && timeSinceIgnited == 0) {
				playSound(SoundEvents.ENTITY_CREEPER_PRIMED, 1, 0.5F);
			}

			timeSinceIgnited += i;

			if(timeSinceIgnited < 0) {
				timeSinceIgnited = 0;
			}

			if(timeSinceIgnited >= fuseTime) {
				timeSinceIgnited = fuseTime;
				explode();
			}
		}

		if(ticksExisted > 500) {
			explode();
		}

		super.onUpdate();
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		dataManager.set(POWERED, Boolean.valueOf(compound.getBoolean("powered")));

		if(compound.hasKey("Fuse", 99)) {
			fuseTime = compound.getShort("Fuse");
		}

		if(compound.hasKey("ExplosionRadius", 99)) {
			explosionRadius = compound.getByte("ExplosionRadius");
		}

		if(compound.getBoolean("ignited")) {
			ignite();
		}
	}

	/**
	 * Sets the state of scarab, -1 to idle and 1 to be 'in fuse'
	 */
	public void setScarabState(int state) {
		dataManager.set(STATE, Integer.valueOf(state));
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);

		if(dataManager.get(POWERED).booleanValue()) {
			compound.setBoolean("powered", true);
		}

		compound.setShort("Fuse", fuseTime);
		compound.setByte("ExplosionRadius", explosionRadius);
		compound.setBoolean("ignited", hasIgnited());
	}
}