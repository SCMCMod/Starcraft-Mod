package ga.scmc.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ga.scmc.enums.FactionTypes;
import ga.scmc.enums.TeamColors;
import ga.scmc.enums.TypeAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class EntityStarcraftMob extends EntityMob {

	private static final DataParameter<Integer> COLOR = EntityDataManager.createKey(EntityStarcraftMob.class, DataSerializers.VARINT);
	
	List<TypeAttributes> types = new ArrayList<TypeAttributes>(15);
	List<FactionTypes> factions = new ArrayList<FactionTypes>(15);
	TeamColors teamColor;
	HashMap<TypeAttributes, Double> bonusDamage = new HashMap<TypeAttributes, Double>();
	
	public EntityStarcraftMob(World world) {
		super(world);
	}
	
	public boolean isType(TypeAttributes type) {
		for(int x = 0; x < types.size(); x++) {
			if(this.types.get(x) == type) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isFaction(FactionTypes faction) {
		for(int x = 0; x < factions.size(); x++) {
			if(this.factions.get(x) == faction) {
				return true;
			}
		}
		return false;
	}
	
	public TeamColors getTeamColor() {
		for(TeamColors color: TeamColors.values()) {
			if(color.ID == this.getNBTColor()) {
				return color;
			}
		}
		return null;
	}
	
	public void setTeamColor(TeamColors team) {
		this.teamColor = team;
		this.setBiomass(team.ID);
	}
	
	public void setTypes(TypeAttributes ... types) {
		for(int x = 0; x < types.length; x++) {
			this.types.add(x, types[x]);
		}
	}
	
	public void setFactions(FactionTypes ... types) {
		for(int x = 0; x < types.length; x++) {
			this.factions.add(x, types[x]);
		}
	}
	
	public void setDamageAgainstType(TypeAttributes type, double dmg) {
		bonusDamage.put(type, dmg);
	}
	
	public double getDamageAgainstType(TypeAttributes type) {
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

		nbt.setInteger("Color", this.getBiomass());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);

		this.setBiomass(nbt.getInteger("Color"));
	}

	public int getBiomass() {
		return this.getDataManager().get(COLOR);
	}

	public void setBiomass(int colornum) {
		this.getDataManager().set(COLOR, colornum);
	}
	
	@Override
	protected boolean processInteract(EntityPlayer player, EnumHand hand, ItemStack stack) {
		ItemStack heldItem = player.getHeldItem(hand);
		if (heldItem != null && heldItem.getItem() == Items.DYE) {
			int meta = heldItem.getMetadata();
			setTeamColor(TeamColors.values()[15 - meta]);
			heldItem.stackSize -= 1;
			return true;
		} else {
			return super.processInteract(player, hand, stack);
		}
	}
}