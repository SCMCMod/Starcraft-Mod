package com.hypeirochus.scmc.entity.living;

import java.util.HashMap;
import java.util.Map;

import com.hypeirochus.scmc.api.IEntityTeamColorable;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public abstract class EntityStarcraftMob extends EntityMob implements IEntityTeamColorable<EntityStarcraftMob> {

	private static final DataParameter<Integer> COLOR = EntityDataManager.createKey(EntityStarcraftMob.class, DataSerializers.VARINT);
	private static final DataParameter<String> OWNER = EntityDataManager.createKey(EntityStarcraftMob.class, DataSerializers.STRING);

	Map<Integer, EnumTypeAttributes> types = new HashMap<Integer, EnumTypeAttributes>();
	Map<Integer, EnumFactionTypes> factions = new HashMap<Integer, EnumFactionTypes>();
	EnumColors color;

	public EntityStarcraftMob(World world) {
		super(world);
	}

	/**
	 * Makes starcraft mobs spawn anywhere, as long as the difficulty is not peaceful.
	 */
	@Override
	public boolean getCanSpawnHere() {
		if (this.world.getDifficulty() != EnumDifficulty.PEACEFUL) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Initializes the entity NBT values. Owner is set to empty by default.
	 */
	@Override
	protected void entityInit() {
		super.entityInit();

		this.getDataManager().register(COLOR, 0);
		this.getDataManager().register(OWNER, "");
	}

	/**
	 * 
	 * @param type
	 *            The type we are checking the mob for.
	 * @return True if the mob is the type requested, false otherwise.
	 */
	public boolean hasAttribute(EnumTypeAttributes type) {
		for (int x = 0; x < types.size(); x++) {
			if (this.types.get(x) == type) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param faction
	 *            The faction we are checking the mob for.
	 * @return True if the mob is of the requested faction, false otherwise.
	 */
	public boolean isFaction(EnumFactionTypes faction) {
		for (int x = 0; x < factions.size(); x++) {
			if (this.factions.get(x) == faction) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets the color of the mob.
	 */
	public EnumColors getColor() {
		for (EnumColors color : EnumColors.values()) {
			if (color.getId() == this.getColorID()) {
				return color;
			}
		}
		return null;
	}

	/**
	 * Sets the color of this mob to whatever the color specified is.
	 */
	public EntityStarcraftMob setColor(EnumColors color) {
		this.color = color;
		this.setColorID(color.getId());
		return this;
	}

	/**
	 * 
	 * @param types
	 *            The attributes we want our entity to have.
	 * @return The mob.
	 */
	public EntityStarcraftMob setAttributes(EnumTypeAttributes... types) {
		for (int x = 0; x < types.length; x++) {
			this.types.put(x, types[x]);
		}
		return this;
	}
	
	public EntityStarcraftMob amendAttribute(EnumTypeAttributes type) {
		this.types.put(types.size(), type);
		return this;
	}
	
	public EntityStarcraftMob removeAttribute(EnumTypeAttributes type) {
		for (int x = 0; x < types.size(); x++) {
			if (this.types.get(x) == type) {
				this.types.remove(x);
				return this;
			}
		}
		return this;
	}

	/**
	 * 
	 * @param types
	 *            Sets the mob to be under the given factions.
	 * @return The mob.a
	 */
	public EntityStarcraftMob setFactions(EnumFactionTypes... types) {
		for (int x = 0; x < types.length; x++) {
			this.factions.put(x, types[x]);
		}
		this.setStarcraftOwner(types[0].toString());
		return this;
	}

	/**
	 * Stores the NBT for the entity.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);

		nbt.setInteger("Color", this.getColorID());
		nbt.setString("Owner", this.getStarcraftOwner());
	}

	/**
	 * Reads the NBT from saved files for this entity.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.setColorID(nbt.getInteger("Color"));
		this.setStarcraftOwner(nbt.getString("Owner"));
	}

	public int getColorID() {
		return this.getDataManager().get(COLOR);
	}

	public void setColorID(int colornum) {
		this.getDataManager().set(COLOR, colornum);
	}

	/**
	 * Gets the owner of this mob. Used mostly to determine if two entities should attack, along with the factions.
	 * 
	 * @return
	 */
	public String getStarcraftOwner() {
		return this.getDataManager().get(OWNER);
	}

	/**
	 * Sets the owner of this mob. Set through events such as unit purchase, mind control, and so on.
	 * 
	 * @param owner
	 *            The owner this mob will be under.
	 */
	public void setStarcraftOwner(String owner) {
		this.getDataManager().set(OWNER, owner);
	}

	//TODO: Remove this eventually.
	@Override
	protected boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack heldItem = player.getHeldItem(hand);
		if (heldItem != null && heldItem.getItem() == ItemHandler.PLEDGE) {
			this.setStarcraftOwner(player.getUniqueID().toString());
			heldItem.shrink(1);
			return true;
		} else if (heldItem != null && heldItem.getItem() == Items.DYE) {
			int meta = heldItem.getMetadata();
			setColor(EnumColors.values()[15 - meta]);
			heldItem.shrink(1);
			return true;
		} else {
			return super.processInteract(player, hand);
		}
	}

	/**
	 * This is for handling how the mob behaves towards players and entities depending on owners
	 */
	@Override
	public void setAttackTarget(EntityLivingBase entitylivingbaseIn) {
		if (entitylivingbaseIn instanceof EntityPlayer) {
			String owner = ((EntityPlayer) entitylivingbaseIn).getUniqueID().toString();
			if (owner.contentEquals(this.getStarcraftOwner())) {
				this.setAttackTarget(null);
			} else {
				super.setAttackTarget(entitylivingbaseIn);
			}
		} else if (entitylivingbaseIn instanceof EntityStarcraftMob) {
			if (((EntityStarcraftMob) entitylivingbaseIn).getStarcraftOwner().contentEquals(this.getStarcraftOwner())) {
				this.setAttackTarget(null);
			} else {
				super.setAttackTarget(entitylivingbaseIn);
			}
		} else if (entitylivingbaseIn instanceof EntityStarcraftPassive) {
			if (((EntityStarcraftPassive) entitylivingbaseIn).getStarcraftOwner().contentEquals(this.getStarcraftOwner())) {
				this.setAttackTarget(null);
			} else {
				super.setAttackTarget(entitylivingbaseIn);
			}
		} else {
			super.setAttackTarget(entitylivingbaseIn);
		}
	}

	public boolean checkTarget(Entity entity, EnumFactionTypes faction) {
		//Is our target invisible?
		if (!entity.isInvisible()) {
			
			//If not invisible, is our target a starcraft mob?
			if (entity instanceof EntityStarcraftMob) {
				
				//Does it have the monster attribute?
				if (entity.isCreatureType(EnumCreatureType.MONSTER, false)) {
					
					//Does our target have the same owner?
					if (!((EntityStarcraftMob) entity).getStarcraftOwner().contentEquals(this.getStarcraftOwner())) {
						if(((EntityStarcraftMob) entity).hasAttribute(EnumTypeAttributes.INVISIBLE)) {
							if(((EntityStarcraftMob) entity).hasAttribute(EnumTypeAttributes.DETECTED)) {
								//Our target is detected, attack it!
								return true;
							}else {
								//Our target is not detected, we can't attack it.
								return false;
							}
						}
						return true;
					} else {
						//Our target has the same owner, do not attack.
						return false;
					}
				}
				//If our target isn't a monster, is it a starcraft passive?
			} else if (entity instanceof EntityStarcraftPassive) {
				//Does it have the creature attribute?
				if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					//Is the target under the same faction as us?
					if (!((EntityStarcraftPassive) entity).isFaction(faction)) {
						if (!((EntityStarcraftPassive) entity).getUniqueID().toString().contentEquals(this.getStarcraftOwner()) && !((EntityStarcraftPassive) entity).hasAttribute(EnumTypeAttributes.CRITTER)) {
							//The target does not have the same target and is not a critter. Attack it!
							return true;
						} else {
							//The target either has the same owner as us or is a critter, don't attack.
							return false;
						}
					} else if (!((EntityStarcraftPassive) entity).getStarcraftOwner().contentEquals(this.getStarcraftOwner())) {
						//The target does not have the same owner, attack!
						return true;
					}
				}
			} else if (entity instanceof EntityPlayer) {
				if (((EntityPlayer) entity).getUniqueID().toString().contentEquals(this.getStarcraftOwner())) {
					//This target is our owner, do not attack.
					return false;
				} else {
					//This target is not our owner. Attack!
					return true;
				}
			} else {
				if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
					return false;
				}
				return true;
			}
		}
		return false;
	}
	
	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return (int) (this.getMaxHealth() * 3/4);
	}
}