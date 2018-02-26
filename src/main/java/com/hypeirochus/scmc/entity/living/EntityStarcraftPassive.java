package com.hypeirochus.scmc.entity.living;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.hypeirochus.scmc.api.IEntityTeamColorable;
import com.hypeirochus.scmc.enums.EnumColors;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.enums.EnumTypeAttributes;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class EntityStarcraftPassive extends EntityTameable implements IEntityTeamColorable<EntityStarcraftPassive> {

	private static final DataParameter<Integer> COLOR = EntityDataManager.createKey(EntityStarcraftPassive.class, DataSerializers.VARINT);
	private static final DataParameter<String> OWNER = EntityDataManager.createKey(EntityStarcraftPassive.class, DataSerializers.STRING);

	List<EnumTypeAttributes> types = new ArrayList<EnumTypeAttributes>(15);
	List<EnumFactionTypes> factions = new ArrayList<EnumFactionTypes>(15);
	EnumColors teamColor;
	HashMap<EnumTypeAttributes, Double> bonusDamage = new HashMap<EnumTypeAttributes, Double>();

	public EntityStarcraftPassive(World world) {
		super(world);
	}

	@Override
	public boolean getCanSpawnHere() {
		return true;
	}

	@Override
	protected void entityInit() {
		super.entityInit();

		this.getDataManager().register(COLOR, 0);
		this.getDataManager().register(OWNER, "");
	}

	public int secondsToTicks(int seconds) {
		return seconds * 20;
	}

	public boolean isType(EnumTypeAttributes type) {
		for (int x = 0; x < types.size(); x++) {
			if (this.types.get(x) == type) {
				return true;
			}
		}
		return false;
	}

	public boolean isFaction(EnumFactionTypes faction) {
		for (int x = 0; x < factions.size(); x++) {
			if (this.factions.get(x) == faction) {
				return true;
			}
		}
		return false;
	}

	public EnumColors getColor() {
		for (EnumColors color : EnumColors.values()) {
			if (color.getId() == this.getNBTColor()) {
				return color;
			}
		}
		return null;
	}

	public EntityStarcraftPassive setColor(EnumColors team) {
		this.teamColor = team;
		this.setNBTColor(team.getId());
		return this;
	}

	public EntityStarcraftPassive setTypes(EnumTypeAttributes... types) {
		for (int x = 0; x < types.length; x++) {
			this.types.add(x, types[x]);
		}
		return this;
	}

	public EntityStarcraftPassive setFactions(EnumFactionTypes... types) {
		for (int x = 0; x < types.length; x++) {
			this.factions.add(x, types[x]);
		}
		return this;
	}

	public EntityStarcraftPassive setDamageAgainstType(EnumTypeAttributes type, double dmg) {
		bonusDamage.put(type, dmg);
		return this;
	}

	public double getDamageAgainstType(EnumTypeAttributes type) {
		return bonusDamage.get(type);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);

		nbt.setInteger("Color", this.getNBTColor());
		nbt.setString("Owner", this.getStarcraftOwner());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.setNBTColor(nbt.getInteger("Color"));
		this.setStarcraftOwner(nbt.getString("Owner"));
	}

	/**
	 * Gets the owner of this animal. Used mostly to determine if two entities should attack, along with the factions.
	 * 
	 * @return String
	 */
	public String getStarcraftOwner() {
		return this.getDataManager().get(OWNER);
	}

	/**
	 * Sets the owner of this animal. Set through events such as unit purchase, mind control, and so on.
	 * 
	 * @param owner
	 *            The owner this mob will be under.
	 */
	public void setStarcraftOwner(String owner) {
		this.getDataManager().set(OWNER, owner);
	}

	public int getNBTColor() {
		return this.getDataManager().get(COLOR);
	}

	public EntityStarcraftPassive setNBTColor(int colornum) {
		this.getDataManager().set(COLOR, colornum);
		return this;
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
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
}