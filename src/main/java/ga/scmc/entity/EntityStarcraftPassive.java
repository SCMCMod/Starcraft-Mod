package ga.scmc.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ga.scmc.enums.FactionTypes;
import ga.scmc.enums.TeamColors;
import ga.scmc.enums.TypeAttributes;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class EntityStarcraftPassive extends EntityTameable {

	List<TypeAttributes> types = new ArrayList<TypeAttributes>(15);
	List<FactionTypes> factions = new ArrayList<FactionTypes>(15);
	TeamColors teamColor = TeamColors.WHITE;
	HashMap<TypeAttributes, Double> bonusDamage = new HashMap<TypeAttributes, Double>();
	
	public EntityStarcraftPassive(World world) {
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
		return this.teamColor;
	}
	
	public void setTeamColor(TeamColors team) {
		this.teamColor = team;
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
	public boolean processInteract(EntityPlayer player, EnumHand hand, ItemStack stack) {
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