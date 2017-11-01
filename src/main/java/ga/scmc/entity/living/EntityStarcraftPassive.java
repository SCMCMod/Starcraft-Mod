package ga.scmc.entity.living;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ga.scmc.enums.EnumFactionTypes;
import ga.scmc.enums.EnumTeamColors;
import ga.scmc.enums.EnumTypeAttributes;
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

public abstract class EntityStarcraftPassive extends EntityTameable {

	private static final DataParameter<Integer> COLOR = EntityDataManager.createKey(EntityStarcraftPassive.class, DataSerializers.VARINT);

	List<EnumTypeAttributes> types = new ArrayList<EnumTypeAttributes>(15);
	List<EnumFactionTypes> factions = new ArrayList<EnumFactionTypes>(15);
	EnumTeamColors teamColor;
	HashMap<EnumTypeAttributes, Double> bonusDamage = new HashMap<EnumTypeAttributes, Double>();

	public EntityStarcraftPassive(World world) {
		super(world);
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

	public EnumTeamColors getTeamColor() {
		for (EnumTeamColors color : EnumTeamColors.values()) {
			if (color.getId() == this.getNBTColor()) {
				return color;
			}
		}
		return null;
	}

	public void setTeamColor(EnumTeamColors team) {
		this.teamColor = team;
		this.setNBTColor(team.getId());
	}

	public void setTypes(EnumTypeAttributes... types) {
		for (int x = 0; x < types.length; x++) {
			this.types.add(x, types[x]);
		}
	}

	public void setFactions(EnumFactionTypes... types) {
		for (int x = 0; x < types.length; x++) {
			this.factions.add(x, types[x]);
		}
	}

	public void setDamageAgainstType(EnumTypeAttributes type, double dmg) {
		bonusDamage.put(type, dmg);
	}

	public double getDamageAgainstType(EnumTypeAttributes type) {
		return bonusDamage.get(type);
	}

	@Override
	protected void entityInit() {
		super.entityInit();

		this.getDataManager().register(COLOR, 0);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);

		nbt.setInteger("Color", this.getNBTColor());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.setNBTColor(nbt.getInteger("Color"));
	}

	public int getNBTColor() {
		return this.getDataManager().get(COLOR);
	}

	public void setNBTColor(int colornum) {
		this.getDataManager().set(COLOR, colornum);
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand, ItemStack stack) {
		ItemStack heldItem = player.getHeldItem(hand);
		if (heldItem != null && heldItem.getItem() == Items.DYE) {
			int meta = heldItem.getMetadata();
			setTeamColor(EnumTeamColors.values()[15 - meta]);
			heldItem.stackSize -= 1;
			return true;
		} else {
			return super.processInteract(player, hand, stack);
		}
	}
}