package ga.scmc.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

public abstract class EntityStarcraftPassive extends EntityTameable implements StarcraftEnums {

	List<typeAttributes> types = new ArrayList<typeAttributes>(14);
	List<factionTypes> factions = new ArrayList<factionTypes>(15);
	teamColors teamColor = teamColors.WHITE;
	HashMap<typeAttributes, Double> bonusDamage = new HashMap<typeAttributes, Double>();
	
	public EntityStarcraftPassive(World world) {
		super(world);
	}
	
	public boolean isType(typeAttributes type) {
		for(int x = 0; x < types.size(); x++) {
			if(this.types.get(x) == type) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isFaction(factionTypes faction) {
		for(int x = 0; x < factions.size(); x++) {
			if(this.factions.get(x) == faction) {
				return true;
			}
		}
		return false;
	}
	
	public teamColors getTeamColor() {
		return this.teamColor;
	}
	
	public void setTeam(teamColors team) {
		this.teamColor = team;
	}
	
	public void setTypes(typeAttributes ... types) {
		for(int x = 0; x < types.length; x++) {
			this.types.add(x, types[x]);
		}
	}
	
	public void setFactions(factionTypes ... types) {
		for(int x = 0; x < types.length; x++) {
			this.factions.add(x, types[x]);
		}
	}
	
	public void setDamageAgainstType(typeAttributes type, double dmg) {
		bonusDamage.put(type, dmg);
	}
	
	public double getDamageAgainstType(typeAttributes type) {
		return bonusDamage.get(type);
	}
}